package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.society.core.vms.entity.NeighbourhoodPassDetail;

public interface NeighbourhoodPassDetailRepository extends CrudRepository<NeighbourhoodPassDetail, Long> {

	List<NeighbourhoodPassDetail> findAll();

	NeighbourhoodPassDetail findByNpId(Long neighbourPassId);
	
	NeighbourhoodPassDetail findByNpIdAndPassCode(Long neighbourPassId, String passCode);
	
	

}
