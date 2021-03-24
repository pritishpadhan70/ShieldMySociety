package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AMENITY_USER database table.
 * 
 */
@Entity
@Table(name="AMENITY_USER")
@NamedQuery(name="AmenityUser.findAll", query="SELECT a FROM AmenityUser a")
public class AmenityUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AU_ID")
	private String auId;

	@Column(name="AMENITY_ID")
	private int amenityId;

	@Column(name="`COMMENT`")
	private String comment;

	@Column(name="USER_ID")
	private int userId;

	public AmenityUser() {
	}

	public String getAuId() {
		return this.auId;
	}

	public void setAuId(String auId) {
		this.auId = auId;
	}

	public int getAmenityId() {
		return this.amenityId;
	}

	public void setAmenityId(int amenityId) {
		this.amenityId = amenityId;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}