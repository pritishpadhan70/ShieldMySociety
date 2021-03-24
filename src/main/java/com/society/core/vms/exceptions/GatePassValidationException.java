package com.society.core.vms.exceptions;

public class GatePassValidationException extends SocietyException {
	private static final long serialVersionUID = 1L;

	public GatePassValidationException() {
		super("Gate pass code is invalid");
	}

	public GatePassValidationException(String message) {
		super(message);
	}
}
