package com.society.core.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.society.core.vms.dto.AdvanceVisitorRequestDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.OtpException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.request.KeyValueRequest;
import com.society.core.vms.response.GlobalResponse;
import com.society.core.vms.service.AdvanceVisitorService;

@RestController
@RequestMapping("/avr")
public class AdvanceVisitorController {

	@Autowired
	private  AdvanceVisitorService service;
	
	/*
	 * @RequestMapping(value = "/", method = RequestMethod.GET) public String home()
	 * {
	 * 
	 * return "This is FLAT home "; }
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public GlobalResponse findAllVisitors() {
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getAdvVisitorListService());
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}	
	
	@RequestMapping(value = "{avrId}", method = RequestMethod.POST)
	public GlobalResponse findOneFlatController(@PathVariable long visitorId) {
		
		GlobalResponse response;
		try {
			AdvanceVisitorRequestDTO visitor = service.getSingleVisitorByIdService(visitorId);
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(visitor);
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public GlobalResponse createController(@RequestBody  AdvanceVisitorRequestDTO request) {
		
		GlobalResponse response;
		try {
			//AdvanceVisitorRequestDTO visitor = service.createAdvVisitorService(request);
			response = new GlobalResponse(true, 200, service.createAdvVisitorService(request), "");
			//response.setData(visitor);
			
		} catch (PersistanceException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	//otp verification of advance visitor request.
	@RequestMapping(value = "/verify", method = RequestMethod.POST)
	public GlobalResponse verifyAdvVisitorRequestController(@RequestBody  KeyValueRequest request) {
		
		GlobalResponse response;
		try {
			//AdvanceVisitorRequestDTO visitor = service.createAdvVisitorService(request);
			response = new GlobalResponse(true, 200, service.verifyAdvVisitorRequestService(request), "");
			//response.setData(visitor);
			
		} catch (PersistanceException | OtpException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	}
