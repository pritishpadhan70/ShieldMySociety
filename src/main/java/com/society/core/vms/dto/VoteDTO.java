package com.society.core.vms.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;


/**
 * The Data  class for the VOTE object.
 * 
 */
public class VoteDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long vid;

	private Timestamp createdAt;
	private BigInteger createdBy;
	private String description;
	private VoteSubjectDTO voteSubject;
	private Long societyId;
	private Long forUser;
	private boolean isExpired;
	private boolean isRead;
	private String voteText;
	private Timestamp userOptedAt;
	private VoteActionButtonDTO userSelectedButton;
	private VoteTypeDTO voteType;
	private String voteName;
	private Long roleId;

	public VoteDTO() {
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
	 * @return the createdAt
	 */
	public Timestamp getCreatedAt() {
		return createdAt;
	}

	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the createdBy
	 */
	public BigInteger getCreatedBy() {
		return createdBy;
	}

	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(BigInteger createdBy) {
		this.createdBy = createdBy;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the voteSubject
	 */
	public VoteSubjectDTO getVoteSubject() {
		return voteSubject;
	}

	/**
	 * @param voteSubject the voteSubject to set
	 */
	public void setVoteSubject(VoteSubjectDTO voteSubject) {
		this.voteSubject = voteSubject;
	}

	/**
	 * @param forUser the forUser to set
	 */
	public void setForUser(Long forUser) {
		this.forUser = forUser;
	}

	/**
	 * @return the forUser
	 */
	public Long getForUser() {
		return forUser;
	}

	/**
	 * @return the isExpired
	 */
	public boolean isExpired() {
		return isExpired;
	}

	/**
	 * @param isExpired the isExpired to set
	 */
	public void setExpired(boolean isExpired) {
		this.isExpired = isExpired;
	}

	/**
	 * @return the isRead
	 */
	public boolean isRead() {
		return isRead;
	}

	/**
	 * @param isRead the isRead to set
	 */
	public void setRead(boolean isRead) {
		this.isRead = isRead;
	}

	/**
	 * @return the voteText
	 */
	public String getVoteText() {
		return voteText;
	}

	/**
	 * @param voteText the voteText to set
	 */
	public void setVoteText(String voteText) {
		this.voteText = voteText;
	}

	/**
	 * @return the userOptedAt
	 */
	public Timestamp getUserOptedAt() {
		return userOptedAt;
	}

	/**
	 * @param userOptedAt the userOptedAt to set
	 */
	public void setUserOptedAt(Timestamp userOptedAt) {
		this.userOptedAt = userOptedAt;
	}

	/**
	 * @return the userSelectedButton
	 */
	public VoteActionButtonDTO getUserSelectedButton() {
		return userSelectedButton;
	}

	/**
	 * @param userSelectedButton the userSelectedButton to set
	 */
	public void setUserSelectedButton(VoteActionButtonDTO userSelectedButton) {
		this.userSelectedButton = userSelectedButton;
	}

	/**
	 * @return the voteType
	 */
	public VoteTypeDTO getVoteType() {
		return voteType;
	}

	/**
	 * @param voteType the voteType to set
	 */
	public void setVoteType(VoteTypeDTO voteType) {
		this.voteType = voteType;
	}

	/**
	 * @return the voteName
	 */
	public String getVoteName() {
		return voteName;
	}

	/**
	 * @param voteName the voteName to set
	 */
	public void setVoteName(String voteName) {
		this.voteName = voteName;
	}

	/**
	 * @return the roleId
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
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



}