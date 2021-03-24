package com.society.core.vms.service;

import java.util.List;

import com.society.core.vms.dto.DailyVisitorDTO;
import com.society.core.vms.dto.VisitorDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.request.IdStringRequest;

public interface VisitorService {
	
	List<VisitorDTO> getVisitorListService() throws DataNotFoundException;
	
	VisitorDTO getSingleVisitorByIdService(long visitorId) throws DataNotFoundException;

	VisitorDTO getSingleVisitorByVisitorNameService(String visitorName);
	
	VisitorDTO getSingleVisitorByPhoneService(long phone);
	
	VisitorDTO getSingleVisitorByIdProofService(String idType,String idNumber);
	
	boolean saveSingleVisitorDataService(VisitorDTO data);
	
	boolean saveVisitorDataListService(List<VisitorDTO> dataList);
	
	boolean deleteSingleVisitorService(long visitorId);
	
	boolean deleteVisitorListService(List<Long> visitorids);
	
	boolean disableSingleVisitorService(long visitorId);
	
	boolean disableVisitorListService(List<Long> visitorids);
	
	boolean enableSingleVisitorService(long visitorId);
	
	boolean enableVisitorListService(List<Long> visitorids);

	String createUpdateVisitorService(VisitorDTO visitor) throws InvalidInputDataException, PersistanceException;

	DailyVisitorDTO fetchDailyVisitorByPhoneService(IdStringRequest phone) throws PersistanceException, DataNotFoundException, InvalidInputDataException;



}
