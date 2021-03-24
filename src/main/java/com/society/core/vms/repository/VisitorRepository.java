package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.society.core.vms.entity.Visitor;
import com.society.core.vms.entity.VisitorType;

public interface VisitorRepository extends CrudRepository<Visitor, Long> {

	List<Visitor> findAll();
	
	Visitor findByVid(Long visitorId);
	
	@Query("select vt from VisitorType vt where vt.vtId=:id")
	VisitorType findByVtId(@Param("id") int id);

}
