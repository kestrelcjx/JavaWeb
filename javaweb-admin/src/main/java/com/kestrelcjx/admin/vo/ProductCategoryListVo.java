package com.kestrelcjx.admin.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 商品分类列表Vo
 */
public class ProductCategoryListVo {
    /**
     * 商品分类ID
     */
    private Integer id;
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
     * 分类图片
     */
    private String imageUrl;
    /**
     * 级别：1一级 2二级 3三级 4四级
     */
    private Integer level;
    /**
     * 级别描述
     */
    private String levelName;
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
    /**
     * 状态描述
     */
    private String statusName;
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

    public ProductCategoryListVo() {
    }

    public Integer getId() {
        return this.id;
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

    public String getImageUrl() {
        return this.imageUrl;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getLevelName() {
        return this.levelName;
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

    public String getStatusName() {
        return this.statusName;
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

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
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
        if (!(o instanceof ProductCategoryListVo)) return false;
        final ProductCategoryListVo other = (ProductCategoryListVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
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
        final Object this$imageUrl = this.getImageUrl();
        final Object other$imageUrl = other.getImageUrl();
        if (this$imageUrl == null ? other$imageUrl != null : !this$imageUrl.equals(other$imageUrl)) return false;
        final Object this$level = this.getLevel();
        final Object other$level = other.getLevel();
        if (this$level == null ? other$level != null : !this$level.equals(other$level)) return false;
        final Object this$levelName = this.getLevelName();
        final Object other$levelName = other.getLevelName();
        if (this$levelName == null ? other$levelName != null : !this$levelName.equals(other$levelName)) return false;
        final Object this$note = this.getNote();
        final Object other$note = other.getNote();
        if (this$note == null ? other$note != null : !this$note.equals(other$note)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$statusName = this.getStatusName();
        final Object other$statusName = other.getStatusName();
        if (this$statusName == null ? other$statusName != null : !this$statusName.equals(other$statusName))
            return false;
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
        return other instanceof ProductCategoryListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $storeId = this.getStoreId();
        result = result * PRIME + ($storeId == null ? 43 : $storeId.hashCode());
        final Object $pid = this.getPid();
        result = result * PRIME + ($pid == null ? 43 : $pid.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $image = this.getImage();
        result = result * PRIME + ($image == null ? 43 : $image.hashCode());
        final Object $imageUrl = this.getImageUrl();
        result = result * PRIME + ($imageUrl == null ? 43 : $imageUrl.hashCode());
        final Object $level = this.getLevel();
        result = result * PRIME + ($level == null ? 43 : $level.hashCode());
        final Object $levelName = this.getLevelName();
        result = result * PRIME + ($levelName == null ? 43 : $levelName.hashCode());
        final Object $note = this.getNote();
        result = result * PRIME + ($note == null ? 43 : $note.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $statusName = this.getStatusName();
        result = result * PRIME + ($statusName == null ? 43 : $statusName.hashCode());
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
        return "ProductCategoryListVo(id=" + this.getId() + ", storeId=" + this.getStoreId() + ", pid=" + this.getPid() + ", name=" + this.getName() + ", image=" + this.getImage() + ", imageUrl=" + this.getImageUrl() + ", level=" + this.getLevel() + ", levelName=" + this.getLevelName() + ", note=" + this.getNote() + ", sort=" + this.getSort() + ", status=" + this.getStatus() + ", statusName=" + this.getStatusName() + ", createUser=" + this.getCreateUser() + ", createUserName=" + this.getCreateUserName() + ", createTime=" + this.getCreateTime() + ", updateUser=" + this.getUpdateUser() + ", updateUserName=" + this.getUpdateUserName() + ", updateTime=" + this.getUpdateTime() + ")";
    }
}