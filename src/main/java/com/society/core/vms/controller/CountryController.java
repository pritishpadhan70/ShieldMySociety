package com.society.core.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.response.GlobalResponse;
import com.society.core.vms.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController {

	@Autowired
	private  CountryService service;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public GlobalResponse findAllState() {
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getCountryListService());
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}	
	

	
	@RequestMapping(value = "{countryId}", method = RequestMethod.POST)
	public GlobalResponse findOneUserController(@PathVariable long countryId) {
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getSingleCountryByIdService(countryId));
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	}
