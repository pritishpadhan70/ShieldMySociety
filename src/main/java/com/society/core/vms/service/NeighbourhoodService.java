package com.society.core.vms.service;

import java.util.List;

import com.society.core.vms.dto.NeighbourhoodDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.request.NeibourhoodStatusRequest;

public interface NeighbourhoodService {

	List<NeighbourhoodDTO> getAllNeighbourhoodService() throws DataNotFoundException;

	NeighbourhoodDTO getSingleNeighbourhoodByIdService(Integer neighbourId) throws DataNotFoundException;

	String createNeighbourhoodService(NeighbourhoodDTO dto) throws PersistanceException, InvalidInputDataException;

	String updateNeighbourhoodStatusService(NeibourhoodStatusRequest dto) throws PersistanceException, InvalidInputDataException;


}
