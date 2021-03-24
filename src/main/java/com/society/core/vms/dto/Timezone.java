package com.society.core.vms.dto;

import java.io.Serializable;


/**
 * The data class for the TIMEZONE object table.
 * 
 */
public class Timezone implements Serializable {
	private static final long serialVersionUID = 1L;

	private int tid;
	private String description;
	private String location;
	private String zone;

	public Timezone() {
	}

	public int getTid() {
		return this.tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}