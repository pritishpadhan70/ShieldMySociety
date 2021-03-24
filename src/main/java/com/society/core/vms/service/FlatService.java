package com.society.core.vms.service;

import java.util.List;

import com.society.core.vms.dto.FlatDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.PersistanceException;

public interface FlatService {
	
	List<FlatDTO> getFlatListService() throws DataNotFoundException;
	
	FlatDTO getSingleFlatByIdService(long flatId) throws DataNotFoundException;

	FlatDTO getSingleFlatByFlatNameService(String flatName);
	
	FlatDTO getSingleFlatByPhoneService(long phone);
	
	FlatDTO getSingleFlatByIdProofService(String idType,String idNumber);
	
	boolean saveSingleFlatDataService(FlatDTO data);
	
	boolean saveFlatDataListService(List<FlatDTO> dataList);
	
	boolean deleteSingleFlatService(long flatId);
	
	boolean deleteFlatListService(List<Long> flatids);
	
	boolean disableSingleFlatService(long flatId);
	
	boolean disableFlatListService(List<Long> flatids);
	
	boolean enableSingleFlatService(long flatId);
	
	boolean enableFlatListService(List<Long> flatids);

	String createUpdateFlatService(FlatDTO user) throws PersistanceException, InvalidInputDataException;



}
