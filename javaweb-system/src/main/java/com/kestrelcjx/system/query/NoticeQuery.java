package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 通知公告查询条件
 */
public class NoticeQuery extends BaseQuery {
    /**
     * 通知标题
     */
    private String title;
    /**
     * 通知来源：1=云平台
     */
    private Integer source;
    /**
     * 是否置顶：1=已置顶，2=未置顶
     */
    private Integer isTop;
    /**
     * 发布状态：1=草稿箱，2=立即发布，3=定时发布
     */
    private Integer status;
    /**
     * 推送状态：1=已推送，2=未推送
     */
    private Integer isSend;

    public NoticeQuery() {
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getSource() {
        return this.source;
    }

    public Integer getIsTop() {
        return this.isTop;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getIsSend() {
        return this.isSend;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setIsSend(Integer isSend) {
        this.isSend = isSend;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof NoticeQuery)) return false;
        final NoticeQuery other = (NoticeQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getSource() == null ? other.getSource() != null : !this.getSource().equals(other.getSource()))
            return false;
        if (this.getIsTop() == null ? other.getIsTop() != null : !this.getIsTop().equals(other.getIsTop()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getIsSend() == null ? other.getIsSend() != null : !this.getIsSend().equals(other.getIsSend()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof NoticeQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getSource() == null ? 43 : this.getSource().hashCode());
        result = result * PRIME + (this.getIsTop() == null ? 43 : this.getIsTop().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getIsSend() == null ? 43 : this.getIsSend().hashCode());
        return result;
    }

    public String toString() {
        return "NoticeQuery(" +
                "title=" + this.getTitle() +
                ", source=" + this.getSource() +
                ", isTop=" + this.getIsTop() +
                ", status=" + this.getStatus() +
                ", isSend=" + this.getIsSend() +
                ")";
    }
}
