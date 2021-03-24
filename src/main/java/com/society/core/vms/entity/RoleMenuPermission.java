/*
 * package com.society.core.vms.entity;
 * 
 * import java.io.Serializable; import javax.persistence.*;
 * 
 * 
 *//**
	 * The persistent class for the ROLE_MENU_PERMISSION database table.
	 * 
	 *//*
		 * @Entity
		 * 
		 * @Table(name="ROLE_MENU_PERMISSION")
		 * 
		 * @NamedQuery(name="RoleMenuPermission.findAll",
		 * query="SELECT r FROM RoleMenuPermission r") public class RoleMenuPermission
		 * implements Serializable { private static final long serialVersionUID = 1L;
		 * 
		 * @Id private String id;
		 * 
		 * private String value;
		 * 
		 * //bi-directional many-to-one association to MenuLink
		 * 
		 * @ManyToOne
		 * 
		 * @JoinColumn(name="MENU_ID") private MenuLink menuLink;
		 * 
		 * //bi-directional many-to-one association to Role
		 * 
		 * @ManyToOne
		 * 
		 * @JoinColumn(name="ROLE_ID") private Role role;
		 * 
		 * public RoleMenuPermission() { }
		 * 
		 * public String getId() { return this.id; }
		 * 
		 * public void setId(String id) { this.id = id; }
		 * 
		 * public String getValue() { return this.value; }
		 * 
		 * public void setValue(String value) { this.value = value; }
		 * 
		 * public MenuLink getMenuLink() { return this.menuLink; }
		 * 
		 * public void setMenuLink(MenuLink menuLink) { this.menuLink = menuLink; }
		 * 
		 * public Role getRole() { return this.role; }
		 * 
		 * public void setRole(Role role) { this.role = role; }
		 * 
		 * }
		 */