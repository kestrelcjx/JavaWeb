package com.kestrelcjx.system.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 广告位描述模块常量
 */
public class AdSortConstant {
    /**
     * 站点类型
     */
    public static Map<Integer, String> ADSORT_PLATFORM_LIST = new HashMap<Integer, String>() {
        {
            put(1, "PC网站");
            put(2, "WAP手机站");
            put(3, "微信小程序");
            put(4, "APP移动端");
        }
    };
}