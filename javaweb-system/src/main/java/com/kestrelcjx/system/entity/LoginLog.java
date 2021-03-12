package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.kestrelcjx.common.common.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 登录日志
 */
@TableName("sys_login_log")
public class LoginLog extends BaseEntity {
    /**
     * 日志标题
     */
    private String title;
    /**
     * 登录账号
     */
    private String loginName;
    /**
     * 登录时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date loginTime;
    /**
     * 登录IP地址
     */
    private String loginIp;
    /**
     * 登录地区
     */
    private String loginLocation;
    /**
     * 浏览器类型
     */
    private String browser;
    /**
     * 操作系统
     */
    private String os;
    /**
     * 登录状态：1=成功，2=失败
     */
    private Integer status;
    /**
     * 类型：1=登录系统，2=退出系统
     */
    private Integer type;
    /**
     * 提示消息
     */
    private String msg;

    public LoginLog() {
    }

    public String getTitle() {
        return this.title;
    }

    public String getLoginName() {
        return this.loginName;
    }

    public Date getLoginTime() {
        return this.loginTime;
    }

    public String getLoginIp() {
        return this.loginIp;
    }

    public String getLoginLocation() {
        return this.loginLocation;
    }

    public String getBrowser() {
        return this.browser;
    }

    public String getOs() {
        return this.os;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getType() {
        return this.type;
    }

    public String getMsg() {
        return this.msg;
    }

    public LoginLog setTitle(String title) {
        this.title = title;
        return this;
    }

    public LoginLog setLoginName(String loginName) {
        this.loginName = loginName;
        return this;
    }

    public LoginLog setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
        return this;
    }

    public LoginLog setLoginIp(String loginIp) {
        this.loginIp = loginIp;
        return this;
    }

    public LoginLog setLoginLocation(String loginLocation) {
        this.loginLocation = loginLocation;
        return this;
    }

    public LoginLog setBrowser(String browser) {
        this.browser = browser;
        return this;
    }

    public LoginLog setOs(String os) {
        this.os = os;
        return this;
    }

    public LoginLog setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public LoginLog setType(Integer type) {
        this.type = type;
        return this;
    }

    public LoginLog setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String toString() {
        return "LoginLog(" +
                "title=" + this.getTitle() +
                ", loginName=" + this.getLoginName() +
                ", loginTime=" + this.getLoginTime() +
                ", loginIp=" + this.getLoginIp() +
                ", loginLocation=" + this.getLoginLocation() +
                ", browser=" + this.getBrowser() +
                ", os=" + this.getOs() +
                ", status=" + this.getStatus() +
                ", type=" + this.getType() +
                ", msg=" + this.getMsg() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LoginLog)) return false;
        final LoginLog other = (LoginLog) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getLoginName() == null ? other.getLoginName() != null :
                !this.getLoginName().equals(other.getLoginName())) return false;
        if (this.getLoginTime() == null ? other.getLoginTime() != null :
                !this.getLoginTime().equals(other.getLoginTime())) return false;
        if (this.getLoginIp() == null ? other.getLoginIp() != null : !this.getLoginIp().equals(other.getLoginIp()))
            return false;
        if (this.getLoginLocation() == null ? other.getLoginLocation() != null :
                !this.getLoginLocation().equals(other.getLoginLocation()))
            return false;
        if (this.getBrowser() == null ? other.getBrowser() != null : !this.getBrowser().equals(other.getBrowser()))
            return false;
        if (this.getOs() == null ? other.getOs() != null : !this.getOs().equals(other.getOs())) return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getMsg() == null ? other.getMsg() != null : !this.getMsg().equals(other.getMsg())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LoginLog;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getLoginName() == null ? 43 : this.getLoginName().hashCode());
        result = result * PRIME + (this.getLoginTime() == null ? 43 : this.getLoginTime().hashCode());
        result = result * PRIME + (this.getLoginIp() == null ? 43 : this.getLoginIp().hashCode());
        result = result * PRIME + (this.getLoginLocation() == null ? 43 : this.getLoginLocation().hashCode());
        result = result * PRIME + (this.getBrowser() == null ? 43 : this.getBrowser().hashCode());
        result = result * PRIME + (this.getOs() == null ? 43 : this.getOs().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getMsg() == null ? 43 : this.getMsg().hashCode());
        return result;
    }
}
