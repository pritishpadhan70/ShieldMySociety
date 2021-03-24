package com.society.core.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.society.core.vms.dto.DailyVisitorDTO;
import com.society.core.vms.dto.VisitorDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.request.IdStringRequest;
import com.society.core.vms.response.GlobalResponse;
import com.society.core.vms.service.VisitorService;

@RestController
@RequestMapping("/visitor")
public class VisitorController {

	@Autowired
	private  VisitorService service;
	
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
			response.setData(service.getVisitorListService());
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, e.getMessage(), null);
			e.printStackTrace();
		}
		
		return response;
	}	
	
	@RequestMapping(value = "{visitorId}", method = RequestMethod.POST)
	public GlobalResponse findOneFlatController(@PathVariable long visitorId) {
		
		GlobalResponse response;
		try {
			VisitorDTO visitor = service.getSingleVisitorByIdService(visitorId);
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(visitor);
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, e.getMessage(), null);
			e.printStackTrace();
		}
		
		return response;
	}
	
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public GlobalResponse createUpdateUserController(@RequestBody VisitorDTO visitor) {

		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", service.createUpdateVisitorService(visitor));

		} catch (PersistanceException | InvalidInputDataException e) {

			response = new GlobalResponse(false, 200, e.getMessage(), null);
			e.printStackTrace();
		}

		return response;
	}
	
	@RequestMapping(value = "fetchVisitorData", method = RequestMethod.POST)
	public GlobalResponse fetchVisitorController(@RequestBody IdStringRequest phone) {

		GlobalResponse response;
		try {
			DailyVisitorDTO dailyVisitor =  service.fetchDailyVisitorByPhoneService(phone);
			response = new GlobalResponse(true, 200, "Success",null);
			response.setData(dailyVisitor);

		} catch (PersistanceException | InvalidInputDataException | DataNotFoundException e) {

			response = new GlobalResponse(false, 200, e.getMessage(), null);
			e.printStackTrace();
		}

		return response;
	}
	
	}
