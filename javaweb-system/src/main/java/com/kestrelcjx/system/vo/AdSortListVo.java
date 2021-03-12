package com.kestrelcjx.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 广告位描述列表
 */
public class AdSortListVo {
    /**
     * 广告位描述ID
     */
    private Integer id;
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
    private Integer itemId;
    /**
     * 站点名称
     */
    private String itemName;
    /**
     * 栏目ID
     */
    private Integer cateId;
    /**
     * 栏目名称
     */
    private String cateName;
    /**
     * 广告页面位置
     */
    private Integer locId;
    /**
     * 站点类型：1=PC网站，2=WAP手机站，3=小程序，4=APP移动端
     */
    private Integer platform;
    /**
     * 站点类型描述
     */
    private String platformName;
    /**
     * 广告位排序
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

    public AdSortListVo() {
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getNote() {
        return this.note;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public String getItemName() {
        return this.itemName;
    }

    public Integer getCateId() {
        return this.cateId;
    }

    public String getCateName() {
        return this.cateName;
    }

    public Integer getLocId() {
        return this.locId;
    }

    public Integer getPlatform() {
        return this.platform;
    }

    public String getPlatformName() {
        return this.platformName;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public void setLocId(Integer locId) {
        this.locId = locId;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
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
        if (!(o instanceof AdSortListVo)) return false;
        final AdSortListVo other = (AdSortListVo) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() == null ? other.getId() != null : !this.getId().equals(other.getId()))return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getNote() == null ? other.getNote() != null : !this.getNote().equals(other.getNote())) return false;
        if (this.getItemId() == null ? other.getItemId() != null : !this.getItemId().equals(other.getItemId()))
            return false;
        if (this.getItemName() == null ? other.getItemName() != null :
                !this.getItemName().equals(other.getItemName())) return false;
        if (this.getCateId() == null ? other.getCateId() != null : !this.getCateId().equals(other.getCateId()))
            return false;
        if (this.getCateName() == null ? other.getCateName() != null :
                !this.getCateName().equals(other.getCateName())) return false;
        if (this.getLocId() == null ? other.getLocId() != null : !this.getLocId().equals(other.getLocId()))
            return false;
        if (this.getPlatform() == null ? other.getPlatform() != null :
                !this.getPlatform().equals(other.getPlatform())) return false;
        if (this.getPlatformName() == null ? other.getPlatformName() != null :
                !this.getPlatformName().equals(other.getPlatformName()))
            return false;
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
        return other instanceof AdSortListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getId() == null ? 43 : this.getId().hashCode());
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getNote() == null ? 43 : this.getNote().hashCode());
        result = result * PRIME + (this.getItemId() == null ? 43 : this.getItemId().hashCode());
        result = result * PRIME + (this.getItemName() == null ? 43 : this.getItemName().hashCode());
        result = result * PRIME + (this.getCateId() == null ? 43 : this.getCateId().hashCode());
        result = result * PRIME + (this.getCateName() == null ? 43 : this.getCateName().hashCode());
        result = result * PRIME + (this.getLocId() == null ? 43 : this.getLocId().hashCode());
        result = result * PRIME + (this.getPlatform() == null ? 43 : this.getPlatform().hashCode());
        result = result * PRIME + (this.getPlatformName() == null ? 43 : this.getPlatformName().hashCode());
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
        return "AdSortListVo(" +
                "id=" + this.getId() +
                ", name=" + this.getName() +
                ", note=" + this.getNote() +
                ", itemId=" + this.getItemId() +
                ", itemName=" + this.getItemName() +
                ", cateId=" + this.getCateId() +
                ", cateName=" + this.getCateName() +
                ", locId=" + this.getLocId() +
                ", platform=" + this.getPlatform() +
                ", platformName=" + this.getPlatformName() +
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
