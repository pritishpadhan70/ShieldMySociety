package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.society.core.vms.entity.DailyVisitor;

public interface DailyVisitorRepository extends CrudRepository<DailyVisitor, Long> {

	List<DailyVisitor> findAll();
	
	DailyVisitor findByVisitorPhone(String visitorId);
	

}
