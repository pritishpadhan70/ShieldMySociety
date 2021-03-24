package com.society.core.vms.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SocietyException extends Exception {

	private static final long serialVersionUID = 1L;

	public SocietyException() {
		super("Society Application Exception");
	}
	
	public SocietyException(String message) {
		super(message);
	}
}
