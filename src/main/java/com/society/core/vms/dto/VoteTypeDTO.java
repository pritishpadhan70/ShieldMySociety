package com.society.core.vms.dto;

import java.io.Serializable;
import java.util.List;


/**
 * The data class for the VOTE_TYPE object .
 * 
 */
public class VoteTypeDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private int vtid;

	private String description;

	private String type;


	//bi-directional many-to-many association to VotetypeActnbtn
	private List<VoteActionButtonDTO> voteActionButtons;

	public VoteTypeDTO() {
	}

	/**
	 * @return the vtid
	 */
	public int getVtid() {
		return vtid;
	}

	/**
	 * @param vtid the vtid to set
	 */
	public void setVtid(int vtid) {
		this.vtid = vtid;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the voteActionButtons
	 */
	public List<VoteActionButtonDTO> getVoteActionButtons() {
		return voteActionButtons;
	}

	/**
	 * @param voteActionButtons the voteActionButtons to set
	 */
	public void setVoteActionButtons(List<VoteActionButtonDTO> voteActionButtons) {
		this.voteActionButtons = voteActionButtons;
	}


}