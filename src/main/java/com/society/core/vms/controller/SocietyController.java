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
import com.society.core.vms.service.SocietyService;

@RestController
@RequestMapping("/society")
public class SocietyController {

	@Autowired
	private  SocietyService service;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public GlobalResponse findAllSociety() {
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getSocietyListService());
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}	
	

	
	@RequestMapping(value = "{societyId}", method = RequestMethod.POST)
	public GlobalResponse findOneSocietyController(@PathVariable Integer societyId) {
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getSingleSocietyByIdService(societyId));
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	@RequestMapping(value = "cid", method = RequestMethod.POST)
	public GlobalResponse findSocietyByCityController(@RequestBody IdStringRequest id) {
		
		GlobalResponse response;

		if (null == id || null == id.getId() || id.getId().isEmpty()) {
			response = new GlobalResponse(false, 200, "not a valid city-Id", null);
		}
		try {
			Integer cityId = Integer.valueOf(id.getId());
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getSocietiesByCityIdService(cityId));

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}
	

	

	
	}
