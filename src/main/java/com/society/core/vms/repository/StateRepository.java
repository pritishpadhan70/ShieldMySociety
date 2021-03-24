package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.society.core.vms.entity.State;

public interface StateRepository extends CrudRepository<State, Long> {

	List<State> findAll();
	
	State findByStateId(Long stateId);

	List<State> findByCountryId(Long countryId);

}
