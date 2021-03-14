package com.kestrelcjx.admin.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 店铺表查询条件
 */
public class StoreQuery extends BaseQuery {
    /**
     * 店铺类型：1公司 2个人
     */
    private Integer storeType;
    /**
     * 是否推荐：1是 2否
     */
    private Integer storeRecommend;
    /**
     * 店铺状态：1正常 2审核中 2关闭
     */
    private Integer storeStatus;
    /**
     * 是否平台店铺：1是 2否
     */
    private Integer isPlatform;
    /**
     * 申请状态：0信息已保存 10已提交申请 20资料审核成功 30资料审核失败 40缴费完成 50缴费审核失败 60审核通过开店
     */
    private Integer status;

    public StoreQuery() {
    }

    public Integer getStoreType() {
        return this.storeType;
    }

    public Integer getStoreRecommend() {
        return this.storeRecommend;
    }

    public Integer getStoreStatus() {
        return this.storeStatus;
    }

    public Integer getIsPlatform() {
        return this.isPlatform;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
    }

    public void setStoreRecommend(Integer storeRecommend) {
        this.storeRecommend = storeRecommend;
    }

    public void setStoreStatus(Integer storeStatus) {
        this.storeStatus = storeStatus;
    }

    public void setIsPlatform(Integer isPlatform) {
        this.isPlatform = isPlatform;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof StoreQuery)) return false;
        final StoreQuery other = (StoreQuery) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$storeType = this.getStoreType();
        final Object other$storeType = other.getStoreType();
        if (this$storeType == null ? other$storeType != null : !this$storeType.equals(other$storeType)) return false;
        final Object this$storeRecommend = this.getStoreRecommend();
        final Object other$storeRecommend = other.getStoreRecommend();
        if (this$storeRecommend == null ? other$storeRecommend != null : !this$storeRecommend.equals(other$storeRecommend))
            return false;
        final Object this$storeStatus = this.getStoreStatus();
        final Object other$storeStatus = other.getStoreStatus();
        if (this$storeStatus == null ? other$storeStatus != null : !this$storeStatus.equals(other$storeStatus))
            return false;
        final Object this$isPlatform = this.getIsPlatform();
        final Object other$isPlatform = other.getIsPlatform();
        if (this$isPlatform == null ? other$isPlatform != null : !this$isPlatform.equals(other$isPlatform))
            return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof StoreQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $storeType = this.getStoreType();
        result = result * PRIME + ($storeType == null ? 43 : $storeType.hashCode());
        final Object $storeRecommend = this.getStoreRecommend();
        result = result * PRIME + ($storeRecommend == null ? 43 : $storeRecommend.hashCode());
        final Object $storeStatus = this.getStoreStatus();
        result = result * PRIME + ($storeStatus == null ? 43 : $storeStatus.hashCode());
        final Object $isPlatform = this.getIsPlatform();
        result = result * PRIME + ($isPlatform == null ? 43 : $isPlatform.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "StoreQuery(storeType=" + this.getStoreType() + ", storeRecommend=" + this.getStoreRecommend() + ", storeStatus=" + this.getStoreStatus() + ", isPlatform=" + this.getIsPlatform() + ", status=" + this.getStatus() + ")";
    }
}
