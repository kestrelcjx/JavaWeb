package com.kestrelcjx.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kestrelcjx.system.entity.OperLog;

/**
 * 操作日志Mapper接口
 */
public interface OperLogMapper extends BaseMapper<OperLog> {
    /**
     * 创建系统操作日志
     *
     * @param operLog
     */
    void insertOperLog(OperLog operLog);
}
