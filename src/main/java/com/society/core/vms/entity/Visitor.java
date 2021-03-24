package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the VISITOR database table.
 * 
 */
@Entity
@NamedQuery(name="Visitor.findAll", query="SELECT v FROM Visitor v")
public class Visitor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "generator", strategy = "increment")
	@GeneratedValue(generator = "generator")
	private Long vid;

	@Column(name="ADVANCE_VISITOR_REQUEST")
	private BigInteger advanceVisitorRequest;

	private String comments;

	private String flatid;
	
	private String sex;

	@Column(name="ID_TYPE")
	private int idType;
	
	@Column(name="ID_VALUE")
	private String idValue;

	@Column(name="DAILY_VISITOR_ID")
	private int dailyVisitorId;
	
	@Column(name="IN_TIME")
	private Timestamp inTime;

	@Column(name="IS_ARRIVED")
	private boolean isArrived;

	@Column(name="IS_PASS_ISSUED")
	private boolean isPassIssued;

	@Column(name="IS_SUBMITTED")
	private boolean isSubmitted;

	@Column(name="IS_VERIFIED")
	private boolean isVerified;

	@Column(name="IS_VISITOR_ACTIVE")
	private boolean isVisitorActive;

	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="MIDDLE_NAME")
	private String middleName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="OUT_TIME")
	private Timestamp outTime;

	private String phone;
	
	@Column(name="ALTERNATIVE_PHONE")
	private String alternativePhone;
	
	@Column(name="PHOTO_PATH")
	private String photoPath;

	@Column(name="SIGNATURE_PATH")
	private String signaturePath;

	@Column(name="VEHICLE_NO")
	private String vehicleNo;

	@Column(name="VEHICLE_TYPE")
	private int vehicleType;

	@Column(name="VISITOR_ADDRESS")
	private String visitorAddress;

	@Column(name="VISITOR_OTP")
	private int visitorOtp;

	//bi-directional many-to-one association to VisitorType
	@ManyToOne
	@JoinColumn(name="TYPE")
	private VisitorType visitorType;

	public Visitor() {
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
	 * @return the advanceVisitorRequest
	 */
	public BigInteger getAdvanceVisitorRequest() {
		return advanceVisitorRequest;
	}

	/**
	 * @param advanceVisitorRequest the advanceVisitorRequest to set
	 */
	public void setAdvanceVisitorRequest(BigInteger advanceVisitorRequest) {
		this.advanceVisitorRequest = advanceVisitorRequest;
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
	 * @return the isSubmitted
	 */
	public boolean isSubmitted() {
		return isSubmitted;
	}

	/**
	 * @param isSubmitted the isSubmitted to set
	 */
	public void setSubmitted(boolean isSubmitted) {
		this.isSubmitted = isSubmitted;
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

	/**
	 * @return the visitorOtp
	 */
	public int getVisitorOtp() {
		return visitorOtp;
	}

	/**
	 * @param visitorOtp the visitorOtp to set
	 */
	public void setVisitorOtp(int visitorOtp) {
		this.visitorOtp = visitorOtp;
	}

	/**
	 * @return the visitorType
	 */
	public VisitorType getVisitorType() {
		return visitorType;
	}

	/**
	 * @param visitorType the visitorType to set
	 */
	public void setVisitorType(VisitorType visitorType) {
		this.visitorType = visitorType;
	}

	

}