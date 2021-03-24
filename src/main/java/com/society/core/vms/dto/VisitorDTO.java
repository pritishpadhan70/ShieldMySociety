package com.society.core.vms.dto;

import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The DTO class for the VISITOR data.
 * 
 */
public class VisitorDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long vid;
	private String comments;
	private String flatid;
	private String sex;
	private int idType;
	private String idValue;
	private int dailyVisitorId;
	private Timestamp inTime;
	private boolean isArrived;
	private boolean isPassIssued;
	private boolean isVerified;
	private boolean isVisitorActive;
	private String firstName;
	private String middleName;
	private String lastName;
	private Timestamp outTime;
	private String phone;
	private String alternativePhone;
	private String photoPath;
	private String signaturePath;
	private int type;
	private String vehicleNo;
	private int vehicleType;
	private String visitorAddress;

	public VisitorDTO() {
	}

	/**
	 * @return the vid
	 */
	public Long getVid() {
		return vid;
	}

	/**
	 * @param vid the vid to set
	 */
	public void setVid(Long vid) {
		this.vid = vid;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/**
	 * @return the flatid
	 */
	public String getFlatid() {
		return flatid;
	}

	/**
	 * @param flatid the flatid to set
	 */
	public void setFlatid(String flatid) {
		this.flatid = flatid;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the idType
	 */
	public int getIdType() {
		return idType;
	}

	/**
	 * @param idType the idType to set
	 */
	public void setIdType(int idType) {
		this.idType = idType;
	}

	/**
	 * @return the idValue
	 */
	public String getIdValue() {
		return idValue;
	}

	/**
	 * @param idValue the idValue to set
	 */
	public void setIdValue(String idValue) {
		this.idValue = idValue;
	}

	/**
	 * @return the dailyVisitorId
	 */
	public int getDailyVisitorId() {
		return dailyVisitorId;
	}

	/**
	 * @param dailyVisitorId the dailyVisitorId to set
	 */
	public void setDailyVisitorId(int dailyVisitorId) {
		this.dailyVisitorId = dailyVisitorId;
	}

	/**
	 * @return the inTime
	 */
	public Timestamp getInTime() {
		return inTime;
	}

	/**
	 * @param inTime the inTime to set
	 */
	public void setInTime(Timestamp inTime) {
		this.inTime = inTime;
	}

	/**
	 * @return the isArrived
	 */
	public boolean isArrived() {
		return isArrived;
	}

	/**
	 * @param isArrived the isArrived to set
	 */
	public void setArrived(boolean isArrived) {
		this.isArrived = isArrived;
	}

	/**
	 * @return the isPassIssued
	 */
	public boolean isPassIssued() {
		return isPassIssued;
	}

	/**
	 * @param isPassIssued the isPassIssued to set
	 */
	public void setPassIssued(boolean isPassIssued) {
		this.isPassIssued = isPassIssued;
	}

	/**
	 * @return the isVerified
	 */
	public boolean isVerified() {
		return isVerified;
	}

	/**
	 * @param isVerified the isVerified to set
	 */
	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	/**
	 * @return the isVisitorActive
	 */
	public boolean isVisitorActive() {
		return isVisitorActive;
	}

	/**
	 * @param isVisitorActive the isVisitorActive to set
	 */
	public void setVisitorActive(boolean isVisitorActive) {
		this.isVisitorActive = isVisitorActive;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the outTime
	 */
	public Timestamp getOutTime() {
		return outTime;
	}

	/**
	 * @param outTime the outTime to set
	 */
	public void setOutTime(Timestamp outTime) {
		this.outTime = outTime;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the alternativePhone
	 */
	public String getAlternativePhone() {
		return alternativePhone;
	}

	/**
	 * @param alternativePhone the alternativePhone to set
	 */
	public void setAlternativePhone(String alternativePhone) {
		this.alternativePhone = alternativePhone;
	}

	/**
	 * @return the photoPath
	 */
	public String getPhotoPath() {
		return photoPath;
	}

	/**
	 * @param photoPath the photoPath to set
	 */
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	/**
	 * @return the signaturePath
	 */
	public String getSignaturePath() {
		return signaturePath;
	}

	/**
	 * @param signaturePath the signaturePath to set
	 */
	public void setSignaturePath(String signaturePath) {
		this.signaturePath = signaturePath;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the vehicleNo
	 */
	public String getVehicleNo() {
		return vehicleNo;
	}

	/**
	 * @param vehicleNo the vehicleNo to set
	 */
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	/**
	 * @return the vehicleType
	 */
	public int getVehicleType() {
		return vehicleType;
	}

	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(int vehicleType) {
		this.vehicleType = vehicleType;
	}

	/**
	 * @return the visitorAddress
	 */
	public String getVisitorAddress() {
		return visitorAddress;
	}

	/**
	 * @param visitorAddress the visitorAddress to set
	 */
	public void setVisitorAddress(String visitorAddress) {
		this.visitorAddress = visitorAddress;
	}

	

}