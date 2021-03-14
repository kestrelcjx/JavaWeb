package com.kestrelcjx.admin.query;

import com.kestrelcjx.common.common.BaseQuery;

/**
 * 文章管理查询条件
 */
public class ArticleQuery extends BaseQuery {
    /**
     * 文章标题
     */
    private String title;
    /**
     * 是否置顶：1已置顶 2未置顶
     */
    private Integer isTop;
    /**
     * 状态：1已审核 2待审核 3审核失败
     */
    private Integer status;

    public ArticleQuery() {
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getIsTop() {
        return this.isTop;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ArticleQuery)) return false;
        final ArticleQuery other = (ArticleQuery) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$isTop = this.getIsTop();
        final Object other$isTop = other.getIsTop();
        if (this$isTop == null ? other$isTop != null : !this$isTop.equals(other$isTop)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ArticleQuery;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $isTop = this.getIsTop();
        result = result * PRIME + ($isTop == null ? 43 : $isTop.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "ArticleQuery(title=" + this.getTitle() + ", isTop=" + this.getIsTop() + ", status=" + this.getStatus() + ")";
    }
}
