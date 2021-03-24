package com.society.core.vms.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;


/**
 * The data class for the MENU_LINKS object table.
 * 
 */
public class MenuLinkDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int menuId;
	private String displayName;
	private boolean isAdminMenu;
	private boolean isCommonMenu;
	private boolean isFactoryDefault;
	private BigInteger isOnclickAction;
	private String menuLocation;
	private int parentMenu;
	private String url;
	private List<RoleDTO> roles;

	public MenuLinkDTO() {
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

	public List<RoleDTO> getRoles() {
		return this.roles;
	}

	public void setRoles(List<RoleDTO> roles) {
		this.roles = roles;
	}



}