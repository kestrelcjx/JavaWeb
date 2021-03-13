package com.kestrelcjx.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 系统消息列表Vo
 */
public class MessageListVo {
    /**
     * 系统消息ID
     */
    private Integer id;
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
     * 发送方式：1=系统，2=短信，3=邮件，4=微信，5推送
     */
    private Integer type;
    /**
     * 发送方式描述
     */
    private String typeName;
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
     * 发送状态描述
     */
    private String sendStatusName;
    /**
     * 发送次数
     */
    private Integer sendNum;
    /**
     * 发送备注
     */
    private String note;
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

    public MessageListVo() {
    }

    public Integer getId() {
        return this.id;
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

    public String getTypeName() {
        return this.typeName;
    }

    public Date getSendTime() {
        return this.sendTime;
    }

    public Integer getSendStatus() {
        return this.sendStatus;
    }

    public String getSendStatusName() {
        return this.sendStatusName;
    }

    public Integer getSendNum() {
        return this.sendNum;
    }

    public String getNote() {
        return this.note;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public void setSendStatusName(String sendStatusName) {
        this.sendStatusName = sendStatusName;
    }

    public void setSendNum(Integer sendNum) {
        this.sendNum = sendNum;
    }

    public void setNote(String note) {
        this.note = note;
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
        if (!(o instanceof MessageListVo)) return false;
        final MessageListVo other = (MessageListVo) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() == null ? other.getId() != null : !this.getId().equals(other.getId())) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getContent() == null ? other.getContent() != null : !this.getContent().equals(other.getContent()))
            return false;
        if (this.getReceiver() == null ? other.getReceiver() != null :
                !this.getReceiver().equals(other.getReceiver())) return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getTypeName() == null ? other.getTypeName() != null :
                !this.getTypeName().equals(other.getTypeName())) return false;
        if (this.getSendTime() == null ? other.getSendTime() != null :
                !this.getSendTime().equals(other.getSendTime())) return false;
        if (this.getSendStatus() == null ? other.getSendStatus() != null :
                !this.getSendStatus().equals(other.getSendStatus()))
            return false;
        if (this.getSendStatusName() == null ? other.getSendStatusName() != null :
                !this.getSendStatusName().equals(other.getSendStatusName()))
            return false;
        if (this.getSendNum() == null ? other.getSendNum() != null : !this.getSendNum().equals(other.getSendNum()))
            return false;
        if (this.getNote() == null ? other.getNote() != null : !this.getNote().equals(other.getNote())) return false;
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
        return other instanceof MessageListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getId() == null ? 43 : this.getId().hashCode());
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getContent() == null ? 43 : this.getContent().hashCode());
        result = result * PRIME + (this.getReceiver() == null ? 43 : this.getReceiver().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getTypeName() == null ? 43 : this.getTypeName().hashCode());
        result = result * PRIME + (this.getSendTime() == null ? 43 : this.getSendTime().hashCode());
        result = result * PRIME + (this.getSendStatus() == null ? 43 : this.getSendStatus().hashCode());
        result = result * PRIME + (this.getSendStatusName() == null ? 43 : this.getSendStatusName().hashCode());
        result = result * PRIME + (this.getSendNum() == null ? 43 : this.getSendNum().hashCode());
        result = result * PRIME + (this.getNote() == null ? 43 : this.getNote().hashCode());
        result = result * PRIME + (this.getCreateUser() == null ? 43 : this.getCreateUser().hashCode());
        result = result * PRIME + (this.getCreateUserName() == null ? 43 : this.getCreateUserName().hashCode());
        result = result * PRIME + (this.getCreateTime() == null ? 43 : this.getCreateTime().hashCode());
        result = result * PRIME + (this.getUpdateUser() == null ? 43 : this.getUpdateUser().hashCode());
        result = result * PRIME + (this.getUpdateUserName() == null ? 43 : this.getUpdateUserName().hashCode());
        result = result * PRIME + (this.getUpdateTime() == null ? 43 : this.getUpdateTime().hashCode());
        return result;
    }

    public String toString() {
        return "MessageListVo(" +
                "id=" + this.getId() +
                ", title=" + this.getTitle() +
                ", content=" + this.getContent() +
                ", receiver=" + this.getReceiver() +
                ", type=" + this.getType() +
                ", typeName=" + this.getTypeName() +
                ", sendTime=" + this.getSendTime() +
                ", sendStatus=" + this.getSendStatus() +
                ", sendStatusName=" + this.getSendStatusName() +
                ", sendNum=" + this.getSendNum() +
                ", note=" + this.getNote() +
                ", createUser=" + this.getCreateUser() +
                ", createUserName=" + this.getCreateUserName() +
                ", createTime=" + this.getCreateTime() +
                ", updateUser=" + this.getUpdateUser() +
                ", updateUserName=" + this.getUpdateUserName() +
                ", updateTime=" + this.getUpdateTime() +
                ")";
    }
}
