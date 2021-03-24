package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.society.core.vms.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {

	List<Country> findAll();
	
	Country findByCountryId(Long countryId);

}
