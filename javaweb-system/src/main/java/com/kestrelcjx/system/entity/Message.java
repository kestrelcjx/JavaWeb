package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.kestrelcjx.common.common.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 系统消息
 */
@TableName("sys_message")
public class Message extends BaseEntity {
    /**
     * 消息标题
     */
    private String title;
    /**
     * 消息内容
     */
    private String content;
    /**
     * 接收人
     */
    private String receiver;
    /**
     * 发送方式：1=系统，2=短信，3=邮件，4=微信，5=推送
     */
    private Integer type;
    /**
     * 发送时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date sendTime;
    /**
     * 发送状态：1=已发送，2=未发送
     */
    private Integer sendStatus;
    /**
     * 发送次数
     */
    private Integer sendNum;
    /**
     * 发送备注
     */
    private String note;

    public Message() {
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public Integer getType() {
        return this.type;
    }

    public Date getSendTime() {
        return this.sendTime;
    }

    public Integer getSendStatus() {
        return this.sendStatus;
    }

    public Integer getSendNum() {
        return this.sendNum;
    }

    public String getNote() {
        return this.note;
    }

    public Message setTitle(String title) {
        this.title = title;
        return this;
    }

    public Message setContent(String content) {
        this.content = content;
        return this;
    }

    public Message setReceiver(String receiver) {
        this.receiver = receiver;
        return this;
    }

    public Message setType(Integer type) {
        this.type = type;
        return this;
    }

    public Message setSendTime(Date sendTime) {
        this.sendTime = sendTime;
        return this;
    }

    public Message setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
        return this;
    }

    public Message setSendNum(Integer sendNum) {
        this.sendNum = sendNum;
        return this;
    }

    public Message setNote(String note) {
        this.note = note;
        return this;
    }

    public String toString() {
        return "Message(" +
                "title=" + this.getTitle() +
                ", content=" + this.getContent() +
                ", receiver=" + this.getReceiver() +
                ", type=" + this.getType() +
                ", sendTime=" + this.getSendTime() +
                ", sendStatus=" + this.getSendStatus() +
                ", sendNum=" + this.getSendNum() +
                ", note=" + this.getNote() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Message)) return false;
        final Message other = (Message) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getContent() == null ? other.getContent() != null : !this.getContent().equals(other.getContent()))
            return false;
        if (this.getReceiver() == null ? other.getReceiver() != null :
                !this.getReceiver().equals(other.getReceiver())) return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getSendTime() == null ? other.getSendTime() != null :
                !this.getSendTime().equals(other.getSendTime())) return false;
        if (this.getSendStatus() == null ? other.getSendStatus() != null :
                !this.getSendStatus().equals(other.getSendStatus()))
            return false;
        if (this.getSendNum() == null ? other.getSendNum() != null : !this.getSendNum().equals(other.getSendNum()))
            return false;
        if (this.getNote() == null ? other.getNote() != null : !this.getNote().equals(other.getNote())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Message;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getContent() == null ? 43 : this.getContent().hashCode());
        result = result * PRIME + (this.getReceiver() == null ? 43 : this.getReceiver().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getSendTime() == null ? 43 : this.getSendTime().hashCode());
        result = result * PRIME + (this.getSendStatus() == null ? 43 : this.getSendStatus().hashCode());
        result = result * PRIME + (this.getSendNum() == null ? 43 : this.getSendNum().hashCode());
        result = result * PRIME + (this.getNote() == null ? 43 : this.getNote().hashCode());
        return result;
    }
}
