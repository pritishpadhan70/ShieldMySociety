/**
 * 
 */
package com.society.core.vms.service.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.society.core.vms.dto.DailyVisitorDTO;
import com.society.core.vms.dto.VisitorDTO;
import com.society.core.vms.entity.DailyVisitor;
import com.society.core.vms.entity.Visitor;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.repository.DailyVisitorRepository;
import com.society.core.vms.repository.VisitorRepository;
import com.society.core.vms.request.IdStringRequest;
import com.society.core.vms.service.VisitorService;
import com.society.core.vms.util.ConversionUtility;
import com.society.core.vms.util.UtilityMethods;

/**
 * @author deepikadas
 *
 */

@Service("visitorService")
@Transactional
public class VisitorServiceImpl implements VisitorService {
	
	@Autowired
	private VisitorRepository repository;
	
	@Autowired
	private DailyVisitorRepository dvRrepository;

	@Override
	public List<VisitorDTO> getVisitorListService() throws DataNotFoundException{
		
		List<Visitor> visitors = repository.findAll();
		if (visitors.isEmpty()) {
			throw new DataNotFoundException("NO Visitor Data ");
		}
		
		return ConversionUtility.visitorEntityToDataObject(visitors);
	}

	@Override
	public VisitorDTO getSingleVisitorByIdService(long visitorId) throws DataNotFoundException {
		
		Visitor visitor = repository.findByVid(visitorId);
		if (null == visitor) {
			System.out.println("NO Visitor found, : " + visitorId);
			throw new DataNotFoundException("NO Visitor found");
		}
		return ConversionUtility.entityToDataObject(visitor);
	}

	@Override
	public VisitorDTO getSingleVisitorByVisitorNameService(String visitorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VisitorDTO getSingleVisitorByPhoneService(long phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VisitorDTO getSingleVisitorByIdProofService(String idType, String idNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveSingleVisitorDataService(VisitorDTO data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveVisitorDataListService(List<VisitorDTO> dataList) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteSingleVisitorService(long visitorId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteVisitorListService(List<Long> visitorids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean disableSingleVisitorService(long visitorId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean disableVisitorListService(List<Long> visitorids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean enableSingleVisitorService(long visitorId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean enableVisitorListService(List<Long> visitorids) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String createUpdateVisitorService(VisitorDTO visitor)
			throws InvalidInputDataException, PersistanceException {
		
	//	UtilityMethods.validateVisitorObject(visitor);
		Visitor entity = repository.save(ConversionUtility.dataObjectToEntity(visitor));
		
		return "Visitor data saved succesfully, ID: " + entity.getVid() ;
	}

	@Override
	public DailyVisitorDTO fetchDailyVisitorByPhoneService(IdStringRequest phone)
			throws PersistanceException, InvalidInputDataException, DataNotFoundException {
		
		if(phone==null || phone.getId().isEmpty()) {
			System.out.println("Empty phone number provided.");
			throw new InvalidInputDataException("Empty phone number provided.");
		}
		
		//VisitorDTO dvDto =  new VisitorDTO();
		DailyVisitor dVisitor = dvRrepository.findByVisitorPhone(phone.getId());
		
		if(dVisitor==null) {
			System.out.println("NO daily visitor found for phone number: "+ phone.getId());

			throw new DataNotFoundException("NO daily visitor found for phone number: "+ phone.getId());
		}
		
		
		DailyVisitorDTO dvDto =  ConversionUtility.entityToDataObject(dVisitor);
		
		
		
		return dvDto;
	}

	
}
