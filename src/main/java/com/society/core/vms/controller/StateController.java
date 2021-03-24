package com.society.core.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.request.IdStringRequest;
import com.society.core.vms.response.GlobalResponse;
import com.society.core.vms.service.StateService;

@RestController
@RequestMapping("/state")
public class StateController {

	@Autowired
	private  StateService service;
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public GlobalResponse findAllState() {
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getStateListService());
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}	
	

	
	@RequestMapping(value = "{stateId}", method = RequestMethod.POST)
	public GlobalResponse findOneStateController(@PathVariable long stateId) {
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getSingleStateByIdService(stateId));
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	@RequestMapping(value = "cid", method = RequestMethod.POST)
	public GlobalResponse findStateByCountryController(@RequestBody IdStringRequest id) {
		
		GlobalResponse response;
		if(null ==id || null == id.getId() || id.getId().isEmpty()) {
			response = new GlobalResponse(false, 200, "not a valid Country-Id", null);
		}
		try {
			Long countryId = Long.valueOf(id.getId());
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.findStatesByCountryService(countryId));
			
		} catch (NumberFormatException e) {
			
			response = new GlobalResponse(false, 200, "Invalid Country Id",e.getMessage());
			e.printStackTrace();
		}catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	}
