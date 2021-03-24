package com.society.core.vms.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the VOTE database table.
 * 
 */
@Entity
@NamedQuery(name="Vote.findAll", query="SELECT v FROM Vote v")
public class Vote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long vid;

	@Column(name="CREATED_AT")
	private Timestamp createdAt;

	@Column(name="CREATED_BY")
	private BigInteger createdBy;

	private String description;
	
	@Column(name="SOCIETY_ID")
	private Long societyId;

	@Column(name="FOR_USER")
	private Long forUser;

	@Column(name="IS_EXPIRED")
	private boolean isExpired;

	@Column(name="IS_READ")
	private boolean isRead;
	
	
	@Column(name="VOTE_NAME")
	private String voteName;

	//bi-directional many-to-one association to VoteSubject
	@ManyToOne
	@JoinColumn(name="VOTE_SUBJECT")
	private VoteSubject voteSubject;
	
	@Lob
	@Column(name="VOTE_TEXT")
	private String voteText;

	@Column(name="USER_OPTED_AT")
	private Timestamp userOptedAt;

	//bi-directional many-to-one association to VoteActionButton
	@ManyToOne
	@JoinColumn(name="VALUE_OPTED_BY_USER")
	private VoteActionButton userSelectedButton;

	//bi-directional many-to-one association to VoteType
	@ManyToOne
	@JoinColumn(name="VT_ID")
	private VoteType voteType;

	public Vote() {
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
	public VoteSubject getVoteSubject() {
		return voteSubject;
	}

	/**
	 * @param voteSubject the voteSubject to set
	 */
	public void setVoteSubject(VoteSubject voteSubject) {
		this.voteSubject = voteSubject;
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
	 * @return the forUser
	 */
	public Long getForUser() {
		return forUser;
	}

	/**
	 * @param forUser the forUser to set
	 */
	public void setForUser(Long forUser) {
		this.forUser = forUser;
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
	public VoteActionButton getUserSelectedButton() {
		return userSelectedButton;
	}

	/**
	 * @param userSelectedButton the userSelectedButton to set
	 */
	public void setUserSelectedButton(VoteActionButton userSelectedButton) {
		this.userSelectedButton = userSelectedButton;
	}

	/**
	 * @return the voteType
	 */
	public VoteType getVoteType() {
		return voteType;
	}

	/**
	 * @param voteType the voteType to set
	 */
	public void setVoteType(VoteType voteType) {
		this.voteType = voteType;
	}

	

}