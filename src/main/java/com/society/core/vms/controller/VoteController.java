package com.society.core.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.society.core.vms.dto.VoteDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.request.IdNumberRequest;
import com.society.core.vms.request.IdStringRequest;
import com.society.core.vms.response.GlobalResponse;
import com.society.core.vms.service.VoteService;

@RestController
@RequestMapping("/vote")
public class VoteController {

	@Autowired
	private VoteService service;

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public GlobalResponse createVoteController(@RequestBody VoteDTO request) {

		if (null == request || request.getForUser() == null || request.getDescription().isEmpty()) {

			return new GlobalResponse(false, 200, "InvalidRequest", null);
		}

		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, service.createVoteService(request), "");
			// response.setData(service.createOtpervice(request));

		} catch (PersistanceException | InvalidInputDataException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "{voteId}", method = RequestMethod.POST)
	public GlobalResponse getOneVoteController(@PathVariable Long voteId) {

		GlobalResponse response;
		if (null == voteId) {
			response = new GlobalResponse(false, 200, "not a valid request", null);
		}
		try {
			response = new GlobalResponse(true, 200, "SUCCESS", "");
			response.setData(service.getOneVoteByIdService(voteId));

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, e.getMessage(), e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "votename", method = RequestMethod.POST)
	public GlobalResponse getNofiicationForUserController(@RequestBody IdStringRequest request) {

		GlobalResponse response;
		if (null == request) {
			response = new GlobalResponse(false, 200, "not a valid request", null);
		}
		try {
			response = new GlobalResponse(true, 200, "SUCCESS", "");
			response.setData(service.getResultsByVoteNameService(request));

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, e.getMessage(), e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "userid", method = RequestMethod.POST)
	public GlobalResponse getResultsByUserController(@RequestBody IdNumberRequest request) {

		GlobalResponse response;
		if (null == request) {
			response = new GlobalResponse(false, 200, "not a valid request", null);
		}
		try {
			response = new GlobalResponse(true, 200, "SUCCESS", "");
			response.setData(service.getResultsByUserService(request));

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, e.getMessage(), e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "creategroup", method = RequestMethod.POST)
	public GlobalResponse createGroupVoteController(@RequestBody VoteDTO request) {

		GlobalResponse response;
		if (null == request || request.getRoleId() == null || request.getSocietyId() == null
				|| request.getVoteText() == null || request.getVoteText().trim().isEmpty()) {
			response = new GlobalResponse(false, 200, "not a valid request", null);
		}
		try {
			response = new GlobalResponse(true, 200, "SUCCESS", "");
			response.setData(service.createGroupVoteService(request, request.getRoleId(), request.getSocietyId()));

		} catch (PersistanceException | InvalidInputDataException e) {

			response = new GlobalResponse(false, 200, e.getMessage(), e.getMessage());
			e.printStackTrace();
		}

		return response;
	}
	

	@RequestMapping(value = "votecount/", method = RequestMethod.POST)
	public GlobalResponse getVoteCountController(@RequestBody IdStringRequest request) {

		GlobalResponse response;
		if (null == request || request.getId() == null || 
				request.getId().trim().isEmpty()) {
			
			response = new GlobalResponse(false, 200, "not a valid request", null);
		}
		try {
			response = new GlobalResponse(true, 200, "SUCCESS", "");
			response.setData(service.getVoteCountService(request.getId()));

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, e.getMessage(), e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

}
