package com.kestrelcjx.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 布局列表Vo
 */
public class LayoutListVo {
    /**
     * 布局ID
     */
    private Integer id;
    /**
     * 页面编号
     */
    private Integer itemId;
    /**
     * 页面编号名称
     */
    private String itemName;
    /**
     * 页面的位置
     */
    private Integer locId;
    /**
     * 页面位置描述
     */
    private String locDesc;
    /**
     * 类型：1=新闻资讯，2=其他
     */
    private Integer type;
    /**
     * 类型描述
     */
    private String typeName;
    /**
     * 对应的类型编号
     */
    private Integer typeId;
    /**
     * 图片路径
     */
    private String image;
    /**
     * 图片路径
     */
    private String imageUrl;
    /**
     * 显示顺序
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

    public LayoutListVo() {
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public String getItemName() {
        return this.itemName;
    }

    public Integer getLocId() {
        return this.locId;
    }

    public String getLocDesc() {
        return this.locDesc;
    }

    public Integer getType() {
        return this.type;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public Integer getTypeId() {
        return this.typeId;
    }

    public String getImage() {
        return this.image;
    }

    public String getImageUrl() {
        return this.imageUrl;
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

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setLocId(Integer locId) {
        this.locId = locId;
    }

    public void setLocDesc(String locDesc) {
        this.locDesc = locDesc;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
        if (!(o instanceof LayoutListVo)) return false;
        final LayoutListVo other = (LayoutListVo) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() == null ? other.getId() != null : !this.getId().equals(other.getId())) return false;
        if (this.getItemId() == null ? other.getItemId() != null : !this.getItemId().equals(other.getItemId()))
            return false;
        if (this.getItemName() == null ? other.getItemName() != null :
                !this.getItemName().equals(other.getItemName())) return false;
        if (this.getLocId() == null ? other.getLocId() != null : !this.getLocId().equals(other.getLocId()))
            return false;
        if (this.getLocDesc() == null ? other.getLocDesc() != null : !this.getLocDesc().equals(other.getLocDesc()))
            return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getTypeName() == null ? other.getTypeName() != null :
                !this.getTypeName().equals(other.getTypeName())) return false;
        if (this.getTypeId() == null ? other.getTypeId() != null : !this.getTypeId().equals(other.getTypeId()))
            return false;
        if (this.getImage() == null ? other.getImage() != null : !this.getImage().equals(other.getImage()))
            return false;
        if (this.getImageUrl() == null ? other.getImageUrl() != null :
                !this.getImageUrl().equals(other.getImageUrl())) return false;
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) return false;
        if (this.getCreateUser() == null ? other.getCreateUser() != null :
                !this.getCreateUser().equals(other.getCreateUser()))
            return false;
        if (this.getCreateUserName() == null ? other.getCreateUserName() != null :
                !this.getCreateUserName().equals(other.getCreateUserName()))
            return false;
        if (this.getCreateTime() == null ? other.getCreateTime() != null :
                !this.getCreateTime().equals(other.getCreateTime()))
            return false;
        if (this.getUpdateUser() == null ? other.getUpdateUser() != null :
                !this.getUpdateUser().equals(other.getUpdateUser()))
            return false;
        if (this.getUpdateUserName() == null ? other.getUpdateUserName() != null :
                !this.getUpdateUserName().equals(other.getUpdateUserName()))
            return false;
        if (this.getUpdateTime() == null ? other.getUpdateTime() != null :
                !this.getUpdateTime().equals(other.getUpdateTime()))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LayoutListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getId() == null ? 43 : this.getId().hashCode());
        result = result * PRIME + (this.getItemId() == null ? 43 : this.getItemId().hashCode());
        result = result * PRIME + (this.getItemName() == null ? 43 : this.getItemName().hashCode());
        result = result * PRIME + (this.getLocId() == null ? 43 : this.getLocId().hashCode());
        result = result * PRIME + (this.getLocDesc() == null ? 43 : this.getLocDesc().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getTypeName() == null ? 43 : this.getTypeName().hashCode());
        result = result * PRIME + (this.getTypeId() == null ? 43 : this.getTypeId().hashCode());
        result = result * PRIME + (this.getImage() == null ? 43 : this.getImage().hashCode());
        result = result * PRIME + (this.getImageUrl() == null ? 43 : this.getImageUrl().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        result = result * PRIME + (this.getCreateUser() == null ? 43 : this.getCreateUser().hashCode());
        result = result * PRIME + (this.getCreateUserName() == null ? 43 : this.getCreateUserName().hashCode());
        result = result * PRIME + (this.getCreateTime() == null ? 43 : this.getCreateTime().hashCode());
        result = result * PRIME + (this.getUpdateUser() == null ? 43 : this.getUpdateUser().hashCode());
        result = result * PRIME + (this.getUpdateUserName() == null ? 43 : this.getUpdateUserName().hashCode());
        result = result * PRIME + (this.getUpdateTime() == null ? 43 : this.getUpdateTime().hashCode());
        return result;
    }

    public String toString() {
        return "LayoutListVo(" +
                "id=" + this.getId() +
                ", itemId=" + this.getItemId() +
                ", itemName=" + this.getItemName() +
                ", locId=" + this.getLocId() +
                ", locDesc=" + this.getLocDesc() +
                ", type=" + this.getType() +
                ", typeName=" + this.getTypeName() +
                ", typeId=" + this.getTypeId() +
                ", image=" + this.getImage() +
                ", imageUrl=" + this.getImageUrl() +
                ", sort=" + this.getSort() +
                ", createUser=" + this.getCreateUser() +
                ", createUserName=" + this.getCreateUserName() +
                ", createTime=" + this.getCreateTime() +
                ", updateUser=" + this.getUpdateUser() +
                ", updateUserName=" + this.getUpdateUserName() +
                ", updateTime=" + this.getUpdateTime() +
                ")";
    }
}
