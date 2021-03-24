package com.society.core.vms.exceptions;

public class PersistanceException extends SocietyException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5897860892659141244L;
	
	public PersistanceException() {
		super("Exception while saving/updating in Application");
	}
	public PersistanceException(String message) {
		super(message);
	}

}
