package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 消息模块
 */
@TableName("sys_message_template")
public class MessageTemplate extends BaseEntity {
    /**
     * 模板CODE
     */
    private String code;
    /**
     * 模板标题
     */
    private String title;
    /**
     * 模板类型：1=系统模板，2=短信模板，3=邮件模板，4=微信，5=推送模板
     */
    private Integer type;
    /**
     * 模板内存
     */
    private String content;
    /**
     * 状态：1=在用，2=停用
     */
    private Integer status;

    public MessageTemplate() {
    }

    public String getCode() {
        return this.code;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getType() {
        return this.type;
    }

    public String getContent() {
        return this.content;
    }

    public Integer getStatus() {
        return this.status;
    }

    public MessageTemplate setCode(String code) {
        this.code = code;
        return this;
    }

    public MessageTemplate setTitle(String title) {
        this.title = title;
        return this;
    }

    public MessageTemplate setType(Integer type) {
        this.type = type;
        return this;
    }

    public MessageTemplate setContent(String content) {
        this.content = content;
        return this;
    }

    public MessageTemplate setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String toString() {
        return "MessageTemplate(" +
                "code=" + this.getCode() +
                ", title=" + this.getTitle() +
                ", type=" + this.getType() +
                ", content=" + this.getContent() +
                ", status=" + this.getStatus() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MessageTemplate)) return false;
        final MessageTemplate other = (MessageTemplate) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getCode() == null ? other.getCode() != null : !this.getCode().equals(other.getCode())) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getContent() == null ? other.getContent() != null : !this.getContent().equals(other.getContent()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MessageTemplate;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getCode() == null ? 43 : this.getCode().hashCode());
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getContent() == null ? 43 : this.getContent().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        return result;
    }
}
