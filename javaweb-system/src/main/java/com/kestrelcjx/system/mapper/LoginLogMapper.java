package com.kestrelcjx.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kestrelcjx.system.entity.LoginLog;

/**
 * 登录日志Mapper接口
 */
public interface LoginLogMapper extends BaseMapper<LoginLog> {
    /**
     * 创建系统登录日志
     *
     * @param LoginLog
     */
    void insertLoginLog(LoginLog LoginLog);
}
