package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 广告查询条件
 */
public class AdQuery extends BaseQuery {
    /**
     * 广告标题
     */
    private String title;
    /**
     * 广告格式：1=图片，2=文字，3=视频，4=推荐
     */
    private Integer type;
    /**
     * 状态：1=在用，2=停用
     */
    private Integer status;

    public AdQuery() {
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AdQuery)) return false;
        final AdQuery other = (AdQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AdQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        return result;
    }

    public String toString() {
        return "AdQuery(" +
                "title=" + this.getTitle() +
                ", type=" + this.getType() +
                ", status=" + this.getStatus() +
                ")";
    }
}
