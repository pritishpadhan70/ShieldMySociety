package com.society.core.vms.service;

import java.util.List;

import com.society.core.vms.dto.EnrolmentData;
import com.society.core.vms.dto.SocietyDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.SocietyException;

public interface SocietyService {
	
	List<SocietyDTO> getSocietyListService() throws DataNotFoundException;
	
	SocietyDTO getSingleSocietyByIdService(Integer societyId) throws DataNotFoundException;

	List<SocietyDTO> getSocietiesByCityIdService(Integer cityId) throws DataNotFoundException;

	String  saveSocietyEnrollmentService(EnrolmentData data)throws SocietyException;

	EnrolmentData getEnrollSocietyService(Integer societyEnrolmentId) throws DataNotFoundException;

	List<EnrolmentData> getAllEnrollSocietyService() throws DataNotFoundException;
}
