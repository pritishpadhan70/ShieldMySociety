package com.society.core.vms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(VmsApplication.class, args);
	}

}

/*
 * [Deprecation] CSS cannot be loaded from `file:` URLs unless they end in a
 * `.css` file extension. Society_Admin_Access.htm#:1 Access to XMLHttpRequest
 * at
 * 'file:///F:/idea_team_project/HTML%20pages/HTML%20pages/test/SocietyEnrolment
 * /SocietyEnrollmentDetails.htm' from origin 'null' has been blocked by CORS
 * policy: Cross origin requests are only supported for protocol schemes: http,
 * data, chrome, chrome-extension, https. jquery-3.5.1.js:10099 GET
 * file:///F:/idea_team_project/HTML%20pages/HTML%20page
 */