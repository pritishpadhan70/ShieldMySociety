package com.society.core.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.society.core.vms.dto.EnrolmentData;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.SocietyException;
import com.society.core.vms.response.GlobalResponse;
import com.society.core.vms.service.SocietyService;

@RestController
@RequestMapping("/societyenrollment")
public class SocietyEnrollmentController {

	@Autowired
	private  SocietyService service;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public GlobalResponse findAllSocietyEnrollment() {
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getAllEnrollSocietyService());
			
		} catch (DataNotFoundException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}	
	

	
	@RequestMapping(value = "{societyEnrollmentId}", method = RequestMethod.POST)
	public GlobalResponse findOneSocietyEnrollmentController(@PathVariable Integer societyId) {
		
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

	
	@RequestMapping(value = "enroll", method = RequestMethod.POST)
	public GlobalResponse saveSocietyEnrollmentController(@RequestBody EnrolmentData data) {
		
		GlobalResponse response;

		if (null == data) {
			response = new GlobalResponse(false, 400, "invalid Enroment data", null);
		}
		try {
			response = new GlobalResponse(true, 200, service.saveSocietyEnrollmentService(data), "");
			//response.setData(service.enrollSocietyService(data));

		} catch (SocietyException e) {

			response = new GlobalResponse(false, 400, e.getMessage(), e.getMessage());
			e.printStackTrace();
		}

		return response;
	}
	
	
	}
