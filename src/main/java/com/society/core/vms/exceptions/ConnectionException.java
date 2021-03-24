package com.society.core.vms.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ConnectionException extends SocietyException {

	private static final long serialVersionUID = 1L;

	public ConnectionException() {
		super("Issue with connectivity");
	}
	
	public ConnectionException(String message) {
		super(message);
	}
}
