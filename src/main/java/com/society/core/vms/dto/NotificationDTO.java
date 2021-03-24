/**
 * 
 */
package com.society.core.vms.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

import com.society.core.vms.entity.NotificationActionButton;
import com.society.core.vms.entity.NotificationType;

/**
 * @author deepikadas
 *
 */
public class NotificationDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long nid;
	private Timestamp createdAt;
	private BigInteger createdBy;
	private String description;
	private BigInteger forUser;
	private byte isExpired;
	private byte isRead;
	private String notificationText;
	private Timestamp userOptedAt;
	private NotificationActionButtonDTO userSelectedButton;
	private NotificationTypeDTO notificationType;
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
	public NotificationActionButtonDTO getUserSelectedButton() {
		return userSelectedButton;
	}
	/**
	 * @param userSelectedButton the userSelectedButton to set
	 */
	public void setUserSelectedButton(NotificationActionButtonDTO userSelectedButton) {
		this.userSelectedButton = userSelectedButton;
	}
	/**
	 * @return the notificationType
	 */
	public NotificationTypeDTO getNotificationType() {
		return notificationType;
	}
	/**
	 * @param notificationType the notificationType to set
	 */
	public void setNotificationType(NotificationTypeDTO notificationType) {
		this.notificationType = notificationType;
	}

	

}
