package com.society.core.vms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.society.core.vms.entity.MenuLink;

public interface MenuLinkRepository extends CrudRepository<MenuLink, Integer> {

	List<MenuLink> findAll();
	
	MenuLink findByMenuId(int menuId);
	
	@Query("select ml from MenuLink ml join Role r where  r.roleId = :roleId")
	List<MenuLink> findByRoleId(@Param("roleId")int roleId);
	
	@Query("select ml from MenuLink ml join Role r where  r.groupName = :roleName")
	List<MenuLink> findByRoleName(@Param("roleName")String roleName);
	
	List<MenuLink> findByRoles_RoleId(int roleId);// same as findByRoleId()

	List<MenuLink> findByRoles_GroupName(String roleId); //same as findByRoleName
	
	List<MenuLink> findByIsAdminMenu(boolean isAdminMenu);

	List<MenuLink> findByIsCommonMenu(boolean isCommonMenu);
	
	List<MenuLink> findByIsFactoryDefault(boolean isFactoryDefault);

	List<MenuLink> findByParentMenu(int parentMenuId);

	
	

}
