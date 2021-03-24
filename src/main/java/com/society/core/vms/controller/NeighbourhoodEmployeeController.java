package com.society.core.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.society.core.vms.dto.NeibourhoodEmployeeDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.response.GlobalResponse;
import com.society.core.vms.service.NeighbourhoodEmployeeService;

@RestController
@RequestMapping("/nbremployee")
public class NeighbourhoodEmployeeController {

	@Autowired
	private  NeighbourhoodEmployeeService service;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public GlobalResponse findAllNeighbourhoodEmployeeController() {
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getAllNeighbourhoodEmployeeService());
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}	
	

	
	@RequestMapping(value = "{neighbourEmpId}", method = RequestMethod.POST)
	public GlobalResponse findOneNeighbourhoodEmployeeController(@PathVariable Integer neighbourEmpId) {
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getSingleNeighbourhoodEmployeeByIdService(neighbourEmpId));
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 500, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public GlobalResponse createNeighbourhoodEmployeeController(@RequestBody NeibourhoodEmployeeDTO dto) {
		
		GlobalResponse response;

		if (null == dto) {
			response = new GlobalResponse(false, 200, "Invalid object/data", null);
		}
		try {
			response = new GlobalResponse(true, 200, service.createNeighbourhoodEmployeeService(dto), "");
			//response.setData(service.createNeighbourhoodService(dto));

		} catch (PersistanceException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}
	

	

	
	}
