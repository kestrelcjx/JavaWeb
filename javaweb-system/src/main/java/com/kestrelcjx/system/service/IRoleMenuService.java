package com.kestrelcjx.system.service;

import com.kestrelcjx.common.common.IBaseService;
import com.kestrelcjx.common.utils.JsonResult;
import com.kestrelcjx.system.dto.RolePermissionDto;
import com.kestrelcjx.system.entity.RoleMenu;

/**
 * 角色菜单关系服务类
 */
public interface IRoleMenuService extends IBaseService<RoleMenu> {
    /**
     * 根据角色ID获取菜单列表
     *
     * @param roleId 角色ID
     * @return
     */
    JsonResult getRolePermissionByRoleId(Integer roleId);

    /**
     * 设置角色菜单权限
     *
     * @param rolePermissionDto 角色菜单权限
     * @return
     */
    JsonResult setRolePermission(RolePermissionDto rolePermissionDto);
}
