package com.kestrelcjx.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 栏目列表Vo
 */
public class ItemCateListVo {
    /**
     * 栏目ID
     */
    private Integer id;
    /**
     * 栏目名称
     */
    private String name;
    /**
     * 父级ID
     */
    private Integer pid;
    /**
     * 站点ID
     */
    private Integer itemId;
    /**
     * 站点名称
     */
    private String itemName;
    /**
     * 拼音(全)
     */
    private String pinyin;
    /**
     * 拼音(简)
     */
    private String code;
    /**
     * 有无封面：1=有，2=无
     */
    private Integer isCover;
    /**
     * 有无封面描述
     */
    private String isCoverName;
    /**
     * 封面
     */
    private String cover;
    /**
     * 封面
     */
    private String coverUrl;
    /**
     * 状态：1=启用，2=停用
     */
    private Integer status;
    /**
     * 状态描述
     */
    private String statusName;
    /**
     * 备注
     */
    private String note;
    /**
     * 排序
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

    public ItemCateListVo() {
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getPid() {
        return this.pid;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public String getItemName() {
        return this.itemName;
    }

    public String getPinyin() {
        return this.pinyin;
    }

    public String getCode() {
        return this.code;
    }

    public Integer getIsCover() {
        return this.isCover;
    }

    public String getIsCoverName() {
        return this.isCoverName;
    }

    public String getCover() {
        return this.cover;
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getStatusName() {
        return this.statusName;
    }

    public String getNote() {
        return this.note;
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

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setIsCover(Integer isCover) {
        this.isCover = isCover;
    }

    public void setIsCoverName(String isCoverName) {
        this.isCoverName = isCoverName;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public void setNote(String note) {
        this.note = note;
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
        if (!(o instanceof ItemCateListVo)) return false;
        final ItemCateListVo other = (ItemCateListVo) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() == null ? other.getId() != null : !this.getId().equals(other.getId())) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getPid() == null ? other.getPid() != null : !this.getPid().equals(other.getPid())) return false;
        if (this.getItemId() == null ? other.getItemId() != null : !this.getItemId().equals(other.getItemId()))
            return false;
        if (this.getItemName() == null ? other.getItemName() != null :
                !this.getItemName().equals(other.getItemName())) return false;
        if (this.getPinyin() == null ? other.getPinyin() != null : !this.getPinyin().equals(other.getPinyin()))
            return false;
        if (this.getCode() == null ? other.getCode() != null : !this.getCode().equals(other.getCode())) return false;
        if (this.getIsCover() == null ? other.getIsCover() != null : !this.getIsCover().equals(other.getIsCover()))
            return false;
        if (this.getIsCoverName() == null ? other.getIsCoverName() != null :
                !this.getIsCoverName().equals(other.getIsCoverName()))
            return false;
        if (this.getCover() == null ? other.getCover() != null : !this.getCover().equals(other.getCover()))
            return false;
        if (this.getCoverUrl() == null ? other.getCoverUrl() != null :
                !this.getCoverUrl().equals(other.getCoverUrl())) return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getStatusName() == null ? other.getStatusName() != null :
                !this.getStatusName().equals(other.getStatusName()))
            return false;
        if (this.getNote() == null ? other.getNote() != null : !this.getNote().equals(other.getNote())) return false;
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
        return other instanceof ItemCateListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getId() == null ? 43 : this.getId().hashCode());
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getPid() == null ? 43 : this.getPid().hashCode());
        result = result * PRIME + (this.getItemId() == null ? 43 : this.getItemId().hashCode());
        result = result * PRIME + (this.getItemName() == null ? 43 : this.getItemName().hashCode());
        result = result * PRIME + (this.getPinyin() == null ? 43 : this.getPinyin().hashCode());
        result = result * PRIME + (this.getCode() == null ? 43 : this.getCode().hashCode());
        result = result * PRIME + (this.getIsCover() == null ? 43 : this.getIsCover().hashCode());
        result = result * PRIME + (this.getIsCoverName() == null ? 43 : this.getIsCoverName().hashCode());
        result = result * PRIME + (this.getCover() == null ? 43 : this.getCover().hashCode());
        result = result * PRIME + (this.getCoverUrl() == null ? 43 : this.getCoverUrl().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getStatusName() == null ? 43 : this.getStatusName().hashCode());
        result = result * PRIME + (this.getNote() == null ? 43 : this.getNote().hashCode());
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
        return "ItemCateListVo(" +
                "id=" + this.getId() +
                ", name=" + this.getName() +
                ", pid=" + this.getPid() +
                ", itemId=" + this.getItemId() +
                ", itemName=" + this.getItemName() +
                ", pinyin=" + this.getPinyin() +
                ", code=" + this.getCode() +
                ", isCover=" + this.getIsCover() +
                ", isCoverName=" + this.getIsCoverName() +
                ", cover=" + this.getCover() +
                ", coverUrl=" + this.getCoverUrl() +
                ", status=" + this.getStatus() +
                ", statusName=" + this.getStatusName() +
                ", note=" + this.getNote() +
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
