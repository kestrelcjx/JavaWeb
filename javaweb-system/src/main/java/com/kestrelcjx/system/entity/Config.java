package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 系统配置
 */
@TableName("sys_config")
public class Config extends BaseEntity {
    /**
     * 配置标题
     */
    private String title;
    /**
     * 配置标签符
     */
    private String tag;
    /**
     * 配置值
     */
    private String value;
    /**
     * 配置项
     */
    private String options;
    /**
     * 配置分组ID
     */
    private Integer groupId;
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
     * 排序
     */
    private Integer sort;
    /**
     * 配置说明
     */
    private String note;

    public Config() {
    }

    public String getTitle() {
        return this.title;
    }

    public String getTag() {
        return this.tag;
    }

    public String getValue() {
        return this.value;
    }

    public String getOptions() {
        return this.options;
    }

    public Integer getGroupId() {
        return this.groupId;
    }

    public String getType() {
        return this.type;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getSort() {
        return this.sort;
    }

    public String getNote() {
        return this.note;
    }

    public Config setTitle(String title) {
        this.title = title;
        return this;
    }

    public Config setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public Config setValue(String value) {
        this.value = value;
        return this;
    }

    public Config setOptions(String options) {
        this.options = options;
        return this;
    }

    public Config setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    public Config setType(String type) {
        this.type = type;
        return this;
    }

    public Config setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Config setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public Config setNote(String note) {
        this.note = note;
        return this;
    }

    public String toString() {
        return "Config(" +
                "title=" + this.getTitle() +
                ", tag=" + this.getTag() +
                ", value=" + this.getValue() +
                ", options=" + this.getOptions() +
                ", groupId=" + this.getGroupId() +
                ", type=" + this.getType() +
                ", status=" + this.getStatus() +
                ", sort=" + this.getSort() +
                ", note=" + this.getNote() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Config)) return false;
        final Config other = (Config) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getTag() == null ? other.getTag() != null : !this.getTag().equals(other.getTag())) return false;
        if (this.getValue() == null ? other.getValue() != null : !this.getValue().equals(other.getValue()))
            return false;
        if (this.getOptions() == null ? other.getOptions() != null : !this.getOptions().equals(other.getOptions()))
            return false;
        if (this.getGroupId() == null ? other.getGroupId() != null : !this.getGroupId().equals(other.getGroupId()))
            return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) return false;
        if (this.getNote() == null ? other.getNote() != null : !this.getNote().equals(other.getNote())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Config;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getTag() == null ? 43 : this.getTag().hashCode());
        result = result * PRIME + (this.getValue() == null ? 43 : this.getValue().hashCode());
        result = result * PRIME + (this.getOptions() == null ? 43 : this.getOptions().hashCode());
        result = result * PRIME + (this.getGroupId() == null ? 43 : this.getGroupId().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        result = result * PRIME + (this.getNote() == null ? 43 : this.getNote().hashCode());
        return result;
    }
}
