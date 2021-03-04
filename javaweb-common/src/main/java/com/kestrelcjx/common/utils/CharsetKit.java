package com.kestrelcjx.common.utils;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * 字符串工具集
 */
public class CharsetKit {
    public static final String ISO_8859_1 = "ISO-8859-1";
    public static final String UTF_8 = "UTF-8";
    public static final String GBK = "GBK";
    public static final Charset CHARSET_ISO_8859_1 = Charset.forName(ISO_8859_1);
    public static final Charset CHARSET_UTD_8 = Charset.forName(UTF_8);
    public static final Charset CHARSET_GBK = Charset.forName(GBK);

    /**
     * 转换为Charset对象<br>
     *
     * @param charset 字符集，为null则返回默认值字符集
     * @return 结果
     */
    public static Charset charset(String charset) {
        return StringUtils.isEmpty(charset) ? Charset.defaultCharset() : Charset.forName(charset);
    }

    /**
     * 转换字符串的字符编码
     *
     * @param source      被转换的字符串
     * @param srcCharset  源字符集，默认为ISO_8859_1
     * @param destCharset 目标字符集，默认为UTF-8
     * @return 结果
     */
    public static String convert(String source, Charset srcCharset, Charset destCharset) {
        if (null == srcCharset) {
            srcCharset = StandardCharsets.ISO_8859_1;
        }
        if (null == destCharset) {
            destCharset = StandardCharsets.UTF_8;
        }
        if (StringUtils.isEmpty(source) || srcCharset.equals(destCharset)) {
            return source;
        }
        return new String(source.getBytes(srcCharset), destCharset);
    }

    /**
     * 转换字符串的字符编码
     *
     * @param source      被转换的字符串
     * @param srcCharset  源字符集，默认为ISO-8859-1
     * @param destCharset 目标字符集，默认为UTF-8
     * @return 结果
     */
    public static String convert(String source, String srcCharset, String destCharset) {
        return convert(source, Charset.forName(srcCharset), Charset.forName(destCharset));
    }

    /**
     * @return 系统默认字符编码
     */
    public static String systemCharset() {
        return Charset.defaultCharset().name();
    }
}
