package com.kestrelcjx.common.utils;

import org.apache.commons.lang3.time.DateFormatUtils;

import java.lang.management.ManagementFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils extends org.apache.commons.lang3.time.DateUtils {
    public static String YYYY = "yyyy";
    public static String YYYY_MM = "yyyy-MM";
    public static String YYYY_MM_DD = "yyyy-MM-dd";
    public static String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    public static String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    public static String[] parsePatterns = {
            "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM",
            "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm", "yyyy/MM",
            "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM"
    };

    /**
     * 获取当前时间
     *
     * @return
     */
    public static Date now() {
        return new Date();
    }

    /**
     * 获取Date的指定格式的字符串
     *
     * @param format 日期格式
     * @param date   日期
     * @return 字符串
     */
    public static final String parseDateToStr(final String format, final Date date) {
        return new SimpleDateFormat(format).format(date);
    }

    /**
     * 获取yyyy-MM-dd形式的日期字符串
     *
     * @param date 日期
     * @return 字符串
     */
    public static final String dateTime(final Date date) {
        return parseDateToStr(YYYY_MM_DD, date);
    }

    /**
     * 获取当前日期的指定格式的字符串
     *
     * @param format 日期格式
     * @return 字符串
     */
    public static final String dateTimeNow(final String format) {
        return parseDateToStr(format, new Date());
    }

    /**
     * 获取当前时间，格式为yyyyMMddHHmmss
     *
     * @return 字符串
     */
    public static final String dateTimeNow() {
        return dateTimeNow(YYYYMMDDHHMMSS);
    }

    /**
     * 获取当前时间，格式为yyyy-MM-dd HH:mm:ss
     *
     * @return 字符串
     */
    public static final String getTime() {
        return dateTimeNow(YYYY_MM_DD_HH_MM_SS);
    }

    /**
     * 获取当前日期，格式为yyyy-MM-dd
     *
     * @return 字符串
     */
    public static final String getDate() {
        return dateTimeNow(YYYY_MM_DD);
    }

    /**
     * 将表示日期的字符串按照格式解析成Date类
     *
     * @param format 日期格式
     * @param date   表示日期的字符串
     * @return Date类
     */
    public static final Date dateTime(final String format, final String date) {
        try {
            return new SimpleDateFormat(format).parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 日期路径，即年/月/日，如2021/01/01
     *
     * @return
     */
    public static final String datePath() {
        Date now = new Date();
        return DateFormatUtils.format(now, "yyyy/MM/dd");
    }

    /**
     * 日期路径，即年月日，如20210101
     *
     * @return
     */
    public static final String dateTime() {
        Date now = new Date();
        return DateFormatUtils.format(now, "yyyyMMdd");
    }

    /**
     * 将日期格式字符串转化为Date类
     *
     * @param object
     * @return
     */
    public static Date parseDate(Object object) {
        if (null == object) {
            return null;
        }
        try {
            return parseDate(object.toString(), parsePatterns);
        } catch (ParseException e) {
            return null;
        }
    }

    /**
     * 获取服务器启动时间
     *
     * @return
     */
    public static Date getServerStartDate() {
        Long time = ManagementFactory.getRuntimeMXBean().getStartTime();
        return new Date(time);
    }

    /**
     * 计算两个时间差
     *
     * @param endDate
     * @param nowDate
     * @return
     */
    public static String getDatePoor(Date endDate, Date nowDate) {
        long nd = 24 * 60 * 60 * 100; // 一天的毫秒数
        long nh = 60 * 60 * 1000; // 一小时的毫秒数
        long nm = 60 * 1000; // 一分钟的毫秒数
        long diff = endDate.getTime() - nowDate.getTime();
        long day = diff / nd;
        long hour = diff % nd / nh;
        long min = diff % nd % nh / nm;
        return day + "天" + hour + "小时" + min + "分钟";
    }
}
