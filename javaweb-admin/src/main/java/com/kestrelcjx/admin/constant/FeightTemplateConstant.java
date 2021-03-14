package com.kestrelcjx.admin.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * 运费模版模块常量
 */
public class FeightTemplateConstant {
    /**
     * 计费类型
     */
    public static Map<Integer, String> FEIGHTTEMPLATE_CHARGETYPE_LIST = new HashMap<Integer, String>() {
        {
            put(1, "按重量");
            put(2, "按件数");
        }
    };
}