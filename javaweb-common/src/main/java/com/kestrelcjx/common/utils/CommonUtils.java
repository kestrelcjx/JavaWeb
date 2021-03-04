package com.kestrelcjx.common.utils;

import com.alibaba.fastjson.JSONObject;
import com.kestrelcjx.common.config.CommonConfig;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 公共函数类
 */
public class CommonUtils {
    /**
     * 获取当前时间戳
     *
     * @return
     */
    public static Integer timeStamp() {
        long currentTime = System.currentTimeMillis();
        String time = String.valueOf(currentTime / 1000);
        return Integer.valueOf(time);
    }

    /**
     * 时间转换为日期
     *
     * @param time   被转换的时间戳
     * @param format 日期格式
     * @return 结果
     */
    public static String formatTime(Integer time, String format) {
        if (StringUtils.isEmpty(format)) {
            return "";
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Long timeLong = time.longValue() * 1000;
        Date date = new Date(timeLong);
        return dateFormat.format(date);
    }

    /**
     * 获取到图片域名的地址
     *
     * @param imageUrl
     * @return
     */
    public static String getImageURL(String imageUrl) {
        return CommonConfig.imageURL + imageUrl;
    }

    /**
     * 验证邮箱格式是否正确
     *
     * @param email 验证邮箱
     * @return 结果
     */
    public static boolean isEmail(String email) {
        boolean flag = false;
        try {
            String check = "^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";
            Pattern regex = Pattern.compile(check);
            Matcher matcher = regex.matcher(email);
            flag = matcher.matches();
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    /**
     * 验证手机号格式是否正确
     *
     * @param mobile 验证手机号
     * @return 结果
     */
    public static boolean isMobile(String mobile) {
        boolean flag = false;
        try {
            String check = "^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
            Pattern pattern = Pattern.compile(check);
            Matcher matcher = pattern.matcher(mobile);
            flag = matcher.matches();
        } catch (Exception e) {
            flag = false;
        }
        return flag;
    }

    /**
     * 生成指定位数的随机字符串
     *
     * @param isNum  是否是纯数字
     * @param length 长度
     * @return
     */
    public static String getRandomStr(boolean isNum, int length) {
        StringBuilder builder = new StringBuilder(length);
        String str = isNum ? "1234567890" : "1234567890abcdefghijklmnopqrstuvwxyz";
        int len = str.length();
        for (int i = 0; i < length; i++) {
            int index = new Random().nextInt(len);
            builder.append(str.charAt(index));
        }
        return builder.toString();
    }

    /**
     * 判断是否在数组中
     *
     * @param s     验证字符串
     * @param array 字符串数组
     * @return 结果
     */
    public static boolean inArray(final String s, final String[] array) {
        for (String item : array) {
            if (item != null && item.equals(s)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断key是否在map中
     *
     * @param key 键值
     * @param map Map对象
     * @return 结果
     */
    public static boolean inArray(String key, Map<String, String> map) {
        return map.containsKey(key);
    }

    /**
     * 从HTML中提取纯文本
     *
     * @param strHtml 源HTML字符串
     * @return HTML中的纯文本
     */
    public static String stripHtml(String strHtml) {
        String content = strHtml.replaceAll("</?[^>]+>", "");
        content = content.replaceAll("\\s*|\t|\r|\n", "");
        return content;
    }

    /**
     * 去除字符串中的空格、回车、换行符、制表符等
     *
     * @param str 原始字符串
     * @return 结果
     */
    public static String replaceSpecialStr(String str) {
        String result = "";
        if (str != null) {
            Pattern pattern = Pattern.compile("\\s*|\t|\r|\n");
            Matcher matcher = pattern.matcher(str);
            result = matcher.replaceAll("");
        }
        return result;
    }

    /**
     * 将Object转换为Map
     *
     * @param object
     * @return
     * @throws IllegalAccessException
     */
    public static Map<String, Object> objectToMap(Object object) throws IllegalAccessException {
        Map<String, Object> map = new HashMap<>();
        Class<?> clazz = object.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object value = field.get(object);
            map.put(fieldName, value);
        }
        return map;
    }

    /**
     * 判断是否时JSON格式
     *
     * @param str JSON字符串
     * @return
     */
    public static boolean isJSON(String str) {
        try {
            JSONObject jsonStr = JSONObject.parseObject(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * MD5方法
     *
     * @param source
     * @return
     */
    public static String md5(byte[] source) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(source);
            StringBuilder builder = new StringBuilder();
            for (byte b : md.digest()) {
                builder.append(String.format("%02x%", b & 0xff));
            }
            return builder.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 密码加密
     *
     * @param password 原始密码
     * @return 加密密码
     */
    public static String password(String password) {
        String md5 = md5(password.getBytes());
        String pwd = md5((md5 + "IgtUdEQJyVevaCxQnY").getBytes());
        return pwd;
    }

    /**
     * 对数组进行分组
     *
     * @param list 数据源
     * @param size 每组几个
     * @param <T>
     * @return
     */
    public static <T> List<List<T>> split(List<T> list, Integer size) {
        if (CollectionUtils.isEmpty(list)) {
            return new ArrayList<>();
        }
        Integer count = list.size() / size;
        List<List<T>> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            List<T> temp = list.subList(i * size, (i + 1) * size);
            arrayList.add(temp);
        }
        Integer extra = list.size() % size;
        if (extra != 0) {
            List<T> temp = list.subList(count * size, count * size + extra);
            arrayList.add(temp);
        }
        return arrayList;
    }
}