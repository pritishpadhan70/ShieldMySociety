package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.sql.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the NEIBOURHOOD_EMPLOYEE database table.
 * 
 */
@Entity
@Table(name="NEIBOURHOOD_EMPLOYEE")
@NamedQuery(name="NeibourhoodEmployee.findAll", query="SELECT n FROM NeibourhoodEmployee n")
public class NeibourhoodEmployee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GenericGenerator(name = "generator", strategy = "increment")
	//@GeneratedValue(generator = "generator")
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="NE_ID")
	private int neId;

	private String address;

	@Column(name="CREATED_DATE")
	private Timestamp createdDate;

	@Column(name="IS_ACTIVE")
	private boolean isActive;

	@Column(name="JOB_DESC")
	private String jobDesc;

	private String name;

	@Column(name="NE_DOB")
	private Date neDob;

	private String phone;

	//bi-directional many-to-one association to NeibourhoodType
	@ManyToOne
	@JoinColumn(name="TYPE")
	private NeibourhoodType neibourhoodType;

	//bi-directional many-to-one association to Neighbourhood
	@ManyToOne
	@JoinColumn(name="NEIGHBOURHOOD_ID")
	private Neighbourhood neighbourhood;

	public NeibourhoodEmployee() {
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

	public NeibourhoodType getNeibourhoodType() {
		return this.neibourhoodType;
	}

	public void setNeibourhoodType(NeibourhoodType neibourhoodType) {
		this.neibourhoodType = neibourhoodType;
	}

	public Neighbourhood getNeighbourhood() {
		return this.neighbourhood;
	}

	public void setNeighbourhood(Neighbourhood neighbourhood) {
		this.neighbourhood = neighbourhood;
	}

}