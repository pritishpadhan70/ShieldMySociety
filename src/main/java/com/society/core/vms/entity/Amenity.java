package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the AMENITY database table.
 * 
 */
@Entity
@NamedQuery(name="Amenity.findAll", query="SELECT a FROM Amenity a")
public class Amenity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int aid;

	@Column(name="AMENITY_COUNT")
	private int amenityCount;

	@Column(name="AMENITY_DESCRIPTION")
	private String amenityDescription;

	@Column(name="AMENITY_NAME")
	private String amenityName;

	public Amenity() {
	}

	public int getAid() {
		return this.aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getAmenityCount() {
		return this.amenityCount;
	}

	public void setAmenityCount(int amenityCount) {
		this.amenityCount = amenityCount;
	}

	public String getAmenityDescription() {
		return this.amenityDescription;
	}

	public void setAmenityDescription(String amenityDescription) {
		this.amenityDescription = amenityDescription;
	}

	public String getAmenityName() {
		return this.amenityName;
	}

	public void setAmenityName(String amenityName) {
		this.amenityName = amenityName;
	}

}