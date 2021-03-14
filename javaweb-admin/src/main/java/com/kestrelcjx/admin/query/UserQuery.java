package com.kestrelcjx.admin.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 会员用户查询条件
 */
public class UserQuery extends BaseQuery {
    /**
     * 性别：1男 2女 3未知
     */
    private Integer gender;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 设备类型：1苹果 2安卓 3WAP站 4PC站 5微信小程序 6后台添加
     */
    private Integer device;
    /**
     * 用户状态：1登录 2登出
     */
    private Integer loginStatus;
    /**
     * 用户来源：1注册会员 2马甲会员
     */
    private Integer source;
    /**
     * 是否启用：1启用  2停用
     */
    private Integer status;

    public UserQuery() {
    }

    public Integer getGender() {
        return this.gender;
    }

    public String getMobile() {
        return this.mobile;
    }

    public Integer getDevice() {
        return this.device;
    }

    public Integer getLoginStatus() {
        return this.loginStatus;
    }

    public Integer getSource() {
        return this.source;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setDevice(Integer device) {
        this.device = device;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UserQuery)) return false;
        final UserQuery other = (UserQuery) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$gender = this.getGender();
        final Object other$gender = other.getGender();
        if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender)) return false;
        final Object this$mobile = this.getMobile();
        final Object other$mobile = other.getMobile();
        if (this$mobile == null ? other$mobile != null : !this$mobile.equals(other$mobile)) return false;
        final Object this$device = this.getDevice();
        final Object other$device = other.getDevice();
        if (this$device == null ? other$device != null : !this$device.equals(other$device)) return false;
        final Object this$loginStatus = this.getLoginStatus();
        final Object other$loginStatus = other.getLoginStatus();
        if (this$loginStatus == null ? other$loginStatus != null : !this$loginStatus.equals(other$loginStatus))
            return false;
        final Object this$source = this.getSource();
        final Object other$source = other.getSource();
        if (this$source == null ? other$source != null : !this$source.equals(other$source)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $gender = this.getGender();
        result = result * PRIME + ($gender == null ? 43 : $gender.hashCode());
        final Object $mobile = this.getMobile();
        result = result * PRIME + ($mobile == null ? 43 : $mobile.hashCode());
        final Object $device = this.getDevice();
        result = result * PRIME + ($device == null ? 43 : $device.hashCode());
        final Object $loginStatus = this.getLoginStatus();
        result = result * PRIME + ($loginStatus == null ? 43 : $loginStatus.hashCode());
        final Object $source = this.getSource();
        result = result * PRIME + ($source == null ? 43 : $source.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "UserQuery(gender=" + this.getGender() + ", mobile=" + this.getMobile() + ", device=" + this.getDevice() + ", loginStatus=" + this.getLoginStatus() + ", source=" + this.getSource() + ", status=" + this.getStatus() + ")";
    }
}
