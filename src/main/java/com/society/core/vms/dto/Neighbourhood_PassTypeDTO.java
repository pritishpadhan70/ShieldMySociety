package com.society.core.vms.dto;

import java.io.Serializable;
import java.util.List;


/**
 * The data class for the `NEIGHBOURHOOD _PASS_TYPE` object table.
 * 
 */
public class Neighbourhood_PassTypeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int nptId;
	private String comments;
	private String passName;
	private String validity;

	//bi-directional many-to-one association to NeighbourhoodPassEntry
	private List<NeighbourhoodPassDetailDTO> neighbourhoodPassEntries;

	public Neighbourhood_PassTypeDTO() {
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

	public List<NeighbourhoodPassDetailDTO> getNeighbourhoodPassEntries() {
		return this.neighbourhoodPassEntries;
	}

	public void setNeighbourhoodPassEntries(List<NeighbourhoodPassDetailDTO> neighbourhoodPassEntries) {
		this.neighbourhoodPassEntries = neighbourhoodPassEntries;
	}

	public NeighbourhoodPassDetailDTO addNeighbourhoodPassEntry(NeighbourhoodPassDetailDTO neighbourhoodPassEntry) {
		getNeighbourhoodPassEntries().add(neighbourhoodPassEntry);
		neighbourhoodPassEntry.setNeighbourhoodPassType(this);

		return neighbourhoodPassEntry;
	}

	public NeighbourhoodPassDetailDTO removeNeighbourhoodPassEntry(NeighbourhoodPassDetailDTO neighbourhoodPassEntry) {
		getNeighbourhoodPassEntries().remove(neighbourhoodPassEntry);
		neighbourhoodPassEntry.setNeighbourhoodPassType(null);

		return neighbourhoodPassEntry;
	}

}