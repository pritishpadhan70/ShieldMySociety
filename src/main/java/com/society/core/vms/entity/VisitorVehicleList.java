package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the VISITOR_VEHICLE_LIST database table.
 * 
 */
@Entity
@Table(name="VISITOR_VEHICLE_LIST")
@NamedQuery(name="VisitorVehicleList.findAll", query="SELECT v FROM VisitorVehicleList v")
public class VisitorVehicleList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FVL_ID")
	private String fvlId;

	@Column(name="`COMMENT`")
	private int comment;

	@Column(name="VEHICLE_COLOR")
	private String vehicleColor;

	@Column(name="VEHICLE_MAKE")
	private String vehicleMake;

	@Column(name="VEHICLE_NUMBER")
	private String vehicleNumber;

	@Column(name="VEHICLE_TYPE_ID")
	private int vehicleTypeId;

	@Column(name="VISITOR_ID")
	private BigInteger visitorId;

	public VisitorVehicleList() {
	}

	public String getFvlId() {
		return this.fvlId;
	}

	public void setFvlId(String fvlId) {
		this.fvlId = fvlId;
	}

	public int getComment() {
		return this.comment;
	}

	public void setComment(int comment) {
		this.comment = comment;
	}

	public String getVehicleColor() {
		return this.vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public String getVehicleMake() {
		return this.vehicleMake;
	}

	public void setVehicleMake(String vehicleMake) {
		this.vehicleMake = vehicleMake;
	}

	public String getVehicleNumber() {
		return this.vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public int getVehicleTypeId() {
		return this.vehicleTypeId;
	}

	public void setVehicleTypeId(int vehicleTypeId) {
		this.vehicleTypeId = vehicleTypeId;
	}

	public BigInteger getVisitorId() {
		return this.visitorId;
	}

	public void setVisitorId(BigInteger visitorId) {
		this.visitorId = visitorId;
	}

}