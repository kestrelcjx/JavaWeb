package com.kestrelcjx.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 系统参数配置类
 */
@Configuration
public class SystemConfig {
    /**
     * 系统名称
     */
    public static String fullName;
    /**
     * 系统简称
     */
    public static String nickName;
    /**
     * 系统版本号
     */
    public static String version;

    public static String getFullName() {
        return fullName;
    }

    /**
     * 系统名称
     *
     * @param fullName 名称
     */
    @Value("${system.fullName}")
    public static void setFullName(String fullName) {
        SystemConfig.fullName = fullName;
    }

    public static String getNickName() {
        return nickName;
    }

    /**
     * 系统简称
     *
     * @param nickName 简称
     */
    @Value("${system.nickName}")
    public static void setNickName(String nickName) {
        SystemConfig.nickName = nickName;
    }

    public static String getVersion() {
        return version;
    }

    /**
     * 系统版本号
     *
     * @param version 版本号
     */
    @Value("${system.version}")
    public static void setVersion(String version) {
        SystemConfig.version = version;
    }
}
