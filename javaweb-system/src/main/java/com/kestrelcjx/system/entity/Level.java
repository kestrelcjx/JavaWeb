package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 职级
 */
@TableName("sys_level")
public class Level extends BaseEntity {
    /**
     * 职级名称
     */
    private String name;
    /**
     * 状态：1=正常，2=停用
     */
    private Integer status;
    /**
     * 显示顺序
     */
    private Integer sort;

    public Level() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Level setName(String name) {
        this.name = name;
        return this;
    }

    public Level setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Level setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String toString() {
        return "Level(" +
                "name=" + this.getName() +
                ", status=" + this.getStatus() +
                ", sort=" + this.getSort() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Level)) return false;
        final Level other = (Level) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus()))
            return false;
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Level;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getStatus() == null ? 43 : this.getStatus().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        return result;
    }
}
