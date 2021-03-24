package com.society.core.vms.service;

import java.util.List;

import com.society.core.vms.dto.MenuLinkDTO;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.PersistanceException;

public interface MenuLinkService {
	
	List<MenuLinkDTO> getAllMenuService() throws DataNotFoundException;
	
	MenuLinkDTO getSingleMenuByIdService(int menuId) throws DataNotFoundException;
	
	List<MenuLinkDTO> getMenuByRoleId(int roleId) throws DataNotFoundException;

	List<MenuLinkDTO> getMenuByRoleName(String roleId) throws DataNotFoundException; 
	
	List<MenuLinkDTO> getAllNoneAdminMenuService(boolean isAdminMenu) throws DataNotFoundException;

	List<MenuLinkDTO> getAllNoneCommonMenuService(boolean isCommonMenu) throws DataNotFoundException;
	
	List<MenuLinkDTO> getAllNoneFactoryDefaultMenuService(boolean isFactoryDefault) throws DataNotFoundException;

	List<MenuLinkDTO> getAllByParentMenuIdService(int parentMenuId) throws DataNotFoundException;
	
	String createMenuLinkService(MenuLinkDTO dto) throws PersistanceException;

}
