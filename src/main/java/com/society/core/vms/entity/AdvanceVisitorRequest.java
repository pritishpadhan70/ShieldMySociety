package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the ADVANCE_VISITOR_REQUEST database table.
 * 
 */
@Entity
@Table(name="ADVANCE_VISITOR_REQUEST")
@NamedQuery(name="AdvanceVisitorRequest.findAll", query="SELECT a FROM AdvanceVisitorRequest a")
public class AdvanceVisitorRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AV_ID")
	private Long avId;

	@Column(name="BLOCK_ID")
	private String blockId;

	private String comments;

	private String company;

	@Column(name="CREATED_BY")
	private java.math.BigInteger createdBy;

	@Column(name="CREATED_TIME")
	private Timestamp createdTime;

	@Column(name="ESTIMATE_IN_TIME")
	private Timestamp estimateInTime;

	@Column(name="ESTIMATE_OUT_TIME")
	private Timestamp estimateOutTime;

	@Column(name="FLAT_ID")
	private String flatId;

	@Column(name="IS_CHECKED_IN")
	private boolean isCheckedIn;

	@Column(name="PERSON_COUNT")
	private int personCount;

	private int purpose;

	@Column(name="SOCIETY_ID")
	private java.math.BigInteger societyId;

	@Column(name="VISITOR_ADDRESS")
	private String visitorAddress;

	@Column(name="VISITOR_DESCRIPTION")
	private String visitorDescription;

	@Column(name="VISITOR_FIRST_NAME")
	private String visitorFirstName;
	
	@Column(name="VISITOR_MIDDLE_NAME")
	private String visitorMiddleName;
	
	@Column(name="VISITOR_LAST_NAME")
	private String visitorLastName;

	@Column(name="VISITOR_OTP")
	private int visitorOtp;

	@Column(name="VISITOR_PHONE")
	private String visitorPhone;

	@Column(name="VISITOR_TYPE")
	private int visitorType;

	public AdvanceVisitorRequest() {
	}

	/**
	 * @return the avId
	 */
	public Long getAvId() {
		return avId;
	}

	/**
	 * @param avId the avId to set
	 */
	public void setAvId(Long avId) {
		this.avId = avId;
	}

	/**
	 * @return the blockId
	 */
	public String getBlockId() {
		return blockId;
	}

	/**
	 * @param blockId the blockId to set
	 */
	public void setBlockId(String blockId) {
		this.blockId = blockId;
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
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}

	/**
	 * @return the createdBy
	 */
	public java.math.BigInteger getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(java.math.BigInteger createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the createdTime
	 */
	public Timestamp getCreatedTime() {
		return createdTime;
	}

	/**
	 * @param createdTime the createdTime to set
	 */
	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * @return the estimateInTime
	 */
	public Timestamp getEstimateInTime() {
		return estimateInTime;
	}

	/**
	 * @param estimateInTime the estimateInTime to set
	 */
	public void setEstimateInTime(Timestamp estimateInTime) {
		this.estimateInTime = estimateInTime;
	}

	/**
	 * @return the estimateOutTime
	 */
	public Timestamp getEstimateOutTime() {
		return estimateOutTime;
	}

	/**
	 * @param estimateOutTime the estimateOutTime to set
	 */
	public void setEstimateOutTime(Timestamp estimateOutTime) {
		this.estimateOutTime = estimateOutTime;
	}

	/**
	 * @return the flatId
	 */
	public String getFlatId() {
		return flatId;
	}

	/**
	 * @param flatId the flatId to set
	 */
	public void setFlatId(String flatId) {
		this.flatId = flatId;
	}

	/**
	 * @return the isCheckedIn
	 */
	public boolean isCheckedIn() {
		return isCheckedIn;
	}

	/**
	 * @param isCheckedIn the isCheckedIn to set
	 */
	public void setCheckedIn(boolean isCheckedIn) {
		this.isCheckedIn = isCheckedIn;
	}

	/**
	 * @return the personCount
	 */
	public int getPersonCount() {
		return personCount;
	}

	/**
	 * @param personCount the personCount to set
	 */
	public void setPersonCount(int personCount) {
		this.personCount = personCount;
	}

	/**
	 * @return the purpose
	 */
	public int getPurpose() {
		return purpose;
	}

	/**
	 * @param purpose the purpose to set
	 */
	public void setPurpose(int purpose) {
		this.purpose = purpose;
	}

	/**
	 * @return the societyId
	 */
	public java.math.BigInteger getSocietyId() {
		return societyId;
	}

	/**
	 * @param societyId the societyId to set
	 */
	public void setSocietyId(java.math.BigInteger societyId) {
		this.societyId = societyId;
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
	 * @return the visitorDescription
	 */
	public String getVisitorDescription() {
		return visitorDescription;
	}

	/**
	 * @param visitorDescription the visitorDescription to set
	 */
	public void setVisitorDescription(String visitorDescription) {
		this.visitorDescription = visitorDescription;
	}

	/**
	 * @return the visitorFirstName
	 */
	public String getVisitorFirstName() {
		return visitorFirstName;
	}

	/**
	 * @param visitorFirstName the visitorFirstName to set
	 */
	public void setVisitorFirstName(String visitorFirstName) {
		this.visitorFirstName = visitorFirstName;
	}

	/**
	 * @return the visitorMiddleName
	 */
	public String getVisitorMiddleName() {
		return visitorMiddleName;
	}

	/**
	 * @param visitorMiddleName the visitorMiddleName to set
	 */
	public void setVisitorMiddleName(String visitorMiddleName) {
		this.visitorMiddleName = visitorMiddleName;
	}

	/**
	 * @return the visitorLastName
	 */
	public String getVisitorLastName() {
		return visitorLastName;
	}

	/**
	 * @param visitorLastName the visitorLastName to set
	 */
	public void setVisitorLastName(String visitorLastName) {
		this.visitorLastName = visitorLastName;
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
	 * @return the visitorType
	 */
	public int getVisitorType() {
		return visitorType;
	}

	/**
	 * @param visitorType the visitorType to set
	 */
	public void setVisitorType(int visitorType) {
		this.visitorType = visitorType;
	}

	

}