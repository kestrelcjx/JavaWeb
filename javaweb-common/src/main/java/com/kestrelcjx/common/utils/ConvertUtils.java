package com.kestrelcjx.common.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Set;

/**
 * 类型转换器
 */
public class ConvertUtils {
    /**
     * 转换为String<br>
     * 如果给定的值为null，或者转换失败，返回默认值<br>
     * 转换失败不会报错
     *
     * @param value        被转换的值
     * @param defaultValue 转换错误时返回的默认值
     * @return 结果
     */
    public static String toStr(Object value, String defaultValue) {
        if (null == value) {
            return defaultValue;
        }
        if (value instanceof String) {
            return (String) value;
        }
        return value.toString();
    }

    /**
     * 转换为String<br>
     * 如果给定的值为null，或者转换失败，返回默认值null<br>
     * 转换失败不会报错
     *
     * @param value 被转换的值
     * @return 结果
     */
    public static String toStr(Object value) {
        return toStr(value, null);
    }

    /**
     * 转换为Character<br>
     * 如果给定的值为null，或者转换失败，返回默认值<br>
     * 转换失败不会报错
     *
     * @param value        被转换的值
     * @param defaultValue 转换错误时返回的默认值
     * @return 结果
     */
    public static Character toChar(Object value, Character defaultValue) {
        if (null == value) {
            return defaultValue;
        }
        if (value instanceof Character) {
            return (Character) value;
        }
        final String valueStr = toStr(value, null);
        return StringUtils.isEmpty(valueStr) ? defaultValue : valueStr.charAt(0);
    }

    /**
     * 转换为Character<br>
     * 如果给定的值为null，或者转换失败，返回默认值null<br>
     * 转化失败不会报错
     *
     * @param value 被转换的值
     * @return 结果
     */
    public static Character toChar(Object value) {
        return toChar(value, null);
    }

    /**
     * 转换为Byte<br>
     * 如果给定的值为null，或者转换失败，返回默认值<br>
     * 转换失败不会报错
     *
     * @param value        被转换的值
     * @param defaultValue 转换错误时返回的默认值
     * @return 结果
     */
    public static Byte toByte(Object value, Byte defaultValue) {
        if (null == value) {
            return defaultValue;
        }
        if (value instanceof Byte) {
            return (Byte) value;
        }
        if (value instanceof Number) {
            return ((Number) value).byteValue();
        }
        final String valueStr = toStr(value, null);
        if (StringUtils.isEmpty(valueStr)) {
            return defaultValue;
        }
        try {
            return Byte.parseByte(valueStr.trim());
        } catch (Exception e) {
            return defaultValue;
        }
    }

    /**
     * 转换为Byte<br>
     * 如果给定的值为null，或者转换失败，返回默认值null<br>
     * 转换失败不会报错
     *
     * @param value 被转换的值
     * @return 结果
     */
    public static Byte toByte(Object value) {
        return toByte(value, null);
    }

    /**
     * 转换为Short<br>
     * 如果给定值为null，或者转换失败，返回默认值<br>
     * 转换失败不会报错
     *
     * @param value        被转换的值
     * @param defaultValue 转换错误时返回的默认值
     * @return 结果
     */
    public static Short toShort(Object value, Short defaultValue) {
        if (null == value) {
            return defaultValue;
        }
        if (value instanceof Short) {
            return (Short) value;
        }
        if (value instanceof Number) {
            return ((Number) value).shortValue();
        }
        final String valueStr = toStr(value, null);
        if (StringUtils.isEmpty(valueStr)) {
            return defaultValue;
        }
        try {
            return Short.parseShort(valueStr.trim());
        } catch (Exception e) {
            return defaultValue;
        }
    }

    /**
     * 转换为Short<br>
     * 如果给定的值为null，或者转换失败，返回默认值null<br>
     * 转换失败不会报错
     *
     * @param value 被转换的值
     * @return 结果
     */
    public static Short toShort(Object value) {
        return toShort(value, null);
    }

    /**
     * 转换为Number<br>
     * 如果给定的值为null，或者转换失败，返回默认值<br>
     * 转换失败不会报错
     *
     * @param value        被转换的值
     * @param defaultValue 转换错误时的默认值
     * @return 结果
     */
    public static Number toNumber(Object value, Number defaultValue) {
        if (null == value) {
            return defaultValue;
        }
        if (value instanceof Number) {
            return (Number) value;
        }
        final String valueStr = toStr(value, null);
        if (StringUtils.isEmpty(valueStr)) {
            return defaultValue;
        }
        try {
            return NumberFormat.getInstance().parse(valueStr);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    /**
     * 转换为Number<br>
     * 如果给定的值为null，或者转换失败，返回默认值null<br>
     * 转换失败不会报错
     *
     * @param object 被转换的值
     * @return 结果
     */
    public static Number toNumber(Object object) {
        return toNumber(object, null);
    }

    /**
     * 转换为Integer<br>
     * 如果给定的值为null，或者转换失败，返回默认值<br>
     * 转换失败不会报错
     *
     * @param value        被转换的值
     * @param defaultValue 转换错误时返回的默认值
     * @return 结果
     */
    public static Integer toInt(Object value, Integer defaultValue) {
        if (null == value) {
            return defaultValue;
        }
        if (value instanceof Integer) {
            return (Integer) value;
        }
        if (value instanceof Number) {
            return ((Number) value).intValue();
        }
        final String valueStr = toStr(value, null);
        if (StringUtils.isEmpty(valueStr)) {
            return defaultValue;
        }
        try {
            return Integer.parseInt(valueStr.trim());
        } catch (Exception e) {
            return defaultValue;
        }
    }

    /**
     * 转换为Integer<br>
     * 如果给定的值为null，或者转换失败，返回默认值null<br>
     * 转换失败不会报错
     *
     * @param value 被转换的值
     * @return 结果
     */
    public static Integer toInt(Object value) {
        return toInt(value, null);
    }

    /**
     * 转换为Integer数组
     *
     * @param split 分隔符
     * @param str   被转换的值
     * @return 结果
     */
    public static Integer[] toIntArray(String split, String str) {
        if (StringUtils.isEmpty(str)) {
            return new Integer[]{};
        }
        String[] arr = str.split(split);
        final Integer[] ints = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            final Integer v = toInt(arr[i], 0);
            ints[i] = v;
        }
        return ints;
    }

    /**
     * 转换为Integer数组
     *
     * @param str 被转换的值
     * @return 结果
     */
    public static Integer[] toIntArray(String str) {
        return toIntArray(",", str);
    }

    /**
     * 转换为Long<br>
     * 如果给定的值为null，或者转换失败，返回默认值<br>
     * 转换失败不会报错
     *
     * @param value        被转换的值
     * @param defaultValue 转换错误时返回的默认值
     * @return 结果
     */
    public static Long toLong(Object value, Long defaultValue) {
        if (null == value) {
            return defaultValue;
        }
        if (value instanceof Long) {
            return (Long) value;
        }
        if (value instanceof Number) {
            return ((Number) value).longValue();
        }
        final String valueStr = toStr(value, null);
        if (StringUtils.isEmpty(valueStr)) {
            return defaultValue;
        }
        try {
            return new BigDecimal(valueStr.trim()).longValue();
        } catch (Exception e) {
            return defaultValue;
        }
    }

    /**
     * 转换为Long<br>
     * 如果给定的值为null，或者转换失败，返回默认值null<br>
     * 转换失败不会报错
     *
     * @param value 被转换的值
     * @return 结果
     */
    public static Long toLong(Object value) {
        return toLong(value, null);
    }

    /**
     * 转换为Long数组
     *
     * @param split 分隔符
     * @param str   被转换的值
     * @return 结果
     */
    public static Long[] toLongArray(String split, String str) {
        if (StringUtils.isEmpty(str)) {
            return new Long[]{};
        }
        String[] arr = str.split(split);
        final Long[] longs = new Long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            final Long v = toLong(arr[i], null);
            longs[i] = v;
        }
        return longs;
    }

    /**
     * 转换为Long数组
     *
     * @param str 被转换的值
     * @return 结果
     */
    public static Long[] toLongArray(String str) {
        return toLongArray(",", str);
    }

    /**
     * 转换为Double<br>
     * 如果给定的值为null，或者转换失败，返回默认值<br>
     * 转换失败不会报错
     *
     * @param value        被转换的值
     * @param defaultValue 转换错误时返回的默认值
     * @return 结果
     */
    public static Double toDouble(Object value, Double defaultValue) {
        if (null == value) {
            return defaultValue;
        }
        if (value instanceof Double) {
            return (Double) value;
        }
        if (value instanceof Number) {
            return ((Number) value).doubleValue();
        }
        final String valueStr = toStr(value, null);
        if (StringUtils.isEmpty(valueStr)) {
            return defaultValue;
        }
        try {
            return new BigDecimal(valueStr.trim()).doubleValue();
        } catch (Exception e) {
            return defaultValue;
        }
    }

    /**
     * 转换为Double<br>
     * 如果给定的值为null，或者转换失败。返回默认值null<br>
     * 转换失败不会报错
     *
     * @param value 被转换的值
     * @return 结果
     */
    public static Double toDouble(Object value) {
        return toDouble(value, null);
    }

    /**
     * 转换为Float<br>
     * 如果给定的值为null，或者转换失败，返回默认值<br>
     * 转换失败不会报错
     *
     * @param value        被转换的值
     * @param defaultValue 转换错误时返回的默认值
     * @return 结果
     */
    public static Float toFloat(Object value, Float defaultValue) {
        if (null == value) {
            return defaultValue;
        }
        if (value instanceof Float) {
            return (Float) value;
        }
        if (value instanceof Number) {
            return ((Number) value).floatValue();
        }
        final String valueStr = toStr(value, null);
        if (StringUtils.isEmpty(valueStr)) {
            return defaultValue;
        }
        try {
            return Float.parseFloat(valueStr.trim());
        } catch (Exception e) {
            return defaultValue;
        }
    }

    /**
     * 转换为Float<br>
     * 如果给定的值为null，或者转换失败，返回默认值null<br>
     * 转换失败不会报错
     *
     * @param value 被转换的值
     * @return 结果
     */
    public static Float toFloat(Object value) {
        return toFloat(value, null);
    }

    /**
     * 转换为Boolean<br>
     * String支持的值为：true、false、yes、ok、no、1、0，如果给定的值为null，或者转换失败，返回默认值<br>
     * 转换失败不会报错
     *
     * @param value        被转换的值
     * @param defaultValue 转换错误时返回的默认值
     * @return 结果
     */
    public static Boolean toBool(Object value, Boolean defaultValue) {
        if (null == value) {
            return defaultValue;
        }
        if (value instanceof Boolean) {
            return (Boolean) value;
        }
        String valueStr = toStr(value, null);
        if (StringUtils.isEmpty(valueStr)) {
            return defaultValue;
        }
        valueStr = valueStr.trim().toLowerCase();
        switch (valueStr) {
            case "true":
            case "yes":
            case "1":
            case "ok":
                return true;
            case "false":
            case "no":
            case "0":
                return false;
            default:
                return defaultValue;
        }
    }

    /**
     * 转换为Boolean<br>
     * 如果给定的值为null，或者转换失败，返回默认值null<br>
     * 转换失败不会报错
     *
     * @param object 被转换的值
     * @return 结果
     */
    public static Boolean toBool(Object object) {
        return toBool(object, null);
    }

    /**
     * 转换为Enum对象<br>
     * 如果给定的值为null，或者转换失败，返回默认值<br>
     * 转换失败不会报错
     *
     * @param clazz        Enum的Class
     * @param value        被转换的值
     * @param defaultValue 转换失败时返回的默认值
     * @return 结果
     */
    public static <E extends Enum<E>> E toEnum(Class<E> clazz, Object value, E defaultValue) {
        if (null == value) {
            return defaultValue;
        }
        if (clazz.isAssignableFrom(value.getClass())) {
            E myE = (E) value;
            return myE;
        }
        final String valueStr = toStr(value, null);
        if (StringUtils.isEmpty(valueStr)) {
            return defaultValue;
        }
        try {
            return Enum.valueOf(clazz, valueStr);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    /**
     * 转换为Enum对象<br>
     * 如果给定的值为null，或者转换失败，返回默认值null<br>
     * 转换失败不会报错
     *
     * @param clazz Enum的Class
     * @param value 被转换的值
     * @return 结果
     */
    public static <E extends Enum<E>> E toEnum(Class<E> clazz, Object value) {
        return toEnum(clazz, value, null);
    }

    /**
     * 转换为BigInteger<br>
     * 如果给定的值为null，或者转换失败，返回默认值<br>
     * 转换失败不会报错
     *
     * @param value        被转换的值
     * @param defaultValue 转换失败时返回的默认值
     * @return 结果
     */
    public static BigInteger toBigInteger(Object value, BigInteger defaultValue) {
        if (null == value) {
            return defaultValue;
        }
        if (value instanceof BigInteger) {
            return (BigInteger) value;
        }
        if (value instanceof Long) {
            return BigInteger.valueOf((Long) value);
        }
        final String valueStr = toStr(value, null);
        if (StringUtils.isEmpty(valueStr)) {
            return defaultValue;
        }
        try {
            return new BigInteger(valueStr);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    /**
     * 转换为BigInteger<br>
     * 如果给定的值的null，或者转换失败，返回默认值null<br>
     * 转换失败不会报错
     *
     * @param value 被转换的值
     * @return 结果
     */
    public static BigInteger toBigInteger(Object value) {
        return toBigInteger(value, null);
    }

    /**
     * 转换为BigDecimal<br>
     * 如果给定的值为空，或者转换失败，返回默认值<br>
     * 转换失败不会报错
     *
     * @param value        被转换的值
     * @param defaultValue 转换失败时返回的默认值
     * @return 结果
     */
    public static BigDecimal toBigDecimal(Object value, BigDecimal defaultValue) {
        if (null == value) {
            return defaultValue;
        }
        if (value instanceof BigDecimal) {
            return (BigDecimal) value;
        }
        if (value instanceof Long) {
            return new BigDecimal((Long) value);
        }
        if (value instanceof Double) {
            return new BigDecimal((Double) value);
        }
        if (value instanceof Integer) {
            return new BigDecimal((Integer) value);
        }
        final String valueStr = toStr(value, null);
        if (StringUtils.isEmpty(valueStr)) {
            return defaultValue;
        }
        try {
            return new BigDecimal(valueStr);
        } catch (Exception e) {
            return defaultValue;
        }
    }

    /**
     * 转换为BigDecimal<br>
     * 如果给定的值为null，或者转换失败，返回默认值<br>
     * 转换失败不会报错
     *
     * @param value 被转换的值
     * @return 结果
     */
    public static BigDecimal toBigDecimal(Object value) {
        return toBigDecimal(value, null);
    }

    /**
     * 将byte数组转换为字符串
     *
     * @param bytes   byte数组
     * @param charset 字符集，如果次字段为null，则解码的结果取决于平台
     * @return 结果
     */
    public static String str(byte[] bytes, Charset charset) {
        if (null == bytes) {
            return null;
        }
        if (null == charset) {
            return new String(bytes);
        }
        return new String(bytes, charset);
    }

    /**
     * 将byte数组转换为字符串
     *
     * @param bytes   byte数组
     * @param charset 字符集
     * @return 结果
     */
    public static String str(byte[] bytes, String charset) {
        return str(bytes, StringUtils.isEmpty(charset) ? Charset.defaultCharset() : Charset.forName(charset));
    }

    /**
     * 将编码的ByteBuffer数据转换为字符串
     *
     * @param bytes   数据
     * @param charset 字符集，如果为null则使用当前系统字符集
     * @return
     */
    public static String str(ByteBuffer bytes, Charset charset) {
        if (null == charset) {
            charset = Charset.defaultCharset();
        }
        return charset.decode(bytes).toString();
    }

    /**
     * 将编码的ByteBuffer数据转换为字符串
     *
     * @param bytes   数据
     * @param charset 字符集，如果为null则使用当前系统字符集
     * @return
     */
    public static String str(ByteBuffer bytes, String charset) {
        if (null == bytes) {
            return null;
        }
        return str(bytes, Charset.forName(charset));
    }

    /**
     * 将对象转换为字符串<br>
     * 1、Byte数组和ByteBuffer会转换为对应字符串的数组
     * 2、对象数组会调用Arrays.toString方法
     *
     * @param object  被转换的对象
     * @param charset 字符集
     * @return 结果
     */
    public static String str(Object object, Charset charset) {
        if (null == object) {
            return null;
        }
        if (object instanceof String) {
            return (String) object;
        } else if (object instanceof byte[] || object instanceof Byte[]) {
            return str((Byte[]) object, charset);
        } else if (object instanceof ByteBuffer) {
            return str((ByteBuffer) object, charset);
        }
        return object.toString();
    }

    /**
     * 将对象转换为字符串<br>
     * 1、Byte数组和ByteBuffer会被转换为对应的字符串的数组
     * 2、对象数组会调用Arrays.toString方法
     *
     * @param object  被转换的对象
     * @param charset 字符集
     * @return 结果
     */
    public static String str(Object object, String charset) {
        return str(object, Charset.forName(charset));
    }

    /**
     * 将对象转换为字符串<br>
     * 1、Byte数组和ByteBuffer会被转换为对应的字符串的数组
     * 2、对象数组会调用Arrays.toString方法
     *
     * @param object 被转换的对象
     * @return 结果
     */
    public static String utf8Str(Object object) {
        return str(object, CharsetKit.CHARSET_UTD_8);
    }

    /**
     * 半角转全角
     *
     * @param input         String
     * @param notConvertSet 不替换的字符集合
     * @return 结果
     */
    public static String toSBC(String input, Set<Character> notConvertSet) {
        char c[] = input.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (notConvertSet != null && notConvertSet.contains(c[i])) {
                continue;
            }
            if (c[i] == ' ') {
                c[i] = '\u3000';
            } else if (c[i] < '\177') {
                c[i] = (char) (c[i] + 65248);
            }
        }
        return new String(c);
    }

    /**
     * 半角转全角
     *
     * @param input String
     * @return 结果
     */
    public static String toSBC(String input) {
        return toSBC(input, null);
    }

    /**
     * 全角转半角
     *
     * @param input         String
     * @param notConvertSet 不替换的字符集合
     * @return 结果
     */
    public static String toDBC(String input, Set<Character> notConvertSet) {
        char[] c = input.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (notConvertSet != null && notConvertSet.contains(c[i])) {
                continue;
            }
            if (c[i] == '\u3000') {
                c[i] = ' ';
            } else if (c[i] > '\uFF00' && c[i] < '\uFF5F') {
                c[i] = (char) (c[i] - 65248);
            }
        }
        return new String(c);
    }

    /**
     * 全角转半角
     *
     * @param input String
     * @return 结果
     */
    public static String toDBC(String input) {
        return toDBC(input, null);
    }

    /**
     * 数字金额大写转换
     *
     * @param n 数字
     * @return 结果
     */
    public static String digitUppercase(double n) {
        String[] fraction = {"角", "分"};
        String[] digit = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String[][] unit = {{"元", "万", "亿"}, {"", "拾", "佰", "仟"}};
        String head = n < 0 ? "负" : "";
        n = Math.abs(n);
        String s = "";
        for (int i = 0; i < fraction.length; i++) {
            s += (digit[(int) (Math.floor(n * 10 * Math.pow(10, i)) % 10)]
                    + fraction[i]).replaceAll("(零.)+", "");
        }
        if (s.length() < 1) {
            s = "整";
        }
        int integerPart = (int) Math.floor(n);
        for (int i = 0; i < unit[0].length && integerPart > 0; i++) {
            String p = "";
            for (int j = 0; j < unit[1].length && n > 0; j++) {
                p = digit[integerPart % 10] + unit[1][j] + p;
                integerPart = integerPart / 10;
            }
            s = p.replaceAll("(零.)*零$", "")
                    .replaceAll("^$", "零") + unit[0][i] + s;
        }
        return head + s.replaceAll("(零.)*零元", "元")
                .replaceFirst("(零.)+", "")
                .replaceAll("(零.)+", "零")
                .replaceAll("^整$", "零元整");
    }
}
