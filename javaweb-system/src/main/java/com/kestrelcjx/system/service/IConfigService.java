package com.kestrelcjx.system.service;

import com.kestrelcjx.common.common.IBaseService;
import com.kestrelcjx.system.entity.Config;

import java.util.List;

/**
 * 系统配置服务类
 */
public interface IConfigService extends IBaseService<Config> {
    /**
     * 根据分组ID获取配置列表
     *
     * @param groupId 分组ID
     * @return
     */
    List<Config> getConfigListByGroupId(Integer groupId);
}
