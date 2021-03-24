package com.society.core.vms.dto;

import java.io.Serializable;
import java.util.List;


/**
 * The data class for the ROLE object table.
 * 
 */
public class RoleDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int roleId;
	private String groupDescription;
	private String groupName;
	private byte isEnabled;
	private List<MenuLinkDTO> menuLinks;

	public RoleDTO() {
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getGroupDescription() {
		return this.groupDescription;
	}

	public void setGroupDescription(String groupDescription) {
		this.groupDescription = groupDescription;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public byte getIsEnabled() {
		return this.isEnabled;
	}

	public void setIsEnabled(byte isEnabled) {
		this.isEnabled = isEnabled;
	}

	public List<MenuLinkDTO> getMenuLinks() {
		return this.menuLinks;
	}

	public void setMenuLinks(List<MenuLinkDTO> menuLinks) {
		this.menuLinks = menuLinks;
	}


}