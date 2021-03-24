package com.society.core.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.society.core.vms.dto.NeighbourhoodDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.request.NeibourhoodStatusRequest;
import com.society.core.vms.response.GlobalResponse;
import com.society.core.vms.service.NeighbourhoodService;
import com.society.core.vms.util.ValidationUtils;

@RestController
@RequestMapping("/nbr")
public class NeighbourhoodController {

	@Autowired
	private  NeighbourhoodService service;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public GlobalResponse findAllNeighbourhoodController() {
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getAllNeighbourhoodService());
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}	
	

	
	@RequestMapping(value = "{neighbourId}", method = RequestMethod.POST)
	public GlobalResponse findOneNeighbourhoodController(@PathVariable Integer neighbourId) {
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getSingleNeighbourhoodByIdService(neighbourId));
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public GlobalResponse createNeighbourhoodController(@RequestBody NeighbourhoodDTO dto) {
		
		GlobalResponse response;

		if (null == dto) {
			response = new GlobalResponse(false, 200, "Invalid object/data", null);
		}
		try {
			response = new GlobalResponse(true, 200, service.createNeighbourhoodService(dto), "");
			//response.setData(service.createNeighbourhoodService(dto));

		} catch (PersistanceException | InvalidInputDataException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}
	
	@RequestMapping(value = "statusupdate", method = RequestMethod.POST)
	public GlobalResponse updateNeighbourhoodStatusController(@RequestBody NeibourhoodStatusRequest dto) {
		
		GlobalResponse response;

		if (null == dto|| dto.getId()==null || dto.getStatus()==null) {
			return new GlobalResponse(false, 500, "Invalid object/data", null);
		}
		
		if(!ValidationUtils.isValidStatusValue(dto.getStatus())) {
			return new GlobalResponse(false, 500, "Invalid STATUS value provided: " + dto.getStatus(), null);

		}
			
		try {
			response = new GlobalResponse(true, 200, service.updateNeighbourhoodStatusService(dto), "");
			//response.setData(service.createNeighbourhoodService(dto));

		} catch (PersistanceException | InvalidInputDataException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}
	

	
	}
