package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 角色菜单关系查询条件
 */
public class RoleMenuQuery extends BaseQuery {

    public RoleMenuQuery() {
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RoleMenuQuery)) return false;
        final RoleMenuQuery other = (RoleMenuQuery) o;
        if (!other.canEqual((Object) this)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RoleMenuQuery;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "RoleMenuQuery()";
    }
}
