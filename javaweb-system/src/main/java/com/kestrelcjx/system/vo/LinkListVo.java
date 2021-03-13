package com.kestrelcjx.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 友链列表Vo
 */
public class LinkListVo {
    /**
     * 友链ID
     */
    private Integer id;
    /**
     * 友链名称
     */
    private String name;
    /**
     * 类型：1=友情链接，2=合作伙伴
     */
    private Integer type;
    /**
     * 类型描述
     */
    private String typeName;
    /**
     * 友链地址
     */
    private String url;
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
     * 平台：1=PC站，2=WAP站，3=微信小程序，4=APP应用
     */
    private Integer platform;
    /**
     * 平台描述
     */
    private String platformName;
    /**
     * 友链形式：1=文字链接，2=图片链接
     */
    private Integer form;
    /**
     * 友链形式描述
     */
    private String formName;
    /**
     * 友链图片
     */
    private String image;
    /**
     * 友链图片
     */
    private String imageUrl;
    /**
     * 状态：1=在用，2=停用
     */
    private Integer status;
    /**
     * 状态描述
     */
    private String statusName;
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

    public LinkListVo() {
    }

    public Integer getId() {
        return this.id;
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

    public String getUrl() {
        return this.url;
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

    public Integer getPlatform() {
        return this.platform;
    }

    public String getPlatformName() {
        return this.platformName;
    }

    public Integer getForm() {
        return this.form;
    }

    public String getFormName() {
        return this.formName;
    }

    public String getImage() {
        return this.image;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getStatusName() {
        return this.statusName;
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

    public void setType(Integer type) {
        this.type = type;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public void setForm(Integer form) {
        this.form = form;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
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
        if (!(o instanceof LinkListVo)) return false;
        final LinkListVo other = (LinkListVo) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() == null ? other.getId() != null : !this.getId().equals(other.getId())) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getTypeName() == null ? other.getTypeName() != null :
                !this.getTypeName().equals(other.getTypeName())) return false;
        if (this.getUrl() == null ? other.getUrl() != null : !this.getUrl().equals(other.getUrl())) return false;
        if (this.getItemId() == null ? other.getItemId() != null : !this.getItemId().equals(other.getItemId()))
            return false;
        if (this.getItemName() == null ? other.getItemName() != null :
                !this.getItemName().equals(other.getItemName())) return false;
        if (this.getCateId() == null ? other.getCateId() != null : !this.getCateId().equals(other.getCateId()))
            return false;
        if (this.getCateName() == null ? other.getCateName() != null :
                !this.getCateName().equals(other.getCateName())) return false;
        if (this.getPlatform() == null ? other.getPlatform() != null :
                !this.getPlatform().equals(other.getPlatform())) return false;
        if (this.getPlatformName() == null ? other.getPlatformName() != null :
                !this.getPlatformName().equals(other.getPlatformName()))
            return false;
        if (this.getForm() == null ? other.getForm() != null : !this.getForm().equals(other.getForm())) return false;
        if (this.getFormName() == null ? other.getFormName() != null :
                !this.getFormName().equals(other.getFormName())) return false;
        if (this.getImage() == null ? other.getImage() != null : !this.getImage().equals(other.getImage()))
            return false;
        if (this.getImageUrl() == null ? other.getImageUrl() != null :
                !this.getImageUrl().equals(other.getImageUrl())) return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getStatusName() == null ? other.getStatusName() != null :
                !this.getStatusName().equals(other.getStatusName()))
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
        return other instanceof LinkListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getId() == null ? 43 : this.getId().hashCode());
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getTypeName() == null ? 43 : this.getTypeName().hashCode());
        result = result * PRIME + (this.getUrl() == null ? 43 : this.getUrl().hashCode());
        result = result * PRIME + (this.getItemId() == null ? 43 : this.getItemId().hashCode());
        result = result * PRIME + (this.getItemName() == null ? 43 : this.getItemName().hashCode());
        result = result * PRIME + (this.getCateId() == null ? 43 : this.getCateId().hashCode());
        result = result * PRIME + (this.getCateName() == null ? 43 : this.getCateName().hashCode());
        result = result * PRIME + (this.getPlatform() == null ? 43 : this.getPlatform().hashCode());
        result = result * PRIME + (this.getPlatformName() == null ? 43 : this.getPlatformName().hashCode());
        result = result * PRIME + (this.getForm() == null ? 43 : this.getForm().hashCode());
        result = result * PRIME + (this.getFormName() == null ? 43 : this.getFormName().hashCode());
        result = result * PRIME + (this.getImage() == null ? 43 : this.getImage().hashCode());
        result = result * PRIME + (this.getImageUrl() == null ? 43 : this.getImageUrl().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getStatusName() == null ? 43 : this.getStatusName().hashCode());
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
        return "LinkListVo(" +
                "id=" + this.getId() +
                ", name=" + this.getName() +
                ", type=" + this.getType() +
                ", typeName=" + this.getTypeName() +
                ", url=" + this.getUrl() +
                ", itemId=" + this.getItemId() +
                ", itemName=" + this.getItemName() +
                ", cateId=" + this.getCateId() +
                ", cateName=" + this.getCateName() +
                ", platform=" + this.getPlatform() +
                ", platformName=" + this.getPlatformName() +
                ", form=" + this.getForm() +
                ", formName=" + this.getFormName() +
                ", image=" + this.getImage() +
                ", imageUrl=" + this.getImageUrl() +
                ", status=" + this.getStatus() +
                ", statusName=" + this.getStatusName() +
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
