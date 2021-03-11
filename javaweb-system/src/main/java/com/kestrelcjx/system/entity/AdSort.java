package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 广告位描述
 */
@TableName("sys_ad_sort")
public class AdSort extends BaseEntity {
    /**
     * 广告位名称
     */
    private String name;
    /**
     * 广告位描述
     */
    private String note;
    /**
     * 站点ID
     */
    private String itemId;
    /**
     * 栏目ID
     */
    private Integer cateId;
    /**
     * 广告页面位置
     */
    private Integer locId;
    /**
     * 站点类型：1=PC网站，2=WAP手机站，3=小程序，4=APP移动端
     */
    private Integer platform;
    /**
     * 广告位排序
     */
    private Integer sort;

    public AdSort() {
    }

    public String getName() {
        return this.name;
    }

    public String getNote() {
        return this.note;
    }

    public String getItemId() {
        return this.itemId;
    }

    public Integer getCateId() {
        return this.cateId;
    }

    public Integer getLocId() {
        return this.locId;
    }

    public Integer getPlatform() {
        return this.platform;
    }

    public Integer getSort() {
        return this.sort;
    }

    public AdSort setName(String name) {
        this.name = name;
        return this;
    }

    public AdSort setNote(String note) {
        this.note = note;
        return this;
    }

    public AdSort setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    public AdSort setCateId(Integer cateId) {
        this.cateId = cateId;
        return this;
    }

    public AdSort setLocId(Integer locId) {
        this.locId = locId;
        return this;
    }

    public AdSort setPlatform(Integer platform) {
        this.platform = platform;
        return this;
    }

    public AdSort setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String toString() {
        return "AdSort(" +
                "name=" + this.getName() +
                ", note=" + this.getNote() +
                ", itemId=" + this.getItemId() +
                ", cateId=" + this.getCateId() +
                ", locId=" + this.getLocId() +
                ", platform=" + this.getPlatform() +
                ", sort=" + this.getSort() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AdSort)) return false;
        final AdSort other = (AdSort) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getNote() == null ? other.getNote() != null : !this.getNote().equals(other.getNote())) return false;
        if (this.getItemId() == null ? other.getItemId() != null : !this.getItemId().equals(other.getItemId()))
            return false;
        if (this.getCateId() == null ? other.getCateId() != null : !this.getCateId().equals(other.getCateId()))
            return false;
        if (this.getLocId() == null ? other.getLocId() != null : !this.getLocId().equals(other.getLocId()))
            return false;
        if (this.getPlatform() == null ? other.getPlatform() != null : !this.getPlatform().equals(other.getPlatform()))
            return false;
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AdSort;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getNote() == null ? 43 : this.getNote().hashCode());
        result = result * PRIME + (this.getItemId() == null ? 43 : this.getItemId().hashCode());
        result = result * PRIME + (this.getCateId() == null ? 43 : this.getCateId().hashCode());
        result = result * PRIME + (this.getLocId() == null ? 43 : this.getLocId().hashCode());
        result = result * PRIME + (this.getPlatform() == null ? 43 : this.getPlatform().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        return result;
    }
}
