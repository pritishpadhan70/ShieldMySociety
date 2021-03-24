package com.society.core.vms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.society.core.vms.dto.VoteDTO;
import com.society.core.vms.entity.Vote;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.repository.VoteRepository;
import com.society.core.vms.request.IdNumberRequest;
import com.society.core.vms.request.IdStringRequest;
import com.society.core.vms.service.VoteService;
import com.society.core.vms.util.ConversionUtility;

@Service("voteService")
public class VoteServiceImpl implements VoteService {
	
	@Autowired
	VoteRepository repository;

	@Override
	public VoteDTO getOneVoteByIdService(long id) throws DataNotFoundException {

		Vote entity = repository.findByVid(id);
		if(entity == null) {
			throw new DataNotFoundException(" no vote found for given ID");
		}
		return ConversionUtility.entityToDataObject(entity);
	}

	@Override
	public List<VoteDTO> getResultsByVoteNameService(IdStringRequest request) throws DataNotFoundException {

		List<Vote> entities = repository.findByVoteName(request.getId());
		if(entities == null || entities.isEmpty()) {
			throw new DataNotFoundException("No new Votes fou you");
		}
		return ConversionUtility.voteEntityListToDataObject(entities);
	}

	@Override
	public List<VoteDTO> getResultsByUserService(IdNumberRequest request) throws DataNotFoundException {

		List<Vote> entities = repository.findByForUser(request.getId());
		if(entities == null || entities.isEmpty()) {
			throw new DataNotFoundException("No new Votes fou you");
		}
		return ConversionUtility.voteEntityListToDataObject(entities);
	}
	
	
	@Override
	public String createVoteService(VoteDTO request) throws PersistanceException, InvalidInputDataException {
		
		repository.save(ConversionUtility.dataObjectToEntity(request));
		
		return "Notification Created succefully";
	}


	@Override
	public String createGroupVoteService(VoteDTO request, Long roleId, Long societyId) throws PersistanceException, InvalidInputDataException {
		//TODO: implementation of Group notification.
		//repository.save(ConversionUtility.dataObjectToEntity(request));
		
		return "Group Notification Created succefully for Role: " + roleId + "Society: " + societyId ;
	}

	@Override
	public Map<String, Integer> getVoteCountService(String id) throws DataNotFoundException {
		Map<String,Integer> voteCount = new HashMap<String, Integer>();
		
		//List<Vote> entities = repository.findByVoteName(id);
		List<Vote> entities = repository.findByVoteSubject(id);
		
		if(entities == null || entities.isEmpty()) {
			throw new DataNotFoundException("No votes count for this vote");
		}
		
		for (Vote vote : entities) {
			
			String votedValue = vote.getUserSelectedButton().getButtonName();
			
			if( voteCount.get(votedValue) == null) {
				
				voteCount.put(votedValue, 0);
			}else {
				voteCount.put(votedValue, voteCount.get(votedValue)+1);
			}
		}
		
		
		return voteCount;
	}
}
