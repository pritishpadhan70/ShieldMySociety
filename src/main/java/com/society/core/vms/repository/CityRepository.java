package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.society.core.vms.entity.City;

public interface CityRepository extends CrudRepository<City, Integer> {

	List<City> findAll();
	
	City findByCid(Integer cityId);

	List<City> findByDistrictId(Integer districtId);

}
