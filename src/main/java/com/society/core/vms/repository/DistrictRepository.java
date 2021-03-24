package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.society.core.vms.entity.District;

public interface DistrictRepository extends CrudRepository<District, Long> {

	List<District> findAll();
	
	District findByDid(Long districtId);

	List<District> findByStateId(Long stateId);

}
