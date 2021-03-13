package com.kestrelcjx.system.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 定时任务模块常量
 */
public class CrontabConstant {
    /**
     * 状态
     */
    public static Map<Integer, String> CRONTAB_STATUS_LIST = new HashMap<Integer, String>() {
        {
            put(1, "正常");
            put(2, "暂停");
        }
    };
}