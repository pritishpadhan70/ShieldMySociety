package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the `NOTIFICATION-TYPE_ACTION-BUTTON` database table.
 * 
 */
@Entity
@Table(name="NOTFCTINTYPE_ACTNBTN")
@NamedQuery(name="Notification_typeAction_button.findAll", query="SELECT n FROM Notification_typeAction_button n")
public class Notification_typeAction_button implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="AB_ID")
	private int abId;

	@Column(name="NT_ID")
	private int ntId;

	public Notification_typeAction_button() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAbId() {
		return this.abId;
	}

	public void setAbId(int abId) {
		this.abId = abId;
	}

	public int getNtId() {
		return this.ntId;
	}

	public void setNtId(int ntId) {
		this.ntId = ntId;
	}

}