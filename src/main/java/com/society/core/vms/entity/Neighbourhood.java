package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the NEIGHBOURHOOD database table.
 * 
 */
@Entity
@NamedQuery(name="Neighbourhood.findAll", query="SELECT n FROM Neighbourhood n")
public class Neighbourhood implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long nid;

	@Column(name="ACTIVATION_DATE")
	private Timestamp activationDate;

	private String address;

	@Column(name="CONTACT_NUMBER")
	private String contactNumber;

	@Column(name="GPS_TAG_VALUE")
	private String gpsTagValue;

	private String gstin;

	@Column(name="IS_ACTIVE")
	private boolean isActive;

	@Column(name="IS_PASSCODE_ENTRY_AUTHORISED")
	private boolean isPasscodeEntryAuthorised;

	private String location;

	@Column(name="MANAGER_NAME")
	private String managerName;

	@Column(name="NEIGHBOUR_NAME")
	private String neighbourName;

	@Column(name="OWNER_NAME")
	private String ownerName;

	private String pan;

	@Column(name="REGD_ADDRESS")
	private String regdAddress;

	@Column(name="REGD_DATE")
	private Timestamp regdDate;

	@Column(name="REGD_NO")
	private String regdNo;

	//@Column(name="SHOP_NUMBER")
	//private int shopNumber;

	@Column(name="STATUS_ID")
	private String statusId;
	
	
	@Column(name="STATUS_COMMENT")
	private String comment;
	

	@Column(name="USER_ID")
	private BigInteger userId;

	//bi-directional many-to-one association to NeibourhoodEmployee
	@OneToMany(mappedBy="neighbourhood")
	private List<NeibourhoodEmployee> neibourhoodEmployees;

	//bi-directional many-to-one association to NeibourhoodType
	@ManyToOne
	@JoinColumn(name="TYPE")
	private NeibourhoodType neibourhoodType;

	//bi-directional many-to-one association to NeighbourhoodPassDetail
	@OneToMany(mappedBy="neighbourhood")
	private List<NeighbourhoodPassDetail> neighbourhoodPassDetails;

	public Neighbourhood() {
	}

	
	
	/**
	 * @return the nid
	 */
	public Long getNid() {
		return nid;
	}



	/**
	 * @param nid the nid to set
	 */
	public void setNid(Long nid) {
		this.nid = nid;
	}



	/**
	 * @return the activationDate
	 */
	public Timestamp getActivationDate() {
		return activationDate;
	}



	/**
	 * @param activationDate the activationDate to set
	 */
	public void setActivationDate(Timestamp activationDate) {
		this.activationDate = activationDate;
	}



	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}



	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}



	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}



	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}



	/**
	 * @return the gpsTagValue
	 */
	public String getGpsTagValue() {
		return gpsTagValue;
	}



	/**
	 * @param gpsTagValue the gpsTagValue to set
	 */
	public void setGpsTagValue(String gpsTagValue) {
		this.gpsTagValue = gpsTagValue;
	}



	/**
	 * @return the gstin
	 */
	public String getGstin() {
		return gstin;
	}



	/**
	 * @param gstin the gstin to set
	 */
	public void setGstin(String gstin) {
		this.gstin = gstin;
	}



	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return isActive;
	}



	/**
	 * @param isActive the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}



	/**
	 * @return the isPasscodeEntryAuthorised
	 */
	public boolean isPasscodeEntryAuthorised() {
		return isPasscodeEntryAuthorised;
	}



	/**
	 * @param isPasscodeEntryAuthorised the isPasscodeEntryAuthorised to set
	 */
	public void setPasscodeEntryAuthorised(boolean isPasscodeEntryAuthorised) {
		this.isPasscodeEntryAuthorised = isPasscodeEntryAuthorised;
	}



	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}



	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}



	/**
	 * @return the managerName
	 */
	public String getManagerName() {
		return managerName;
	}



	/**
	 * @param managerName the managerName to set
	 */
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}



	/**
	 * @return the neighbourName
	 */
	public String getNeighbourName() {
		return neighbourName;
	}



	/**
	 * @param neighbourName the neighbourName to set
	 */
	public void setNeighbourName(String neighbourName) {
		this.neighbourName = neighbourName;
	}



	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}



	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}



	/**
	 * @return the pan
	 */
	public String getPan() {
		return pan;
	}



	/**
	 * @param pan the pan to set
	 */
	public void setPan(String pan) {
		this.pan = pan;
	}



	/**
	 * @return the regdAddress
	 */
	public String getRegdAddress() {
		return regdAddress;
	}



	/**
	 * @param regdAddress the regdAddress to set
	 */
	public void setRegdAddress(String regdAddress) {
		this.regdAddress = regdAddress;
	}



	/**
	 * @return the regdDate
	 */
	public Timestamp getRegdDate() {
		return regdDate;
	}



	/**
	 * @param regdDate the regdDate to set
	 */
	public void setRegdDate(Timestamp regdDate) {
		this.regdDate = regdDate;
	}



	/**
	 * @return the regdNo
	 */
	public String getRegdNo() {
		return regdNo;
	}



	/**
	 * @param regdNo the regdNo to set
	 */
	public void setRegdNo(String regdNo) {
		this.regdNo = regdNo;
	}



	/**
	 * @return the shopNumber
	 */
	/*
	 * public int getShopNumber() { return shopNumber; }
	 */



	/**
	 * @param shopNumber the shopNumber to set
	 */
	/*
	 * public void setShopNumber(int shopNumber) { this.shopNumber = shopNumber; }
	 */


	/**
	 * @return the statusId
	 */
	public String getStatusId() {
		return statusId;
	}



	/**
	 * @param statusId the statusId to set
	 */
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}



	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}



	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}



	/**
	 * @return the userId
	 */
	public BigInteger getUserId() {
		return userId;
	}



	/**
	 * @param userId the userId to set
	 */
	public void setUserId(BigInteger userId) {
		this.userId = userId;
	}



	/**
	 * @return the neibourhoodEmployees
	 */
	public List<NeibourhoodEmployee> getNeibourhoodEmployees() {
		return neibourhoodEmployees;
	}



	/**
	 * @param neibourhoodEmployees the neibourhoodEmployees to set
	 */
	public void setNeibourhoodEmployees(List<NeibourhoodEmployee> neibourhoodEmployees) {
		this.neibourhoodEmployees = neibourhoodEmployees;
	}



	/**
	 * @return the neibourhoodType
	 */
	public NeibourhoodType getNeibourhoodType() {
		return neibourhoodType;
	}



	/**
	 * @param neibourhoodType the neibourhoodType to set
	 */
	public void setNeibourhoodType(NeibourhoodType neibourhoodType) {
		this.neibourhoodType = neibourhoodType;
	}



	/**
	 * @return the neighbourhoodPassDetails
	 */
	public List<NeighbourhoodPassDetail> getNeighbourhoodPassDetails() {
		return neighbourhoodPassDetails;
	}



	/**
	 * @param neighbourhoodPassDetails the neighbourhoodPassDetails to set
	 */
	public void setNeighbourhoodPassDetails(List<NeighbourhoodPassDetail> neighbourhoodPassDetails) {
		this.neighbourhoodPassDetails = neighbourhoodPassDetails;
	}



	public NeibourhoodEmployee addNeibourhoodEmployee(NeibourhoodEmployee neibourhoodEmployee) {
		getNeibourhoodEmployees().add(neibourhoodEmployee);
		neibourhoodEmployee.setNeighbourhood(this);

		return neibourhoodEmployee;
	}

	public NeibourhoodEmployee removeNeibourhoodEmployee(NeibourhoodEmployee neibourhoodEmployee) {
		getNeibourhoodEmployees().remove(neibourhoodEmployee);
		neibourhoodEmployee.setNeighbourhood(null);

		return neibourhoodEmployee;
	}


	public NeighbourhoodPassDetail addNeighbourhoodPassDetail(NeighbourhoodPassDetail neighbourhoodPassDetail) {
		getNeighbourhoodPassDetails().add(neighbourhoodPassDetail);
		neighbourhoodPassDetail.setNeighbourhood(this);

		return neighbourhoodPassDetail;
	}

	public NeighbourhoodPassDetail removeNeighbourhoodPassDetail(NeighbourhoodPassDetail neighbourhoodPassDetail) {
		getNeighbourhoodPassDetails().remove(neighbourhoodPassDetail);
		neighbourhoodPassDetail.setNeighbourhood(null);

		return neighbourhoodPassDetail;
	}

}