package com.society.core.vms.response;

import java.io.Serializable;

public class GlobalResponse implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3618562326159615699L;
	private boolean status;
	private int code;
	private String message;
	private String detailedMessage;
	private Object data;
	
	
	/**
	 * NO-Argument constructor
	 */
	public GlobalResponse() {
		super();
	}


	/**
	 * Parameterized constructor
	 * @param status
	 * @param code
	 * @param message
	 * @param detailedMessage
	 */
	public GlobalResponse(boolean status, int code, String message, String detailedMessage) {
		super();
		this.status = status;
		this.code = code;
		this.message = message;
		this.detailedMessage = detailedMessage;
	}


	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}


	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}


	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}


	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}


	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}


	/**
	 * @return the detailedMessage
	 */
	public String getDetailedMessage() {
		return detailedMessage;
	}


	/**
	 * @param detailedMessage the detailedMessage to set
	 */
	public void setDetailedMessage(String detailedMessage) {
		this.detailedMessage = detailedMessage;
	}


	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}


	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
	
	

}
