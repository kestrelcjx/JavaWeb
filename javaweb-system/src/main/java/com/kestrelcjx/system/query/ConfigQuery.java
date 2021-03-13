package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 系统配置查询条件
 */
public class ConfigQuery extends BaseQuery {
    /**
     * 配置标题
     */
    private String title;
    /**
     * 配置类型：hidden=隐藏 readonly=只读文本 number=数字 text=单行文本 textarea=多行文本
     * array=数组 password=密码 radio=单选框 checkbox=复选框 select=下拉框 icon=字体图标
     * date=日期 datetime=时间 image=单张图片 images=多张图片 file=单个文件 files=多个文件
     * ueditor=富文本编辑器 json=JSON
     */
    private String type;
    /**
     * 状态：1=正常，2=停用
     */
    private Integer status;
    /**
     * 分组ID
     */
    private Integer groupId;

    public ConfigQuery() {
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ConfigQuery)) return false;
        final ConfigQuery other = (ConfigQuery) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getGroupId() == null ? other.getGroupId() != null : !this.getGroupId().equals(other.getGroupId()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ConfigQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getGroupId() == null ? 43 : this.getGroupId().hashCode());
        return result;
    }

    public String toString() {
        return "ConfigQuery(" +
                "title=" + this.getTitle() +
                ", type=" + this.getType() +
                ", status=" + this.getStatus() +
                ", groupId=" + this.getGroupId() +
                ")";
    }
}
