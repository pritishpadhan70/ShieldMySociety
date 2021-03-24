package com.society.core.vms.dto;

import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;


/**
 * The data class for the NEIGHBOURHOOD_PASS_ENTRY object table.
 * 
 */
public class NeighbourhoodPassDetailDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long npId;
	private Timestamp createdDate;
	private boolean isActive;
	private String passCode;
	private Time passEntryEndTime;
	private Time passEntryStartTime;
	private Timestamp validTill;

	//bi-directional many-to-one association to Neighbourhood
	private NeighbourhoodDTO neighbourhood;

	//bi-directional many-to-one association to Neighbourhood_PassType
	private Neighbourhood_PassTypeDTO neighbourhoodPassType;

	//bi-directional many-to-one association to Society
	private SocietyDTO society;

	public NeighbourhoodPassDetailDTO() {
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

	public NeighbourhoodDTO getNeighbourhood() {
		return this.neighbourhood;
	}

	public void setNeighbourhood(NeighbourhoodDTO neighbourhood) {
		this.neighbourhood = neighbourhood;
	}

	public Neighbourhood_PassTypeDTO getNeighbourhoodPassType() {
		return this.neighbourhoodPassType;
	}

	public void setNeighbourhoodPassType(Neighbourhood_PassTypeDTO neighbourhoodPassType) {
		this.neighbourhoodPassType = neighbourhoodPassType;
	}

	public SocietyDTO getSociety() {
		return this.society;
	}

	public void setSociety(SocietyDTO society) {
		this.society = society;
	}

}