package com.society.core.vms.dto;

import java.io.Serializable;


/**
 * The data class for the SOCIETY_BLOCK object table.
 * 
 */
public class SocietyBlock implements Serializable {
	private static final long serialVersionUID = 1L;

	private int sbId;
	private String blockName;
	private int description;
	private int societyId;

	public SocietyBlock() {
	}

	public int getSbId() {
		return this.sbId;
	}

	public void setSbId(int sbId) {
		this.sbId = sbId;
	}

	public String getBlockName() {
		return this.blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public int getDescription() {
		return this.description;
	}

	public void setDescription(int description) {
		this.description = description;
	}

	public int getSocietyId() {
		return this.societyId;
	}

	public void setSocietyId(int societyId) {
		this.societyId = societyId;
	}

}