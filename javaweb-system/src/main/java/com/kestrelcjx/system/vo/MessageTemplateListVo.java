package com.kestrelcjx.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 消息模板列表Vo
 */
public class MessageTemplateListVo {
    /**
     * 消息模板ID
     */
    private Integer id;
    /**
     * 模板CODE
     */
    private String code;
    /**
     * 模板标题
     */
    private String title;
    /**
     * 模板类型：1=系统模板，2=短信模板，3=邮件模板，4=微信模板，5=推送模板
     */
    private Integer type;
    /**
     * 模板类型描述
     */
    private String typeName;
    /**
     * 模板内容
     */
    private String content;
    /**
     * 状态：1=在用，2=停用
     */
    private Integer status;
    /**
     * 状态描述
     */
    private String statusName;
    /**
     * 添加人
     */
    private Integer createUser;
    /**
     * 添加人名称
     */
    private String createUserName;
    /**
     * 添加时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 更新人
     */
    private Integer updateUser;
    /**
     * 更新人名称
     */
    private String updateUserName;
    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    public MessageTemplateListVo() {
    }

    public Integer getId() {
        return this.id;
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

    public String getTypeName() {
        return this.typeName;
    }

    public String getContent() {
        return this.content;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getStatusName() {
        return this.statusName;
    }

    public Integer getCreateUser() {
        return this.createUser;
    }

    public String getCreateUserName() {
        return this.createUserName;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Integer getUpdateUser() {
        return this.updateUser;
    }

    public String getUpdateUserName() {
        return this.updateUserName;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MessageTemplateListVo)) return false;
        final MessageTemplateListVo other = (MessageTemplateListVo) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() == null ? other.getId() != null : !this.getId().equals(other.getId())) return false;
        if (this.getCode() == null ? other.getCode() != null : !this.getCode().equals(other.getCode())) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getTypeName() == null ? other.getTypeName() != null :
                !this.getTypeName().equals(other.getTypeName())) return false;
        if (this.getContent() == null ? other.getContent() != null : !this.getContent().equals(other.getContent()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getStatusName() == null ? other.getStatusName() != null :
                !this.getStatusName().equals(other.getStatusName()))
            return false;
        if (this.getCreateUser() == null ? other.getCreateUser() != null :
                !this.getCreateUser().equals(other.getCreateUser()))
            return false;
        if (this.getCreateUserName() == null ? other.getCreateUserName() != null :
                !this.getCreateUserName().equals(other.getCreateUserName()))
            return false;
        if (this.getCreateTime() == null ? other.getCreateTime() != null :
                !this.getCreateTime().equals(other.getCreateTime()))
            return false;
        if (this.getUpdateUser() == null ? other.getUpdateUser() != null :
                !this.getUpdateUser().equals(other.getUpdateUser()))
            return false;
        if (this.getUpdateUserName() == null ? other.getUpdateUserName() != null :
                !this.getUpdateUserName().equals(other.getUpdateUserName()))
            return false;
        if (this.getUpdateTime() == null ? other.getUpdateTime() != null :
                !this.getUpdateTime().equals(other.getUpdateTime()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MessageTemplateListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getId() == null ? 43 : this.getId().hashCode());
        result = result * PRIME + (this.getCode() == null ? 43 : this.getCode().hashCode());
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getTypeName() == null ? 43 : this.getTypeName().hashCode());
        result = result * PRIME + (this.getContent() == null ? 43 : this.getContent().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getStatusName() == null ? 43 : this.getStatusName().hashCode());
        result = result * PRIME + (this.getCreateUser() == null ? 43 : this.getCreateUser().hashCode());
        result = result * PRIME + (this.getCreateUserName() == null ? 43 : this.getCreateUserName().hashCode());
        result = result * PRIME + (this.getCreateTime() == null ? 43 : this.getCreateTime().hashCode());
        result = result * PRIME + (this.getUpdateUser() == null ? 43 : this.getUpdateUser().hashCode());
        result = result * PRIME + (this.getUpdateUserName() == null ? 43 : this.getUpdateUserName().hashCode());
        result = result * PRIME + (this.getUpdateTime() == null ? 43 : this.getUpdateTime().hashCode());
        return result;
    }

    public String toString() {
        return "MessageTemplateListVo(" +
                "id=" + this.getId() +
                ", code=" + this.getCode() +
                ", title=" + this.getTitle() +
                ", type=" + this.getType() +
                ", typeName=" + this.getTypeName() +
                ", content=" + this.getContent() +
                ", status=" + this.getStatus() +
                ", statusName=" + this.getStatusName() +
                ", createUser=" + this.getCreateUser() +
                ", createUserName=" + this.getCreateUserName() +
                ", createTime=" + this.getCreateTime() +
                ", updateUser=" + this.getUpdateUser() +
                ", updateUserName=" + this.getUpdateUserName() +
                ", updateTime=" + this.getUpdateTime() +
                ")";
    }
}
