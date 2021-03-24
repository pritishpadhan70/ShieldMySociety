package com.society.core.vms.service;

import java.util.List;

import com.society.core.vms.dto.RoleDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.PersistanceException;

public interface RoleService {

	List<RoleDTO> getAllRolesService() throws DataNotFoundException;
	
	RoleDTO getSingleRoleByIdService(int roleId)throws DataNotFoundException;
	
	List<String> getAllRolesNameService() throws DataNotFoundException;
	
	RoleDTO getDefaultRoleByUserIdService(Long userId) throws DataNotFoundException;
	
	List<RoleDTO> getRolesByUserIdService(Long userId) throws DataNotFoundException;
	
	String ceateRoleService(RoleDTO dto) throws PersistanceException, InvalidInputDataException;
	
	
	
}
