package com.society.core.vms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the USER_ID_PROOF database table.
 * 
 */
@Entity
@Table(name="USER_ID_PROOF")
@NamedQuery(name="UserIdProof.findAll", query="SELECT u FROM UserIdProof u")
public class UserIdProof implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="UIP_ID")
	private String uipId;

	@Column(name="ID_VALUE")
	private String idValue;

	@Column(name="IDPROOF_ID")
	private int idproofId;

	//@Column(name="USER_ID")
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private GlobalUser globalUser;

	public UserIdProof() {
	}

	public String getUipId() {
		return this.uipId;
	}

	public void setUipId(String uipId) {
		this.uipId = uipId;
	}

	public String getIdValue() {
		return this.idValue;
	}

	public void setIdValue(String idValue) {
		this.idValue = idValue;
	}

	public int getIdproofId() {
		return this.idproofId;
	}

	public void setIdproofId(int idproofId) {
		this.idproofId = idproofId;
	}

	public GlobalUser getGlobalUser() {
		return this.globalUser;
	}

	public void setGlobalUser(GlobalUser globalUser) {
		this.globalUser = globalUser;
	}

}