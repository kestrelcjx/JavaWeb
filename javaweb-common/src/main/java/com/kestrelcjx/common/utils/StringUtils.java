package com.kestrelcjx.common.utils;

import com.alibaba.druid.sql.visitor.functions.Char;

import java.util.*;

/**
 * 字符串工具类
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils {
    /**
     * 空字符串
     */
    private static final String NULLSTR = "";

    /**
     * 下划线
     */
    private static final char SEPARATOR = '_';

    /**
     * 获取参数不为空值
     *
     * @param value        判断值
     * @param defaultValue 默认值
     * @param <T>          参数类型
     * @return 返回值
     */
    public static <T> T nvl(T value, T defaultValue) {
        return value != null ? value : defaultValue;
    }

    /**
     * 判断容器是否为空
     *
     * @param c 判断容器
     * @return true=空，false=非空
     */
    public static boolean isEmpty(Collection<?> c) {
        return isNull(c) || c.isEmpty();
    }

    /**
     * 判断一个容器是否非空
     *
     * @param c 判断容器
     * @return true=非空，false=空
     */
    public static boolean isNotEmpty(Collection<?> c) {
        return !isEmpty(c);
    }

    /**
     * 判断一个数组是否为空
     *
     * @param objects 判断数组
     * @return true=空，false=非空
     */
    public static boolean isEmpty(Object[] objects) {
        return isNull(objects) || (objects.length == 0);
    }

    /**
     * 判断一个数组是否非空
     *
     * @param objects 判断数组
     * @return true=非空，false=空
     */
    public static boolean isNotEmpty(Object[] objects) {
        return !isEmpty(objects);
    }

    /**
     * 判断一个Map是否为空
     *
     * @param map 判断Map
     * @return true=空，false=非空
     */
    public static boolean isEmpty(Map<?, ?> map) {
        return isNull(map) || map.isEmpty();
    }

    /**
     * 判断一个Map是否非空
     *
     * @param map 判断Map
     * @return true=非空，false=空
     */
    public static boolean isNotEmpty(Map<?, ?> map) {
        return !isEmpty(map);
    }

    /**
     * 判断一个字符串是否为空
     *
     * @param str 判断字符串
     * @return true=空，false=非空
     */
    public static boolean isEmpty(String str) {
        return isNull(str) || NULLSTR.equals(str.trim());
    }

    /**
     * 判断一个字符串是否非空
     *
     * @param str 判断字符串
     * @return true=非空，false=空
     */
    public static boolean isNotEmpty(String str) {
        return !isNotEmpty(str);
    }

    /**
     * 判断一个对象是否为空
     *
     * @param o 判断对象
     * @return true=空，false=非空
     */
    public static boolean isNull(Object o) {
        return o == null;
    }

    /**
     * 判断一个对象是否非空
     *
     * @param o 判断对象
     * @return true=非空，false=空
     */
    public static boolean isNotNull(Object o) {
        return !isNull(o);
    }

    /**
     * 判断一个对象是否为数组类型（Java基本类型的数组）
     *
     * @param o 判断对象
     * @return true=数组，false=非数组
     */
    public static boolean isArray(Object o) {
        return isNotNull(o) || o.getClass().isArray();
    }

    /**
     * 去空格
     *
     * @param str
     * @return
     */
    public static String trim(String str) {
        return str == null ? "" : str.trim();
    }

    /**
     * 截取字符串
     *
     * @param str   字符串
     * @param start 开始
     * @return 结果
     */
    public static String substring(final String str, int start) {
        if (str == null) {
            return NULLSTR;
        }
        if (start < 0) {
            start = Math.max(0, str.length() + start);
        } else if (start > str.length()) {
            return NULLSTR;
        }
        return str.substring(start);
    }

    /**
     * 截取字符串
     *
     * @param str   字符串
     * @param start 开始
     * @param end   结束
     * @return 结果
     */
    public static String substring(final String str, int start, int end) {
        if (str == null) {
            return NULLSTR;
        }
        if (end < 0) {
            end = Math.max(0, str.length() + end);
        }
        if (start < 0) {
            start = Math.max(0, str.length() + start);
        }
        if (start > end) {
            return NULLSTR;
        }
        return str.substring(start, end);
    }

    /**
     * 格式化字符串<br>
     * 此方法只是简单地将占位符 {} 按照顺序替换为参数<br>
     * 如果想输出 {}，使用 \ 转义 { 即可，如果想输出 {} 之前的 \，使用双转义符 \\ 即可<br>
     * 例子：<br>
     * 通常使用：format("this is {} for {}", "a", "b") -> this is a for b<br>
     * 转义 {}：format("this is \\{} for {}", "a", "b") -> this is {} for a<br>
     * 转义 \：format("this is \\\\{} for {}", "a", "b") -> this is \a for b<br>
     *
     * @param template 字符串模板
     * @param params   参数列表
     * @return 结果
     */
    public static String format(String template, Object... params) {
        if (isEmpty(params) || isEmpty(template)) {
            return template;
        }
        return StrFormatter.format(template, params);
    }

    /**
     * 字符串转List
     *
     * @param str         被转换的字符串
     * @param sep         分隔符
     * @param filterBlank 过滤纯空白
     * @param trim        去掉首尾空白
     * @return 结果
     */
    public static final List<String> str2List(String str, String sep, boolean filterBlank, boolean trim) {
        List<String> list = new ArrayList<>();
        if (isEmpty(str)) {
            return list;
        }
        if (filterBlank && isBlank(str)) {
            return list;
        }
        String[] split = str.split(sep);
        for (String string : split) {
            if (filterBlank && isBlank(string)) {
                continue;
            }
            if (trim) {
                string = string.trim();
            }
            list.add(string);
        }
        return list;
    }

    /**
     * 字符串转Set
     *
     * @param str 被转换的字符串
     * @param sep 分隔符
     * @return 结果
     */
    public static final Set<String> str2Set(String str, String sep) {
        return new HashSet<>(str2List(str, sep, true, false));
    }

    /**
     * 驼峰命名转下划线命名
     *
     * @param str 被转换的字符串
     * @return 结果
     */
    public static String toUnderScoreCase(String str) {
        if (null == str) {
            return null;
        }
        StringBuilder builder = new StringBuilder();
        boolean preCharIsUpperCase = true; // 前置字符是否大写
        boolean currentCharIsUpperCase = true; // 当前字符是否大写
        boolean nextCharIsUpperCase = true; // 下一个字符是否大写
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i > 0) {
                preCharIsUpperCase = Character.isUpperCase(str.charAt(i - 1));
            } else {
                preCharIsUpperCase = false;
            }
            currentCharIsUpperCase = Character.isUpperCase(c);
            if (i < (str.length() - 1)) {
                nextCharIsUpperCase = Character.isUpperCase(str.charAt(i + 1));
            }
            if (preCharIsUpperCase && currentCharIsUpperCase && !nextCharIsUpperCase) {
                builder.append(SEPARATOR);
            } else if (i != 0 && !preCharIsUpperCase && currentCharIsUpperCase) {
                builder.append(SEPARATOR);
            }
            builder.append(Character.toLowerCase(c));
        }
        return builder.toString();
    }

    /**
     * 是否包含字符串
     *
     * @param str  验证字符串
     * @param strs 字符串数组
     * @return 结果
     */
    public static boolean inStringIgnoreCase(String str, String... strs) {
        if (str != null && strs != null) {
            for (String s : strs) {
                if (str.equalsIgnoreCase(trim(s))) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 将下划线大写命名的字符串转换为驼峰式（首字母大写）。<br>
     * 如果转换前的字符串为空，则返回空字符串。<br>
     * 例如：HELLO_WORLD -> HelloWorld
     *
     * @param name 被转换的转发创
     * @return 结果
     */
    public static String convertToCamelCase(String name) {
        StringBuilder result = new StringBuilder();
        if (null == name || name.isEmpty()) {
            return "";
        } else if (!name.contains("_")) {
            return name.substring(0, 1).toUpperCase() + name.substring(1);
        }
        String[] camels = name.split("_");
        for (String camel : camels) {
            if (camel.isEmpty()) {
                continue;
            }
            result.append(camel.substring(0, 1).toUpperCase());
            result.append(camel.substring(1).toLowerCase());
        }
        return result.toString();
    }

    /**
     * 驼峰式命名法（首字母小写）<br>
     * 例如：user_name -> userName
     *
     * @param name 被转换的字符串
     * @return 结果
     */
    public static String toCamelCase(String name) {
        if (null == name) {
            return null;
        }
        name = name.toLowerCase();
        StringBuilder builder = new StringBuilder(name.length());
        boolean upperCase = false;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c == SEPARATOR) {
                upperCase = true;
            } else if (upperCase) {
                builder.append(Character.toUpperCase(c));
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
