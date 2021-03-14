package com.kestrelcjx.admin.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 商品属性列表Vo
 */
public class ProductAttributeListVo {
    /**
     * 商品属性ID
     */
    private Integer id;
    /**
     * 商品属性分类ID
     */
    private Integer productAttributeCategoryId;
    /**
     * 商品属性分类名称
     */
    private String productAttributeCategoryName;
    /**
     * 属性名称
     */
    private String name;
    /**
     * 属性的类型：1规格 2属性
     */
    private Integer type;
    /**
     * 属性的类型描述
     */
    private String typeName;
    /**
     * 排序号
     */
    private Integer sort;
    /**
     * 所属店铺ID
     */
    private Integer storeId;
    /**
     * 添加人
     */
    private Integer createUser;
    /**
     * 添加人名称
     */
    private String createUserName;
    /**
     * 添加时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 更新人
     */
    private Integer updateUser;
    /**
     * 更新人名称
     */
    private String updateUserName;
    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    public ProductAttributeListVo() {
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getProductAttributeCategoryId() {
        return this.productAttributeCategoryId;
    }

    public String getProductAttributeCategoryName() {
        return this.productAttributeCategoryName;
    }

    public String getName() {
        return this.name;
    }

    public Integer getType() {
        return this.type;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Integer getStoreId() {
        return this.storeId;
    }

    public Integer getCreateUser() {
        return this.createUser;
    }

    public String getCreateUserName() {
        return this.createUserName;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Integer getUpdateUser() {
        return this.updateUser;
    }

    public String getUpdateUserName() {
        return this.updateUserName;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setProductAttributeCategoryId(Integer productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
    }

    public void setProductAttributeCategoryName(String productAttributeCategoryName) {
        this.productAttributeCategoryName = productAttributeCategoryName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ProductAttributeListVo)) return false;
        final ProductAttributeListVo other = (ProductAttributeListVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$productAttributeCategoryId = this.getProductAttributeCategoryId();
        final Object other$productAttributeCategoryId = other.getProductAttributeCategoryId();
        if (this$productAttributeCategoryId == null ? other$productAttributeCategoryId != null : !this$productAttributeCategoryId.equals(other$productAttributeCategoryId))
            return false;
        final Object this$productAttributeCategoryName = this.getProductAttributeCategoryName();
        final Object other$productAttributeCategoryName = other.getProductAttributeCategoryName();
        if (this$productAttributeCategoryName == null ? other$productAttributeCategoryName != null : !this$productAttributeCategoryName.equals(other$productAttributeCategoryName))
            return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        final Object this$typeName = this.getTypeName();
        final Object other$typeName = other.getTypeName();
        if (this$typeName == null ? other$typeName != null : !this$typeName.equals(other$typeName)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        final Object this$storeId = this.getStoreId();
        final Object other$storeId = other.getStoreId();
        if (this$storeId == null ? other$storeId != null : !this$storeId.equals(other$storeId)) return false;
        final Object this$createUser = this.getCreateUser();
        final Object other$createUser = other.getCreateUser();
        if (this$createUser == null ? other$createUser != null : !this$createUser.equals(other$createUser))
            return false;
        final Object this$createUserName = this.getCreateUserName();
        final Object other$createUserName = other.getCreateUserName();
        if (this$createUserName == null ? other$createUserName != null : !this$createUserName.equals(other$createUserName))
            return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        final Object this$updateUser = this.getUpdateUser();
        final Object other$updateUser = other.getUpdateUser();
        if (this$updateUser == null ? other$updateUser != null : !this$updateUser.equals(other$updateUser))
            return false;
        final Object this$updateUserName = this.getUpdateUserName();
        final Object other$updateUserName = other.getUpdateUserName();
        if (this$updateUserName == null ? other$updateUserName != null : !this$updateUserName.equals(other$updateUserName))
            return false;
        final Object this$updateTime = this.getUpdateTime();
        final Object other$updateTime = other.getUpdateTime();
        if (this$updateTime == null ? other$updateTime != null : !this$updateTime.equals(other$updateTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ProductAttributeListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $productAttributeCategoryId = this.getProductAttributeCategoryId();
        result = result * PRIME + ($productAttributeCategoryId == null ? 43 : $productAttributeCategoryId.hashCode());
        final Object $productAttributeCategoryName = this.getProductAttributeCategoryName();
        result = result * PRIME + ($productAttributeCategoryName == null ? 43 : $productAttributeCategoryName.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        final Object $typeName = this.getTypeName();
        result = result * PRIME + ($typeName == null ? 43 : $typeName.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        final Object $storeId = this.getStoreId();
        result = result * PRIME + ($storeId == null ? 43 : $storeId.hashCode());
        final Object $createUser = this.getCreateUser();
        result = result * PRIME + ($createUser == null ? 43 : $createUser.hashCode());
        final Object $createUserName = this.getCreateUserName();
        result = result * PRIME + ($createUserName == null ? 43 : $createUserName.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $updateUser = this.getUpdateUser();
        result = result * PRIME + ($updateUser == null ? 43 : $updateUser.hashCode());
        final Object $updateUserName = this.getUpdateUserName();
        result = result * PRIME + ($updateUserName == null ? 43 : $updateUserName.hashCode());
        final Object $updateTime = this.getUpdateTime();
        result = result * PRIME + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public String toString() {
        return "ProductAttributeListVo(id=" + this.getId() + ", productAttributeCategoryId=" + this.getProductAttributeCategoryId() + ", productAttributeCategoryName=" + this.getProductAttributeCategoryName() + ", name=" + this.getName() + ", type=" + this.getType() + ", typeName=" + this.getTypeName() + ", sort=" + this.getSort() + ", storeId=" + this.getStoreId() + ", createUser=" + this.getCreateUser() + ", createUserName=" + this.getCreateUserName() + ", createTime=" + this.getCreateTime() + ", updateUser=" + this.getUpdateUser() + ", updateUserName=" + this.getUpdateUserName() + ", updateTime=" + this.getUpdateTime() + ")";
    }
}