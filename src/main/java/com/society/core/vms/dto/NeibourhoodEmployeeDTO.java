package com.society.core.vms.dto;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;


/**
 * The data class for the NEIBOURHOOD_EMPLOYEE object table.
 * 
 */
public class NeibourhoodEmployeeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int neId;
	private String address;
	private Timestamp createdDate;
	private boolean isActive;
	private String jobDesc;
	private String name;
	private Date neDob;
	private String phone;

	//bi-directional many-to-one association to NeibourhoodType
	private NeibourhoodTypeDTO neibourhoodType;

	//bi-directional many-to-one association to Neighbourhood
	private NeighbourhoodDTO neighbourhood;

	public NeibourhoodEmployeeDTO() {
	}

	public int getNeId() {
		return this.neId;
	}

	public void setNeId(int neId) {
		this.neId = neId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getJobDesc() {
		return this.jobDesc;
	}

	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getNeDob() {
		return this.neDob;
	}

	public void setNeDob(Date neDob) {
		this.neDob = neDob;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public NeibourhoodTypeDTO getNeibourhoodType() {
		return this.neibourhoodType;
	}

	public void setNeibourhoodType(NeibourhoodTypeDTO neibourhoodType) {
		this.neibourhoodType = neibourhoodType;
	}

	public NeighbourhoodDTO getNeighbourhood() {
		return this.neighbourhood;
	}

	public void setNeighbourhood(NeighbourhoodDTO neighbourhood) {
		this.neighbourhood = neighbourhood;
	}

}