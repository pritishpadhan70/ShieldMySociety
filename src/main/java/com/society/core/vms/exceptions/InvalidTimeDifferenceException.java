package com.society.core.vms.exceptions;

public class InvalidTimeDifferenceException extends SocietyException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4987049297274271825L;
	
	public InvalidTimeDifferenceException() {
		super("Exception while finding diffrence in 2 TimeStamps");
	}
	public InvalidTimeDifferenceException(String message) {
		super(message);
	}
}
