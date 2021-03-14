package com.kestrelcjx.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kestrelcjx.system.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 系统角色Mapper接口
 */
public interface RoleMapper extends BaseMapper<Role> {
    /**
     * 根据人员ID获取角色列表
     *
     * @param adminId 人员ID
     * @return
     */
    List<Role> getRoleListByAdminId(@Param("adminId") Integer adminId);
}
