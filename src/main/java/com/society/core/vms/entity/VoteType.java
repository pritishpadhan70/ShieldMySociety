package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the VOTE_TYPE database table.
 * 
 */
@Entity
@Table(name = "VOTE_TYPE")
@NamedQuery(name = "VoteType.findAll", query = "SELECT v FROM VoteType v")
public class VoteType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int vtid;

	private String description;

	private String type;

	// bi-directional many-to-one association to Vote
	// @OneToMany(mappedBy="voteType")
	// private List<Vote> votes;

	// bi-directional many-to-many association to VotetypeActnbtn
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH })
	@JoinTable(name = "VOTETYPE_ACTNBTN", joinColumns = { @JoinColumn(name = "VT_ID") }, inverseJoinColumns = {
			@JoinColumn(name = "VAB_ID") })
	private List<VoteActionButton> voteActionButtons;

	public VoteType() {
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

	/*	*//**
			 * @return the votes
			 */
	/*
	 * public List<Vote> getVotes() { return votes; }
	 * 
	 *//**
		 * @param votes the votes to set
		 *//*
			 * public void setVotes(List<Vote> votes) { this.votes = votes; }
			 */

	/**
	 * @return the voteActionButtons
	 */
	public List<VoteActionButton> getVoteActionButtons() {
		return voteActionButtons;
	}

	/**
	 * @param voteActionButtons the voteActionButtons to set
	 */
	public void setVoteActionButtons(List<VoteActionButton> voteActionButtons) {
		this.voteActionButtons = voteActionButtons;
	}

}