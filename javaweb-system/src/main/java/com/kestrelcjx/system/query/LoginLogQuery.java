package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 登录日志查询条件
 */
public class LoginLogQuery extends BaseQuery {
    /**
     * 日志标题
     */
    private String title;
    /**
     * 登录状态：1=成功，2=失败
     */
    private Integer status;
    /**
     * 类型：1=登录系统，2=退出系统
     */
    private Integer type;

    public LoginLogQuery() {
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getType() {
        return this.type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LoginLogQuery)) return false;
        final LoginLogQuery other = (LoginLogQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LoginLogQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        return result;
    }

    public String toString() {
        return "LoginLogQuery(" +
                "title=" + this.getTitle() +
                ", status=" + this.getStatus() +
                ", type=" + this.getType() +
                ")";
    }
}
