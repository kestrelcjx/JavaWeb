package com.kestrelcjx.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 广告列表Vo
 */
public class AdListVo {
    /**
     * 广告ID
     */
    private Integer id;
    /**
     * 广告标题
     */
    private String title;
    /**
     * 广告位ID
     */
    private Integer sortId;
    /**
     * 广告位名称
     */
    private String sortName;
    /**
     * 广告图片
     */
    private String cover;
    /**
     * 广告图片URL
     */
    private String coverUrl;
    /**
     * 广告格式：1=图片，2=文字，3=视频，4推荐
     */
    private Integer type;
    /**
     * 广告格式
     */
    private String typeName;
    /**
     * 广告描述
     */
    private String description;
    /**
     * 广告内容
     */
    private String content;
    /**
     * 广告链接
     */
    private String url;
    /**
     * 广告宽度
     */
    private Integer width;
    /**
     * 广告高度
     */
    private Integer height;
    /**
     * 开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startTime;
    /**
     * 结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date endTime;
    /**
     * 广告点击次数
     */
    private Integer viewNum;
    /**
     * 状态：1=在用，2=停用
     */
    private Integer status;
    /**
     * 状态描述
     */
    private String statusName;
    /**
     * 排序
     */
    private Integer sort;
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

    public AdListVo() {
    }

    public Integer getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getSortId() {
        return this.sortId;
    }

    public String getSortName() {
        return this.sortName;
    }

    public String getCover() {
        return this.cover;
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }

    public Integer getType() {
        return this.type;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public String getDescription() {
        return this.description;
    }

    public String getContent() {
        return this.content;
    }

    public String getUrl() {
        return this.url;
    }

    public Integer getWidth() {
        return this.width;
    }

    public Integer getHeight() {
        return this.height;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
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

    public Integer getSort() {
        return this.sort;
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

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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

    public void setSort(Integer sort) {
        this.sort = sort;
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
        if (!(o instanceof AdListVo)) return false;
        final AdListVo other = (AdListVo) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() == null ? other.getId() != null : !this.getId().equals(other.getId())) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getSortId() == null ? other.getSortId() != null : !this.getSortId().equals(other.getSortId()))
            return false;
        if (this.getSortName() == null ? other.getSortName() != null :
                !this.getSortName().equals(other.getSortName())) return false;
        if (this.getCover() == null ? other.getCover() != null : !this.getCover().equals(other.getCover()))
            return false;
        if (this.getCoverUrl() == null ? other.getCoverUrl() != null :
                !this.getCoverUrl().equals(other.getCoverUrl())) return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getTypeName() == null ? other.getTypeName() != null :
                !this.getTypeName().equals(other.getTypeName())) return false;
        if (this.getDescription() == null ? other.getDescription() != null :
                !this.getDescription().equals(other.getDescription()))
            return false;
        if (this.getContent() == null ? other.getContent() != null : !this.getContent().equals(other.getContent()))
            return false;
        if (this.getUrl() == null ? other.getUrl() != null : !this.getUrl().equals(other.getUrl())) return false;
        if (this.getWidth() == null ? other.getWidth() != null : !this.getWidth().equals(other.getWidth()))
            return false;
        if (this.getHeight() == null ? other.getHeight() != null : !this.getHeight().equals(other.getHeight()))
            return false;
        if (this.getStartTime() == null ? other.getStartTime() != null :
                !this.getStartTime().equals(other.getStartTime())) return false;
        if (this.getEndTime() == null ? other.getEndTime() != null : !this.getEndTime().equals(other.getEndTime()))
            return false;
        if (this.getViewNum() == null ? other.getViewNum() != null : !this.getViewNum().equals(other.getViewNum()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getStatusName() == null ? other.getStatusName() != null :
                !this.getStatusName().equals(other.getStatusName()))
            return false;
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) return false;
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
        return other instanceof AdListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getId() == null ? 43 : this.getId().hashCode());
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getSortId() == null ? 43 : this.getSortId().hashCode());
        result = result * PRIME + (this.getSortName() == null ? 43 : this.getSortName().hashCode());
        result = result * PRIME + (this.getCover() == null ? 43 : this.getCover().hashCode());
        result = result * PRIME + (this.getCoverUrl() == null ? 43 : this.getCoverUrl().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getTypeName() == null ? 43 : this.getTypeName().hashCode());
        result = result * PRIME + (this.getDescription() == null ? 43 : this.getDescription().hashCode());
        result = result * PRIME + (this.getContent() == null ? 43 : this.getContent().hashCode());
        result = result * PRIME + (this.getUrl() == null ? 43 : this.getUrl().hashCode());
        result = result * PRIME + (this.getWidth() == null ? 43 : this.getWidth().hashCode());
        result = result * PRIME + (this.getHeight() == null ? 43 : this.getHeight().hashCode());
        result = result * PRIME + (this.getStartTime() == null ? 43 : this.getStartTime().hashCode());
        result = result * PRIME + (this.getEndTime() == null ? 43 : this.getEndTime().hashCode());
        result = result * PRIME + (this.getViewNum() == null ? 43 : this.getViewNum().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getStatusName() == null ? 43 : this.getStatusName().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        result = result * PRIME + (this.getCreateUser() == null ? 43 : this.getCreateUser().hashCode());
        result = result * PRIME + (this.getCreateUserName() == null ? 43 : this.getCreateUserName().hashCode());
        result = result * PRIME + (this.getCreateTime() == null ? 43 : this.getCreateTime().hashCode());
        result = result * PRIME + (this.getUpdateUser() == null ? 43 : this.getUpdateUser().hashCode());
        result = result * PRIME + (this.getUpdateUserName() == null ? 43 : this.getUpdateUserName().hashCode());
        result = result * PRIME + (this.getUpdateTime() == null ? 43 : this.getUpdateTime().hashCode());
        return result;
    }

    public String toString() {
        return "AdListVo(" +
                "id=" + this.getId() +
                ", title=" + this.getTitle() +
                ", sortId=" + this.getSortId() +
                ", sortName=" + this.getSortName() +
                ", cover=" + this.getCover() +
                ", coverUrl=" + this.getCoverUrl() +
                ", type=" + this.getType() +
                ", typeName=" + this.getTypeName() +
                ", description=" + this.getDescription() +
                ", content=" + this.getContent() +
                ", url=" + this.getUrl() +
                ", width=" + this.getWidth() +
                ", height=" + this.getHeight() +
                ", startTime=" + this.getStartTime() +
                ", endTime=" + this.getEndTime() +
                ", viewNum=" + this.getViewNum() +
                ", status=" + this.getStatus() +
                ", statusName=" + this.getStatusName() +
                ", sort=" + this.getSort() +
                ", createUser=" + this.getCreateUser() +
                ", createUserName=" + this.getCreateUserName() +
                ", createTime=" + this.getCreateTime() +
                ", updateUser=" + this.getUpdateUser() +
                ", updateUserName=" + this.getUpdateUserName() +
                ", updateTime=" + this.getUpdateTime() +
                ")";
    }
}
