package com.society.core.vms.dto;

import java.io.Serializable;


/**
 * The Data class for the VOTE_SUBJECT object .
 * 
 */
public class VoteSubjectDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int vsId;
	private String subject;
	//private List<Vote> votes;

	public VoteSubjectDTO() {
	}

	
	
	/**
	 * @param vsId
	 * @param subject
	 */
	public VoteSubjectDTO(int vsId, String subject) {
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



}