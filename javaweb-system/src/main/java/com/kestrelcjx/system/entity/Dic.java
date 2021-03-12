package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 字典
 */
@TableName("sys_dic")
public class Dic extends BaseEntity {
    /**
     * 字典名称
     */
    private String title;
    /**
     * 内部标签
     */
    private String tag;
    /**
     * 字典值
     */
    private String value;
    /**
     * 字典类型ID
     */
    private Integer typeId;
    /**
     * 状态：1=在用，2=停用
     */
    private Integer status;
    /**
     * 备注
     */
    private String note;
    /**
     * 显示顺序
     */
    private Integer sort;

    public Dic() {
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

    public Integer getTypeId() {
        return this.typeId;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getNote() {
        return this.note;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Dic setTitle(String title) {
        this.title = title;
        return this;
    }

    public Dic setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public Dic setValue(String value) {
        this.value = value;
        return this;
    }

    public Dic setTypeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    public Dic setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Dic setNote(String note) {
        this.note = note;
        return this;
    }

    public Dic setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String toString() {
        return "Dic(" +
                "title=" + this.getTitle() +
                ", tag=" + this.getTag() +
                ", value=" + this.getValue() +
                ", typeId=" + this.getTypeId() +
                ", status=" + this.getStatus() +
                ", note=" + this.getNote() +
                ", sort=" + this.getSort() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Dic)) return false;
        final Dic other = (Dic) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getTitle() == null ? other.getTitle() != null : !this.getTitle().equals(other.getTitle()))
            return false;
        if (this.getTag() == null ? other.getTag() != null : !this.getTag().equals(other.getTag())) return false;
        if (this.getValue() == null ? other.getValue() != null : !this.getValue().equals(other.getValue()))
            return false;
        if (this.getTypeId() == null ? other.getTypeId() != null : !this.getTypeId().equals(other.getTypeId()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getNote() == null ? other.getNote() != null : !this.getNote().equals(other.getNote())) return false;
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Dic;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getTitle() == null ? 43 : this.getTitle().hashCode());
        result = result * PRIME + (this.getTag() == null ? 43 : this.getTag().hashCode());
        result = result * PRIME + (this.getValue() == null ? 43 : this.getValue().hashCode());
        result = result * PRIME + (this.getTypeId() == null ? 43 : this.getTypeId().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getNote() == null ? 43 : this.getNote().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        return result;
    }
}
