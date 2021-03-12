package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 布局描述
 */
@TableName("sys_layout_desc")
public class LayoutDesc extends BaseEntity {
    /**
     * 推荐位名称
     */
    private String name;
    /**
     * 页面编号
     */
    private Integer itemId;
    /**
     * 位置编号
     */
    private Integer locId;
    /**
     * 页面位置描述
     */
    private String locDesc;
    /**
     * 排序
     */
    private Integer sort;

    public LayoutDesc() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public Integer getLocId() {
        return this.locId;
    }

    public String getLocDesc() {
        return this.locDesc;
    }

    public Integer getSort() {
        return this.sort;
    }

    public LayoutDesc setName(String name) {
        this.name = name;
        return this;
    }

    public LayoutDesc setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public LayoutDesc setLocId(Integer locId) {
        this.locId = locId;
        return this;
    }

    public LayoutDesc setLocDesc(String locDesc) {
        this.locDesc = locDesc;
        return this;
    }

    public LayoutDesc setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String toString() {
        return "LayoutDesc(" +
                "name=" + this.getName() +
                ", itemId=" + this.getItemId() +
                ", locId=" + this.getLocId() +
                ", locDesc=" + this.getLocDesc() +
                ", sort=" + this.getSort() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LayoutDesc)) return false;
        final LayoutDesc other = (LayoutDesc) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getItemId() == null ? other.getItemId() != null : !this.getItemId().equals(other.getItemId()))
            return false;
        if (this.getLocId() == null ? other.getLocId() != null : !this.getLocId().equals(other.getLocId()))
            return false;
        if (this.getLocDesc() == null ? other.getLocDesc() != null : !this.getLocDesc().equals(other.getLocDesc()))
            return false;
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LayoutDesc;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getItemId() == null ? 43 : this.getItemId().hashCode());
        result = result * PRIME + (this.getLocId() == null ? 43 : this.getLocId().hashCode());
        result = result * PRIME + (this.getLocDesc() == null ? 43 : this.getLocDesc().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        return result;
    }
}
