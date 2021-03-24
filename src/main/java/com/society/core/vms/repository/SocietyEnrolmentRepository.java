package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.society.core.vms.entity.SocietyEnrolment;

public interface SocietyEnrolmentRepository extends CrudRepository<SocietyEnrolment, Long> {

	List<SocietyEnrolment> findAll();
	List<SocietyEnrolment> findByIsClosedFalse();
	
	SocietyEnrolment findBySocietyId(Integer societyId);

	List<SocietyEnrolment> findByDistrict(Integer districtId);
	
	List<SocietyEnrolment> findByCity(Integer districtId);
	
	List<SocietyEnrolment> findByCountry(Integer districtId);
	
	SocietyEnrolment findById(Integer societyEnrolmentId);

}
