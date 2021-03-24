package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.society.core.vms.entity.Neighbourhood;

public interface NeighbourhoodRepository extends CrudRepository<Neighbourhood, Long> {

	List<Neighbourhood> findAll();
	
	Neighbourhood findByNid(Long neighbourhoodId);

	@Modifying
	@Transactional
	@Query("UPDATE Neighbourhood n set n.statusId =:status, n.comment =:comment WHERE n.nid=:id")
	int updateStatus(@Param("id")Long id, @Param("comment") String comment, @Param("status") String status);

}
