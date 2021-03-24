package com.society.core.vms.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.List;


/**
 * The data class for the NEIGHBOURHOOD object table.
 * 
 */
public class NeighbourhoodDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long nid;
	private Timestamp activationDate;
	private String address;
	private String contactNumber;
	private String gpsTagValue;
	private String gstin;
	private boolean isActive;
	private boolean isPasscodeEntryAuthorised;
	private String neighbourName;
	private String pan;
	private Timestamp regdDate;
	private int shopNumber;
	private BigInteger userId;
	private String statusId;
	private String comment;
	private String regdNo;
	private String regdAddress;
	private String ownerName;
	private String managerName;


	//bi-directional many-to-one association to NeibourhoodEmployee
	private List<NeibourhoodEmployeeDTO> neibourhoodEmployees;

	//bi-directional many-to-one association to NeighbourhoodPassEntry
	private List<NeighbourhoodPassDetailDTO> neighbourhoodPassEntries;

	//bi-directional many-to-one association to NotificationType
	private Integer neibourhoodType;

	public NeighbourhoodDTO() {
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
	 * @return the shopNumber
	 */
	public int getShopNumber() {
		return shopNumber;
	}


	/**
	 * @param shopNumber the shopNumber to set
	 */
	public void setShopNumber(int shopNumber) {
		this.shopNumber = shopNumber;
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
	 * @return the neibourhoodEmployees
	 */
	public List<NeibourhoodEmployeeDTO> getNeibourhoodEmployees() {
		return neibourhoodEmployees;
	}


	/**
	 * @param neibourhoodEmployees the neibourhoodEmployees to set
	 */
	public void setNeibourhoodEmployees(List<NeibourhoodEmployeeDTO> neibourhoodEmployees) {
		this.neibourhoodEmployees = neibourhoodEmployees;
	}


	/**
	 * @return the neibourhoodType
	 */
	public Integer getNeibourhoodType() {
		return neibourhoodType;
	}


	/**
	 * @param neibourhoodType the neibourhoodType to set
	 */
	public void setNeibourhoodType(Integer neibourhoodType) {
		this.neibourhoodType = neibourhoodType;
	}


	public NeibourhoodEmployeeDTO addNeibourhoodEmployee(NeibourhoodEmployeeDTO neibourhoodEmployee) {
		getNeibourhoodEmployees().add(neibourhoodEmployee);
		neibourhoodEmployee.setNeighbourhood(this);

		return neibourhoodEmployee;
	}

	public NeibourhoodEmployeeDTO removeNeibourhoodEmployee(NeibourhoodEmployeeDTO neibourhoodEmployee) {
		getNeibourhoodEmployees().remove(neibourhoodEmployee);
		neibourhoodEmployee.setNeighbourhood(null);

		return neibourhoodEmployee;
	}

	public List<NeighbourhoodPassDetailDTO> getNeighbourhoodPassEntries() {
		return this.neighbourhoodPassEntries;
	}

	public void setNeighbourhoodPassEntries(List<NeighbourhoodPassDetailDTO> neighbourhoodPassEntries) {
		this.neighbourhoodPassEntries = neighbourhoodPassEntries;
	}

	public NeighbourhoodPassDetailDTO addNeighbourhoodPassEntry(NeighbourhoodPassDetailDTO neighbourhoodPassEntry) {
		getNeighbourhoodPassEntries().add(neighbourhoodPassEntry);
		neighbourhoodPassEntry.setNeighbourhood(this);

		return neighbourhoodPassEntry;
	}

	public NeighbourhoodPassDetailDTO removeNeighbourhoodPassEntry(NeighbourhoodPassDetailDTO neighbourhoodPassEntry) {
		getNeighbourhoodPassEntries().remove(neighbourhoodPassEntry);
		neighbourhoodPassEntry.setNeighbourhood(null);

		return neighbourhoodPassEntry;
	}

	
}