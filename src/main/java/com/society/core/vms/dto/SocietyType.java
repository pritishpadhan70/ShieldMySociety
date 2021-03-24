package com.society.core.vms.dto;

import java.io.Serializable;


/**
 * The DTO class for the SOCIETY_TYPE data.
 * 
 */
public class SocietyType implements Serializable {
	private static final long serialVersionUID = 1L;

	private String stId;
	private String areaRange;
	private String criteria1;
	private String societyType;
	private String sqrtftRange;

	public SocietyType() {
	}

	public String getStId() {
		return this.stId;
	}

	public void setStId(String stId) {
		this.stId = stId;
	}

	public String getAreaRange() {
		return this.areaRange;
	}

	public void setAreaRange(String areaRange) {
		this.areaRange = areaRange;
	}

	public String getCriteria1() {
		return this.criteria1;
	}

	public void setCriteria1(String criteria1) {
		this.criteria1 = criteria1;
	}

	public String getSocietyType() {
		return this.societyType;
	}

	public void setSocietyType(String societyType) {
		this.societyType = societyType;
	}

	public String getSqrtftRange() {
		return this.sqrtftRange;
	}

	public void setSqrtftRange(String sqrtftRange) {
		this.sqrtftRange = sqrtftRange;
	}

}