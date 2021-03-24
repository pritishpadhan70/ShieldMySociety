package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.society.core.vms.entity.Society;

public interface SocietyRepository extends CrudRepository<Society, Integer> {

	List<Society> findAll();
	
	Society findBySocietyId(Integer societyId);

	List<Society> findByDistrict(Integer districtId);
	
	List<Society> findByCity(Integer districtId);
	
	List<Society> findByCountry(Integer districtId);

}
