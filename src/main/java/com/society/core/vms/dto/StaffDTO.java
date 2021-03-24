package com.society.core.vms.dto;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The DTO class for the STAFF data.
 * 
 */
public class StaffDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long staffId;
	private String accessArea;
	private String bloodGroup;
	private int heightCms;
	private String idMark;
	private String idValue1;
	private String idValue2;
	private int iddentityType1;
	private int iddentityType2;
	private boolean isDeleted;
	private boolean isEnabled;
	private boolean isVerified;
	private Timestamp joinDate;
	private String photoPath;
	private String post;
	private String shiftTime;
	private String staffAddress;
	private String staffAltPhone;
	private int staffCountry;
	private int staffDistrict;
	private String staffEmail;
	private String staffName;
	private String staffPhone;
	private int staffPin;
	private int staffState;
	private int staffType;
	private String staffUsername;
	private String vehicleNumber;
	private int vehicleType;
	private int weightKgs;

	public StaffDTO() {
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