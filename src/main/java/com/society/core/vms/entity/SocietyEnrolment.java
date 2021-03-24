package com.society.core.vms.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the SOCIETY database table.
 * 
 */
@Entity
@Table(name = "SOCIETY_ENROLMENT")
@NamedQuery(name = "SocietyEnrolment.findAll", query = "SELECT s FROM SocietyEnrolment s")
public class SocietyEnrolment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GenericGenerator(name = "generator", strategy = "increment")
	@GeneratedValue(generator = "generator")
	@Column(name = "SE_ID")
	private Long id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PHONE")
	private String phone;

	@Column(name = "STATE")
	private Integer state;

	@Column(name = "COUNTRY")
	private Integer country;

	@Column(name = "DISTRICT")
	private Integer district;

	@Column(name = "CITY")
	private Integer city;

	@Column(name = "SOCIETY_NAME")
	private String societyName;

	@Column(name = "SOCIETY_ID")
	private Long societyId;

	@Column(name = "SOCIETY_ADDRESS")
	private String societyAddress;

	@Column(name = "IS_SOCIETY_MGMT_TEAM")
	private boolean isManagementSocietyManagementTeam;

	@Column(name = "USER_ID")
	private Long userId;
	
	@Column(name = "REQUEST_TIME")
	private Timestamp resuestTime;
	
	@Column(name = "IS_CLOSED")
	private boolean isClosed;

	@Column(name = "COMMENTS")
	private String comments;

	@Column(name = "IS_DOCUMENT_ATTACHED")
	private boolean isDocAttached;

	/**
	 * 
	 */
	public SocietyEnrolment() {
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the state
	 */
	public Integer getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public Integer getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(Integer country) {
		this.country = country;
	}

	/**
	 * @return the district
	 */
	public Integer getDistrict() {
		return district;
	}

	/**
	 * @param district the district to set
	 */
	public void setDistrict(Integer district) {
		this.district = district;
	}

	/**
	 * @return the city
	 */
	public Integer getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(Integer city) {
		this.city = city;
	}

	/**
	 * @return the societyName
	 */
	public String getSocietyName() {
		return societyName;
	}

	/**
	 * @param societyName the societyName to set
	 */
	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	/**
	 * @return the societyId
	 */
	public Long getSocietyId() {
		return societyId;
	}

	/**
	 * @param societyId the societyId to set
	 */
	public void setSocietyId(Long societyId) {
		this.societyId = societyId;
	}

	/**
	 * @return the societyAddress
	 */
	public String getSocietyAddress() {
		return societyAddress;
	}

	/**
	 * @param societyAddress the societyAddress to set
	 */
	public void setSocietyAddress(String societyAddress) {
		this.societyAddress = societyAddress;
	}

	/**
	 * @return the isManagementSocietyManagementTeam
	 */
	public boolean isManagementSocietyManagementTeam() {
		return isManagementSocietyManagementTeam;
	}

	/**
	 * @param isManagementSocietyManagementTeam the isManagementSocietyManagementTeam to set
	 */
	public void setManagementSocietyManagementTeam(boolean isManagementSocietyManagementTeam) {
		this.isManagementSocietyManagementTeam = isManagementSocietyManagementTeam;
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
	 * @return the resuestTime
	 */
	public Timestamp getResuestTime() {
		return resuestTime;
	}

	/**
	 * @param resuestTime the resuestTime to set
	 */
	public void setResuestTime(Timestamp resuestTime) {
		this.resuestTime = resuestTime;
	}

	/**
	 * @return the isClosed
	 */
	public boolean isClosed() {
		return isClosed;
	}

	/**
	 * @param isClosed the isClosed to set
	 */
	public void setClosed(boolean isClosed) {
		this.isClosed = isClosed;
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
	 * @return the isDocAttached
	 */
	public boolean isDocAttached() {
		return isDocAttached;
	}

	/**
	 * @param isDocAttached the isDocAttached to set
	 */
	public void setDocAttached(boolean isDocAttached) {
		this.isDocAttached = isDocAttached;
	}
	
	

}