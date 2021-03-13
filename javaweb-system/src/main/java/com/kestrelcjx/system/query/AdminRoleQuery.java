package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 人员角色关系查询条件
 */
public class AdminRoleQuery extends BaseQuery {

    public AdminRoleQuery() {
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof AdminRoleQuery)) return false;
        final AdminRoleQuery other = (AdminRoleQuery) o;
        if (!other.canEqual((Object) this)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AdminRoleQuery;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "AdminRoleQuery()";
    }
}
