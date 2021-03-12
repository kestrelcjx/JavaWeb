package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 布局
 */
@TableName("sys_layout")
public class Layout extends BaseEntity {
    /**
     * 页面编号
     */
    private Integer itemId;
    /**
     * 页面的位置
     */
    private Integer locId;
    /**
     * 类型：1=新闻资讯，2=其它
     */
    private Integer type;
    /**
     * 对应的类型编号
     */
    private Integer typeId;
    /**
     * 图片路径
     */
    private String image;
    /**
     * 显示顺序
     */
    private Integer sort;

    public Layout() {
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public Integer getLocId() {
        return this.locId;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getTypeId() {
        return this.typeId;
    }

    public String getImage() {
        return this.image;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Layout setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public Layout setLocId(Integer locId) {
        this.locId = locId;
        return this;
    }

    public Layout setType(Integer type) {
        this.type = type;
        return this;
    }

    public Layout setTypeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    public Layout setImage(String image) {
        this.image = image;
        return this;
    }

    public Layout setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String toString() {
        return "Layout(" +
                "itemId=" + this.getItemId() +
                ", locId=" + this.getLocId() +
                ", type=" + this.getType() +
                ", typeId=" + this.getTypeId() +
                ", image=" + this.getImage() +
                ", sort=" + this.getSort() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Layout)) return false;
        final Layout other = (Layout) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getItemId() == null ? other.getItemId() != null : !this.getItemId().equals(other.getItemId()))
            return false;
        if (this.getLocId() == null ? other.getLocId() != null : !this.getLocId().equals(other.getLocId()))
            return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getTypeId() == null ? other.getTypeId() != null : !this.getTypeId().equals(other.getTypeId()))
            return false;
        if (this.getImage() == null ? other.getImage() != null : !this.getImage().equals(other.getImage()))
            return false;
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Layout;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getItemId() == null ? 43 : this.getItemId().hashCode());
        result = result * PRIME + (this.getLocId() == null ? 43 : this.getLocId().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getTypeId() == null ? 43 : this.getTypeId().hashCode());
        result = result * PRIME + (this.getImage() == null ? 43 : this.getImage().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        return result;
    }
}
