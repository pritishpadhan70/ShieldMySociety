package com.society.core.vms.dto;

import java.io.Serializable;


/**
 * The persistent class for the VEHICLE_TYPE database table.
 * 
 */
public class VehicleDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int vehicleId;
	private String comments;
	private String fuelType;
	private String vehicleTypeName;

	public VehicleDTO() {
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