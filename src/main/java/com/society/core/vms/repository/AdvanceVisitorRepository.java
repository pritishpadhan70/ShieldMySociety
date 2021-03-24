package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.society.core.vms.entity.AdvanceVisitorRequest;

public interface AdvanceVisitorRepository extends CrudRepository<AdvanceVisitorRequest, Long> {

	List<AdvanceVisitorRequest> findAll();
	
	AdvanceVisitorRequest findByAvId(Long visitorId);
	
	AdvanceVisitorRequest findByVisitorPhone(String visitorId);

}
