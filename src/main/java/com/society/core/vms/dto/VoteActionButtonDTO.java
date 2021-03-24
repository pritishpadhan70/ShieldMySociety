package com.society.core.vms.dto;

import java.io.Serializable;
import java.util.List;


/**
 * The data class for the VOTE_ACTION_BUTTON object .
 * 
 */
public class VoteActionButtonDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int vabId;

	private String buttonDesc;
	private String buttonName;
	private List<VoteTypeDTO> voteTypes;

	public VoteActionButtonDTO() {
	}

	/**
	 * @param vabId
	 * @param buttonDesc
	 * @param buttonName
	 * @param voteTypes
	 */
	public VoteActionButtonDTO(int vabId, String buttonDesc, String buttonName) {
		super();
		this.vabId = vabId;
		this.buttonDesc = buttonDesc;
		this.buttonName = buttonName;
	}

	/**
	 * @return the vabId
	 */
	public int getVabId() {
		return vabId;
	}

	/**
	 * @param vabId the vabId to set
	 */
	public void setVabId(int vabId) {
		this.vabId = vabId;
	}

	/**
	 * @return the buttonDesc
	 */
	public String getButtonDesc() {
		return buttonDesc;
	}

	/**
	 * @param buttonDesc the buttonDesc to set
	 */
	public void setButtonDesc(String buttonDesc) {
		this.buttonDesc = buttonDesc;
	}

	/**
	 * @return the buttonName
	 */
	public String getButtonName() {
		return buttonName;
	}

	/**
	 * @param buttonName the buttonName to set
	 */
	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}

	/**
	 * @return the voteTypes
	 */
	public List<VoteTypeDTO> getVoteTypes() {
		return voteTypes;
	}

	/**
	 * @param voteTypes the voteTypes to set
	 */
	public void setVoteTypes(List<VoteTypeDTO> voteTypes) {
		this.voteTypes = voteTypes;
	}

	



}