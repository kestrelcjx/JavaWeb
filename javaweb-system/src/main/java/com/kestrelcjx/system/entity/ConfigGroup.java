package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 配置分组
 */
@TableName("sys_config_group")
public class ConfigGroup extends BaseEntity {
    /**
     * 分组名称
     */
    private String name;
    /**
     * 排序
     */
    private Integer sort;

    public ConfigGroup() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getSort() {
        return this.sort;
    }

    public ConfigGroup setName(String name) {
        this.name = name;
        return this;
    }

    public ConfigGroup setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public String toString() {
        return "ConfigGroup(" +
                "name=" + this.getName() +
                ", sort=" + this.getSort() +
                ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ConfigGroup)) return false;
        final ConfigGroup other = (ConfigGroup) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) return false;
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ConfigGroup;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = result * PRIME + (this.getName() == null ? 43 : this.getName().hashCode());
        result = result * PRIME + (this.getSort() == null ? 43 : this.getSort().hashCode());
        return result;
    }
}
