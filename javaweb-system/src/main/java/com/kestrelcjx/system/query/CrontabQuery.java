package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 定时任务查询条件
 */
public class CrontabQuery extends BaseQuery {
    /**
     * 任务标题
     */
    private String title;
    /**
     * 状态：1=正常，2=暂停
     */
    private Integer status;

    public CrontabQuery() {
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CrontabQuery)) return false;
        final CrontabQuery other = (CrontabQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CrontabQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        return result;
    }

    public String toString() {
        return "CrontabQuery(" +
                "title=" + this.getTitle() +
                ", status=" + this.getStatus() +
                ")";
    }
}
