package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the VOTE_ACTION_BUTTON database table.
 * 
 */
@Entity
@Table(name="VOTE_ACTION_BUTTON")
@NamedQuery(name="VoteActionButton.findAll", query="SELECT v FROM VoteActionButton v")
public class VoteActionButton implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="VAB_ID")
	private int vabId;

	@Column(name="BUTTON_DESC")
	private String buttonDesc;

	@Column(name="BUTTON_NAME")
	private String buttonName;

	//bi-directional many-to-many association to VotetypeActnbtn
	@ManyToMany(mappedBy="voteActionButtons")
	private List<VoteType> voteTypes;

	public VoteActionButton() {
	}

	
	
	/**
	 * @param vabId
	 * @param buttonDesc
	 * @param buttonName
	 */
	public VoteActionButton(int vabId, String buttonDesc, String buttonName) {
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
	public List<VoteType> getVoteTypes() {
		return voteTypes;
	}



	/**
	 * @param voteTypes the voteTypes to set
	 */
	public void setVoteTypes(List<VoteType> voteTypes) {
		this.voteTypes = voteTypes;
	}


}