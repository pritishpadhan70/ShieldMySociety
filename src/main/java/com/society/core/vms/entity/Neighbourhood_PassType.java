package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the `NEIGHBOURHOOD _PASS_TYPE` database table.
 * 
 */
@Entity
@Table(name="`NEIGHBOURHOOD _PASS_TYPE`")
@NamedQuery(name="Neighbourhood_PassType.findAll", query="SELECT n FROM Neighbourhood_PassType n")
public class Neighbourhood_PassType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NPT_ID")
	private int nptId;

	private String comments;

	@Column(name="PASS_NAME")
	private String passName;

	private String validity;

	//bi-directional many-to-one association to NeighbourhoodPassEntry
	@OneToMany(mappedBy="neighbourhoodPassType")
	private List<NeighbourhoodPassDetail> neighbourhoodPassEntries;

	public Neighbourhood_PassType() {
	}

	public int getNptId() {
		return this.nptId;
	}

	public void setNptId(int nptId) {
		this.nptId = nptId;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getPassName() {
		return this.passName;
	}

	public void setPassName(String passName) {
		this.passName = passName;
	}

	public String getValidity() {
		return this.validity;
	}

	public void setValidity(String validity) {
		this.validity = validity;
	}

	public List<NeighbourhoodPassDetail> getNeighbourhoodPassEntries() {
		return this.neighbourhoodPassEntries;
	}

	public void setNeighbourhoodPassEntries(List<NeighbourhoodPassDetail> neighbourhoodPassEntries) {
		this.neighbourhoodPassEntries = neighbourhoodPassEntries;
	}

	public NeighbourhoodPassDetail addNeighbourhoodPassEntry(NeighbourhoodPassDetail neighbourhoodPassEntry) {
		getNeighbourhoodPassEntries().add(neighbourhoodPassEntry);
		neighbourhoodPassEntry.setNeighbourhoodPassType(this);

		return neighbourhoodPassEntry;
	}

	public NeighbourhoodPassDetail removeNeighbourhoodPassEntry(NeighbourhoodPassDetail neighbourhoodPassEntry) {
		getNeighbourhoodPassEntries().remove(neighbourhoodPassEntry);
		neighbourhoodPassEntry.setNeighbourhoodPassType(null);

		return neighbourhoodPassEntry;
	}

}