package com.kestrelcjx.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kestrelcjx.common.common.BaseQuery;
import com.kestrelcjx.common.utils.JsonResult;
import com.kestrelcjx.system.entity.Admin;

import java.io.Serializable;
import java.util.Map;

/**
 * 系统人员服务类
 */
public interface IAdminService extends IService<Admin> {
    /**
     * 根据查询条件获取数据列表
     *
     * @param query 查询条件
     * @return
     */
    JsonResult getList(BaseQuery query);

    /**
     * 根据ID获取记录信息
     *
     * @param id 记录ID
     * @return
     */
    Map<String, Object> info(Integer id);

    /**
     * 根据ID获取记录信息
     *
     * @param id
     * @return
     */
    Object getInfo(Serializable id);

    /**
     * 根据实体对象添加、编辑记录
     *
     * @param entity 实体对象
     * @return
     */
    JsonResult edit(Admin entity);

    /**
     * 根据ID删除记录
     *
     * @param id 记录ID
     * @return
     */
    JsonResult deleteById(Integer id);

    /**
     * 根据ID删除记录
     *
     * @param ids 记录ID
     * @return
     */
    JsonResult deleteByIds(String ids);

    /**
     * 设置状态
     *
     * @param entity 实体对象
     * @return
     */
    JsonResult setStatus(Admin entity);

    /**
     * 根据用户名获取人员
     *
     * @param username 用户名
     * @return
     */
    Admin getAdminByUsername(String username);
}
