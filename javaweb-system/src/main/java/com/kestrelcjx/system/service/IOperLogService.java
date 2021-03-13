package com.kestrelcjx.system.service;

import com.kestrelcjx.common.common.IBaseService;
import com.kestrelcjx.system.entity.OperLog;

/**
 * 操作日志服务类
 */
public interface IOperLogService extends IBaseService<OperLog> {
    /**
     * 创建系统操作日志
     *
     * @param operLog
     */
    void insertOperLog(OperLog operLog);
}
