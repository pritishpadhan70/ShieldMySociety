package com.society.core.vms.service;

import java.util.List;

import com.society.core.vms.dto.DistrictDTO;
import com.society.core.vms.exceptions.DataNotFoundException;

public interface DistrictService {
	
	List<DistrictDTO> getDistrictListService() throws DataNotFoundException;
	
	DistrictDTO getSingleDistrictByIdService(long districtId) throws DataNotFoundException;

	List<DistrictDTO> findDistrictsByStateService(Long stateId) throws DataNotFoundException;

}
