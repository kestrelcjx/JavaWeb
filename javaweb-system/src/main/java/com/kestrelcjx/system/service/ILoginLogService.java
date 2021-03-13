package com.kestrelcjx.system.service;

import com.kestrelcjx.common.common.IBaseService;
import com.kestrelcjx.system.entity.LoginLog;

/**
 * 登录日志服务类
 */
public interface ILoginLogService extends IBaseService<LoginLog> {
    /**
     * 创建系统登录日志
     *
     * @param loginLog 访问日志对象
     */
    void insertLoginLog(LoginLog loginLog);
}
