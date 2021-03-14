package com.kestrelcjx.admin.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 文章管理列表Vo
 */
public class ArticleListVo {
    /**
     * 文章管理ID
     */
    private Integer id;
    /**
     * 文章标题
     */
    private String title;
    /**
     * 首张图片编号
     */
    private String cover;
    /**
     * 首张图片编号
     */
    private String coverUrl;
    /**
     * 站点ID
     */
    private Integer itemId;
    /**
     * 栏目ID
     */
    private Integer cateId;
    /**
     * 栏目分类名称
     */
    private String cateName;
    /**
     * 浏览次数
     */
    private Integer viewNum;
    /**
     * 是否置顶：1已置顶 2未置顶
     */
    private Integer isTop;
    /**
     * 是否置顶描述
     */
    private String isTopName;
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
    /**
     * 状态描述
     */
    private String statusName;
    /**
     * 添加人
     */
    private Integer createUser;
    /**
     * 添加人名称
     */
    private String createUserName;
    /**
     * 添加时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 更新人
     */
    private Integer updateUser;
    /**
     * 更新人名称
     */
    private String updateUserName;
    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;

    public ArticleListVo() {
    }

    public Integer getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCover() {
        return this.cover;
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public Integer getCateId() {
        return this.cateId;
    }

    public String getCateName() {
        return this.cateName;
    }

    public Integer getViewNum() {
        return this.viewNum;
    }

    public Integer getIsTop() {
        return this.isTop;
    }

    public String getIsTopName() {
        return this.isTopName;
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

    public String getStatusName() {
        return this.statusName;
    }

    public Integer getCreateUser() {
        return this.createUser;
    }

    public String getCreateUserName() {
        return this.createUserName;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Integer getUpdateUser() {
        return this.updateUser;
    }

    public String getUpdateUserName() {
        return this.updateUserName;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName;
    }

    public void setViewNum(Integer viewNum) {
        this.viewNum = viewNum;
    }

    public void setIsTop(Integer isTop) {
        this.isTop = isTop;
    }

    public void setIsTopName(String isTopName) {
        this.isTopName = isTopName;
    }

    public void setGuide(String guide) {
        this.guide = guide;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ArticleListVo)) return false;
        final ArticleListVo other = (ArticleListVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
        final Object this$cover = this.getCover();
        final Object other$cover = other.getCover();
        if (this$cover == null ? other$cover != null : !this$cover.equals(other$cover)) return false;
        final Object this$coverUrl = this.getCoverUrl();
        final Object other$coverUrl = other.getCoverUrl();
        if (this$coverUrl == null ? other$coverUrl != null : !this$coverUrl.equals(other$coverUrl)) return false;
        final Object this$itemId = this.getItemId();
        final Object other$itemId = other.getItemId();
        if (this$itemId == null ? other$itemId != null : !this$itemId.equals(other$itemId)) return false;
        final Object this$cateId = this.getCateId();
        final Object other$cateId = other.getCateId();
        if (this$cateId == null ? other$cateId != null : !this$cateId.equals(other$cateId)) return false;
        final Object this$cateName = this.getCateName();
        final Object other$cateName = other.getCateName();
        if (this$cateName == null ? other$cateName != null : !this$cateName.equals(other$cateName)) return false;
        final Object this$viewNum = this.getViewNum();
        final Object other$viewNum = other.getViewNum();
        if (this$viewNum == null ? other$viewNum != null : !this$viewNum.equals(other$viewNum)) return false;
        final Object this$isTop = this.getIsTop();
        final Object other$isTop = other.getIsTop();
        if (this$isTop == null ? other$isTop != null : !this$isTop.equals(other$isTop)) return false;
        final Object this$isTopName = this.getIsTopName();
        final Object other$isTopName = other.getIsTopName();
        if (this$isTopName == null ? other$isTopName != null : !this$isTopName.equals(other$isTopName)) return false;
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
        final Object this$statusName = this.getStatusName();
        final Object other$statusName = other.getStatusName();
        if (this$statusName == null ? other$statusName != null : !this$statusName.equals(other$statusName))
            return false;
        final Object this$createUser = this.getCreateUser();
        final Object other$createUser = other.getCreateUser();
        if (this$createUser == null ? other$createUser != null : !this$createUser.equals(other$createUser))
            return false;
        final Object this$createUserName = this.getCreateUserName();
        final Object other$createUserName = other.getCreateUserName();
        if (this$createUserName == null ? other$createUserName != null : !this$createUserName.equals(other$createUserName))
            return false;
        final Object this$createTime = this.getCreateTime();
        final Object other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime))
            return false;
        final Object this$updateUser = this.getUpdateUser();
        final Object other$updateUser = other.getUpdateUser();
        if (this$updateUser == null ? other$updateUser != null : !this$updateUser.equals(other$updateUser))
            return false;
        final Object this$updateUserName = this.getUpdateUserName();
        final Object other$updateUserName = other.getUpdateUserName();
        if (this$updateUserName == null ? other$updateUserName != null : !this$updateUserName.equals(other$updateUserName))
            return false;
        final Object this$updateTime = this.getUpdateTime();
        final Object other$updateTime = other.getUpdateTime();
        if (this$updateTime == null ? other$updateTime != null : !this$updateTime.equals(other$updateTime))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ArticleListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $cover = this.getCover();
        result = result * PRIME + ($cover == null ? 43 : $cover.hashCode());
        final Object $coverUrl = this.getCoverUrl();
        result = result * PRIME + ($coverUrl == null ? 43 : $coverUrl.hashCode());
        final Object $itemId = this.getItemId();
        result = result * PRIME + ($itemId == null ? 43 : $itemId.hashCode());
        final Object $cateId = this.getCateId();
        result = result * PRIME + ($cateId == null ? 43 : $cateId.hashCode());
        final Object $cateName = this.getCateName();
        result = result * PRIME + ($cateName == null ? 43 : $cateName.hashCode());
        final Object $viewNum = this.getViewNum();
        result = result * PRIME + ($viewNum == null ? 43 : $viewNum.hashCode());
        final Object $isTop = this.getIsTop();
        result = result * PRIME + ($isTop == null ? 43 : $isTop.hashCode());
        final Object $isTopName = this.getIsTopName();
        result = result * PRIME + ($isTopName == null ? 43 : $isTopName.hashCode());
        final Object $guide = this.getGuide();
        result = result * PRIME + ($guide == null ? 43 : $guide.hashCode());
        final Object $imgs = this.getImgs();
        result = result * PRIME + ($imgs == null ? 43 : $imgs.hashCode());
        final Object $content = this.getContent();
        result = result * PRIME + ($content == null ? 43 : $content.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $statusName = this.getStatusName();
        result = result * PRIME + ($statusName == null ? 43 : $statusName.hashCode());
        final Object $createUser = this.getCreateUser();
        result = result * PRIME + ($createUser == null ? 43 : $createUser.hashCode());
        final Object $createUserName = this.getCreateUserName();
        result = result * PRIME + ($createUserName == null ? 43 : $createUserName.hashCode());
        final Object $createTime = this.getCreateTime();
        result = result * PRIME + ($createTime == null ? 43 : $createTime.hashCode());
        final Object $updateUser = this.getUpdateUser();
        result = result * PRIME + ($updateUser == null ? 43 : $updateUser.hashCode());
        final Object $updateUserName = this.getUpdateUserName();
        result = result * PRIME + ($updateUserName == null ? 43 : $updateUserName.hashCode());
        final Object $updateTime = this.getUpdateTime();
        result = result * PRIME + ($updateTime == null ? 43 : $updateTime.hashCode());
        return result;
    }

    public String toString() {
        return "ArticleListVo(id=" + this.getId() + ", title=" + this.getTitle() + ", cover=" + this.getCover() + ", coverUrl=" + this.getCoverUrl() + ", itemId=" + this.getItemId() + ", cateId=" + this.getCateId() + ", cateName=" + this.getCateName() + ", viewNum=" + this.getViewNum() + ", isTop=" + this.getIsTop() + ", isTopName=" + this.getIsTopName() + ", guide=" + this.getGuide() + ", imgs=" + this.getImgs() + ", content=" + this.getContent() + ", status=" + this.getStatus() + ", statusName=" + this.getStatusName() + ", createUser=" + this.getCreateUser() + ", createUserName=" + this.getCreateUserName() + ", createTime=" + this.getCreateTime() + ", updateUser=" + this.getUpdateUser() + ", updateUserName=" + this.getUpdateUserName() + ", updateTime=" + this.getUpdateTime() + ")";
    }
}