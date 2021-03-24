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
import com.society.core.vms.service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {

	@Autowired
	private  CityService service;
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public GlobalResponse findAllCity() {
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getCityListService());
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}	
	

	
	@RequestMapping(value = "{cityId}", method = RequestMethod.POST)
	public GlobalResponse findOneCityController(@PathVariable Integer cityId) {
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getSingleCityByIdService(cityId));
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	@RequestMapping(value = "did", method = RequestMethod.POST)
	public GlobalResponse findCityByDistrictController(@RequestBody IdStringRequest id) {
		
		GlobalResponse response;
		if(null ==id || null == id.getId() || id.getId().isEmpty()) {
			response = new GlobalResponse(false, 200, "not a valid district-Id", null);
		}
		try {
			Integer districtId = Integer.valueOf(id.getId());
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.findCitiesByDistrictService(districtId));
			
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
