package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the DAILY_VISITOR database table.
 * 
 */
@Entity
@Table(name="DAILY_VISITOR")
@NamedQuery(name="DailyVisitor.findAll", query="SELECT d FROM DailyVisitor d")
public class DailyVisitor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DV_ID")
	private Integer dvId;

	@Column(name="AADHAR_NO")
	private String aadharNo;

	@Column(name="ADD_COUNTRY")
	private Integer addCountry;

	@Column(name="ADD_DISTRICT")
	private Integer addDistrict;

	@Column(name="ADD_PIN")
	private Integer addPin;

	@Column(name="ADD_STATE")
	private Integer addState;

	private Integer age;

	@Column(name="ALTERNATIVE_PHONE")
	private String alternativePhone;

	@Column(name="BLOOD_GROUP")
	private String bloodGroup;

	private String comment;

	@Column(name="CREATED_BY")
	private Integer createdBy;

	@Column(name="DEFAULT_ROLE")
	private Integer defaultRole;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="ID_TYPE")
	private Integer idType;

	@Column(name="IS_DELETED")
	private boolean isDeleted;

	@Column(name="IS_ENABLED")
	private boolean isEnabled;

	@Column(name="IS_USER_REGD_COMPLETE")
	private boolean isUserRegdComplete;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="MEMBER_SINCE")
	private Timestamp memberSince;

	@Column(name="MIDDLE_NAME")
	private String middleName;

	@Column(name="PAN_NO")
	private String panNo;

	@Column(name="PHONE_IMEI")
	private Integer phoneImei;

	@Column(name="PHOTO_PATH")
	private String photoPath;
	
	@Column(name="SIGN_PATH")
	private String signaturePath;

	private String purpose;

	@Column(name="REFERED_BY")
	private Integer referedBy;

	private String sex;

	private Integer timezone;

	@Column(name="USER_DL")
	private String userDl;

	@Column(name="USER_GROUP")
	private Integer userGroup;

	@Lob
	@Column(name="VISITOR_ADDRESS")
	private String visitorAddress;

	@Column(name="VISITOR_EMAIL")
	private String visitorEmail;

	@Column(name="VISITOR_PHONE")
	private String visitorPhone;
	
	@Column(name="LAST_VISITED_FLAT")
	private String lastVisitedFlat;

	public DailyVisitor() {
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