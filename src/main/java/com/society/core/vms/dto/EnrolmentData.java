/**
 * 
 */
package com.society.core.vms.dto;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author deepikadas
 *
 */
public class EnrolmentData implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3205902543000718409L;
	private Long id;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;
	private Long userId;
	private boolean isManagementSocietyManagementTeam;
	private boolean isDocAttached;
	private String societyName;
	private String societyAddress;
	private Long societyId;
	private Integer state;
	private Integer country;
	private Integer district;
	private Integer city;
	private Timestamp resuestTime;
	
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
	private boolean isClosed;
	private String comments;
	
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
	

}
