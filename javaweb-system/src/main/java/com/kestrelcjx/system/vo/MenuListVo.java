package com.kestrelcjx.system.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * 菜单列表Vo
 */
public class MenuListVo {
    /**
     * 菜单ID
     */
    private Integer id;
    /**
     * 菜单名称
     */
    private String name;
    /**
     * 图标
     */
    private String icon;
    /**
     * URL地址
     */
    private String url;
    /**
     * 参数
     */
    private String param;
    /**
     * 上级ID
     */
    private Integer pid;
    /**
     * 类型：1=模块，2=导航，3=菜单，4=节点
     */
    private Integer type;
    /**
     * 类型描述
     */
    private String typeName;
    /**
     * 权限标识
     */
    private String permission;
    /**
     * 是否显示：1=显示，2=不显示
     */
    private Integer status;
    /**
     * 是否显示描述
     */
    private String statusName;
    /**
     * 是否公共：1=是，2=否
     */
    private Integer isPublic;
    /**
     * 是否公共描述
     */
    private String isPublicName;
    /**
     * 菜单备注
     */
    private String note;
    /**
     * 显示顺序
     */
    private Integer sort;
    /**
     * 创建人
     */
    private Integer createUser;
    /**
     * 创建人名称
     */
    private String createUserName;
    /**
     * 创建时间
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
    /**
     * 子级菜单
     */
    private List<MenuListVo> children;
    /**
     * 是否展开
     */
    private boolean open;

    public MenuListVo() {
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getUrl() {
        return this.url;
    }

    public String getParam() {
        return this.param;
    }

    public Integer getPid() {
        return this.pid;
    }

    public Integer getType() {
        return this.type;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public String getPermission() {
        return this.permission;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getStatusName() {
        return this.statusName;
    }

    public Integer getIsPublic() {
        return this.isPublic;
    }

    public String getIsPublicName() {
        return this.isPublicName;
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

    public List<MenuListVo> getChildren() {
        return this.children;
    }

    public boolean isOpen() {
        return this.open;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    public void setIsPublicName(String isPublicName) {
        this.isPublicName = isPublicName;
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

    public void setChildren(List<MenuListVo> children) {
        this.children = children;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MenuListVo)) return false;
        final MenuListVo other = (MenuListVo) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getId() == null ? other.getId() != null : !this.getId().equals(other.getId())) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getIcon() == null ? other.getIcon() != null : !this.getIcon().equals(other.getIcon())) return false;
        if (this.getUrl() == null ? other.getUrl() != null : !this.getUrl().equals(other.getUrl())) return false;
        if (this.getParam() == null ? other.getParam() != null : !this.getParam().equals(other.getParam()))
            return false;
        if (this.getPid() == null ? other.getPid() != null : !this.getPid().equals(other.getPid())) return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getTypeName() == null ? other.getTypeName() != null :
                !this.getTypeName().equals(other.getTypeName())) return false;
        if (this.getPermission() == null ? other.getPermission() != null :
                !this.getPermission().equals(other.getPermission()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getStatusName() == null ? other.getStatusName() != null :
                !this.getStatusName().equals(other.getStatusName()))
            return false;
        if (this.getIsPublic() == null ? other.getIsPublic() != null :
                !this.getIsPublic().equals(other.getIsPublic())) return false;
        if (this.getIsPublicName() == null ? other.getIsPublicName() != null :
                !this.getIsPublicName().equals(other.getIsPublicName()))
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
        if (this.getChildren() == null ? other.getChildren() != null :
                !this.getChildren().equals(other.getChildren())) return false;
        if (this.isOpen() != other.isOpen()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MenuListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + (this.getId() == null ? 43 : this.getId().hashCode());
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getIcon() == null ? 43 : this.getIcon().hashCode());
        result = result * PRIME + (this.getUrl() == null ? 43 : this.getUrl().hashCode());
        result = result * PRIME + (this.getParam() == null ? 43 : this.getParam().hashCode());
        result = result * PRIME + (this.getPid() == null ? 43 : this.getPid().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getTypeName() == null ? 43 : this.getTypeName().hashCode());
        result = result * PRIME + (this.getPermission() == null ? 43 : this.getPermission().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getStatusName() == null ? 43 : this.getStatusName().hashCode());
        result = result * PRIME + (this.getIsPublic() == null ? 43 : this.getIsPublic().hashCode());
        result = result * PRIME + (this.getIsPublicName() == null ? 43 : this.getIsPublicName().hashCode());
        result = result * PRIME + (this.getNote() == null ? 43 : this.getNote().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        result = result * PRIME + (this.getCreateUser() == null ? 43 : this.getCreateUser().hashCode());
        result = result * PRIME + (this.getCreateUserName() == null ? 43 : this.getCreateUserName().hashCode());
        result = result * PRIME + (this.getCreateTime() == null ? 43 : this.getCreateTime().hashCode());
        result = result * PRIME + (this.getUpdateUser() == null ? 43 : this.getUpdateUser().hashCode());
        result = result * PRIME + (this.getUpdateUserName() == null ? 43 : this.getUpdateUserName().hashCode());
        result = result * PRIME + (this.getUpdateTime() == null ? 43 : this.getUpdateTime().hashCode());
        result = result * PRIME + (this.getChildren() == null ? 43 : this.getChildren().hashCode());
        result = result * PRIME + (this.isOpen() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "MenuListVo(" +
                "id=" + this.getId() +
                ", name=" + this.getName() +
                ", icon=" + this.getIcon() +
                ", url=" + this.getUrl() +
                ", param=" + this.getParam() +
                ", pid=" + this.getPid() +
                ", type=" + this.getType() +
                ", typeName=" + this.getTypeName() +
                ", permission=" + this.getPermission() +
                ", status=" + this.getStatus() +
                ", statusName=" + this.getStatusName() +
                ", isPublic=" + this.getIsPublic() +
                ", isPublicName=" + this.getIsPublicName() +
                ", note=" + this.getNote() +
                ", sort=" + this.getSort() +
                ", createUser=" + this.getCreateUser() +
                ", createUserName=" + this.getCreateUserName() +
                ", createTime=" + this.getCreateTime() +
                ", updateUser=" + this.getUpdateUser() +
                ", updateUserName=" + this.getUpdateUserName() +
                ", updateTime=" + this.getUpdateTime() +
                ", children=" + this.getChildren() +
                ", open=" + this.isOpen() +
                ")";
    }
}
