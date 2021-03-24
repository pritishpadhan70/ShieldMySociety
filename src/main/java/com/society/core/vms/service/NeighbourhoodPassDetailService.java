package com.society.core.vms.service;

import java.util.List;

import com.society.core.vms.dto.NeighbourhoodPassDetailDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.GatePassValidationException;
import com.society.core.vms.exceptions.PersistanceException;

public interface NeighbourhoodPassDetailService {

	List<NeighbourhoodPassDetailDTO> getAllNeighbourhoodPassDetailService() throws DataNotFoundException;

	NeighbourhoodPassDetailDTO getSingleNeighbourhoodPassDetailByIdService(Long neighbourId) throws DataNotFoundException;

	String createNeighbourhoodPassDetailService(NeighbourhoodPassDetailDTO dto) throws PersistanceException;

	String verifyNeighbourhoodPassDetailService(NeighbourhoodPassDetailDTO dto) throws GatePassValidationException;

}
