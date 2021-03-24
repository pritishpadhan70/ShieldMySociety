package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the STAFF database table.
 * 
 */
@Entity
@NamedQuery(name="Staff.findAll", query="SELECT s FROM Staff s")
public class Staff implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STAFF_ID")
	private Long staffId;

	@Column(name="ACCESS_AREA")
	private String accessArea;

	@Column(name="BLOOD_GROUP")
	private String bloodGroup;

	@Column(name="HEIGHT_CMS")
	private int heightCms;

	@Column(name="ID_MARK")
	private String idMark;

	@Column(name="ID_VALUE1")
	private String idValue1;

	@Column(name="ID_VALUE2")
	private String idValue2;

	@Column(name="IDDENTITY_TYPE1")
	private int iddentityType1;

	@Column(name="IDDENTITY_TYPE2")
	private int iddentityType2;

	@Column(name="IS_DELETED")
	private boolean isDeleted;

	@Column(name="IS_ENABLED")
	private boolean isEnabled;

	@Column(name="IS_VERIFIED")
	private boolean isVerified;

	@Column(name="JOIN_DATE")
	private Timestamp joinDate;

	@Column(name="PHOTO_PATH")
	private String photoPath;

	private String post;

	@Column(name="SHIFT_TIME")
	private String shiftTime;

	@Lob
	@Column(name="STAFF_ADDRESS")
	private String staffAddress;

	@Column(name="STAFF_ALT_PHONE")
	private String staffAltPhone;

	@Column(name="STAFF_COUNTRY")
	private int staffCountry;

	@Column(name="STAFF_DISTRICT")
	private int staffDistrict;

	@Column(name="STAFF_EMAIL")
	private String staffEmail;

	@Column(name="STAFF_NAME")
	private String staffName;

	@Column(name="STAFF_PHONE")
	private String staffPhone;

	@Column(name="STAFF_PIN")
	private int staffPin;

	@Column(name="STAFF_STATE")
	private int staffState;

	@Column(name="STAFF_TYPE")
	private int staffType;

	@Column(name="STAFF_USERNAME")
	private String staffUsername;

	@Column(name="VEHICLE_NUMBER")
	private String vehicleNumber;

	@Column(name="VEHICLE_TYPE")
	private int vehicleType;

	@Column(name="WEIGHT_KGS")
	private int weightKgs;

	public Staff() {
	}

	public Long getStaffId() {
		return this.staffId;
	}

	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}

	public String getAccessArea() {
		return this.accessArea;
	}

	public void setAccessArea(String accessArea) {
		this.accessArea = accessArea;
	}

	public String getBloodGroup() {
		return this.bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getHeightCms() {
		return this.heightCms;
	}

	public void setHeightCms(int heightCms) {
		this.heightCms = heightCms;
	}

	public String getIdMark() {
		return this.idMark;
	}

	public void setIdMark(String idMark) {
		this.idMark = idMark;
	}

	public String getIdValue1() {
		return this.idValue1;
	}

	public void setIdValue1(String idValue1) {
		this.idValue1 = idValue1;
	}

	public String getIdValue2() {
		return this.idValue2;
	}

	public void setIdValue2(String idValue2) {
		this.idValue2 = idValue2;
	}

	public int getIddentityType1() {
		return this.iddentityType1;
	}

	public void setIddentityType1(int iddentityType1) {
		this.iddentityType1 = iddentityType1;
	}

	public int getIddentityType2() {
		return this.iddentityType2;
	}

	public void setIddentityType2(int iddentityType2) {
		this.iddentityType2 = iddentityType2;
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

	public boolean getIsVerified() {
		return this.isVerified;
	}

	public void setIsVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public Timestamp getJoinDate() {
		return this.joinDate;
	}

	public void setJoinDate(Timestamp joinDate) {
		this.joinDate = joinDate;
	}

	public String getPhotoPath() {
		return this.photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getShiftTime() {
		return this.shiftTime;
	}

	public void setShiftTime(String shiftTime) {
		this.shiftTime = shiftTime;
	}

	public String getStaffAddress() {
		return this.staffAddress;
	}

	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}

	public String getStaffAltPhone() {
		return this.staffAltPhone;
	}

	public void setStaffAltPhone(String staffAltPhone) {
		this.staffAltPhone = staffAltPhone;
	}

	public int getStaffCountry() {
		return this.staffCountry;
	}

	public void setStaffCountry(int staffCountry) {
		this.staffCountry = staffCountry;
	}

	public int getStaffDistrict() {
		return this.staffDistrict;
	}

	public void setStaffDistrict(int staffDistrict) {
		this.staffDistrict = staffDistrict;
	}

	public String getStaffEmail() {
		return this.staffEmail;
	}

	public void setStaffEmail(String staffEmail) {
		this.staffEmail = staffEmail;
	}

	public String getStaffName() {
		return this.staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffPhone() {
		return this.staffPhone;
	}

	public void setStaffPhone(String staffPhone) {
		this.staffPhone = staffPhone;
	}

	public int getStaffPin() {
		return this.staffPin;
	}

	public void setStaffPin(int staffPin) {
		this.staffPin = staffPin;
	}

	public int getStaffState() {
		return this.staffState;
	}

	public void setStaffState(int staffState) {
		this.staffState = staffState;
	}

	public int getStaffType() {
		return this.staffType;
	}

	public void setStaffType(int staffType) {
		this.staffType = staffType;
	}

	public String getStaffUsername() {
		return this.staffUsername;
	}

	public void setStaffUsername(String staffUsername) {
		this.staffUsername = staffUsername;
	}

	public String getVehicleNumber() {
		return this.vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public int getVehicleType() {
		return this.vehicleType;
	}

	public void setVehicleType(int vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getWeightKgs() {
		return this.weightKgs;
	}

	public void setWeightKgs(int weightKgs) {
		this.weightKgs = weightKgs;
	}

}