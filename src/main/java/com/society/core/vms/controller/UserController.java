package com.society.core.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.society.core.vms.dto.ChangePassword;
import com.society.core.vms.dto.GlobalUserDTO;
import com.society.core.vms.dto.LoginDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.LoginException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.exceptions.SocietyException;
import com.society.core.vms.request.IdNumberRequest;
import com.society.core.vms.request.IdStringRequest;
import com.society.core.vms.response.GlobalResponse;
import com.society.core.vms.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;

	/*
	 * @RequestMapping(value = "/", method = RequestMethod.GET) public String home()
	 * {
	 * 
	 * return "This is home"; }
	 */

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public GlobalResponse findAll() {

		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getUserListService());

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 402, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public GlobalResponse loginController(@RequestBody LoginDTO login) {

		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.loginService(login));

		} catch (LoginException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "{userId}", method = RequestMethod.POST)
	public GlobalResponse findOneUserController(@PathVariable long userId) {

		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getSingleUserByIdService(userId));

		} catch (LoginException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public GlobalResponse createUpdateUserController(@RequestBody GlobalUserDTO user) {

		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", service.createUpdateUserService(user));

		} catch (PersistanceException | InvalidInputDataException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "dropdowns", method = RequestMethod.POST)
	public GlobalResponse getUserDropdownController(@RequestBody GlobalUserDTO user) {

		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", null);
			response.setData(service.getUserDropdown(user));

		} catch (DataNotFoundException | InvalidInputDataException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}
	
	@RequestMapping(value = "resetpass", method = RequestMethod.POST)
	public GlobalResponse resetPasswordController(@RequestBody IdNumberRequest id) {

		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, service.resetPasswordService(id.getId()), null);
			//response.setData(service.resetPasswordService(id.getId()));

		} catch (DataNotFoundException | InvalidInputDataException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}
	
	@RequestMapping(value = "changepass", method = RequestMethod.POST)
	public GlobalResponse changePasswordController(@RequestBody ChangePassword pass) {

		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", null);
			response.setData(service.changePasswordService(pass));

		} catch (DataNotFoundException | InvalidInputDataException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}
	
	@RequestMapping(value = "forgotpass", method = RequestMethod.POST)
	public GlobalResponse forgotPasswordController(@RequestBody IdStringRequest request) {

		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", null);
			response.setData(service.forgotPasswordService(request.getId()));

		} catch (DataNotFoundException | InvalidInputDataException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.POST)
	public GlobalResponse logoutController(@RequestBody GlobalUserDTO user) {

		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "you are Successfully logged out", null);
			response.setData(service.logoutService(user));

		} catch (SocietyException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}
}
