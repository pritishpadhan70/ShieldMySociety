package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.society.core.vms.entity.Flat;

public interface FlatRepository extends CrudRepository<Flat, Long> {

	List<Flat> findAll();
	
	Flat findByFlatId(Long flatId);
}
