package com.society.core.vms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.society.core.vms.dto.FlatDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.InvalidInputDataException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.response.GlobalResponse;
import com.society.core.vms.service.FlatService;

@RestController
@RequestMapping("/flat")
public class FlatController {

	@Autowired
	private FlatService service;

	/*
	 * @RequestMapping(value = "/", method = RequestMethod.GET) public String home()
	 * {
	 * 
	 * return "This is FLAT home "; }
	 */

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public GlobalResponse findAllFlatController() {

		GlobalResponse response;
		try {
			List<FlatDTO> flats = service.getFlatListService();
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(flats);

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}

	@RequestMapping(value = "{flatId}", method = RequestMethod.POST)
	public GlobalResponse findOneFlatController(@PathVariable long flatId) {

		GlobalResponse response;
		try {
			FlatDTO flat = service.getSingleFlatByIdService(flatId);
			response = new GlobalResponse(true, 200, "Success", "");
			response.setData(flat);

		} catch (DataNotFoundException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}
	
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public GlobalResponse createUpdateFlatController(@RequestBody FlatDTO flat) {

		GlobalResponse response;
		try {
			response = new GlobalResponse(true, 200, "Success", service.createUpdateFlatService(flat));

		} catch (PersistanceException | InvalidInputDataException e) {

			response = new GlobalResponse(false, 200, "Failure", e.getMessage());
			e.printStackTrace();
		}

		return response;
	}
}
