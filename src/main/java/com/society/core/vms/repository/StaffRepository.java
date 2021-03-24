package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.society.core.vms.entity.Staff;

public interface StaffRepository extends CrudRepository<Staff, Long> {

	List<Staff> findAll();
	
	Staff findByStaffId(Long staffId);

}
