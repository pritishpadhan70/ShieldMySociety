package com.society.core.vms.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidInputDataException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidInputDataException() {
		super("Input data is Invalid");
	}
	
	public InvalidInputDataException(String message) {
		super(message);
	}
}
