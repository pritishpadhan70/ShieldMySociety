package com.society.core.vms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.society.core.vms.dto.RoleDTO;
import com.society.core.vms.entity.Role;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.repository.RoleRepository;
import com.society.core.vms.service.RoleService;
import com.society.core.vms.util.ConversionUtility;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository repository;
	
	@Override
	public List<RoleDTO> getAllRolesService() throws DataNotFoundException {

		List<Role> entities = repository.findAll();
		if(null ==entities || entities.isEmpty()) {
			throw new DataNotFoundException("NO Roles are available");
		}
		
		return ConversionUtility.roleEntityListToDataObject(entities);
	}

	@Override
	public RoleDTO getSingleRoleByIdService(int roleId) throws DataNotFoundException {

		Role entity = repository.findByRoleId(roleId);
		
		return ConversionUtility.entityToDataObject(entity);
	}

	@Override
	public List<String> getAllRolesNameService() throws DataNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RoleDTO getDefaultRoleByUserIdService(Long userId) throws DataNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoleDTO> getRolesByUserIdService(Long userId) throws DataNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ceateRoleService(RoleDTO dto) throws PersistanceException, InvalidInputDataException {
		if(null == dto || dto.getGroupName()==null) {
			throw new InvalidInputDataException("invalid role data");
		}
		Role entity = ConversionUtility.dataObjectToEntity(dto);
		entity = repository.save(entity);
		return "Role save with ID: "+ entity.getRoleId();
	}

}
