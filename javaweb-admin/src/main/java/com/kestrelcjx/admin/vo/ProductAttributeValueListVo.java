package com.kestrelcjx.admin.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * <p>
 * 商品属性值列表Vo
 * </p>
 *
 * @author 鲲鹏
 * @since 2020-06-09
 */
public class ProductAttributeValueListVo {
    /**
     * 商品属性值ID
     */
    private Integer id;
    /**
     * 商品ID
     */
    private Integer productId;
    /**
     * 商品属性ID
     */
    private Integer productAttributeId;
    /**
     * 商品属性名称
     */
    private String productAttributeName;
    /**
     * 商品属性类型
     */
    private Integer productAttributeType;
    /**
     * 手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
     */
    private String productAttributeValue;
    /**
     * 所属店铺ID
     */
    private Integer storeId;
    /**
     * 排序号
     */
    private Integer sort;
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date updateTime;

    public ProductAttributeValueListVo() {
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public Integer getProductAttributeId() {
        return this.productAttributeId;
    }

    public String getProductAttributeName() {
        return this.productAttributeName;
    }

    public Integer getProductAttributeType() {
        return this.productAttributeType;
    }

    public String getProductAttributeValue() {
        return this.productAttributeValue;
    }

    public Integer getStoreId() {
        return this.storeId;
    }

    public Integer getSort() {
        return this.sort;
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

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public void setProductAttributeId(Integer productAttributeId) {
        this.productAttributeId = productAttributeId;
    }

    public void setProductAttributeName(String productAttributeName) {
        this.productAttributeName = productAttributeName;
    }

    public void setProductAttributeType(Integer productAttributeType) {
        this.productAttributeType = productAttributeType;
    }

    public void setProductAttributeValue(String productAttributeValue) {
        this.productAttributeValue = productAttributeValue;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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
        if (!(o instanceof ProductAttributeValueListVo)) return false;
        final ProductAttributeValueListVo other = (ProductAttributeValueListVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$productId = this.getProductId();
        final Object other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !this$productId.equals(other$productId)) return false;
        final Object this$productAttributeId = this.getProductAttributeId();
        final Object other$productAttributeId = other.getProductAttributeId();
        if (this$productAttributeId == null ? other$productAttributeId != null : !this$productAttributeId.equals(other$productAttributeId))
            return false;
        final Object this$productAttributeName = this.getProductAttributeName();
        final Object other$productAttributeName = other.getProductAttributeName();
        if (this$productAttributeName == null ? other$productAttributeName != null : !this$productAttributeName.equals(other$productAttributeName))
            return false;
        final Object this$productAttributeType = this.getProductAttributeType();
        final Object other$productAttributeType = other.getProductAttributeType();
        if (this$productAttributeType == null ? other$productAttributeType != null : !this$productAttributeType.equals(other$productAttributeType))
            return false;
        final Object this$productAttributeValue = this.getProductAttributeValue();
        final Object other$productAttributeValue = other.getProductAttributeValue();
        if (this$productAttributeValue == null ? other$productAttributeValue != null : !this$productAttributeValue.equals(other$productAttributeValue))
            return false;
        final Object this$storeId = this.getStoreId();
        final Object other$storeId = other.getStoreId();
        if (this$storeId == null ? other$storeId != null : !this$storeId.equals(other$storeId)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
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
        return other instanceof ProductAttributeValueListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $productId = this.getProductId();
        result = result * PRIME + ($productId == null ? 43 : $productId.hashCode());
        final Object $productAttributeId = this.getProductAttributeId();
        result = result * PRIME + ($productAttributeId == null ? 43 : $productAttributeId.hashCode());
        final Object $productAttributeName = this.getProductAttributeName();
        result = result * PRIME + ($productAttributeName == null ? 43 : $productAttributeName.hashCode());
        final Object $productAttributeType = this.getProductAttributeType();
        result = result * PRIME + ($productAttributeType == null ? 43 : $productAttributeType.hashCode());
        final Object $productAttributeValue = this.getProductAttributeValue();
        result = result * PRIME + ($productAttributeValue == null ? 43 : $productAttributeValue.hashCode());
        final Object $storeId = this.getStoreId();
        result = result * PRIME + ($storeId == null ? 43 : $storeId.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
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
        return "ProductAttributeValueListVo(id=" + this.getId() + ", productId=" + this.getProductId() + ", productAttributeId=" + this.getProductAttributeId() + ", productAttributeName=" + this.getProductAttributeName() + ", productAttributeType=" + this.getProductAttributeType() + ", productAttributeValue=" + this.getProductAttributeValue() + ", storeId=" + this.getStoreId() + ", sort=" + this.getSort() + ", createUser=" + this.getCreateUser() + ", createUserName=" + this.getCreateUserName() + ", createTime=" + this.getCreateTime() + ", updateUser=" + this.getUpdateUser() + ", updateUserName=" + this.getUpdateUserName() + ", updateTime=" + this.getUpdateTime() + ")";
    }
}