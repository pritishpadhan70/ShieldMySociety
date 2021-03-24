package com.society.core.vms.service;

import java.util.List;

import com.society.core.vms.dto.StateDTO;
import com.society.core.vms.exceptions.DataNotFoundException;

public interface StateService {
	
	List<StateDTO> getStateListService() throws DataNotFoundException;
	
	StateDTO getSingleStateByIdService(long stateId) throws DataNotFoundException;

	List<StateDTO> findStatesByCountryService(Long countryId) throws DataNotFoundException;




}
