package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.society.core.vms.entity.Vote;

public interface VoteRepository extends CrudRepository<Vote, Long> {

	Vote findByVid(long id);

	List<Vote> findByForUser(long id);

	List<Vote> findByVoteName(String id);
	
	//@Query("")
	//List<Vote> findByVoteSubject_subject();
	
	
	@Query("select v from Vote v where v.voteSubject.subject =:subject")
	List<Vote> findByVoteSubject(@Param("subject")String subject);
	

}
