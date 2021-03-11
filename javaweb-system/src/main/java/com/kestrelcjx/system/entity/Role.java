package com.kestrelcjx.system.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 系统角色
 */
@TableName("sys_role")
public class Role extends BaseEntity {
    /**
     * 角色名称
     */
    private String name;
    /**
     * 角色拥有的菜单ID，多个规则使用“,”隔开
     */
    private String rules;
    /**
     * 状态：1=正常，2=禁用
     */
    private String status;
    /**
     * 排序
     */
    private Integer sort;

    public String getName() {
        return name;
    }

    public Role setName(String name) {
        this.name = name;
        return this;
    }

    public String getRules() {
        return rules;
    }

    public Role setRules(String rules) {
        this.rules = rules;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public Role setStatus(String status) {
        this.status = status;
        return this;
    }

    public Integer getSort() {
        return sort;
    }

    public Role setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    @Override
    public String toString() {
        return "Role(" +
                "name='" + name + '\'' +
                ", rules='" + rules + '\'' +
                ", status='" + status + '\'' +
                ", sort=" + sort +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Role)) {
            return false;
        }
        Role other = (Role) o;
        if (!other.canEqual((Object) this)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        if (this.getName() == null ? other.getName() != null : !this.getName().equals(other.getName())) {
            return false;
        }
        if (this.getRules() == null ? other.getRules() != null : !this.getRules().equals(other.getRules())) {
            return false;
        }
        if (this.getStatus() == null ? other.getStatus() != null : !this.getStatus().equals(other.getStatus())) {
            return false;
        }
        if (this.getSort() == null ? other.getSort() != null : !this.getSort().equals(other.getSort())) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        result = (result * PRIME) + (this.getName() == null ? 43 : this.getName().hashCode());
        result = (result * PRIME) + (this.getRules() == null ? 43 : this.getRules().hashCode());
        result = (result * PRIME) + (this.getStatus() == null ? 43 : this.getSort().hashCode());
        result = (result * PRIME) + this.sort;
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Role;
    }
}
