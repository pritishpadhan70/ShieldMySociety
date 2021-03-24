/**
 * 
 */
package com.society.core.vms.request;

import java.io.Serializable;

/**
 * @author deepikadas
 *
 */
public class IdStringRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4954061568207310068L;
	
	private String id;
	
	

	/**
	 * 
	 */
	public IdStringRequest() {
		super();
	}

	
	
	/**
	 * @param id
	 */
	public IdStringRequest(String id) {
		super();
		this.id = id;
	}



	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	

}
