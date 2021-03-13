package com.kestrelcjx.system.service;

import com.kestrelcjx.common.common.IBaseService;
import com.kestrelcjx.system.entity.Role;

import java.util.List;

/**
 * 系统角色服务类
 */
public interface IRoleService extends IBaseService<Role> {
    /**
     * 根据人员ID获取角色列表
     *
     * @param adminId 人员ID
     * @return
     */
    List<Role> getRoleListByAdminId(Integer adminId);
}
