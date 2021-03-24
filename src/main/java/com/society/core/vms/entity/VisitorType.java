package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the VISITOR_TYPE database table.
 * 
 */
@Entity
@Table(name="VISITOR_TYPE")
@NamedQuery(name="VisitorType.findAll", query="SELECT v FROM VisitorType v")
public class VisitorType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="VT_ID")
	private int vtId;

	private String description;

	private String type;

	public VisitorType() {
	}

	
	/**
	 * @param vtId
	 * @param description
	 * @param type
	 */
	public VisitorType(int vtId, String description, String type) {
		super();
		this.vtId = vtId;
		this.description = description;
		this.type = type;
	}


	public int getVtId() {
		return this.vtId;
	}

	public void setVtId(int vtId) {
		this.vtId = vtId;
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

}