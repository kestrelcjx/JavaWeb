package com.kestrelcjx.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 品牌商
 */
@TableName("pms_brand_company")
public class BrandCompany extends BaseEntity {
    /**
     * 品牌商名称
     */
    private String name;
    /**
     * 品牌商简介
     */
    private String description;
    /**
     * 品牌商页的品牌商图片
     */
    private String image;
    /**
     * 排序号
     */
    private Integer sort;

    public BrandCompany() {
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String getImage() {
        return this.image;
    }

    public Integer getSort() {
        return this.sort;
    }

    public BrandCompany setName(String name) {
        this.name = name;
        return this;
    }

    public BrandCompany setDescription(String description) {
        this.description = description;
        return this;
    }

    public BrandCompany setImage(String image) {
        this.image = image;
        return this;
    }

    public BrandCompany setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String toString() {
        return "BrandCompany(name=" + this.getName() + ", description=" + this.getDescription() + ", image=" + this.getImage() + ", sort=" + this.getSort() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BrandCompany)) return false;
        final BrandCompany other = (BrandCompany) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$description = this.getDescription();
        final Object other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description))
            return false;
        final Object this$image = this.getImage();
        final Object other$image = other.getImage();
        if (this$image == null ? other$image != null : !this$image.equals(other$image)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BrandCompany;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $description = this.getDescription();
        result = result * PRIME + ($description == null ? 43 : $description.hashCode());
        final Object $image = this.getImage();
        result = result * PRIME + ($image == null ? 43 : $image.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        return result;
    }
}