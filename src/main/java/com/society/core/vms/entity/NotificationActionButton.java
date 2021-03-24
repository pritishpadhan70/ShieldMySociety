package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the NOTIFICATION_ACTION_BUTTON database table.
 * 
 */
@Entity
@Table(name="NOTIFICATION_ACTION_BUTTON")
@NamedQuery(name="NotificationActionButton.findAll", query="SELECT n FROM NotificationActionButton n")
public class NotificationActionButton implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AB_ID")
	private int abId;

	@Column(name="BUTTON_DESC")
	private String buttonDesc;

	@Column(name="BUTTON_NAME")
	private String buttonName;

	//bi-directional many-to-one association to Notification
	//@OneToMany(mappedBy="notificationActionButton")
	//private List<Notification> notifications;
	
	@ManyToMany(mappedBy="actionButtons")
	private List<NotificationType> notificationTypes;

	public NotificationActionButton() {
	}

	
	/**
	 * @param abId
	 * @param buttonDesc
	 * @param buttonName
	 * @param notificationTypes
	 */
	public NotificationActionButton(int abId, String buttonDesc, String buttonName) {
		super();
		this.abId = abId;
		this.buttonDesc = buttonDesc;
		this.buttonName = buttonName;
	}


	/**
	 * @return the abId
	 */
	public int getAbId() {
		return abId;
	}

	/**
	 * @param abId the abId to set
	 */
	public void setAbId(int abId) {
		this.abId = abId;
	}

	/**
	 * @return the buttonDesc
	 */
	public String getButtonDesc() {
		return buttonDesc;
	}

	/**
	 * @param buttonDesc the buttonDesc to set
	 */
	public void setButtonDesc(String buttonDesc) {
		this.buttonDesc = buttonDesc;
	}

	/**
	 * @return the buttonName
	 */
	public String getButtonName() {
		return buttonName;
	}

	/**
	 * @param buttonName the buttonName to set
	 */
	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}

	/**
	 * @return the notificationTypes
	 */
	public List<NotificationType> getNotificationTypes() {
		return notificationTypes;
	}

	/**
	 * @param notificationTypes the notificationTypes to set
	 */
	public void setNotificationTypes(List<NotificationType> notificationTypes) {
		this.notificationTypes = notificationTypes;
	}

	/*
	 * public List<Notification> getNotifications() { return this.notifications; }
	 * 
	 * public void setNotifications(List<Notification> notifications) {
	 * this.notifications = notifications; }
	 * 
	 * public Notification addNotification(Notification notification) {
	 * getNotifications().add(notification);
	 * notification.setNotificationActionButton(this);
	 * 
	 * return notification; }
	 * 
	 * public Notification removeNotification(Notification notification) {
	 * getNotifications().remove(notification);
	 * notification.setNotificationActionButton(null);
	 * 
	 * return notification; }
	 */

	
}