package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the VOTETYPE_ACTNBTN database table( Many to many join table).
 * 
 */
@Entity
@Table(name="VOTETYPE_ACTNBTN")
@NamedQuery(name="VotetypeActnbtn.findAll", query="SELECT v FROM VotetypeActnbtn v")
public class VotetypeActnbtn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	//bi-directional many-to-one association to VoteType
	@ManyToOne
	@JoinColumn(name="VT_ID")
	private VoteType voteType;

	//bi-directional many-to-one association to VoteActionButton
	@ManyToOne
	@JoinColumn(name="VAB_ID")
	private VoteActionButton voteActionButton;

	public VotetypeActnbtn() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public VoteType getVoteType() {
		return this.voteType;
	}

	public void setVoteType(VoteType voteType) {
		this.voteType = voteType;
	}

	public VoteActionButton getVoteActionButton() {
		return this.voteActionButton;
	}

	public void setVoteActionButton(VoteActionButton voteActionButton) {
		this.voteActionButton = voteActionButton;
	}

}