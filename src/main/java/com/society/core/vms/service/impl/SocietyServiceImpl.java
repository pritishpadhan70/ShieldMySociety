/**
 * 
 */
package com.society.core.vms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.society.core.vms.dto.EnrolmentData;
import com.society.core.vms.dto.SocietyDTO;
import com.society.core.vms.entity.Society;
import com.society.core.vms.entity.SocietyEnrolment;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.SocietyException;
import com.society.core.vms.repository.SocietyEnrolmentRepository;
import com.society.core.vms.repository.SocietyRepository;
import com.society.core.vms.service.SocietyService;
import com.society.core.vms.util.ConversionUtility;

/**
 * @author deepikadas
 *
 */

@Service("societyService")
@Transactional
public class SocietyServiceImpl implements SocietyService {
	
	@Autowired
	private SocietyRepository repository;
	
	@Autowired
	private SocietyEnrolmentRepository enrolRepo;

	@Override
	public List<SocietyDTO> getSocietyListService() throws DataNotFoundException {

		List<Society> societies = repository.findAll();
		if (societies.isEmpty()) {
			throw new DataNotFoundException("NO Society Data ");
		}
		
	 return ConversionUtility.societyEntityListToDataObject(societies);
	}

	@Override
	public SocietyDTO getSingleSocietyByIdService(Integer societyId) throws DataNotFoundException {
		
		Society society = repository.findBySocietyId(societyId);
		return ConversionUtility.entityToDataObject(society);
	}

	@Override
	public List<SocietyDTO> getSocietiesByCityIdService(Integer societyId) throws DataNotFoundException {

		List<Society> entities = repository.findByCity(societyId);
		if (entities.isEmpty()) {
			throw new DataNotFoundException("NO Society Data ");
		}
		return ConversionUtility.societyEntityListToDataObject(entities);
	}

	@Override
	public String saveSocietyEnrollmentService(EnrolmentData data) throws SocietyException {
		
		if(null ==data || data.getPhone()==null|| data.getPhone().isEmpty()|| data.getSocietyName()==null) {
			throw new DataNotFoundException("Enrollment data not provided properly");
		}
		SocietyEnrolment entity = ConversionUtility.dataToEntityObject(data);
		entity = enrolRepo.save(entity);
		
		 return "Enrolment saved succesfully with ID: "+ entity.getId();
	}

	@Override
	public EnrolmentData getEnrollSocietyService(Integer societyEnrolmentId) throws DataNotFoundException {
		//List<SocietyEnrolment> enrolemtList = enrolRepo.findByIsClosedFalse();
		

		SocietyEnrolment entity = enrolRepo.findById(societyEnrolmentId);
		
		return ConversionUtility.entityToDataObject(entity);
		
	}
	
	@Override
	public List<EnrolmentData> getAllEnrollSocietyService() throws DataNotFoundException {
		List<SocietyEnrolment> enrolemtList = enrolRepo.findAll();
		
		if(enrolemtList.isEmpty()) {
			throw new DataNotFoundException("Enrollment data not available");
		}
		
		return ConversionUtility.societyEnrollEntityListToDataObject(enrolemtList);
		
	}


	
	



}
