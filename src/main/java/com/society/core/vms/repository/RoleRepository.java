package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.society.core.vms.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

	List<Role> findAll();

	Role findByRoleId(int roleId);
	

}
