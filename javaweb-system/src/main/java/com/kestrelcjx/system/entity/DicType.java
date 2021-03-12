package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 字典类型
 */
@TableName("sys_dic_type")
public class DicType extends BaseEntity {
    /**
     * 字典名称
     */
    private String name;
    /**
     * 标识符
     */
    private String tag;
    /**
     * 显示顺序
     */
    private Integer sort;

    public DicType() {
    }

    public String getName() {
        return this.name;
    }

    public String getTag() {
        return this.tag;
    }

    public Integer getSort() {
        return this.sort;
    }

    public DicType setName(String name) {
        this.name = name;
        return this;
    }

    public DicType setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public DicType setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String toString() {
        return "DicType(" +
                "name=" + this.getName() +
                ", tag=" + this.getTag() +
                ", sort=" + this.getSort() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DicType)) return false;
        final DicType other = (DicType) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getTag() == null ? other.getTag() != null : !this.getTag().equals(other.getTag())) return false;
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DicType;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getTag() == null ? 43 : this.getTag().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        return result;
    }
}
