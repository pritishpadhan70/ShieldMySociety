/**
 * 
 */
package com.society.core.vms.request;

import java.io.Serializable;

/**
 * @author deepikadas
 *
 */
public class KeyValueRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -288179518215431047L;
	
	
	private String key;
	private String value;
	
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	

}
