package com.kestrelcjx.system.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 系统角色模块常量
 */
public class RoleConstant {
    /**
     * 状态
     */
    public static Map<Integer, String> ROLE_STATUS_LIST = new HashMap<Integer, String>() {
        {
            put(1, "正常");
            put(2, "禁用");
        }
    };
}