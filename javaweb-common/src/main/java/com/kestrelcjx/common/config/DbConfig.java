package com.kestrelcjx.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 数据库配置类
 */
@Configuration
public class DbConfig {
    /**
     * 数据库驱动
     */
    public static String driver;
    /**
     * 数据库连接
     */
    public static String url;
    /**
     * 数据库登录名
     */
    public static String username;
    /**
     * 数据库密码
     */
    public static String password;

    public static String getDriver() {
        return driver;
    }

    /**
     * 数据库驱动
     *
     * @param driver 驱动名
     */
    @Value("${spring.datasource.driver-class-name}")
    public static void setDriver(String driver) {
        DbConfig.driver = driver;
    }

    public static String getUrl() {
        return url;
    }

    /**
     * 数据库连接
     *
     * @param url 连接
     */
    @Value("${spring.datasource.url}")
    public static void setUrl(String url) {
        DbConfig.url = url;
    }

    public static String getUsername() {
        return username;
    }

    /**
     * 数据库登录名
     *
     * @param username 登录名
     */
    @Value("${spring.datasource.username}")
    public static void setUsername(String username) {
        DbConfig.username = username;
    }

    public static String getPassword() {
        return password;
    }

    /**
     * 数据库登录密码
     *
     * @param password 登录密码
     */
    @Value("${spring.datasource.password}")
    public static void setPassword(String password) {
        DbConfig.password = password;
    }
}
