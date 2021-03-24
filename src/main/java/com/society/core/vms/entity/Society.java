package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SOCIETY database table.
 * 
 */
@Entity
@NamedQuery(name="Society.findAll", query="SELECT s FROM Society s")
public class Society implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SOCIETY_ID")
	private Integer societyId;

	@Column(name="AMENITY_COUNT")
	private int amenityCount;

	@Column(name="APP_REGD_DATE")
	private Timestamp appRegdDate;

	@Column(name="AREA_SQRFT")
	private int areaSqrft;

	private Integer city;

	@Lob
	private String comments;

	@Lob
	@Column(name="CONSTRUCTOR_ADDRESS")
	private String constructorAddress;

	@Column(name="CONSTRUCTOR_EMAIL")
	private String constructorEmail;

	@Column(name="CONSTRUCTOR_HQ")
	private String constructorHq;

	@Column(name="CONSTRUCTOR_NAME")
	private String constructorName;

	@Column(name="CONSTRUCTOR_OWNER")
	private String constructorOwner;

	@Column(name="CONSTRUCTOR_PHONE")
	private String constructorPhone;

	private int country;

	@Column(name="CREATION_DATE")
	private Timestamp creationDate;

	private int district;

	@Column(name="FLAT_AREA_TOTAL")
	private int flatAreaTotal;

	@Column(name="FLAT_COUNT")
	private int flatCount;

	@Column(name="FLOOR_COUNT")
	private int floorCount;

	@Column(name="GATE_COUNT")
	private int gateCount;

	@Column(name="GPS_VALUE")
	private String gpsValue;

	@Column(name="IS_DELETED")
	private boolean isDeleted;

	@Column(name="IS_ENABLED")
	private boolean isEnabled;

	private String landmark;

	@Column(name="LAST_UPDATED")
	private Timestamp lastUpdated;

	@Column(name="LICENCE_NUMBER")
	private String licenceNumber;

	@Column(name="LICENCE_TYPE")
	private String licenceType;

	@Column(name="`NON-RESIDENT_AREA`")
	private int non_residentArea;

	@Column(name="OTHER_REGD_NO")
	private String otherRegdNo;

	private int pin;

	@Column(name="REGD_NUMBER")
	private String regdNumber;

	@Column(name="RERRA_NUMBER")
	private String rerraNumber;

	@Column(name="SOCIETY_ID_DISPLAY")
	private int societyIdDisplay;

	@Column(name="SOCIETY_NAME")
	private String societyName;

	@Column(name="SOCIETY_TYPE")
	private int societyType;

	private int state;

	@Column(name="TIME_REFRENCE")
	private int timeRefrence;

	public Society() {
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

	public Integer getCity() {
		return this.city;
	}

	public void setCity(Integer city) {
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