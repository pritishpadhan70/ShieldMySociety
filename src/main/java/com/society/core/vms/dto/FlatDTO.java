package com.society.core.vms.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;


/**
 * The DTO class for the FLAT data.
 * 
 */
public class FlatDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long flatId;

	private int areaSqrft;
	private String block;

	private String flatDescription;
	private String flatIntercomPhone;
	private String flatName;
	private String flatType;
	private String floor;
	private String residentName;
	private String residentPhone;
	private boolean isOwnerResiding;
	private boolean isVaccant;
	private int noOfResident;
	private Timestamp occupiedDate;
	private String ownerPhone;
	private String parkingArea;
	private BigInteger societyId;
	private BigInteger ownerId;
	private BigInteger tennantId;
	private String tennantName;
	private String userPass;
	private Timestamp vaccantDate;

	public FlatDTO() {
	}

	/**
	 * @return the flatId
	 */
	public Long getFlatId() {
		return flatId;
	}

	/**
	 * @param flatId the flatId to set
	 */
	public void setFlatId(Long flatId) {
		this.flatId = flatId;
	}

	/**
	 * @return the areaSqrft
	 */
	public int getAreaSqrft() {
		return areaSqrft;
	}

	/**
	 * @param areaSqrft the areaSqrft to set
	 */
	public void setAreaSqrft(int areaSqrft) {
		this.areaSqrft = areaSqrft;
	}

	/**
	 * @return the block
	 */
	public String getBlock() {
		return block;
	}

	/**
	 * @param block the block to set
	 */
	public void setBlock(String block) {
		this.block = block;
	}

	/**
	 * @return the flatDescription
	 */
	public String getFlatDescription() {
		return flatDescription;
	}

	/**
	 * @param flatDescription the flatDescription to set
	 */
	public void setFlatDescription(String flatDescription) {
		this.flatDescription = flatDescription;
	}

	/**
	 * @return the flatIntercomPhone
	 */
	public String getFlatIntercomPhone() {
		return flatIntercomPhone;
	}

	/**
	 * @param flatIntercomPhone the flatIntercomPhone to set
	 */
	public void setFlatIntercomPhone(String flatIntercomPhone) {
		this.flatIntercomPhone = flatIntercomPhone;
	}

	/**
	 * @return the flatName
	 */
	public String getFlatName() {
		return flatName;
	}

	/**
	 * @param flatName the flatName to set
	 */
	public void setFlatName(String flatName) {
		this.flatName = flatName;
	}

	/**
	 * @return the flatType
	 */
	public String getFlatType() {
		return flatType;
	}

	/**
	 * @param flatType the flatType to set
	 */
	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}

	/**
	 * @return the floor
	 */
	public String getFloor() {
		return floor;
	}

	/**
	 * @param floor the floor to set
	 */
	public void setFloor(String floor) {
		this.floor = floor;
	}

	/**
	 * @return the residentName
	 */
	public String getResidentName() {
		return residentName;
	}

	/**
	 * @param residentName the residentName to set
	 */
	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	/**
	 * @return the residentPhone
	 */
	public String getResidentPhone() {
		return residentPhone;
	}

	/**
	 * @param residentPhone the residentPhone to set
	 */
	public void setResidentPhone(String residentPhone) {
		this.residentPhone = residentPhone;
	}

	/**
	 * @return the isOwnerResiding
	 */
	public boolean isOwnerResiding() {
		return isOwnerResiding;
	}

	/**
	 * @param isOwnerResiding the isOwnerResiding to set
	 */
	public void setOwnerResiding(boolean isOwnerResiding) {
		this.isOwnerResiding = isOwnerResiding;
	}

	/**
	 * @return the isVaccant
	 */
	public boolean isVaccant() {
		return isVaccant;
	}

	/**
	 * @param isVaccant the isVaccant to set
	 */
	public void setVaccant(boolean isVaccant) {
		this.isVaccant = isVaccant;
	}

	/**
	 * @return the noOfResident
	 */
	public int getNoOfResident() {
		return noOfResident;
	}

	/**
	 * @param noOfResident the noOfResident to set
	 */
	public void setNoOfResident(int noOfResident) {
		this.noOfResident = noOfResident;
	}

	/**
	 * @return the occupiedDate
	 */
	public Timestamp getOccupiedDate() {
		return occupiedDate;
	}

	/**
	 * @param occupiedDate the occupiedDate to set
	 */
	public void setOccupiedDate(Timestamp occupiedDate) {
		this.occupiedDate = occupiedDate;
	}

	/**
	 * @return the ownerPhone
	 */
	public String getOwnerPhone() {
		return ownerPhone;
	}

	/**
	 * @param ownerPhone the ownerPhone to set
	 */
	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}

	/**
	 * @return the parkingArea
	 */
	public String getParkingArea() {
		return parkingArea;
	}

	/**
	 * @param parkingArea the parkingArea to set
	 */
	public void setParkingArea(String parkingArea) {
		this.parkingArea = parkingArea;
	}

	/**
	 * @return the societyId
	 */
	public BigInteger getSocietyId() {
		return societyId;
	}

	/**
	 * @param societyId the societyId to set
	 */
	public void setSocietyId(BigInteger societyId) {
		this.societyId = societyId;
	}

	/**
	 * @return the ownerId
	 */
	public BigInteger getOwnerId() {
		return ownerId;
	}

	/**
	 * @param ownerId the ownerId to set
	 */
	public void setOwnerId(BigInteger ownerId) {
		this.ownerId = ownerId;
	}

	/**
	 * @return the tennantId
	 */
	public BigInteger getTennantId() {
		return tennantId;
	}

	/**
	 * @param tennantId the tennantId to set
	 */
	public void setTennantId(BigInteger tennantId) {
		this.tennantId = tennantId;
	}

	/**
	 * @return the tennantName
	 */
	public String getTennantName() {
		return tennantName;
	}

	/**
	 * @param tennantName the tennantName to set
	 */
	public void setTennantName(String tennantName) {
		this.tennantName = tennantName;
	}

	/**
	 * @return the userPass
	 */
	public String getUserPass() {
		return userPass;
	}

	/**
	 * @param userPass the userPass to set
	 */
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	/**
	 * @return the vaccantDate
	 */
	public Timestamp getVaccantDate() {
		return vaccantDate;
	}

	/**
	 * @param vaccantDate the vaccantDate to set
	 */
	public void setVaccantDate(Timestamp vaccantDate) {
		this.vaccantDate = vaccantDate;
	}

}