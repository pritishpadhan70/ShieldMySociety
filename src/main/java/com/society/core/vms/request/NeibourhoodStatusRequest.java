/**
 * 
 */
package com.society.core.vms.request;

import java.io.Serializable;

/**
 * @author deepikadas
 *
 */
public class NeibourhoodStatusRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1285230509657181154L;
	/**
	 * 
	 */
	
	
	private String id;
	private String status;
	private String comments;
	/**
	 * 
	 */
	public NeibourhoodStatusRequest() {
		super();
	}
	
	
	
	/**
	 * @param id
	 * @param status
	 * @param comments
	 */
	public NeibourhoodStatusRequest(String id, String status, String comments) {
		super();
		this.id = id;
		this.status = status;
		this.comments = comments;
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
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}
	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	

}
