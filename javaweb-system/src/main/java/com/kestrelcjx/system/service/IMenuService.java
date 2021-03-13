package com.kestrelcjx.system.service;

import com.kestrelcjx.common.common.IBaseService;
import com.kestrelcjx.system.entity.Menu;
import com.kestrelcjx.system.vo.MenuListVo;

import java.util.List;

/**
 * 菜单服务类
 */
public interface IMenuService extends IBaseService<Menu> {
    /**
     * 根据人员ID获取菜单权限
     *
     * @param adminId 人员ID
     * @return
     */
    List<Menu> getMenuListByAdminId(Integer adminId);
    List<MenuListVo> getNavbarMenu(Integer adminId);
}
