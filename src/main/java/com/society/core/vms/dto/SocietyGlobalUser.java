package com.society.core.vms.dto;

import java.io.Serializable;


/**
 * The DTO class for the SOCIETY_GLOBAL_USER data.
 * 
 */
public class SocietyGlobalUser implements Serializable {
	private static final long serialVersionUID = 1L;

	private String sguId;
	private int COmment;
	private int globalUserId;
	private int societyId;

	public SocietyGlobalUser() {
	}

	public String getSguId() {
		return this.sguId;
	}

	public void setSguId(String sguId) {
		this.sguId = sguId;
	}

	public int getCOmment() {
		return this.COmment;
	}

	public void setCOmment(int COmment) {
		this.COmment = COmment;
	}

	public int getGlobalUserId() {
		return this.globalUserId;
	}

	public void setGlobalUserId(int globalUserId) {
		this.globalUserId = globalUserId;
	}

	public int getSocietyId() {
		return this.societyId;
	}

	public void setSocietyId(int societyId) {
		this.societyId = societyId;
	}

}