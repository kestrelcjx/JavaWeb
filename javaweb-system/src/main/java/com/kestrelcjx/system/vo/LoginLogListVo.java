package com.kestrelcjx.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 登录日志列表Vo
 */
public class LoginLogListVo {
    /**
     * 登录日志ID
     */
    private Integer id;
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
     * 登录状态描述
     */
    private String statusName;
    /**
     * 类型：1=登录系统，2=退出系统
     */
    private Integer type;
    /**
     * 类型描述
     */
    private String typeName;
    /**
     * 提示消息
     */
    private String msg;
    /**
     * 添加人
     */
    private Integer createUser;
    /**
     * 添加人名称
     */
    private String createUserName;
    /**
     * 添加时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 更新人
     */
    private Integer updateUser;
    /**
     * 更新人名称
     */
    private String updateUserName;
    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    public LoginLogListVo() {
    }

    public Integer getId() {
        return this.id;
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

    public String getStatusName() {
        return this.statusName;
    }

    public Integer getType() {
        return this.type;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public String getMsg() {
        return this.msg;
    }

    public Integer getCreateUser() {
        return this.createUser;
    }

    public String getCreateUserName() {
        return this.createUserName;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Integer getUpdateUser() {
        return this.updateUser;
    }

    public String getUpdateUserName() {
        return this.updateUserName;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public void setLoginLocation(String loginLocation) {
        this.loginLocation = loginLocation;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LoginLogListVo)) return false;
        final LoginLogListVo other = (LoginLogListVo) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() == null ? other.getId() != null : !this.getId().equals(other.getId())) return false;
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
        if (this.getStatusName() == null ? other.getStatusName() != null :
                !this.getStatusName().equals(other.getStatusName()))
            return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getTypeName() == null ? other.getTypeName() != null :
                !this.getTypeName().equals(other.getTypeName())) return false;
        if (this.getMsg() == null ? other.getMsg() != null : !this.getMsg().equals(other.getMsg())) return false;
        if (this.getCreateUser() == null ? other.getCreateUser() != null :
                !this.getCreateUser().equals(other.getCreateUser()))
            return false;
        if (this.getCreateUserName() == null ? other.getCreateUserName() != null :
                !this.getCreateUserName().equals(other.getCreateUserName()))
            return false;
        if (this.getCreateTime() == null ? other.getCreateTime() != null :
                !this.getCreateTime().equals(other.getCreateTime()))
            return false;
        if (this.getUpdateUser() == null ? other.getUpdateUser() != null :
                !this.getUpdateUser().equals(other.getUpdateUser()))
            return false;
        if (this.getUpdateUserName() == null ? other.getUpdateUserName() != null :
                !this.getUpdateUserName().equals(other.getUpdateUserName()))
            return false;
        if (this.getUpdateTime() == null ? other.getUpdateTime() != null :
                !this.getUpdateTime().equals(other.getUpdateTime()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LoginLogListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getId() == null ? 43 : this.getId().hashCode());
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getLoginName() == null ? 43 : this.getLoginName().hashCode());
        result = result * PRIME + (this.getLoginTime() == null ? 43 : this.getLoginTime().hashCode());
        result = result * PRIME + (this.getLoginIp() == null ? 43 : this.getLoginIp().hashCode());
        result = result * PRIME + (this.getLoginLocation() == null ? 43 : this.getLoginLocation().hashCode());
        result = result * PRIME + (this.getBrowser() == null ? 43 : this.getBrowser().hashCode());
        result = result * PRIME + (this.getOs() == null ? 43 : this.getOs().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getStatusName() == null ? 43 : this.getStatusName().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getTypeName() == null ? 43 : this.getTypeName().hashCode());
        result = result * PRIME + (this.getMsg() == null ? 43 : this.getMsg().hashCode());
        result = result * PRIME + (this.getCreateUser() == null ? 43 : this.getCreateUser().hashCode());
        result = result * PRIME + (this.getCreateUserName() == null ? 43 : this.getCreateUserName().hashCode());
        result = result * PRIME + (this.getCreateTime() == null ? 43 : this.getCreateTime().hashCode());
        result = result * PRIME + (this.getUpdateUser() == null ? 43 : this.getUpdateUser().hashCode());
        result = result * PRIME + (this.getUpdateUserName() == null ? 43 : this.getUpdateUserName().hashCode());
        result = result * PRIME + (this.getUpdateTime() == null ? 43 : this.getUpdateTime().hashCode());
        return result;
    }

    public String toString() {
        return "LoginLogListVo(id=" + this.getId() + ", title=" + this.getTitle() + ", loginName=" + this.getLoginName() + ", loginTime=" + this.getLoginTime() + ", loginIp=" + this.getLoginIp() + ", loginLocation=" + this.getLoginLocation() + ", browser=" + this.getBrowser() + ", os=" + this.getOs() + ", status=" + this.getStatus() + ", statusName=" + this.getStatusName() + ", type=" + this.getType() + ", typeName=" + this.getTypeName() + ", msg=" + this.getMsg() + ", createUser=" + this.getCreateUser() + ", createUserName=" + this.getCreateUserName() + ", createTime=" + this.getCreateTime() + ", updateUser=" + this.getUpdateUser() + ", updateUserName=" + this.getUpdateUserName() + ", updateTime=" + this.getUpdateTime() + ")";
    }
}
