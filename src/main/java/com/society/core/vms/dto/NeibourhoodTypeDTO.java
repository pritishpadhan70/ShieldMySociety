package com.society.core.vms.dto;

import java.io.Serializable;
import java.util.List;


/**
 * The data class for the NEIBOURHOOD_TYPE object table.
 * 
 */
public class NeibourhoodTypeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int ntId;
	private String description;
	private String type;

	//bi-directional many-to-one association to NeibourhoodEmployee
	private List<NeibourhoodEmployeeDTO> neibourhoodEmployees;

	public NeibourhoodTypeDTO() {
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

	public List<NeibourhoodEmployeeDTO> getNeibourhoodEmployees() {
		return this.neibourhoodEmployees;
	}

	public void setNeibourhoodEmployees(List<NeibourhoodEmployeeDTO> neibourhoodEmployees) {
		this.neibourhoodEmployees = neibourhoodEmployees;
	}

	public NeibourhoodEmployeeDTO addNeibourhoodEmployee(NeibourhoodEmployeeDTO neibourhoodEmployee) {
		getNeibourhoodEmployees().add(neibourhoodEmployee);
		neibourhoodEmployee.setNeibourhoodType(this);

		return neibourhoodEmployee;
	}

	public NeibourhoodEmployeeDTO removeNeibourhoodEmployee(NeibourhoodEmployeeDTO neibourhoodEmployee) {
		getNeibourhoodEmployees().remove(neibourhoodEmployee);
		neibourhoodEmployee.setNeibourhoodType(null);

		return neibourhoodEmployee;
	}

}