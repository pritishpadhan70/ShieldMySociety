/**
 * 
 */
package com.society.core.vms.request;

import java.io.Serializable;

/**
 * @author deepikadas
 *
 */
public class IdNumberRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -785704301023705421L;
	private long id ;
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	

}
