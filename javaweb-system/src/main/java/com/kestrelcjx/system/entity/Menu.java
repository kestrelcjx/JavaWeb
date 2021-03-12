package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

import java.util.List;

/**
 * 菜单
 */
@TableName
public class Menu extends BaseEntity {
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
     * 权限标识
     */
    private String permission;
    /**
     * 是否显示：1=显示，2=不显示
     */
    private Integer status;
    /**
     * 是否公共：1=是，2=否
     */
    private Integer isPublic;
    /**
     * 菜单备注
     */
    private String note;
    /**
     * 显示顺序
     */
    private Integer sort;
    /**
     * 菜单节点
     */
    @TableField(exist = false)
    private String funcIds;
    /**
     * 子级菜单
     */
    @TableField(exist = false)
    private List<Menu> children;

    public Menu() {
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

    public String getPermission() {
        return this.permission;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getIsPublic() {
        return this.isPublic;
    }

    public String getNote() {
        return this.note;
    }

    public Integer getSort() {
        return this.sort;
    }

    public String getFuncIds() {
        return this.funcIds;
    }

    public List<Menu> getChildren() {
        return this.children;
    }

    public Menu setName(String name) {
        this.name = name;
        return this;
    }

    public Menu setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public Menu setUrl(String url) {
        this.url = url;
        return this;
    }

    public Menu setParam(String param) {
        this.param = param;
        return this;
    }

    public Menu setPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    public Menu setType(Integer type) {
        this.type = type;
        return this;
    }

    public Menu setPermission(String permission) {
        this.permission = permission;
        return this;
    }

    public Menu setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Menu setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    public Menu setNote(String note) {
        this.note = note;
        return this;
    }

    public Menu setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public Menu setFuncIds(String funcIds) {
        this.funcIds = funcIds;
        return this;
    }

    public Menu setChildren(List<Menu> children) {
        this.children = children;
        return this;
    }

    public String toString() {
        return "Menu(" +
                "name=" + this.getName() +
                ", icon=" + this.getIcon() +
                ", url=" + this.getUrl() +
                ", param=" + this.getParam() +
                ", pid=" + this.getPid() +
                ", type=" + this.getType() +
                ", permission=" + this.getPermission() +
                ", status=" + this.getStatus() +
                ", isPublic=" + this.getIsPublic() +
                ", note=" + this.getNote() +
                ", sort=" + this.getSort() +
                ", funcIds=" + this.getFuncIds() +
                ", children=" + this.getChildren() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Menu)) return false;
        final Menu other = (Menu) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getIcon() == null ? other.getIcon() != null : !this.getIcon().equals(other.getIcon())) return false;
        if (this.getUrl() == null ? other.getUrl() != null : !this.getUrl().equals(other.getUrl())) return false;
        if (this.getParam() == null ? other.getParam() != null : !this.getParam().equals(other.getParam()))
            return false;
        if (this.getPid() == null ? other.getPid() != null : !this.getPid().equals(other.getPid())) return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getPermission() == null ? other.getPermission() != null :
                !this.getPermission().equals(other.getPermission()))
            return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getIsPublic() == null ? other.getIsPublic() != null :
                !this.getIsPublic().equals(other.getIsPublic())) return false;
        if (this.getNote() == null ? other.getNote() != null : !this.getNote().equals(other.getNote())) return false;
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) return false;
        if (this.getFuncIds() == null ? other.getFuncIds() != null : !this.getFuncIds().equals(other.getFuncIds()))
            return false;
        if (this.getChildren() == null ? other.getChildren() != null :
                !this.getChildren().equals(other.getChildren())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Menu;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getIcon() == null ? 43 : this.getIcon().hashCode());
        result = result * PRIME + (this.getUrl() == null ? 43 : this.getUrl().hashCode());
        result = result * PRIME + (this.getParam() == null ? 43 : this.getParam().hashCode());
        result = result * PRIME + (this.getPid() == null ? 43 : this.getPid().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getPermission() == null ? 43 : this.getPermission().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getIsPublic() == null ? 43 : this.getIsPublic().hashCode());
        result = result * PRIME + (this.getNote() == null ? 43 : this.getNote().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        result = result * PRIME + (this.getFuncIds() == null ? 43 : this.getFuncIds().hashCode());
        result = result * PRIME + (this.getChildren() == null ? 43 : this.getChildren().hashCode());
        return result;
    }
}
