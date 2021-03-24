package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the NEIBOURHOOD_TYPE database table.
 * 
 */
@Entity
@Table(name="NEIBOURHOOD_TYPE")
@NamedQuery(name="NeibourhoodType.findAll", query="SELECT n FROM NeibourhoodType n")
public class NeibourhoodType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NT_ID")
	private int ntId;

	private String description;

	private String type;

	//bi-directional many-to-one association to Neighbourhood
	@OneToMany(mappedBy="neibourhoodType")
	private List<Neighbourhood> neighbourhoods;

	public NeibourhoodType() {
	}

	
	
	/**
	 * @param ntId
	 * @param description
	 * @param type
	 * @param neighbourhoods
	 */
	public NeibourhoodType(int ntId, String description, String type, List<Neighbourhood> neighbourhoods) {
		super();
		this.ntId = ntId;
		this.description = description;
		this.type = type;
		this.neighbourhoods = neighbourhoods;
	}



	public int getNtId() {
		return this.ntId;
	}

	public void setNtId(int ntId) {
		this.ntId = ntId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Neighbourhood> getNeighbourhoods() {
		return this.neighbourhoods;
	}

	public void setNeighbourhoods(List<Neighbourhood> neighbourhoods) {
		this.neighbourhoods = neighbourhoods;
	}



}