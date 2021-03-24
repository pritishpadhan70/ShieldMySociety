package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ROLE database table.
 * 
 */
@Entity
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ROLE_ID")
	private int roleId;

	@Column(name="GROUP_DESCRIPTION")
	private String groupDescription;

	@Column(name="GROUP_NAME")
	private String groupName;

	@Column(name="IS_ENABLED")
	private byte isEnabled;

	//bi-directional many-to-one association to RoleMenuPermission
	//@OneToMany(mappedBy="role")
	
    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH })
    @JoinTable(name = "ROLE_MENU_PERMISSION", 
    		joinColumns = { @JoinColumn(name = "ROLE_ID") }, 
    		inverseJoinColumns = { @JoinColumn(name = "MENU_ID") }
    )
	private List<MenuLink> menuLinks;

	public Role() {
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

	public List<MenuLink> getMenuLinks() {
		return this.menuLinks;
	}

	public void setMenuLinks(List<MenuLink> menuLinks) {
		this.menuLinks = menuLinks;
	}


}