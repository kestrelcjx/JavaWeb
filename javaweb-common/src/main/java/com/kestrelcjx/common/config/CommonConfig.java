package com.kestrelcjx.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonConfig {
    /**
     * 图片域名
     */
    public static String imageURL;
    /**
     * 是否演示环境
     */
    public static boolean appDebug;

    @Value("${server.IMAGE_URL}")
    public void setImageURL(String url) {
        imageURL = url;
    }

    public String getImageURL() {
        return imageURL;
    }

    @Value("${spring.app_debug}")
    public void setAppDebug(boolean debug) {
        appDebug = debug;
    }

    public boolean isAppDebug() {
        return appDebug;
    }
}
