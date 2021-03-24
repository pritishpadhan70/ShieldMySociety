package com.society.core.vms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.society.core.vms.dto.RoleDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.response.GlobalResponse;
import com.society.core.vms.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	private RoleService service;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public GlobalResponse getAllRolesController() {

		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getAllRolesService());

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "{roleId}", method = RequestMethod.POST)
	public GlobalResponse getSingleRoleByIdController(@PathVariable int roleId) {

		GlobalResponse response;
		try {
			RoleDTO role = service.getSingleRoleByIdService(roleId);
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(role);

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "names/role", method = RequestMethod.POST)
	public GlobalResponse getAllRolesNameController() {

		GlobalResponse response;
		try {
			List<String> roleNames = service.getAllRolesNameService();
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(roleNames);

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "roles-uid/{userId}", method = RequestMethod.POST)
	public GlobalResponse getRoleByUserIdController(@PathVariable Long userId) {

		GlobalResponse response;
		try {
			List<RoleDTO> roles = service.getRolesByUserIdService(userId);
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(roles);

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "def-role/{userId}", method = RequestMethod.POST)
	public GlobalResponse getDefaultRoleByUserIdController(@PathVariable Long userId) {

		GlobalResponse response;
		try {
			RoleDTO roles = service.getDefaultRoleByUserIdService(userId);
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(roles);

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public GlobalResponse createRoleController(@RequestBody RoleDTO request) {

		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, service.ceateRoleService(request), "");
			// response.setData(menu);

		} catch (PersistanceException | InvalidInputDataException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

}
