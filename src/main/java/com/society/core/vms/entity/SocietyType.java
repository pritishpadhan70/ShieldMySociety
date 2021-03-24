package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SOCIETY_TYPE database table.
 * 
 */
@Entity
@Table(name="SOCIETY_TYPE")
@NamedQuery(name="SocietyType.findAll", query="SELECT s FROM SocietyType s")
public class SocietyType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ST_ID")
	private String stId;

	@Column(name="AREA_RANGE")
	private String areaRange;

	private String criteria1;

	@Column(name="SOCIETY_TYPE")
	private String societyType;

	@Column(name="SQRTFT_RANGE")
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