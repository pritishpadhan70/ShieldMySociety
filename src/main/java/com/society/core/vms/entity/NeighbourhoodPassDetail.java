package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;


/**
 * The persistent class for the NEIGHBOURHOOD_PASS_ENTRY database table.
 * 
 */
@Entity
@Table(name="NEIGHBOURHOOD_PASS_DETAIL")
@NamedQuery(name="NeighbourhoodPassDetail.findAll", query="SELECT n FROM NeighbourhoodPassDetail n")
public class NeighbourhoodPassDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NP_ID")
	private Long npId;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	@Column(name="IS_ACTIVE")
	private boolean isActive;

	@Column(name="PASS_CODE")
	private String passCode;

	@Column(name="PASS_ENTRY_END_TIME")
	private Time passEntryEndTime;

	@Column(name="PASS_ENTRY_START_TIME")
	private Time passEntryStartTime;

	@Column(name="VALID_TILL")
	private Timestamp validTill;

	//bi-directional many-to-one association to Neighbourhood
	@ManyToOne
	@JoinColumn(name="NEIBOURHOOD_ID")
	private Neighbourhood neighbourhood;

	//bi-directional many-to-one association to Neighbourhood_PassType
	@ManyToOne
	@JoinColumn(name="PASS_TYPE")
	private Neighbourhood_PassType neighbourhoodPassType;

	//bi-directional many-to-one association to Society
	@ManyToOne
	@JoinColumn(name="SOCIETY_ID")
	private Society society;

	public NeighbourhoodPassDetail() {
	}

	public Long getNpId() {
		return this.npId;
	}

	public void setNpId(Long npId) {
		this.npId = npId;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getPassCode() {
		return this.passCode;
	}

	public void setPassCode(String passCode) {
		this.passCode = passCode;
	}

	public Time getPassEntryEndTime() {
		return this.passEntryEndTime;
	}

	public void setPassEntryEndTime(Time passEntryEndTime) {
		this.passEntryEndTime = passEntryEndTime;
	}

	public Time getPassEntryStartTime() {
		return this.passEntryStartTime;
	}

	public void setPassEntryStartTime(Time passEntryStartTime) {
		this.passEntryStartTime = passEntryStartTime;
	}

	public Timestamp getValidTill() {
		return this.validTill;
	}

	public void setValidTill(Timestamp validTill) {
		this.validTill = validTill;
	}

	public Neighbourhood getNeighbourhood() {
		return this.neighbourhood;
	}

	public void setNeighbourhood(Neighbourhood neighbourhood) {
		this.neighbourhood = neighbourhood;
	}

	public Neighbourhood_PassType getNeighbourhoodPassType() {
		return this.neighbourhoodPassType;
	}

	public void setNeighbourhoodPassType(Neighbourhood_PassType neighbourhoodPassType) {
		this.neighbourhoodPassType = neighbourhoodPassType;
	}

	public Society getSociety() {
		return this.society;
	}

	public void setSociety(Society society) {
		this.society = society;
	}

}