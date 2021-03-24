package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the VEHICLE_TYPE database table.
 * 
 */
@Entity
@Table(name="VEHICLE_TYPE")
@NamedQuery(name="VehicleType.findAll", query="SELECT v FROM VehicleType v")
public class VehicleType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="VEHICLE_ID")
	private int vehicleId;

	private String comments;

	@Column(name="FUEL_TYPE")
	private String fuelType;

	@Column(name="VEHICLE_TYPE_NAME")
	private String vehicleTypeName;

	public VehicleType() {
	}

	public int getVehicleId() {
		return this.vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getFuelType() {
		return this.fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getVehicleTypeName() {
		return this.vehicleTypeName;
	}

	public void setVehicleTypeName(String vehicleTypeName) {
		this.vehicleTypeName = vehicleTypeName;
	}

}