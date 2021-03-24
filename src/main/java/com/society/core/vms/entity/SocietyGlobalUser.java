package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SOCIETY_GLOBAL_USER database table.
 * 
 */
@Entity
@Table(name="SOCIETY_GLOBAL_USER")
@NamedQuery(name="SocietyGlobalUser.findAll", query="SELECT s FROM SocietyGlobalUser s")
public class SocietyGlobalUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SGU_ID")
	private String sguId;

	private int COmment;

	@Column(name="GLOBAL_USER_ID")
	private int globalUserId;

	@Column(name="SOCIETY_ID")
	private int societyId;

	public SocietyGlobalUser() {
	}

	public String getSguId() {
		return this.sguId;
	}

	public void setSguId(String sguId) {
		this.sguId = sguId;
	}

	public int getCOmment() {
		return this.COmment;
	}

	public void setCOmment(int COmment) {
		this.COmment = COmment;
	}

	public int getGlobalUserId() {
		return this.globalUserId;
	}

	public void setGlobalUserId(int globalUserId) {
		this.globalUserId = globalUserId;
	}

	public int getSocietyId() {
		return this.societyId;
	}

	public void setSocietyId(int societyId) {
		this.societyId = societyId;
	}

}