package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.society.core.vms.entity.NeibourhoodEmployee;

public interface NeighbourhoodEmployeeRepository extends CrudRepository<NeibourhoodEmployee, Long> {

	List<NeibourhoodEmployee> findAll();

	NeibourhoodEmployee findByNeId(Integer neighbourEmpId);
	

}
