package com.society.core.vms.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * The DTO class for the GLOBAL_USER data.
 * 
 */
public class GlobalUserDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long userId;
	private String aadharNo;
	private String firstName;
	private String middleName;
	private String lastName;
	private int addCountry;
	private int addDistrict;
	private int addPin;
	private int addState;
	private int addCity;
	private int age;
	private String alternativePhone;
	private String bloodGroup;
	private String comment;
	private int createdBy;
	private Date dob;
	private int idType;
	private boolean isDeleted;
	private boolean isEnabled;
	private Timestamp memberSince;
	private String panNo;
	private int parentId;
	private int phoneImei;
	private String photoPath;
	private int referedBy;
	private String sex;
	private String ssn;
	private String userAddress;
	private String userDl;
	private String userEmail;
	private int userGroup;
	private String userName;
	private String userPhone;
	private Map<String,String> iddentities;
	private List<VehicleDTO> vehicles;
	private List<GlobalUserDTO> dependents;
	private String token;
	private boolean isForcePasswordChange;
	

	public GlobalUserDTO() {
	}

	
	
	/**
	 * @param userId
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param isForcePasswordChange
	 */
	public GlobalUserDTO(Long userId, String firstName, String middleName, String lastName,
			boolean isForcePasswordChange) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.isForcePasswordChange = isForcePasswordChange;
	}



	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
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
	 * @return the addCountry
	 */
	public int getAddCountry() {
		return addCountry;
	}

	/**
	 * @param addCountry the addCountry to set
	 */
	public void setAddCountry(int addCountry) {
		this.addCountry = addCountry;
	}

	/**
	 * @return the addDistrict
	 */
	public int getAddDistrict() {
		return addDistrict;
	}

	/**
	 * @param addDistrict the addDistrict to set
	 */
	public void setAddDistrict(int addDistrict) {
		this.addDistrict = addDistrict;
	}

	/**
	 * @return the addPin
	 */
	public int getAddPin() {
		return addPin;
	}

	/**
	 * @param addPin the addPin to set
	 */
	public void setAddPin(int addPin) {
		this.addPin = addPin;
	}

	/**
	 * @return the iddentities
	 */
	public Map<String, String> getIddentities() {
		return iddentities;
	}

	/**
	 * @param iddentities the iddentities to set
	 */
	public void setIddentities(Map<String, String> iddentities) {
		this.iddentities = iddentities;
	}

	/**
	 * @return the vehicles
	 */
	public List<VehicleDTO> getVehicles() {
		return vehicles;
	}

	/**
	 * @param vehicles the vehicles to set
	 */
	public void setVehicles(List<VehicleDTO> vehicles) {
		this.vehicles = vehicles;
	}

	/**
	 * @return the dependents
	 */
	public List<GlobalUserDTO> getDependents() {
		return dependents;
	}

	/**
	 * @param dependents the dependents to set
	 */
	public void setDependents(List<GlobalUserDTO> dependents) {
		this.dependents = dependents;
	}

	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	/**
	 * @param isEnabled the isEnabled to set
	 */
	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	/**
	 * @return the addState
	 */
	public int getAddState() {
		return addState;
	}

	/**
	 * @param addState the addState to set
	 */
	public void setAddState(int addState) {
		this.addState = addState;
	}

	/**
	 * @return the addCity
	 */
	public int getAddCity() {
		return addCity;
	}

	/**
	 * @param addCity the addCity to set
	 */
	public void setAddCity(int addCity) {
		this.addCity = addCity;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
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
	public int getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
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
	 * @return the isDeleted
	 */
	public boolean getIsDeleted() {
		return isDeleted;
	}

	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	/**
	 * @return the isEnabled
	 */
	public boolean getIsEnabled() {
		return isEnabled;
	}

	/**
	 * @param isEnabled the isEnabled to set
	 */
	public void setIsEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
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
	 * @return the parentId
	 */
	public int getParentId() {
		return parentId;
	}

	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	/**
	 * @return the phoneImei
	 */
	public int getPhoneImei() {
		return phoneImei;
	}

	/**
	 * @param phoneImei the phoneImei to set
	 */
	public void setPhoneImei(int phoneImei) {
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
	 * @return the referedBy
	 */
	public int getReferedBy() {
		return referedBy;
	}

	/**
	 * @param referedBy the referedBy to set
	 */
	public void setReferedBy(int referedBy) {
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
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * @return the userAddress
	 */
	public String getUserAddress() {
		return userAddress;
	}

	/**
	 * @param userAddress the userAddress to set
	 */
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
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
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * @return the userGroup
	 */
	public int getUserGroup() {
		return userGroup;
	}

	/**
	 * @param userGroup the userGroup to set
	 */
	public void setUserGroup(int userGroup) {
		this.userGroup = userGroup;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userPhone
	 */
	public String getUserPhone() {
		return userPhone;
	}

	/**
	 * @param userPhone the userPhone to set
	 */
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @return the isForcePasswordChange
	 */
	public boolean isForcePasswordChange() {
		return isForcePasswordChange;
	}

	/**
	 * @param isForcePasswordChange the isForcePasswordChange to set
	 */
	public void setForcePasswordChange(boolean isForcePasswordChange) {
		this.isForcePasswordChange = isForcePasswordChange;
	}

	
}