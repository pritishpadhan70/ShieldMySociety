package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the NOTIFICATION_TYPE database table.
 * 
 */
@Entity
@Table(name="NOTIFICATION_TYPE")
@NamedQuery(name="NotificationType.findAll", query="SELECT n FROM NotificationType n")
public class NotificationType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ntid;

	private String description;

	private String type;

	//bi-directional many-to-one association to Notification
	//@OneToMany(mappedBy="notificationType")
	//private List<Notification> notifications;
	
	
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH })
	@JoinTable(name = "NOTFCTINTYPE_ACTNBTN", 
	    joinColumns = { @JoinColumn(name = "NT_ID") }, 
	    inverseJoinColumns = { @JoinColumn(name = "AB_ID") })
	private List<NotificationActionButton> actionButtons;

	public NotificationType() {
	}

	/**
	 * @return the ntid
	 */
	public int getNtid() {
		return ntid;
	}

	/**
	 * @param ntid the ntid to set
	 */
	public void setNtid(int ntid) {
		this.ntid = ntid;
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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the actionButtons
	 */
	public List<NotificationActionButton> getActionButtons() {
		return actionButtons;
	}

	/**
	 * @param actionButtons the actionButtons to set
	 */
	public void setActionButtons(List<NotificationActionButton> actionButtons) {
		this.actionButtons = actionButtons;
	}

	

	/*
	 * public List<Notification> getNotifications() { return this.notifications; }
	 * 
	 * public void setNotifications(List<Notification> notifications) {
	 * this.notifications = notifications; }
	 * 
	 * public Notification addNotification(Notification notification) {
	 * getNotifications().add(notification); notification.setNotificationType(this);
	 * 
	 * return notification; }
	 * 
	 * public Notification removeNotification(Notification notification) {
	 * getNotifications().remove(notification);
	 * notification.setNotificationType(null);
	 * 
	 * return notification; }
	 */

}