package com.society.core.vms.service;

import java.util.List;

import com.society.core.vms.dto.NeibourhoodEmployeeDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.PersistanceException;

public interface NeighbourhoodEmployeeService {

	List<NeibourhoodEmployeeDTO> getAllNeighbourhoodEmployeeService() throws DataNotFoundException;

	NeibourhoodEmployeeDTO getSingleNeighbourhoodEmployeeByIdService(Integer neighbourEmpId) throws DataNotFoundException;

	String createNeighbourhoodEmployeeService(NeibourhoodEmployeeDTO dto) throws PersistanceException;

}
