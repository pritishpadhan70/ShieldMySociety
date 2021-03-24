package com.society.core.vms.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;


/**
 * The persistent class for the GLOBAL_USER database table.
 * 
 */
@Entity
@Table(name="GLOBAL_USER")
@NamedQuery(name="GlobalUser.findAll", query="SELECT g FROM GlobalUser g")
public class GlobalUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "generator", strategy = "increment")
	@GeneratedValue(generator = "generator")
	@Column(name="USER_ID")
	private Long userId;

	@Column(name="AADHAR_NO")
	private String aadharNo;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="MIDDLE_NAME")
	private String middleName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="ADD_COUNTRY")
	private int addCountry;

	@Column(name="ADD_DISTRICT")
	private int addDistrict;

	@Column(name="ADD_PIN")
	private int addPin;

	@Column(name="ADD_STATE")
	private int addState;

	private int age;

	@Column(name="ALTERNATIVE_PHONE")
	private String alternativePhone;

	@Column(name="BLOOD_GROUP")
	private String bloodGroup;

	private String comment;

	@Column(name="CREATED_BY")
	private int createdBy;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(name="ID_TYPE")
	private int idType;

	@Column(name="IS_DELETED")
	private boolean isDeleted;

	@Column(name="IS_ENABLED")
	private boolean isEnabled;

	@Column(name="MEMBER_SINCE")
	private Timestamp memberSince;

	@Column(name="PAN_NO")
	private String panNo;

	@Column(name="PARENT_ID")
	private int parentId;


	@Column(name="PHONE_IMEI")
	private int phoneImei;

	@Column(name="PHOTO_PATH")
	private String photoPath;

	@Column(name="REFERED_BY")
	private int referedBy;

	private String sex;

	private String ssn;

	@Lob
	@Column(name="USER_ADDRESS")
	private String userAddress;

	@Column(name="USER_DL")
	private String userDl;

	@Column(name="USER_EMAIL")
	private String userEmail;

	@Column(name="USER_GROUP")
	private int userGroup;

	@Column(name="USER_NAME")
	private String userName;

	@Column(name="USER_PHONE")
	private String userPhone;
	
	@Column(name="IS_USER_REGD_COMPLETE")
	private boolean isRegdComplete;
	
	//bi-directional many-to-one association to UserIdProof
	@OneToMany(mappedBy="globalUser")
	private List<UserIdProof> userIdProofs;

	public GlobalUser() {
	}

	
	
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAadharNo() {
		return this.aadharNo;
	}

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

	public int getAddCountry() {
		return this.addCountry;
	}

	public void setAddCountry(int addCountry) {
		this.addCountry = addCountry;
	}

	public int getAddDistrict() {
		return this.addDistrict;
	}

	public void setAddDistrict(int addDistrict) {
		this.addDistrict = addDistrict;
	}

	public int getAddPin() {
		return this.addPin;
	}

	public void setAddPin(int addPin) {
		this.addPin = addPin;
	}

	public int getAddState() {
		return this.addState;
	}

	public void setAddState(int addState) {
		this.addState = addState;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAlternativePhone() {
		return this.alternativePhone;
	}

	public void setAlternativePhone(String alternativePhone) {
		this.alternativePhone = alternativePhone;
	}

	public String getBloodGroup() {
		return this.bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getIdType() {
		return this.idType;
	}

	public void setIdType(int idType) {
		this.idType = idType;
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

	public Timestamp getMemberSince() {
		return this.memberSince;
	}

	public void setMemberSince(Timestamp memberSince) {
		this.memberSince = memberSince;
	}

	public String getPanNo() {
		return this.panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}


	public int getPhoneImei() {
		return this.phoneImei;
	}

	public void setPhoneImei(int phoneImei) {
		this.phoneImei = phoneImei;
	}

	public String getPhotoPath() {
		return this.photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public int getReferedBy() {
		return this.referedBy;
	}

	public void setReferedBy(int referedBy) {
		this.referedBy = referedBy;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSsn() {
		return this.ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getUserAddress() {
		return this.userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserDl() {
		return this.userDl;
	}

	public void setUserDl(String userDl) {
		this.userDl = userDl;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getUserGroup() {
		return this.userGroup;
	}

	public void setUserGroup(int userGroup) {
		this.userGroup = userGroup;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}



	/**
	 * @return the isRegdComplete
	 */
	public boolean isRegdComplete() {
		return isRegdComplete;
	}



	/**
	 * @return the userIdProofs
	 */
	public List<UserIdProof> getUserIdProofs() {
		return userIdProofs;
	}



	/**
	 * @param userIdProofs the userIdProofs to set
	 */
	public void setUserIdProofs(List<UserIdProof> userIdProofs) {
		this.userIdProofs = userIdProofs;
	}



	/**
	 * @param isRegdComplete the isRegdComplete to set
	 */
	public void setRegdComplete(boolean isRegdComplete) {
		this.isRegdComplete = isRegdComplete;
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

}