package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the NOTIFICATION database table.
 * 
 */
@Entity
@NamedQuery(name="Notification.findAll", query="SELECT n FROM Notification n")
public class Notification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Long nid;

	@Column(name="CREATED_AT")
	private Timestamp createdAt;

	@Column(name="CREATED_BY")
	private BigInteger createdBy;

	private String description;

	@Column(name="FOR_USER")
	private BigInteger forUser;

	@Column(name="IS_EXPIRED")
	private byte isExpired;

	@Column(name="IS_READ")
	private byte isRead;

	@Lob
	@Column(name="NOTIFICATION_TEXT")
	private String notificationText;

	@Column(name="USER_OPTED_AT")
	private Timestamp userOptedAt;

	//bi-directional many-to-one association to NotificationActionButton
	@ManyToOne
	@JoinColumn(name="VALUE_OPTED_BY_USER")
	private NotificationActionButton userSelectedButton;

	//bi-directional many-to-one association to NotificationType
	@ManyToOne
	@JoinColumn(name="NT_ID")
	private NotificationType notificationType;

	public Notification() {
	}

	/**
	 * @return the nid
	 */
	public Long getNid() {
		return nid;
	}

	/**
	 * @param nid the nid to set
	 */
	public void setNid(Long nid) {
		this.nid = nid;
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
	 * @return the forUser
	 */
	public BigInteger getForUser() {
		return forUser;
	}

	/**
	 * @param forUser the forUser to set
	 */
	public void setForUser(BigInteger forUser) {
		this.forUser = forUser;
	}

	/**
	 * @return the isExpired
	 */
	public byte getIsExpired() {
		return isExpired;
	}

	/**
	 * @param isExpired the isExpired to set
	 */
	public void setIsExpired(byte isExpired) {
		this.isExpired = isExpired;
	}

	/**
	 * @return the isRead
	 */
	public byte getIsRead() {
		return isRead;
	}

	/**
	 * @param isRead the isRead to set
	 */
	public void setIsRead(byte isRead) {
		this.isRead = isRead;
	}

	/**
	 * @return the notificationText
	 */
	public String getNotificationText() {
		return notificationText;
	}

	/**
	 * @param notificationText the notificationText to set
	 */
	public void setNotificationText(String notificationText) {
		this.notificationText = notificationText;
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
	public NotificationActionButton getUserSelectedButton() {
		return userSelectedButton;
	}

	/**
	 * @param userSelectedButton the userSelectedButton to set
	 */
	public void setUserSelectedButton(NotificationActionButton userSelectedButton) {
		this.userSelectedButton = userSelectedButton;
	}

	/**
	 * @return the notificationType
	 */
	public NotificationType getNotificationType() {
		return notificationType;
	}

	/**
	 * @param notificationType the notificationType to set
	 */
	public void setNotificationType(NotificationType notificationType) {
		this.notificationType = notificationType;
	}



}