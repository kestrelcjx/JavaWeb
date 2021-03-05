package com.kestrelcjx.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 阿里短信配置类
 */
@Configuration
@ConfigurationProperties(prefix = "spring.alisms")
public class AliSmsConfig {
    /**
     * KEY
     */
    private String accessKeyId;
    /**
     * 密钥
     */
    private String accessKeySecret;
    /**
     * 区域ID
     */
    private String regionId;
    /**
     * 短信签名
     */
    private String signName;
    /**
     * 短信模板ID
     */
    private String templateCode;

    public String getAccessKeyId() {
        return accessKeyId;
    }

    public void setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
    }

    public String getAccessKeySecret() {
        return accessKeySecret;
    }

    public void setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getSignName() {
        return signName;
    }

    public void setSignName(String signName) {
        this.signName = signName;
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }
}
