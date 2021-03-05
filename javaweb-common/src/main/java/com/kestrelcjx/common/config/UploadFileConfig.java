package com.kestrelcjx.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 文件上传配置
 */
@Configuration
public class UploadFileConfig {
    /**
     * 上传目录
     */
    public static String uploadFolder;
    /**
     * 访问路径
     */
    public static String staticAccessPath;
    /**
     * 上传服务器的映射文件夹
     */
    public static String accessPath;

    @Value("${file.uploadFolder}")
    public void setUploadFolder(String path) {
        uploadFolder = path;
    }

    public String getUploadFolder() {
        return uploadFolder;
    }

    @Value("${file.staticAccessPath}")
    public void setStaticAccessPath(String path) {
        staticAccessPath = path;
    }

    public String getStaticAccessPath() {
        return staticAccessPath;
    }

    @Value("${file.accessPath}")
    public void setAccessPath(String path) {
        accessPath = path;
    }

    public String getAccessPath() {
        return accessPath;
    }
}
