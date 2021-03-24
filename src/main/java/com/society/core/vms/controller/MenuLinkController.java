package com.society.core.vms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.society.core.vms.dto.MenuLinkDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.response.GlobalResponse;
import com.society.core.vms.service.MenuLinkService;

@RestController
@RequestMapping("menu")
public class MenuLinkController {

	@Autowired
	private MenuLinkService service;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public GlobalResponse getAllMenuController() {

		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(service.getAllMenuService());

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "{menuId}", method = RequestMethod.POST)
	public GlobalResponse getSingleMenuByIdController(@PathVariable int menuId) {

		GlobalResponse response;
		try {
			MenuLinkDTO menu = service.getSingleMenuByIdService(menuId);
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(menu);

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "roleid/{roleId}", method = RequestMethod.POST)
	public GlobalResponse getMenuByRoleIdController(@PathVariable int roleId) {

		GlobalResponse response;
		try {
			List<MenuLinkDTO> menus = service.getMenuByRoleId(roleId);
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(menus);

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "rolename/{roleName}", method = RequestMethod.POST)
	public GlobalResponse getMenuByRoleNameController(@PathVariable String roleName) {

		GlobalResponse response;
		try {
			List<MenuLinkDTO> menus = service.getMenuByRoleName(roleName);
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(menus);

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "admin/{isAdminMenu}", method = RequestMethod.POST)
	public GlobalResponse getAllNoneAdminMenuController(@PathVariable boolean isAdminMenu) {

		GlobalResponse response;
		try {
			List<MenuLinkDTO> menus = service.getAllNoneAdminMenuService(isAdminMenu);
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(menus);

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "common/{isCommom}", method = RequestMethod.POST)
	public GlobalResponse getAllNoneCommonMenuController(@PathVariable boolean isCommom) {

		GlobalResponse response;
		try {
			List<MenuLinkDTO> menus = service.getAllNoneCommonMenuService(isCommom);
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(menus);

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "factory/{isFactDefault}", method = RequestMethod.POST)
	public GlobalResponse getAllNoneFactoryDefaultMenuController(@PathVariable boolean isFactDefault) {

		GlobalResponse response;
		try {
			List<MenuLinkDTO> menus = service.getAllNoneFactoryDefaultMenuService(isFactDefault);
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(menus);

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "parent/{parentMenuId}", method = RequestMethod.POST)
	public GlobalResponse getAllByParentMenuIdController(@PathVariable int parentMenuId) {

		GlobalResponse response;
		try {
			List<MenuLinkDTO> menus = service.getAllByParentMenuIdService(parentMenuId);
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(menus);

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public GlobalResponse createMenuController(@RequestBody MenuLinkDTO request) {

		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, service.createMenuLinkService(request), "");
			// response.setData(menu);

		} catch (PersistanceException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

}
