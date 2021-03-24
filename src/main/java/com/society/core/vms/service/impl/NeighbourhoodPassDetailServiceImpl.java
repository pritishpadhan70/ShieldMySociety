package com.society.core.vms.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.society.core.vms.dto.NeighbourhoodPassDetailDTO;
import com.society.core.vms.entity.NeighbourhoodPassDetail;
import com.society.core.vms.entity.Visitor;
import com.society.core.vms.entity.VisitorType;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.GatePassValidationException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.repository.NeighbourhoodPassDetailRepository;
import com.society.core.vms.repository.VisitorRepository;
import com.society.core.vms.service.NeighbourhoodPassDetailService;
import com.society.core.vms.util.ApplicationConstants;
import com.society.core.vms.util.ConversionUtility;
import com.society.core.vms.util.UtilityMethods;

@Service
public class NeighbourhoodPassDetailServiceImpl implements NeighbourhoodPassDetailService {

	@Autowired
	private NeighbourhoodPassDetailRepository repository;
	
	@Autowired
	private VisitorRepository visitorRepo;

	@Override
	public List<NeighbourhoodPassDetailDTO> getAllNeighbourhoodPassDetailService() throws DataNotFoundException {

		List<NeighbourhoodPassDetail> entities = repository.findAll();
		
		return ConversionUtility.neibourhoodEPassDetailsListToDataObject(entities);
	}

	@Override
	public NeighbourhoodPassDetailDTO getSingleNeighbourhoodPassDetailByIdService(Long neighbourPassId)
			throws DataNotFoundException {

		NeighbourhoodPassDetail entity = repository.findByNpId(neighbourPassId);
		if(entity==null) {
			throw new DataNotFoundException("NO pass exists with this ID");
		}

		return ConversionUtility.entityToDataObject(entity);
	}

	@Override
	public String createNeighbourhoodPassDetailService(NeighbourhoodPassDetailDTO dto) throws PersistanceException {

		NeighbourhoodPassDetail entity = ConversionUtility.dataObjectToEntity(dto);

		entity.setPassCode(UtilityMethods.getRamdomCode(ApplicationConstants.GENARATED_PASSCODE_SIZE_VENDOR, true, true));
		repository.save(entity);
		return "Neighbourhood pass created succesffully";
	}

	@Override
	public String verifyNeighbourhoodPassDetailService(NeighbourhoodPassDetailDTO dto) throws GatePassValidationException {
		
		NeighbourhoodPassDetail entity = repository.findByNpIdAndPassCode(dto.getNpId(), dto.getPassCode());
		if (null == entity) {
			throw new GatePassValidationException("Wrong gate pass code provided by user");
		}
		// todo: check expiry and validity, status of vendor passcode
		
		// add record in visitor table.
		Visitor visitor = new Visitor();
		visitor.setComments("Vendor/neighbourhood enters by vendor pass, vendor name: "+ entity.getNeighbourhood().getNeighbourName());
		
		//flat details for neighbourhood's visitor entry
		//visitor.setFlatid(entity.getNeighbourhood().);
		visitor.setInTime(new Timestamp(System.currentTimeMillis()));
		visitor.setArrived(true);
		visitor.setPassIssued(true);
		visitor.setVerified(true);
		visitor.setVisitorActive(true);
		visitor.setFirstName(entity.getNeighbourhood().getNeighbourName());
		visitor.setOutTime(null);
		visitor.setPhone(entity.getNeighbourhood().getContactNumber());
		visitor.setPhotoPath(null);
		visitor.setSignaturePath(null);
		visitor.setVisitorType(new VisitorType(5, "NEIGHBOURHOOD",null));
		
		//need to set vehicle details
		//visitor.setVehicleNo(entity.getvehicleNo());
		//visitor.setVehicleType(vehicleType);
		visitorRepo.save(visitor);
		
		return "Vendor/Neighbourhood pass verified succesfully,\n Now can enter hte premises";
	}

}
