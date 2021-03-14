package com.kestrelcjx.admin.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 会员地址模块常量
 */
public class UserAddressConstant {
    /**
     * 默认地址
     */
    public static Map<Integer, String> USERADDRESS_ISDEFAULT_LIST = new HashMap<Integer, String>() {
        {
            put(1, "是");
            put(2, "否");
        }
    };
}