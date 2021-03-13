package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 短信日志查询条件
 */
public class SmsLogQuery extends BaseQuery {
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 发送类型：1=用户注册 2=修改密码 3=找回密码 4=换绑手机号验证 5=换绑手机号 6=钱包提现
     * 7=设置支付密码 8=系统通知
     */
    private Integer type;
    /**
     * 状态：1=成功，2=失败，3=待处理
     */
    private Integer status;

    public SmsLogQuery() {
    }

    public String getMobile() {
        return this.mobile;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SmsLogQuery)) return false;
        final SmsLogQuery other = (SmsLogQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getMobile() == null ? other.getMobile() != null : !this.getMobile().equals(other.getMobile()))
            return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SmsLogQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getMobile() == null ? 43 : this.getMobile().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        return result;
    }

    public String toString() {
        return "SmsLogQuery(" +
                "mobile=" + this.getMobile() +
                ", type=" + this.getType() +
                ", status=" + this.getStatus() +
                ")";
    }
}
