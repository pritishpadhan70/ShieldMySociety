package com.society.core.vms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.society.core.vms.dto.NeighbourhoodDTO;
import com.society.core.vms.entity.Neighbourhood;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.repository.NeighbourhoodRepository;
import com.society.core.vms.request.NeibourhoodStatusRequest;
import com.society.core.vms.service.NeighbourhoodService;
import com.society.core.vms.util.ConversionUtility;

@Service
public class NeighbourhoodServiceImpl implements NeighbourhoodService {

	@Autowired
	private NeighbourhoodRepository reopsitory;
	
	@Override
	public List<NeighbourhoodDTO> getAllNeighbourhoodService() throws DataNotFoundException {
		
		List<Neighbourhood> entities = reopsitory.findAll();
		
		if (null== entities || entities.isEmpty()) {
			throw new DataNotFoundException("No Neighborhood found ");
		}
		
		return ConversionUtility.neighbourhoodEntityListToDataObject(entities);
	}

	@Override
	public NeighbourhoodDTO getSingleNeighbourhoodByIdService(Integer neighbourId) throws DataNotFoundException {
		
		Neighbourhood entity = reopsitory.findByNid(Long.valueOf(neighbourId));
		
		if (null== entity) {
			throw new DataNotFoundException("No Neighborgood found for you request");
		}
		return ConversionUtility.entityToDataObject(entity);
	}

	@Override
	public String createNeighbourhoodService(NeighbourhoodDTO dto) throws PersistanceException, InvalidInputDataException {
		
		if(dto==null || dto.getNeibourhoodType()==null) {
			throw new InvalidInputDataException("improper input/neighbourtype ");
		}
		Neighbourhood entity = ConversionUtility.dataObjectToEntity(dto);
		entity = reopsitory.save(entity);
		return "New neighbourhood created succesfully with ID: " + entity.getNid();
	}

	@Override
	public String updateNeighbourhoodStatusService(NeibourhoodStatusRequest dto)
			throws PersistanceException, InvalidInputDataException {
		
		if(0==reopsitory.updateStatus(Long.valueOf(dto.getId()),dto.getComments(), dto.getStatus())){
			
			throw new  PersistanceException("Status udatedStatus udated failed: "+ dto.getId());
		}
		return "Status udated to for neighbour id: "+ dto.getId();
	}

}
