package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 系统消息查询条件
 */
public class MessageQuery extends BaseQuery {
    /**
     * 消息标题
     */
    private String title;
    /**
     * 发送方式：1=系统，2=短信，3=邮件，4=微信，5=推送
     */
    private Integer type;
    /**
     * 发送状态：1=已发送，2=未发送
     */
    private Integer sendStatus;

    public MessageQuery() {
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getSendStatus() {
        return this.sendStatus;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MessageQuery)) return false;
        final MessageQuery other = (MessageQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getSendStatus() == null ? other.getSendStatus() != null :
                !this.getSendStatus().equals(other.getSendStatus()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MessageQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getSendStatus() == null ? 43 : this.getSendStatus().hashCode());
        return result;
    }

    public String toString() {
        return "MessageQuery(" +
                "title=" + this.getTitle() +
                ", type=" + this.getType() +
                ", sendStatus=" + this.getSendStatus() +
                ")";
    }
}
