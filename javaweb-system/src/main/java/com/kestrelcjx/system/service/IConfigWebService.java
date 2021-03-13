package com.kestrelcjx.system.service;

import com.kestrelcjx.common.utils.JsonResult;

import java.util.Map;

/**
 * 系统配置服务类
 */
public interface IConfigWebService {
    /**
     * 编辑配置信息
     *
     * @param map 参数
     * @return
     */
    JsonResult configEdit(Map<String, Object> map);
}
