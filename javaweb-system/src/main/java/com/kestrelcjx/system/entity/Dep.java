package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 部门
 */
@TableName("sys_dep")
public class Dep extends BaseEntity {
    /**
     * 部门名称
     */
    private String name;
    /**
     * 上级ID
     */
    private String pid;
    /**
     * 类型：1=公司，2=部门
     */
    private Integer type;
    /**
     * 是否有子级：1=是，2=否
     */
    private Integer hasChild;
    /**
     * 排序
     */
    private Integer sort;

    public Dep() {
    }

    public String getName() {
        return this.name;
    }

    public String getPid() {
        return this.pid;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getHasChild() {
        return this.hasChild;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Dep setName(String name) {
        this.name = name;
        return this;
    }

    public Dep setPid(String pid) {
        this.pid = pid;
        return this;
    }

    public Dep setType(Integer type) {
        this.type = type;
        return this;
    }

    public Dep setHasChild(Integer hasChild) {
        this.hasChild = hasChild;
        return this;
    }

    public Dep setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String toString() {
        return "Dep(" +
                "name=" + this.getName() +
                ", pid=" + this.getPid() +
                ", type=" + this.getType() +
                ", hasChild=" + this.getHasChild() +
                ", sort=" + this.getSort() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Dep)) return false;
        final Dep other = (Dep) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getPid() == null ? other.getPid() != null : !this.getPid().equals(other.getPid())) return false;
        if (this.getType() == null ? other.getType() != null : !this.getType().equals(other.getType())) return false;
        if (this.getHasChild() == null ? other.getHasChild() != null :
                !this.getHasChild().equals(other.getHasChild())) return false;
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Dep;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getPid() == null ? 43 : this.getPid().hashCode());
        result = result * PRIME + (this.getType() == null ? 43 : this.getType().hashCode());
        result = result * PRIME + (this.getHasChild() == null ? 43 : this.getHasChild().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        return result;
    }
}
