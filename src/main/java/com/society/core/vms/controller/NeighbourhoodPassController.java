package com.society.core.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.society.core.vms.dto.NeighbourhoodPassDetailDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.GatePassValidationException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.response.GlobalResponse;
import com.society.core.vms.service.NeighbourhoodPassDetailService;

@RestController
@RequestMapping("/nbrpass")
public class NeighbourhoodPassController {

	@Autowired
	private  NeighbourhoodPassDetailService service;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public GlobalResponse findAllNeighbourhoodPassDetailController() {
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getAllNeighbourhoodPassDetailService());
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}	
	

	
	@RequestMapping(value = "{neighbourPass}", method = RequestMethod.POST)
	public GlobalResponse findOneNeighbourhoodPassDetailController(@PathVariable Long neighbourPass) {
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getSingleNeighbourhoodPassDetailByIdService(neighbourPass));
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public GlobalResponse createNeighbourhoodPassDetailController(@RequestBody NeighbourhoodPassDetailDTO dto) {
		
		GlobalResponse response;

		if (null == dto) {
			response = new GlobalResponse(false, 200, "Invalid object/data", null);
		}
		try {
			response = new GlobalResponse(true, 200, service.createNeighbourhoodPassDetailService(dto), "");
			//response.setData(service.createNeighbourhoodService(dto));

		} catch (PersistanceException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}
	
	@RequestMapping(value = "verify", method = RequestMethod.POST)
	public GlobalResponse verifyNeighbourhoodPassDetailController(@RequestBody NeighbourhoodPassDetailDTO dto) {
		
		GlobalResponse response;

		if (null == dto) {
			response = new GlobalResponse(false, 200, "Invalid object/data", null);
		}
		try {
			response = new GlobalResponse(true, 200, service.verifyNeighbourhoodPassDetailService(dto), "");
			//response.setData(service.createNeighbourhoodService(dto));

		} catch (GatePassValidationException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}
	

	
	}
