package com.kestrelcjx.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kestrelcjx.system.entity.Menu;
import com.kestrelcjx.system.vo.MenuListVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 菜单mapper接口
 */
public interface MenuMapper extends BaseMapper<Menu> {
    /**
     * 根据人员ID获取菜单列表
     *
     * @param adminId 人员ID
     * @return
     */
    List<Menu> getMenuListByAmdinId(@Param("adminId") Integer adminId);

    /**
     * 获取导航菜单
     *
     * @param roleIds 角色ID集合（逗号隔开）
     * @param pid     上级ID
     * @return
     */
    List<MenuListVo> getNavbarMenu(@Param("roleId") String roleIds, @Param("pid") Integer pid);
}
