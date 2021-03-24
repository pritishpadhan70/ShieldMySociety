package com.society.core.vms.service;

import java.util.List;
import java.util.Map;

import com.society.core.vms.dto.VoteDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.request.IdNumberRequest;
import com.society.core.vms.request.IdStringRequest;

public interface VoteService {

	VoteDTO getOneVoteByIdService(long id) throws DataNotFoundException;

	List<VoteDTO> getResultsByVoteNameService(IdStringRequest request) throws DataNotFoundException;

	String createVoteService(VoteDTO request) throws PersistanceException, InvalidInputDataException;

	String createGroupVoteService(VoteDTO request, Long roleId, Long societyId)
			throws PersistanceException, InvalidInputDataException;

	List<VoteDTO> getResultsByUserService(IdNumberRequest request) throws DataNotFoundException;

	Map<String, Integer> getVoteCountService(String id) throws DataNotFoundException;

}
