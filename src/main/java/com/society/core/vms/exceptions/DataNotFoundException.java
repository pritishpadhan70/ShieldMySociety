package com.society.core.vms.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DataNotFoundException extends SocietyException {

	private static final long serialVersionUID = 1L;

	public DataNotFoundException() {
		super("Record does not exist");
	}
	public DataNotFoundException(String message) {
		super(message);
	}
}
