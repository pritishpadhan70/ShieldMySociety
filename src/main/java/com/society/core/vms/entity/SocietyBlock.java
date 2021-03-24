package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SOCIETY_BLOCK database table.
 * 
 */
@Entity
@Table(name="SOCIETY_BLOCK")
@NamedQuery(name="SocietyBlock.findAll", query="SELECT s FROM SocietyBlock s")
public class SocietyBlock implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SB_ID")
	private int sbId;

	@Column(name="BLOCK_NAME")
	private String blockName;

	private int description;

	@Column(name="SOCIETY_ID")
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