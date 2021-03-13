package com.kestrelcjx.system.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 部门角色查询条件
 */
public class RoleDeptQuery extends BaseQuery {

    public RoleDeptQuery() {
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RoleDeptQuery)) return false;
        final RoleDeptQuery other = (RoleDeptQuery) o;
        if (!other.canEqual((Object) this)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RoleDeptQuery;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "RoleDeptQuery()";
    }
}
