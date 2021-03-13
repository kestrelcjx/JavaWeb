package com.kestrelcjx.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 通知公告列表Vo
 */
public class NoticeListVo {
    /**
     * 通知公告ID
     */
    private Integer id;
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
     * 通知来源描述
     */
    private String sourceName;
    /**
     * 是否置顶：1=已置顶，2=未置顶
     */
    private Integer isTop;
    /**
     * 是否置顶描述
     */
    private String isTopName;
    /**
     * 阅读量
     */
    private Integer viewNum;
    /**
     * 发布状态：1=草稿箱，2=立即发布，3=定时发布
     */
    private Integer status;
    /**
     * 发布状态描述
     */
    private String statusName;
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
     * 推送状态描述
     */
    private String isSendName;
    /**
     * 推送时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date sendTime;
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

    public NoticeListVo() {
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

    public Integer getSource() {
        return this.source;
    }

    public String getSourceName() {
        return this.sourceName;
    }

    public Integer getIsTop() {
        return this.isTop;
    }

    public String getIsTopName() {
        return this.isTopName;
    }

    public Integer getViewNum() {
        return this.viewNum;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getStatusName() {
        return this.statusName;
    }

    public Date getPublishTime() {
        return this.publishTime;
    }

    public Integer getIsSend() {
        return this.isSend;
    }

    public String getIsSendName() {
        return this.isSendName;
    }

    public Date getSendTime() {
        return this.sendTime;
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

    public void setSource(Integer source) {
        this.source = source;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public void setIsTopName(String isTopName) {
        this.isTopName = isTopName;
    }

    public void setViewNum(Integer viewNum) {
        this.viewNum = viewNum;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public void setIsSend(Integer isSend) {
        this.isSend = isSend;
    }

    public void setIsSendName(String isSendName) {
        this.isSendName = isSendName;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
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
        if (!(o instanceof NoticeListVo)) return false;
        final NoticeListVo other = (NoticeListVo) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() == null ? other.getId() != null : !this.getId().equals(other.getId())) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getContent() == null ? other.getContent() != null : !this.getContent().equals(other.getContent()))
            return false;
        if (this.getSource() == null ? other.getSource() != null : !this.getSource().equals(other.getSource()))
            return false;
        if (this.getSourceName() == null ? other.getSourceName() != null :
                !this.getSourceName().equals(other.getSourceName()))
            return false;
        if (this.getIsTop() == null ? other.getIsTop() != null : !this.getIsTop().equals(other.getIsTop()))
            return false;
        if (this.getIsTopName() == null ? other.getIsTopName() != null :
                !this.getIsTopName().equals(other.getIsTopName())) return false;
        if (this.getViewNum() == null ? other.getViewNum() != null : !this.getViewNum().equals(other.getViewNum()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getStatusName() == null ? other.getStatusName() != null :
                !this.getStatusName().equals(other.getStatusName()))
            return false;
        if (this.getPublishTime() == null ? other.getPublishTime() != null :
                !this.getPublishTime().equals(other.getPublishTime()))
            return false;
        if (this.getIsSend() == null ? other.getIsSend() != null : !this.getIsSend().equals(other.getIsSend()))
            return false;
        if (this.getIsSendName() == null ? other.getIsSendName() != null :
                !this.getIsSendName().equals(other.getIsSendName()))
            return false;
        if (this.getSendTime() == null ? other.getSendTime() != null :
                !this.getSendTime().equals(other.getSendTime())) return false;
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
        return other instanceof NoticeListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getId() == null ? 43 : this.getId().hashCode());
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getContent() == null ? 43 : this.getContent().hashCode());
        result = result * PRIME + (this.getSource() == null ? 43 : this.getSource().hashCode());
        result = result * PRIME + (this.getSourceName() == null ? 43 : this.getSourceName().hashCode());
        result = result * PRIME + (this.getIsTop() == null ? 43 : this.getIsTop().hashCode());
        result = result * PRIME + (this.getIsTopName() == null ? 43 : this.getIsTopName().hashCode());
        result = result * PRIME + (this.getViewNum() == null ? 43 : this.getViewNum().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getStatusName() == null ? 43 : this.getStatusName().hashCode());
        result = result * PRIME + (this.getPublishTime() == null ? 43 : this.getPublishTime().hashCode());
        result = result * PRIME + (this.getIsSend() == null ? 43 : this.getIsSend().hashCode());
        result = result * PRIME + (this.getIsSendName() == null ? 43 : this.getIsSendName().hashCode());
        result = result * PRIME + (this.getSendTime() == null ? 43 : this.getSendTime().hashCode());
        result = result * PRIME + (this.getCreateUser() == null ? 43 : this.getCreateUser().hashCode());
        result = result * PRIME + (this.getCreateUserName() == null ? 43 : this.getCreateUserName().hashCode());
        result = result * PRIME + (this.getCreateTime() == null ? 43 : this.getCreateTime().hashCode());
        result = result * PRIME + (this.getUpdateUser() == null ? 43 : this.getUpdateUser().hashCode());
        result = result * PRIME + (this.getUpdateUserName() == null ? 43 : this.getUpdateUserName().hashCode());
        result = result * PRIME + (this.getUpdateTime() == null ? 43 : this.getUpdateTime().hashCode());
        return result;
    }

    public String toString() {
        return "NoticeListVo(" +
                "id=" + this.getId() +
                ", title=" + this.getTitle() +
                ", content=" + this.getContent() +
                ", source=" + this.getSource() +
                ", sourceName=" + this.getSourceName() +
                ", isTop=" + this.getIsTop() +
                ", isTopName=" + this.getIsTopName() +
                ", viewNum=" + this.getViewNum() +
                ", status=" + this.getStatus() +
                ", statusName=" + this.getStatusName() +
                ", publishTime=" + this.getPublishTime() +
                ", isSend=" + this.getIsSend() +
                ", isSendName=" + this.getIsSendName() +
                ", sendTime=" + this.getSendTime() +
                ", createUser=" + this.getCreateUser() +
                ", createUserName=" + this.getCreateUserName() +
                ", createTime=" + this.getCreateTime() +
                ", updateUser=" + this.getUpdateUser() +
                ", updateUserName=" + this.getUpdateUserName() +
                ", updateTime=" + this.getUpdateTime() +
                ")";
    }
}
