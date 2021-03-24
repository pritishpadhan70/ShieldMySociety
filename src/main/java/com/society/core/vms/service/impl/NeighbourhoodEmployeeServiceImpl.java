package com.society.core.vms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.society.core.vms.dto.NeibourhoodEmployeeDTO;
import com.society.core.vms.entity.NeibourhoodEmployee;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.repository.NeighbourhoodEmployeeRepository;
import com.society.core.vms.service.NeighbourhoodEmployeeService;
import com.society.core.vms.util.ConversionUtility;

@Service
public class NeighbourhoodEmployeeServiceImpl implements NeighbourhoodEmployeeService {
	
	@Autowired
	private NeighbourhoodEmployeeRepository repository;

	@Override
	public List<NeibourhoodEmployeeDTO> getAllNeighbourhoodEmployeeService() throws DataNotFoundException {
		
		// TODO Auto-generated method stub
		List<NeibourhoodEmployee> entities = repository.findAll();
		if(null ==entities || entities.isEmpty()) {
			throw new DataNotFoundException("NO Neighbourhood data exists");
		}
		
		return ConversionUtility.neibourhoodEmployeeEntityListToDataObject(entities);
		
	}

	@Override
	public NeibourhoodEmployeeDTO getSingleNeighbourhoodEmployeeByIdService(Integer neighbourEmpId)
			throws DataNotFoundException {
		NeibourhoodEmployee entity = repository.findByNeId(neighbourEmpId);
		if(entity==null) {
			throw new DataNotFoundException("NO employee exist with ID: "+ neighbourEmpId);
		}
		return ConversionUtility.entityToDataObject(entity);
	}

	@Override
	public String createNeighbourhoodEmployeeService(NeibourhoodEmployeeDTO dto) throws PersistanceException {
		// TODO Auto-generated method stub
		NeibourhoodEmployee entity = ConversionUtility.dataObjectToEntity(dto);
		repository.save(entity);
		return "succesfully save Employee";
	}

}
