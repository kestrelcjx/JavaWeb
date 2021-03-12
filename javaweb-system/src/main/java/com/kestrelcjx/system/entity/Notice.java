package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.kestrelcjx.common.common.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 通知公告
 */
@TableName("sys_notice")
public class Notice extends BaseEntity {
    /**
     * 通知标题
     */
    private String title;
    /**
     * 通知内容
     */
    private String content;
    /**
     * 通知来源：1=云平台
     */
    private Integer source;
    /**
     * 是否置顶：1=已置顶，2=未置顶
     */
    private Integer isTop;
    /**
     * 阅读量
     */
    private Integer viewNum;
    /**
     * 发布状态：1=草稿箱，2=立即发布，3=定时发布
     */
    private Integer status;
    /**
     * 发布时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date publishTime;
    /**
     * 推送状态：1=已推送，2=未推送
     */
    private Integer isSend;
    /**
     * 推送时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date sendTime;

    public Notice() {
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public Integer getSource() {
        return this.source;
    }

    public Integer getIsTop() {
        return this.isTop;
    }

    public Integer getViewNum() {
        return this.viewNum;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Date getPublishTime() {
        return this.publishTime;
    }

    public Integer getIsSend() {
        return this.isSend;
    }

    public Date getSendTime() {
        return this.sendTime;
    }

    public Notice setTitle(String title) {
        this.title = title;
        return this;
    }

    public Notice setContent(String content) {
        this.content = content;
        return this;
    }

    public Notice setSource(Integer source) {
        this.source = source;
        return this;
    }

    public Notice setIsTop(Integer isTop) {
        this.isTop = isTop;
        return this;
    }

    public Notice setViewNum(Integer viewNum) {
        this.viewNum = viewNum;
        return this;
    }

    public Notice setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Notice setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    public Notice setIsSend(Integer isSend) {
        this.isSend = isSend;
        return this;
    }

    public Notice setSendTime(Date sendTime) {
        this.sendTime = sendTime;
        return this;
    }

    public String toString() {
        return "Notice(" +
                "title=" + this.getTitle() +
                ", content=" + this.getContent() +
                ", source=" + this.getSource() +
                ", isTop=" + this.getIsTop() +
                ", viewNum=" + this.getViewNum() +
                ", status=" + this.getStatus() +
                ", publishTime=" + this.getPublishTime() +
                ", isSend=" + this.getIsSend() +
                ", sendTime=" + this.getSendTime() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Notice)) return false;
        final Notice other = (Notice) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getContent() == null ? other.getContent() != null : !this.getContent().equals(other.getContent()))
            return false;
        if (this.getSource() == null ? other.getSource() != null : !this.getSource().equals(other.getSource()))
            return false;
        if (this.getIsTop() == null ? other.getIsTop() != null : !this.getIsTop().equals(other.getIsTop()))
            return false;
        if (this.getViewNum() == null ? other.getViewNum() != null : !this.getViewNum().equals(other.getViewNum()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getPublishTime() == null ? other.getPublishTime() != null :
                !this.getPublishTime().equals(other.getPublishTime()))
            return false;
        if (this.getIsSend() == null ? other.getIsSend() != null : !this.getIsSend().equals(other.getIsSend()))
            return false;
        if (this.getSendTime() == null ? other.getSendTime() != null :
                !this.getSendTime().equals(other.getSendTime())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Notice;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getContent() == null ? 43 : this.getContent().hashCode());
        result = result * PRIME + (this.getSource() == null ? 43 : this.getSource().hashCode());
        result = result * PRIME + (this.getIsTop() == null ? 43 : this.getIsTop().hashCode());
        result = result * PRIME + (this.getViewNum() == null ? 43 : this.getViewNum().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getPublishTime() == null ? 43 : this.getPublishTime().hashCode());
        result = result * PRIME + (this.getIsSend() == null ? 43 : this.getIsSend().hashCode());
        result = result * PRIME + (this.getSendTime() == null ? 43 : this.getSendTime().hashCode());
        return result;
    }
}
