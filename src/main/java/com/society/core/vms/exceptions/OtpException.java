package com.society.core.vms.exceptions;

public class OtpException extends SocietyException {
	private static final long serialVersionUID = 1L;

	public OtpException() {
		super("Input data is Invalid");
	}

	public OtpException(String message) {
		super(message);
	}
}
