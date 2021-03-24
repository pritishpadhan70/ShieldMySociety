package com.society.core.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.society.core.vms.exceptions.SocietyException;
import com.society.core.vms.request.IdNumberRequest;
import com.society.core.vms.request.KeyValueRequest;
import com.society.core.vms.request.PhoneEmailRequest;
import com.society.core.vms.response.GlobalResponse;
import com.society.core.vms.service.OtpService;

@RestController
@RequestMapping("/otp")
public class OtpController {

	@Autowired
	private  OtpService service;
	


	
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public GlobalResponse createOtpController(@RequestBody PhoneEmailRequest request) {
		
		if(null ==request|| request.getPhone()==null || request.getPhone().isEmpty()
				|| request.getEmail() == null || request.getEmail().isEmpty()) {
			return new GlobalResponse(false, 200, "InvalidRequest", null);
		}
		
		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, service.createOtpervice(request), "");
			//response.setData(service.createOtpervice(request));
			
		} catch (SocietyException e) {
			
			response = new GlobalResponse(false, 200, "Failure",e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	@RequestMapping(value = "verify", method = RequestMethod.POST)
	public GlobalResponse verifyOtpPhoneController(@RequestBody KeyValueRequest request) {
		
		GlobalResponse response;
		if(null == request) {
			response = new GlobalResponse(false, 200, "not a valid request", null);
		}
		try {
			response = new GlobalResponse(true, 200, "SUCCESS", "");
			response.setData(service.verifyOtpPhoneService(request));
			
		}catch (SocietyException e) {
			
			response = new GlobalResponse(false, 200, e.getMessage(),e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	@RequestMapping(value = "verifyotp", method = RequestMethod.POST)
	public GlobalResponse verifyOtpUserRegdController(@RequestBody IdNumberRequest request) {
		
		GlobalResponse response;
		if(null == request || request.getId()==0) {
			response = new GlobalResponse(false, 200, "not a valid request", null);
		}
		try {
			response = new GlobalResponse(true, 200, "SUCCESS", "");
			response.setData(service.verifyOtpUserRegdService((int)request.getId()));
			
		}catch (SocietyException e) {
			
			response = new GlobalResponse(false, 200, e.getMessage(),e.getMessage());
			e.printStackTrace();
		}
		
		return response;
	}
	
	}
