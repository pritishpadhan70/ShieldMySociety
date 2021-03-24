package com.society.core.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.society.core.vms.dto.NotificationDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.request.IdNumberRequest;
import com.society.core.vms.response.GlobalResponse;
import com.society.core.vms.service.NotificationService;

@RestController
@RequestMapping("/notification")
public class NotificationController {

	@Autowired
	private  NotificationService service;
	
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public GlobalResponse createNotificationController(@RequestBody NotificationDTO request) {
		
		if(null ==request|| request.getForUser()==null || request.getDescription().isEmpty()
				) {
			
			return new GlobalResponse(false, 200, "InvalidRequest", null);
		}
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, service.createNotificationService(request), "");
			//response.setData(service.createOtpervice(request));
			
		} catch (PersistanceException | InvalidInputDataException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	@RequestMapping(value = "getone", method = RequestMethod.POST)
	public GlobalResponse getOneNofiicationController(@RequestBody IdNumberRequest request) {
		
		GlobalResponse response;
		if(null == request) {
			response = new GlobalResponse(false, 200, "not a valid request", null);
		}
		try {
			response = new GlobalResponse(true, 200, "SUCCESS", "");
			response.setData(service.getOneNOtificationByIdService(request.getId()));
			
		}catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, e.getMessage(),e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	@RequestMapping(value = "getall", method = RequestMethod.POST)
	public GlobalResponse getNofiicationForUserController(@RequestBody IdNumberRequest request) {
		
		GlobalResponse response;
		if(null == request) {
			response = new GlobalResponse(false, 200, "not a valid request", null);
		}
		try {
			response = new GlobalResponse(true, 200, "SUCCESS", "");
			response.setData(service.getNofiicationsForUserService(request));
			
		}catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, e.getMessage(),e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	@RequestMapping(value = "verifyotp", method = RequestMethod.POST)
	public GlobalResponse getOneNOtificationByIdController(@RequestBody IdNumberRequest request) {
		
		GlobalResponse response;
		if(null == request || request.getId()==0) {
			response = new GlobalResponse(false, 200, "not a valid request", null);
		}
		try {
			response = new GlobalResponse(true, 200, "SUCCESS", "");
			response.setData(service.getOneNOtificationByIdService((int)request.getId()));
			
		}catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, e.getMessage(),e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	}
