package com.kestrelcjx.admin.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 运费模版查询条件
 */
public class FeightTemplateQuery extends BaseQuery {
    /**
     * 模板名称
     */
    private String name;
    /**
     * 计费类型：1按重量 2按件数
     */
    private Integer chargeType;

    public FeightTemplateQuery() {
    }

    public String getName() {
        return this.name;
    }

    public Integer getChargeType() {
        return this.chargeType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof FeightTemplateQuery)) return false;
        final FeightTemplateQuery other = (FeightTemplateQuery) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$chargeType = this.getChargeType();
        final Object other$chargeType = other.getChargeType();
        if (this$chargeType == null ? other$chargeType != null : !this$chargeType.equals(other$chargeType))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof FeightTemplateQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $chargeType = this.getChargeType();
        result = result * PRIME + ($chargeType == null ? 43 : $chargeType.hashCode());
        return result;
    }

    public String toString() {
        return "FeightTemplateQuery(name=" + this.getName() + ", chargeType=" + this.getChargeType() + ")";
    }
}
