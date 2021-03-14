package com.kestrelcjx.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;


/**
 * 商品分类
 */
@TableName("pms_product_category")
public class ProductCategory extends BaseEntity {
    /**
     * 店铺ID
     */
    private Integer storeId;
    /**
     * 上级ID
     */
    private Integer pid;
    /**
     * 分类名称
     */
    private String name;
    /**
     * 分类图片
     */
    private String image;
    /**
     * 级别：1一级 2二级 3三级 4四级
     */
    private Integer level;
    /**
     * 备注
     */
    private String note;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 状态：1显示 2隐藏
     */
    private Integer status;

    public ProductCategory() {
    }

    public Integer getStoreId() {
        return this.storeId;
    }

    public Integer getPid() {
        return this.pid;
    }

    public String getName() {
        return this.name;
    }

    public String getImage() {
        return this.image;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getNote() {
        return this.note;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Integer getStatus() {
        return this.status;
    }

    public ProductCategory setStoreId(Integer storeId) {
        this.storeId = storeId;
        return this;
    }

    public ProductCategory setPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    public ProductCategory setName(String name) {
        this.name = name;
        return this;
    }

    public ProductCategory setImage(String image) {
        this.image = image;
        return this;
    }

    public ProductCategory setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public ProductCategory setNote(String note) {
        this.note = note;
        return this;
    }

    public ProductCategory setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public ProductCategory setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String toString() {
        return "ProductCategory(storeId=" + this.getStoreId() + ", pid=" + this.getPid() + ", name=" + this.getName() + ", image=" + this.getImage() + ", level=" + this.getLevel() + ", note=" + this.getNote() + ", sort=" + this.getSort() + ", status=" + this.getStatus() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductCategory)) return false;
        final ProductCategory other = (ProductCategory) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$storeId = this.getStoreId();
        final Object other$storeId = other.getStoreId();
        if (this$storeId == null ? other$storeId != null : !this$storeId.equals(other$storeId)) return false;
        final Object this$pid = this.getPid();
        final Object other$pid = other.getPid();
        if (this$pid == null ? other$pid != null : !this$pid.equals(other$pid)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$image = this.getImage();
        final Object other$image = other.getImage();
        if (this$image == null ? other$image != null : !this$image.equals(other$image)) return false;
        final Object this$level = this.getLevel();
        final Object other$level = other.getLevel();
        if (this$level == null ? other$level != null : !this$level.equals(other$level)) return false;
        final Object this$note = this.getNote();
        final Object other$note = other.getNote();
        if (this$note == null ? other$note != null : !this$note.equals(other$note)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductCategory;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $storeId = this.getStoreId();
        result = result * PRIME + ($storeId == null ? 43 : $storeId.hashCode());
        final Object $pid = this.getPid();
        result = result * PRIME + ($pid == null ? 43 : $pid.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $image = this.getImage();
        result = result * PRIME + ($image == null ? 43 : $image.hashCode());
        final Object $level = this.getLevel();
        result = result * PRIME + ($level == null ? 43 : $level.hashCode());
        final Object $note = this.getNote();
        result = result * PRIME + ($note == null ? 43 : $note.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }
}