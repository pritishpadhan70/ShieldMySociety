package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TIMEZONE database table.
 * 
 */
@Entity
@NamedQuery(name="Timezone.findAll", query="SELECT t FROM Timezone t")
public class Timezone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int tid;

	private String description;

	private String location;

	private String zone;

	public Timezone() {
	}

	public int getTid() {
		return this.tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getZone() {
		return this.zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

}