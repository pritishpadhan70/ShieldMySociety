package com.society.core.vms.service;

import java.util.List;

import com.society.core.vms.dto.StaffDTO;
import com.society.core.vms.exceptions.DataNotFoundException;

public interface StaffService {
	
	List<StaffDTO> getStaffListService() throws DataNotFoundException;
	
	StaffDTO getSingleStaffByIdService(long staffId) throws DataNotFoundException;




}
