package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.kestrelcjx.common.common.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 广告
 */
@TableName("sys_ad")
public class Ad extends BaseEntity {
    /**
     * 广告标题
     */
    private String title;
    /**
     * 广告位ID
     */
    private Integer sortId;
    /**
     * 广告图片
     */
    private String cover;
    /**
     * 广告类型：1=图片，2=文字，3=视频，4=推荐
     */
    private Integer type;
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
     * 排序
     */
    private Integer sort;

    public String getTitle() {
        return title;
    }

    public Ad setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getSortId() {
        return sortId;
    }

    public Ad setSortId(Integer sortId) {
        this.sortId = sortId;
        return this;
    }

    public String getCover() {
        return cover;
    }

    public Ad setCover(String cover) {
        this.cover = cover;
        return this;
    }

    public Integer getType() {
        return type;
    }

    public Ad setType(Integer type) {
        this.type = type;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Ad setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Ad setContent(String content) {
        this.content = content;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Ad setUrl(String url) {
        this.url = url;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public Ad setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public Ad setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Ad setStartTime(Date startTime) {
        this.startTime = startTime;
        return this;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Ad setEndTime(Date endTime) {
        this.endTime = endTime;
        return this;
    }

    public Integer getViewNum() {
        return viewNum;
    }

    public Ad setViewNum(Integer viewNum) {
        this.viewNum = viewNum;
        return this;
    }

    public Integer getStatus() {
        return status;
    }

    public Ad setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public Ad setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    @Override
    public String toString() {
        return "Ad(" +
                "title='" + title + '\'' +
                ", sortId=" + sortId +
                ", cover='" + cover + '\'' +
                ", type=" + type +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", url='" + url + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", viewNum=" + viewNum +
                ", status=" + status +
                ", sort=" + sort +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Ad)) {
            return false;
        }
        Ad other = (Ad) o;
        if (!other.canEqual((Object) this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle())) {
            return false;
        }
        if (this.getSortId() == null ? other.getSortId() != null : !this.getSortId().equals(other.getSortId())) {
            return false;
        }
        if (this.getCover() == null ? other.getCover() != null : !this.getCover().equals(other.getCover())) {
            return false;
        }
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) {
            return false;
        }
        if (this.getDescription() == null ? other.getDescription() != null
                : !this.getDescription().equals(other.getDescription())) {
            return false;
        }
        if (this.getContent() == null ? other.getContent() != null : !this.getContent().equals(other.getContent())) {
            return false;
        }
        if (this.getUrl() == null ? other.getUrl() != null : !this.getUrl().equals(other.getUrl())) {
            return false;
        }
        if (this.getWidth() == null ? other.getWidth() != null : !this.getWidth().equals(other.getWidth())) {
            return false;
        }
        if (this.getHeight() == null ? other.getHeight() != null : !this.getHeight().equals(other.getHeight())) {
            return false;
        }
        if (this.getStartTime() == null ? other.getStartTime() != null
                : !this.getStartTime().equals(other.getStartTime())) {
            return false;
        }
        if (this.getEndTime() == null ? other.getEndTime() != null : !this.getEndTime().equals(other.getEndTime())) {
            return false;
        }
        if (this.getViewNum() == null ? other.getViewNum() != null : !this.getViewNum().equals(other.getViewNum())) {
            return false;
        }
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus())) {
            return false;
        }
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSortId())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        result = (result * PRIME) + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = (result * PRIME) + this.getSortId();
        result = (result * PRIME) + (this.getCover() == null ? 43 : this.getCover().hashCode());
        result = (result * PRIME) + this.getType();
        result = (result * PRIME) + (this.getDescription() == null ? 43 : this.getDescription().hashCode());
        result = (result * PRIME) + (this.getContent() == null ? 43 : this.getContent().hashCode());
        result = (result * PRIME) + (this.getUrl() == null ? 43 : this.getUrl().hashCode());
        result = (result * PRIME) + this.getWidth();
        result = (result * PRIME) + this.getHeight();
        result = (result * PRIME) + (this.getStartTime() == null ? 43 : this.getStartTime().hashCode());
        result = (result * PRIME) + (this.getEndTime() == null ? 43 : this.getEndTime().hashCode());
        result = (result * PRIME) + this.getViewNum();
        result = (result * PRIME) + this.getStatus();
        result = (result * PRIME) + this.getSort();
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Ad;
    }
}
