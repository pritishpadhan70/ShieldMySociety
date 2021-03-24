package com.society.core.vms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the MENU_LINKS database table.
 * 
 */
@Entity
@Table(name="MENU_LINKS")
@NamedQuery(name="MenuLink.findAll", query="SELECT m FROM MenuLink m")
public class MenuLink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MENU_ID")
	private int menuId;

	@Column(name="DISPLAY_NAME")
	private String displayName;

	@Column(name="IS_ADMIN_MENU")
	private boolean isAdminMenu;

	@Column(name="IS_COMMON_MENU")
	private boolean isCommonMenu;

	@Column(name="IS_FACTORY_DEFAULT")
	private boolean isFactoryDefault;

	@Column(name="IS_ONCLICK_ACTION")
	private BigInteger isOnclickAction;

	@Column(name="MENU_LOCATION")
	private String menuLocation;

	@Column(name="PARENT_MENU")
	private int parentMenu;

	private String url;

	//@OneToMany(mappedBy="menuLink")
	@ManyToMany(mappedBy = "menuLinks")
	private List<Role> roles;

	public MenuLink() {
	}

	public int getMenuId() {
		return this.menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public boolean getIsAdminMenu() {
		return this.isAdminMenu;
	}

	public void setIsAdminMenu(boolean isAdminMenu) {
		this.isAdminMenu = isAdminMenu;
	}

	public boolean getIsCommonMenu() {
		return this.isCommonMenu;
	}

	public void setIsCommonMenu(boolean isCommonMenu) {
		this.isCommonMenu = isCommonMenu;
	}

	public boolean getIsFactoryDefault() {
		return this.isFactoryDefault;
	}

	public void setIsFactoryDefault(boolean isFactoryDefault) {
		this.isFactoryDefault = isFactoryDefault;
	}

	public BigInteger getIsOnclickAction() {
		return this.isOnclickAction;
	}

	public void setIsOnclickAction(BigInteger isOnclickAction) {
		this.isOnclickAction = isOnclickAction;
	}

	public String getMenuLocation() {
		return this.menuLocation;
	}

	public void setMenuLocation(String menuLocation) {
		this.menuLocation = menuLocation;
	}

	public int getParentMenu() {
		return this.parentMenu;
	}

	public void setParentMenu(int parentMenu) {
		this.parentMenu = parentMenu;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}



}