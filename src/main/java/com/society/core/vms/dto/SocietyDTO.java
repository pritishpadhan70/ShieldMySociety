package com.society.core.vms.dto;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The DTO class for the SOCIETY data.
 * 
 */
public class SocietyDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer societyId;
	private int amenityCount;
	private Timestamp appRegdDate;
	private int areaSqrft;
	private String city;
	private String comments;
	private String constructorAddress;
	private String constructorEmail;
	private String constructorHq;
	private String constructorName;
	private String constructorOwner;
	private String constructorPhone;
	private int country;
	private Timestamp creationDate;
	private int district;
	private int flatAreaTotal;
	private int flatCount;
	private int floorCount;
	private int gateCount;
	private String gpsValue;
	private boolean isDeleted;
	private boolean isEnabled;
	private String landmark;
	private Timestamp lastUpdated;
	private String licenceNumber;
	private String licenceType;
	private int non_residentArea;
	private String otherRegdNo;
	private int pin;
	private String regdNumber;
	private String rerraNumber;
	private int societyIdDisplay;
	private String societyName;
	private int societyType;
	private int state;
	private int timeRefrence;

	public SocietyDTO() {
	}

	public Integer getSocietyId() {
		return this.societyId;
	}

	public void setSocietyId(Integer societyId) {
		this.societyId = societyId;
	}

	public int getAmenityCount() {
		return this.amenityCount;
	}

	public void setAmenityCount(int amenityCount) {
		this.amenityCount = amenityCount;
	}

	public Timestamp getAppRegdDate() {
		return this.appRegdDate;
	}

	public void setAppRegdDate(Timestamp appRegdDate) {
		this.appRegdDate = appRegdDate;
	}

	public int getAreaSqrft() {
		return this.areaSqrft;
	}

	public void setAreaSqrft(int areaSqrft) {
		this.areaSqrft = areaSqrft;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getConstructorAddress() {
		return this.constructorAddress;
	}

	public void setConstructorAddress(String constructorAddress) {
		this.constructorAddress = constructorAddress;
	}

	public String getConstructorEmail() {
		return this.constructorEmail;
	}

	public void setConstructorEmail(String constructorEmail) {
		this.constructorEmail = constructorEmail;
	}

	public String getConstructorHq() {
		return this.constructorHq;
	}

	public void setConstructorHq(String constructorHq) {
		this.constructorHq = constructorHq;
	}

	public String getConstructorName() {
		return this.constructorName;
	}

	public void setConstructorName(String constructorName) {
		this.constructorName = constructorName;
	}

	public String getConstructorOwner() {
		return this.constructorOwner;
	}

	public void setConstructorOwner(String constructorOwner) {
		this.constructorOwner = constructorOwner;
	}

	public String getConstructorPhone() {
		return this.constructorPhone;
	}

	public void setConstructorPhone(String constructorPhone) {
		this.constructorPhone = constructorPhone;
	}

	public int getCountry() {
		return this.country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	public Timestamp getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public int getDistrict() {
		return this.district;
	}

	public void setDistrict(int district) {
		this.district = district;
	}

	public int getFlatAreaTotal() {
		return this.flatAreaTotal;
	}

	public void setFlatAreaTotal(int flatAreaTotal) {
		this.flatAreaTotal = flatAreaTotal;
	}

	public int getFlatCount() {
		return this.flatCount;
	}

	public void setFlatCount(int flatCount) {
		this.flatCount = flatCount;
	}

	public int getFloorCount() {
		return this.floorCount;
	}

	public void setFloorCount(int floorCount) {
		this.floorCount = floorCount;
	}

	public int getGateCount() {
		return this.gateCount;
	}

	public void setGateCount(int gateCount) {
		this.gateCount = gateCount;
	}

	public String getGpsValue() {
		return this.gpsValue;
	}

	public void setGpsValue(String gpsValue) {
		this.gpsValue = gpsValue;
	}

	public boolean getIsDeleted() {
		return this.isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public boolean getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getLandmark() {
		return this.landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public Timestamp getLastUpdated() {
		return this.lastUpdated;
	}

	public void setLastUpdated(Timestamp lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getLicenceNumber() {
		return this.licenceNumber;
	}

	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	public String getLicenceType() {
		return this.licenceType;
	}

	public void setLicenceType(String licenceType) {
		this.licenceType = licenceType;
	}

	public int getNon_residentArea() {
		return this.non_residentArea;
	}

	public void setNon_residentArea(int non_residentArea) {
		this.non_residentArea = non_residentArea;
	}

	public String getOtherRegdNo() {
		return this.otherRegdNo;
	}

	public void setOtherRegdNo(String otherRegdNo) {
		this.otherRegdNo = otherRegdNo;
	}

	public int getPin() {
		return this.pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getRegdNumber() {
		return this.regdNumber;
	}

	public void setRegdNumber(String regdNumber) {
		this.regdNumber = regdNumber;
	}

	public String getRerraNumber() {
		return this.rerraNumber;
	}

	public void setRerraNumber(String rerraNumber) {
		this.rerraNumber = rerraNumber;
	}

	public int getSocietyIdDisplay() {
		return this.societyIdDisplay;
	}

	public void setSocietyIdDisplay(int societyIdDisplay) {
		this.societyIdDisplay = societyIdDisplay;
	}

	public String getSocietyName() {
		return this.societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public int getSocietyType() {
		return this.societyType;
	}

	public void setSocietyType(int societyType) {
		this.societyType = societyType;
	}

	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getTimeRefrence() {
		return this.timeRefrence;
	}

	public void setTimeRefrence(int timeRefrence) {
		this.timeRefrence = timeRefrence;
	}

}