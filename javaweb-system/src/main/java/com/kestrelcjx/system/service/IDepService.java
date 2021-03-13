package com.kestrelcjx.system.service;

import com.kestrelcjx.common.common.IBaseService;
import com.kestrelcjx.system.entity.Dep;

/**
 * 部门服务类
 */
public interface IDepService extends IBaseService<Dep> {
    /**
     * 根据部门ID获取部门名称
     *
     * @param depId     部门ID
     * @param delimiter 拼接字符
     * @return
     */
    String getDepNameByDepId(Integer depId, String delimiter);
}
