package com.kestrelcjx.common.utils;

/**
 * 字符串格式化
 */
public class StrFormatter {
    public static final String EMPTY_JSON = "{}";
    public static final char C_BACKSLASH = '\\';
    public static final char C_DELIM_START = '{';
    public static final char C_DELIM_END = '}';

    /**
     * 格式化字符串<br>
     * 此方法只是简单地将占位符 {} 按照顺序替换为参数<br>
     * 如果想输出 {}，使用 \ 转义 { 即可，如果想输出 {} 之前的 \，使用双转义符 \\ 即可<br>
     * 例子：<br>
     * 通常使用：format("this is {} for {}", "a", "b") -> this is a for b<br>
     * 转义 {}：format("this is \\{} for {}", "a", "b") -> this is {} for a<br>
     * 转义 \：format("this is \\\\{} for {}", "a", "b") -> this is \a for b<br>
     *
     * @param strPattern 字符串模板
     * @param argArray   参数列表
     * @return 结果
     */
    public static String format(final String strPattern, final Object... argArray) {
        if (StringUtils.isEmpty(strPattern) || StringUtils.isEmpty(argArray)) {
            return strPattern;
        }
        final int strPatternLength = strPattern.length();
        StringBuilder builder = new StringBuilder(strPatternLength + 50);
        int handledPosition = 0;
        int delimIndex; // 占位符所在位置
        for (int argIndex = 0; argIndex < argArray.length; argIndex++) {
            delimIndex = strPattern.indexOf(EMPTY_JSON, handledPosition); // 模板字符串中的“{}”的位置
            if (delimIndex != -1) { // 模板字符串仍存在“{}”
                if (delimIndex > 0 && strPattern.charAt(delimIndex - 1) == C_BACKSLASH) {
                    if (delimIndex > 1 && strPattern.charAt(delimIndex - 2) == C_BACKSLASH) {
                        // 占位符前有两个转义符，占位符有效
                        builder.append(strPattern, handledPosition, delimIndex - 1);
                        builder.append(ConvertUtils.utf8Str(argArray[argIndex]));
                        handledPosition = delimIndex + 2;
                    } else {
                        // 占位符前有一个转义符，占位符无效
                        argIndex--;
                        builder.append(strPattern, handledPosition, delimIndex - 1);
                        builder.append(C_DELIM_START);
                        handledPosition = delimIndex + 1;
                    }
                } else {
                    // 占位符前无转义符，起正常占位作用
                    builder.append(strPattern, handledPosition, delimIndex);
                    builder.append(ConvertUtils.utf8Str(argArray[argIndex]));
                    handledPosition = delimIndex + 2;
                }
            }
        }
        // 加入剩余字符
        builder.append(strPattern, handledPosition, strPatternLength);
        return builder.toString();
    }
}
