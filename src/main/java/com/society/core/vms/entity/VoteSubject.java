package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the VOTE_SUBJECT database table.
 * 
 */
@Entity
@Table(name="VOTE_SUBJECT")
@NamedQuery(name="VoteSubject.findAll", query="SELECT v FROM VoteSubject v")
public class VoteSubject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="VS_ID")
	private int vsId;

	private String subject;

	//bi-directional many-to-one association to Vote
	@OneToMany(mappedBy="voteSubject")//lazy loading
	private List<Vote> votes;

	public VoteSubject() {
	}

	
	
	/**
	 * @param vsId
	 * @param subject
	 * @param votes
	 */
	public VoteSubject(int vsId, String subject) {
		super();
		this.vsId = vsId;
		this.subject = subject;
	}



	public int getVsId() {
		return this.vsId;
	}

	public void setVsId(int vsId) {
		this.vsId = vsId;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<Vote> getVotes() {
		return this.votes;
	}

	public void setVotes(List<Vote> votes) {
		this.votes = votes;
	}

	public Vote addVote(Vote vote) {
		getVotes().add(vote);
		vote.setVoteSubject(this);

		return vote;
	}

	public Vote removeVote(Vote vote) {
		getVotes().remove(vote);
		vote.setVoteSubject(null);

		return vote;
	}

}