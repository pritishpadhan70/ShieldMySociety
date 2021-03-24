package com.society.core.vms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {

		return "This is home <BR><BR><BR><BR>" + "<BR> for user : /user" + "<BR> for visitor : /visitor" + "<BR> for Flat: /flat";
	}

}
