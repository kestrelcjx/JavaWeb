package com.kestrelcjx.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;

/**
 * 文章管理
 */
@TableName("cms_article")
public class Article extends BaseEntity {
    /**
     * 文章标题
     */
    private String title;
    /**
     * 首张图片编号
     */
    private String cover;
    /**
     * 站点ID
     */
    private Integer itemId;
    /**
     * 栏目ID
     */
    private Integer cateId;
    /**
     * 浏览次数
     */
    private Integer viewNum;
    /**
     * 是否置顶：1已置顶 2未置顶
     */
    private Integer isTop;
    /**
     * 文章导读
     */
    private String guide;
    /**
     * 图集
     */
    private String imgs;
    /**
     * 文章内容
     */
    private String content;
    /**
     * 状态：1已审核 2待审核 3审核失败
     */
    private Integer status;

    public Article() {
    }

    public String getTitle() {
        return this.title;
    }

    public String getCover() {
        return this.cover;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public Integer getCateId() {
        return this.cateId;
    }

    public Integer getViewNum() {
        return this.viewNum;
    }

    public Integer getIsTop() {
        return this.isTop;
    }

    public String getGuide() {
        return this.guide;
    }

    public String getImgs() {
        return this.imgs;
    }

    public String getContent() {
        return this.content;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Article setTitle(String title) {
        this.title = title;
        return this;
    }

    public Article setCover(String cover) {
        this.cover = cover;
        return this;
    }

    public Article setItemId(Integer itemId) {
        this.itemId = itemId;
        return this;
    }

    public Article setCateId(Integer cateId) {
        this.cateId = cateId;
        return this;
    }

    public Article setViewNum(Integer viewNum) {
        this.viewNum = viewNum;
        return this;
    }

    public Article setIsTop(Integer isTop) {
        this.isTop = isTop;
        return this;
    }

    public Article setGuide(String guide) {
        this.guide = guide;
        return this;
    }

    public Article setImgs(String imgs) {
        this.imgs = imgs;
        return this;
    }

    public Article setContent(String content) {
        this.content = content;
        return this;
    }

    public Article setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String toString() {
        return "Article(title=" + this.getTitle() + ", cover=" + this.getCover() + ", itemId=" + this.getItemId() + ", cateId=" + this.getCateId() + ", viewNum=" + this.getViewNum() + ", isTop=" + this.getIsTop() + ", guide=" + this.getGuide() + ", imgs=" + this.getImgs() + ", content=" + this.getContent() + ", status=" + this.getStatus() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Article)) return false;
        final Article other = (Article) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$cover = this.getCover();
        final Object other$cover = other.getCover();
        if (this$cover == null ? other$cover != null : !this$cover.equals(other$cover)) return false;
        final Object this$itemId = this.getItemId();
        final Object other$itemId = other.getItemId();
        if (this$itemId == null ? other$itemId != null : !this$itemId.equals(other$itemId)) return false;
        final Object this$cateId = this.getCateId();
        final Object other$cateId = other.getCateId();
        if (this$cateId == null ? other$cateId != null : !this$cateId.equals(other$cateId)) return false;
        final Object this$viewNum = this.getViewNum();
        final Object other$viewNum = other.getViewNum();
        if (this$viewNum == null ? other$viewNum != null : !this$viewNum.equals(other$viewNum)) return false;
        final Object this$isTop = this.getIsTop();
        final Object other$isTop = other.getIsTop();
        if (this$isTop == null ? other$isTop != null : !this$isTop.equals(other$isTop)) return false;
        final Object this$guide = this.getGuide();
        final Object other$guide = other.getGuide();
        if (this$guide == null ? other$guide != null : !this$guide.equals(other$guide)) return false;
        final Object this$imgs = this.getImgs();
        final Object other$imgs = other.getImgs();
        if (this$imgs == null ? other$imgs != null : !this$imgs.equals(other$imgs)) return false;
        final Object this$content = this.getContent();
        final Object other$content = other.getContent();
        if (this$content == null ? other$content != null : !this$content.equals(other$content)) return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Article;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $cover = this.getCover();
        result = result * PRIME + ($cover == null ? 43 : $cover.hashCode());
        final Object $itemId = this.getItemId();
        result = result * PRIME + ($itemId == null ? 43 : $itemId.hashCode());
        final Object $cateId = this.getCateId();
        result = result * PRIME + ($cateId == null ? 43 : $cateId.hashCode());
        final Object $viewNum = this.getViewNum();
        result = result * PRIME + ($viewNum == null ? 43 : $viewNum.hashCode());
        final Object $isTop = this.getIsTop();
        result = result * PRIME + ($isTop == null ? 43 : $isTop.hashCode());
        final Object $guide = this.getGuide();
        result = result * PRIME + ($guide == null ? 43 : $guide.hashCode());
        final Object $imgs = this.getImgs();
        result = result * PRIME + ($imgs == null ? 43 : $imgs.hashCode());
        final Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        return result;
    }
}