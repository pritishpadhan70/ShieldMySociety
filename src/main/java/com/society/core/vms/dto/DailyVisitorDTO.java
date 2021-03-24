package com.society.core.vms.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The Data class for the DAILY_VISITOR object .
 * 
 */
public class DailyVisitorDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer dvId;
	private String aadharNo;
	private Integer addCountry;
	private Integer addDistrict;
	private Integer addPin;
	private Integer addState;
	private Integer age;
	private String alternativePhone;
	private String bloodGroup;
	private String comment;
	private Integer createdBy;
	private Integer defaultRole;
	private Date dob;
	private String firstName;
	private Integer idType;
	private boolean isDeleted;
	private boolean isEnabled;
	private boolean isUserRegdComplete;
	private String lastName;
	private Timestamp memberSince;
	private String middleName;
	private String panNo;
	private Integer phoneImei;
	private String photoPath;
	private String signaturePath;
	private String purpose;
	private Integer referedBy;
	private String sex;
	private Integer timezone;
	private String userDl;
	private Integer userGroup;
	private String visitorAddress;
	private String visitorEmail;
	private String visitorPhone;
	private String lastVisitedFlat;

	public DailyVisitorDTO() {
	}

	/**
	 * @return the dvId
	 */
	public Integer getDvId() {
		return dvId;
	}

	/**
	 * @param dvId the dvId to set
	 */
	public void setDvId(Integer dvId) {
		this.dvId = dvId;
	}

	/**
	 * @return the aadharNo
	 */
	public String getAadharNo() {
		return aadharNo;
	}

	/**
	 * @param aadharNo the aadharNo to set
	 */
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	/**
	 * @return the addCountry
	 */
	public Integer getAddCountry() {
		return addCountry;
	}

	/**
	 * @param addCountry the addCountry to set
	 */
	public void setAddCountry(Integer addCountry) {
		this.addCountry = addCountry;
	}

	/**
	 * @return the addDistrict
	 */
	public Integer getAddDistrict() {
		return addDistrict;
	}

	/**
	 * @param addDistrict the addDistrict to set
	 */
	public void setAddDistrict(Integer addDistrict) {
		this.addDistrict = addDistrict;
	}

	/**
	 * @return the addPin
	 */
	public Integer getAddPin() {
		return addPin;
	}

	/**
	 * @param addPin the addPin to set
	 */
	public void setAddPin(Integer addPin) {
		this.addPin = addPin;
	}

	/**
	 * @return the addState
	 */
	public Integer getAddState() {
		return addState;
	}

	/**
	 * @param addState the addState to set
	 */
	public void setAddState(Integer addState) {
		this.addState = addState;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
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
	 * @return the bloodGroup
	 */
	public String getBloodGroup() {
		return bloodGroup;
	}

	/**
	 * @param bloodGroup the bloodGroup to set
	 */
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
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
	 * @return the createdBy
	 */
	public Integer getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the defaultRole
	 */
	public Integer getDefaultRole() {
		return defaultRole;
	}

	/**
	 * @param defaultRole the defaultRole to set
	 */
	public void setDefaultRole(Integer defaultRole) {
		this.defaultRole = defaultRole;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
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
	 * @return the idType
	 */
	public Integer getIdType() {
		return idType;
	}

	/**
	 * @param idType the idType to set
	 */
	public void setIdType(Integer idType) {
		this.idType = idType;
	}

	/**
	 * @return the isDeleted
	 */
	public boolean isDeleted() {
		return isDeleted;
	}

	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	/**
	 * @return the isEnabled
	 */
	public boolean isEnabled() {
		return isEnabled;
	}

	/**
	 * @param isEnabled the isEnabled to set
	 */
	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	/**
	 * @return the isUserRegdComplete
	 */
	public boolean isUserRegdComplete() {
		return isUserRegdComplete;
	}

	/**
	 * @param isUserRegdComplete the isUserRegdComplete to set
	 */
	public void setUserRegdComplete(boolean isUserRegdComplete) {
		this.isUserRegdComplete = isUserRegdComplete;
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
	 * @return the memberSince
	 */
	public Timestamp getMemberSince() {
		return memberSince;
	}

	/**
	 * @param memberSince the memberSince to set
	 */
	public void setMemberSince(Timestamp memberSince) {
		this.memberSince = memberSince;
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
	 * @return the panNo
	 */
	public String getPanNo() {
		return panNo;
	}

	/**
	 * @param panNo the panNo to set
	 */
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	/**
	 * @return the phoneImei
	 */
	public Integer getPhoneImei() {
		return phoneImei;
	}

	/**
	 * @param phoneImei the phoneImei to set
	 */
	public void setPhoneImei(Integer phoneImei) {
		this.phoneImei = phoneImei;
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
	 * @return the purpose
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * @param purpose the purpose to set
	 */
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	/**
	 * @return the referedBy
	 */
	public Integer getReferedBy() {
		return referedBy;
	}

	/**
	 * @param referedBy the referedBy to set
	 */
	public void setReferedBy(Integer referedBy) {
		this.referedBy = referedBy;
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
	 * @return the timezone
	 */
	public Integer getTimezone() {
		return timezone;
	}

	/**
	 * @param timezone the timezone to set
	 */
	public void setTimezone(Integer timezone) {
		this.timezone = timezone;
	}

	/**
	 * @return the userDl
	 */
	public String getUserDl() {
		return userDl;
	}

	/**
	 * @param userDl the userDl to set
	 */
	public void setUserDl(String userDl) {
		this.userDl = userDl;
	}

	/**
	 * @return the userGroup
	 */
	public Integer getUserGroup() {
		return userGroup;
	}

	/**
	 * @param userGroup the userGroup to set
	 */
	public void setUserGroup(Integer userGroup) {
		this.userGroup = userGroup;
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

	/**
	 * @return the visitorEmail
	 */
	public String getVisitorEmail() {
		return visitorEmail;
	}

	/**
	 * @param visitorEmail the visitorEmail to set
	 */
	public void setVisitorEmail(String visitorEmail) {
		this.visitorEmail = visitorEmail;
	}

	/**
	 * @return the visitorPhone
	 */
	public String getVisitorPhone() {
		return visitorPhone;
	}

	/**
	 * @param visitorPhone the visitorPhone to set
	 */
	public void setVisitorPhone(String visitorPhone) {
		this.visitorPhone = visitorPhone;
	}

	/**
	 * @return the lastVisitedFlat
	 */
	public String getLastVisitedFlat() {
		return lastVisitedFlat;
	}

	/**
	 * @param lastVisitedFlat the lastVisitedFlat to set
	 */
	public void setLastVisitedFlat(String lastVisitedFlat) {
		this.lastVisitedFlat = lastVisitedFlat;
	}

	

}