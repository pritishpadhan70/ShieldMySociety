package com.society.core.vms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.society.core.vms.dto.MenuLinkDTO;
import com.society.core.vms.entity.MenuLink;
import com.society.core.vms.exceptions.DataNotFoundException;
import com.society.core.vms.exceptions.PersistanceException;
import com.society.core.vms.repository.MenuLinkRepository;
import com.society.core.vms.service.MenuLinkService;
import com.society.core.vms.util.ConversionUtility;

@Service
public class MenuLinkServiceImpl implements MenuLinkService {
	
	@Autowired
	MenuLinkRepository repository;

	@Override
	public List<MenuLinkDTO> getAllMenuService() throws DataNotFoundException {

		List<MenuLink> entities = repository.findAll();
		if(null ==entities || entities.isEmpty()) {
			throw new DataNotFoundException("NO MenuLinks are available");
		}
		return ConversionUtility.menuLinkEntityListToDataObject(entities);
	}

	@Override
	public MenuLinkDTO getSingleMenuByIdService(int menuId) throws DataNotFoundException {
		MenuLink entity = repository.findByMenuId(menuId);
		if(null ==entity) {
			throw new DataNotFoundException("NO MenuLink  for ID: " + menuId);
		}
		return ConversionUtility.entityToDataObject(entity);
	}

	@Override
	public List<MenuLinkDTO> getMenuByRoleId(int roleId) throws DataNotFoundException {
		
		List<MenuLink> entities = repository.findByRoleId(roleId);
		if(null ==entities || entities.isEmpty()) {
			throw new DataNotFoundException("NO MenuLinks for RoleId:" + roleId);
		}
		return ConversionUtility.menuLinkEntityListToDataObject(entities);
	}

	@Override
	public List<MenuLinkDTO> getMenuByRoleName(String roleName) throws DataNotFoundException {
		List<MenuLink> entities = repository.findByRoleName(roleName);
		if(null ==entities || entities.isEmpty()) {
			throw new DataNotFoundException("NO MenuLinks for RoleName: " + roleName);
		}
		return ConversionUtility.menuLinkEntityListToDataObject(entities);
	}

	@Override
	public List<MenuLinkDTO> getAllNoneAdminMenuService(boolean isAdminMenu) throws DataNotFoundException {
		List<MenuLink> entities = repository.findByIsAdminMenu(isAdminMenu);
		if(null ==entities || entities.isEmpty()) {
			throw new DataNotFoundException("NO MenuLinks are available for admin Filter");
		}
		return ConversionUtility.menuLinkEntityListToDataObject(entities);
	}

	@Override
	public List<MenuLinkDTO> getAllNoneCommonMenuService(boolean isCommonMenu) throws DataNotFoundException {
		List<MenuLink> entities = repository.findByIsCommonMenu(isCommonMenu);
		if(null ==entities || entities.isEmpty()) {
			throw new DataNotFoundException("NO MenuLinks are available for common menu Filter");
		}
		return ConversionUtility.menuLinkEntityListToDataObject(entities);
	}

	@Override
	public List<MenuLinkDTO> getAllNoneFactoryDefaultMenuService(boolean isFactoryDefault)
			throws DataNotFoundException {
		List<MenuLink> entities = repository.findByIsFactoryDefault(isFactoryDefault);
		if(null ==entities || entities.isEmpty()) {
			throw new DataNotFoundException("NO MenuLinks are available for factory-default Filter");
		}
		return ConversionUtility.menuLinkEntityListToDataObject(entities);
	}

	@Override
	public List<MenuLinkDTO> getAllByParentMenuIdService(int parentMenuId) throws DataNotFoundException {
		List<MenuLink> entities = repository.findByParentMenu(parentMenuId);
		if(null ==entities || entities.isEmpty()) {
			throw new DataNotFoundException("NO MenuLinks are available for parent/root menu");
		}
		return ConversionUtility.menuLinkEntityListToDataObject(entities);
	}

	@Override
	public String createMenuLinkService(MenuLinkDTO dto) throws PersistanceException {
		repository.save(ConversionUtility.dataObjectToEntity(dto));
		return  "Menu created succesfully";
	}

}
