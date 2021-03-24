package com.society.core.vms.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.society.core.vms.dto.AdvanceVisitorRequestDTO;
import com.society.core.vms.entity.AdvanceVisitorRequest;
import com.society.core.vms.entity.Visitor;
import com.society.core.vms.entity.VisitorType;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.OtpException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.repository.AdvanceVisitorRepository;
import com.society.core.vms.repository.VisitorRepository;
import com.society.core.vms.request.KeyValueRequest;
import com.society.core.vms.service.AdvanceVisitorService;
import com.society.core.vms.util.ConversionUtility;

@Service
public class AdvanceVisitorServiceImpl implements AdvanceVisitorService {
	
	@Autowired
	private AdvanceVisitorRepository repository;
	
	@Autowired
	private VisitorRepository visitorRepo;

	@Override
	public List<AdvanceVisitorRequestDTO> getAdvVisitorListService() throws DataNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AdvanceVisitorRequestDTO getSingleVisitorByIdService(long visitorId) throws DataNotFoundException {
		
		AdvanceVisitorRequest entity = repository.findByAvId(visitorId);
		if(null==entity) {
			throw new DataNotFoundException("no data for ID: "+visitorId);
		}
		return ConversionUtility.entityToDataObject(entity);
	}

	@Override
	public String createAdvVisitorService(AdvanceVisitorRequestDTO request)
			throws PersistanceException {
		if(null==request) {
			throw new PersistanceException(" invalid input data ");
		}
		AdvanceVisitorRequest entity = ConversionUtility.dataToEntityObject(request);
		
		//create OTP
		entity = repository.save(entity);
		return "object saved with ID: "+ entity.getAvId();
	}

	@Override
	public String verifyAdvVisitorRequestService(KeyValueRequest request) throws PersistanceException, OtpException {

		if(null ==request || null ==request.getKey() || null == request.getValue()) {
			throw new PersistanceException(" invalid input data ");
		}
		AdvanceVisitorRequest entity  = repository.findByVisitorPhone(request.getKey()); 
		if(entity == null || entity.getVisitorOtp()!= Integer.parseInt(request.getValue())) {
			throw new OtpException(" invalid OTP provided by visitor");
		}
		
		//on succesfull verification app adds visitor to society.
		
		Visitor visitor = new Visitor();
		visitor.setComments("Visitor enters by advance Visitor request, with ID: "+ entity.getAvId());
		visitor.setFlatid(entity.getFlatId());
		visitor.setInTime(new Timestamp(System.currentTimeMillis()));
		visitor.setArrived(true);
		visitor.setPassIssued(true);
		visitor.setVerified(true);
		visitor.setVisitorActive(true);
		visitor.setFirstName(entity.getVisitorFirstName());
		visitor.setMiddleName(entity.getVisitorMiddleName());
		visitor.setLastName(entity.getVisitorLastName());
		visitor.setOutTime(null);
		visitor.setPhone(entity.getVisitorPhone());
		visitor.setPhotoPath(null);
		visitor.setSignaturePath(null);
		VisitorType vt = visitorRepo.findByVtId(entity.getVisitorType());
		visitor.setVisitorType(vt);//need to define visitor type properly
		//visitor.setVehicleNo(entity.getvehicleNo());
		//visitor.setVehicleType(vehicleType);
		visitorRepo.save(visitor);
		
		return "Entry done succesfully for: " + entity.getVisitorFirstName();
	}

}
