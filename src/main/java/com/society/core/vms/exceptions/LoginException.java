package com.society.core.vms.exceptions;

public class LoginException extends SocietyException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5897860892659141244L;
	
	public LoginException() {
		super("Exception while logging in Application");
	}
	public LoginException(String message) {
		super(message);
	}

}
