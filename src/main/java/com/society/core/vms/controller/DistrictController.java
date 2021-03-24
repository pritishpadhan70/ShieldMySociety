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
import com.society.core.vms.service.DistrictService;

@RestController
@RequestMapping("/district")
public class DistrictController {

	@Autowired
	private  DistrictService service;
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public GlobalResponse findAllState() {
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getDistrictListService());
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}	
	

	
	@RequestMapping(value = "{districtId}", method = RequestMethod.POST)
	public GlobalResponse findOneUserController(@PathVariable long districtId) {
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getSingleDistrictByIdService(districtId));
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	@RequestMapping(value = "sid", method = RequestMethod.POST)
	public GlobalResponse findStateByCountryController(@RequestBody IdStringRequest id) {
		
		GlobalResponse response;
		if(null ==id || null == id.getId() || id.getId().isEmpty()) {
			response = new GlobalResponse(false, 200, "not a valid State-Id", null);
		}
		try {
			Long stateId = Long.valueOf(id.getId());
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.findDistrictsByStateService(stateId));
			
		} catch (NumberFormatException e) {
			
			response = new GlobalResponse(false, 200, "Invalid State Id",e.getMessage());
			e.printStackTrace();
		}catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	}
