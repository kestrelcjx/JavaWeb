package com.kestrelcjx.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.kestrelcjx.common.common.BaseEntity;


/**
 * 店铺表
 */
@TableName("sms_store")
public class Store extends BaseEntity {
    /**
     * 店铺分类ID
     */
    private Integer storeCategoryId;
    /**
     * 店铺分类名称
     */
    private String storeCategoryName;
    /**
     * 店铺等级ID
     */
    private Integer storeGradeId;
    /**
     * 店铺等级名称
     */
    private String storeGradeName;
    /**
     * 店铺类型：1公司 2个人
     */
    private Integer storeType;
    /**
     * 店铺名称
     */
    private String storeName;
    /**
     * 店铺简介
     */
    private String storeIntro;
    /**
     * 店铺公司名称
     */
    private String storeCompanyName;
    /**
     * 公司所在地区(如 江苏 南京)
     */
    private String storeCompanyArea;
    /**
     * 店铺地址
     */
    private String storeAddress;
    /**
     * 邮政编码
     */
    private String storeZipcode;
    /**
     * 店铺LOGO
     */
    private String storeLogo;
    /**
     * 店铺Banner
     */
    private String storeBanner;
    /**
     * 店铺头像
     */
    private String storeAvatar;
    /**
     * 店铺SEO关键字
     */
    private String storeKeywords;
    /**
     * 店铺SEO描述
     */
    private String storeDescription;
    /**
     * 店铺QQ
     */
    private String storeQq;
    /**
     * 店铺WW
     */
    private String storeWw;
    /**
     * 商家电话
     */
    private String storePhone;
    /**
     * 主营商品
     */
    private String storeMainbusiness;
    /**
     * 是否推荐：1是 2否
     */
    private Integer storeRecommend;
    /**
     * 店铺当前主题
     */
    private String storeTheme;
    /**
     * 店铺信用
     */
    private Integer storeCredit;
    /**
     * 描述相符度分数
     */
    private Float storeDesccredit;
    /**
     * 服务态度分数
     */
    private Float storeServicecredit;
    /**
     * 发货速度分数
     */
    private Float storeDeliverycredit;
    /**
     * 店铺收藏数量
     */
    private Integer storeCollect;
    /**
     * 店铺销量
     */
    private Integer storeSales;
    /**
     * 售前客服
     */
    private String storePresales;
    /**
     * 售后客服
     */
    private String storeAftersales;
    /**
     * 营业时间
     */
    private String storeBusinessTime;
    /**
     * 店铺开通时间
     */
    private Integer storeStartTime;
    /**
     * 店铺关闭时间
     */
    private Integer storeEndTime;
    /**
     * 店铺状态：1正常 2审核中 2关闭
     */
    private Integer storeStatus;
    /**
     * 店铺排序
     */
    private Integer sort;
    /**
     * 商铺名称
     */
    private String merchantName;
    /**
     * 商家地址
     */
    private String merchantAddress;
    /**
     * 商铺电话
     */
    private String merchantTel;
    /**
     * 公交线路
     */
    private String merchantBus;
    /**
     * 是否平台店铺：1是 2否
     */
    private Integer isPlatform;
    /**
     * 申请状态：0信息已保存 10已提交申请 20资料审核成功 30资料审核失败 40缴费完成 50缴费审核失败 60审核通过开店
     */
    private Integer status;
    /**
     * 审核备注
     */
    private String note;

    public Store() {
    }

    public Integer getStoreCategoryId() {
        return this.storeCategoryId;
    }

    public String getStoreCategoryName() {
        return this.storeCategoryName;
    }

    public Integer getStoreGradeId() {
        return this.storeGradeId;
    }

    public String getStoreGradeName() {
        return this.storeGradeName;
    }

    public Integer getStoreType() {
        return this.storeType;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getStoreIntro() {
        return this.storeIntro;
    }

    public String getStoreCompanyName() {
        return this.storeCompanyName;
    }

    public String getStoreCompanyArea() {
        return this.storeCompanyArea;
    }

    public String getStoreAddress() {
        return this.storeAddress;
    }

    public String getStoreZipcode() {
        return this.storeZipcode;
    }

    public String getStoreLogo() {
        return this.storeLogo;
    }

    public String getStoreBanner() {
        return this.storeBanner;
    }

    public String getStoreAvatar() {
        return this.storeAvatar;
    }

    public String getStoreKeywords() {
        return this.storeKeywords;
    }

    public String getStoreDescription() {
        return this.storeDescription;
    }

    public String getStoreQq() {
        return this.storeQq;
    }

    public String getStoreWw() {
        return this.storeWw;
    }

    public String getStorePhone() {
        return this.storePhone;
    }

    public String getStoreMainbusiness() {
        return this.storeMainbusiness;
    }

    public Integer getStoreRecommend() {
        return this.storeRecommend;
    }

    public String getStoreTheme() {
        return this.storeTheme;
    }

    public Integer getStoreCredit() {
        return this.storeCredit;
    }

    public Float getStoreDesccredit() {
        return this.storeDesccredit;
    }

    public Float getStoreServicecredit() {
        return this.storeServicecredit;
    }

    public Float getStoreDeliverycredit() {
        return this.storeDeliverycredit;
    }

    public Integer getStoreCollect() {
        return this.storeCollect;
    }

    public Integer getStoreSales() {
        return this.storeSales;
    }

    public String getStorePresales() {
        return this.storePresales;
    }

    public String getStoreAftersales() {
        return this.storeAftersales;
    }

    public String getStoreBusinessTime() {
        return this.storeBusinessTime;
    }

    public Integer getStoreStartTime() {
        return this.storeStartTime;
    }

    public Integer getStoreEndTime() {
        return this.storeEndTime;
    }

    public Integer getStoreStatus() {
        return this.storeStatus;
    }

    public Integer getSort() {
        return this.sort;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getMerchantAddress() {
        return this.merchantAddress;
    }

    public String getMerchantTel() {
        return this.merchantTel;
    }

    public String getMerchantBus() {
        return this.merchantBus;
    }

    public Integer getIsPlatform() {
        return this.isPlatform;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getNote() {
        return this.note;
    }

    public Store setStoreCategoryId(Integer storeCategoryId) {
        this.storeCategoryId = storeCategoryId;
        return this;
    }

    public Store setStoreCategoryName(String storeCategoryName) {
        this.storeCategoryName = storeCategoryName;
        return this;
    }

    public Store setStoreGradeId(Integer storeGradeId) {
        this.storeGradeId = storeGradeId;
        return this;
    }

    public Store setStoreGradeName(String storeGradeName) {
        this.storeGradeName = storeGradeName;
        return this;
    }

    public Store setStoreType(Integer storeType) {
        this.storeType = storeType;
        return this;
    }

    public Store setStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    public Store setStoreIntro(String storeIntro) {
        this.storeIntro = storeIntro;
        return this;
    }

    public Store setStoreCompanyName(String storeCompanyName) {
        this.storeCompanyName = storeCompanyName;
        return this;
    }

    public Store setStoreCompanyArea(String storeCompanyArea) {
        this.storeCompanyArea = storeCompanyArea;
        return this;
    }

    public Store setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
        return this;
    }

    public Store setStoreZipcode(String storeZipcode) {
        this.storeZipcode = storeZipcode;
        return this;
    }

    public Store setStoreLogo(String storeLogo) {
        this.storeLogo = storeLogo;
        return this;
    }

    public Store setStoreBanner(String storeBanner) {
        this.storeBanner = storeBanner;
        return this;
    }

    public Store setStoreAvatar(String storeAvatar) {
        this.storeAvatar = storeAvatar;
        return this;
    }

    public Store setStoreKeywords(String storeKeywords) {
        this.storeKeywords = storeKeywords;
        return this;
    }

    public Store setStoreDescription(String storeDescription) {
        this.storeDescription = storeDescription;
        return this;
    }

    public Store setStoreQq(String storeQq) {
        this.storeQq = storeQq;
        return this;
    }

    public Store setStoreWw(String storeWw) {
        this.storeWw = storeWw;
        return this;
    }

    public Store setStorePhone(String storePhone) {
        this.storePhone = storePhone;
        return this;
    }

    public Store setStoreMainbusiness(String storeMainbusiness) {
        this.storeMainbusiness = storeMainbusiness;
        return this;
    }

    public Store setStoreRecommend(Integer storeRecommend) {
        this.storeRecommend = storeRecommend;
        return this;
    }

    public Store setStoreTheme(String storeTheme) {
        this.storeTheme = storeTheme;
        return this;
    }

    public Store setStoreCredit(Integer storeCredit) {
        this.storeCredit = storeCredit;
        return this;
    }

    public Store setStoreDesccredit(Float storeDesccredit) {
        this.storeDesccredit = storeDesccredit;
        return this;
    }

    public Store setStoreServicecredit(Float storeServicecredit) {
        this.storeServicecredit = storeServicecredit;
        return this;
    }

    public Store setStoreDeliverycredit(Float storeDeliverycredit) {
        this.storeDeliverycredit = storeDeliverycredit;
        return this;
    }

    public Store setStoreCollect(Integer storeCollect) {
        this.storeCollect = storeCollect;
        return this;
    }

    public Store setStoreSales(Integer storeSales) {
        this.storeSales = storeSales;
        return this;
    }

    public Store setStorePresales(String storePresales) {
        this.storePresales = storePresales;
        return this;
    }

    public Store setStoreAftersales(String storeAftersales) {
        this.storeAftersales = storeAftersales;
        return this;
    }

    public Store setStoreBusinessTime(String storeBusinessTime) {
        this.storeBusinessTime = storeBusinessTime;
        return this;
    }

    public Store setStoreStartTime(Integer storeStartTime) {
        this.storeStartTime = storeStartTime;
        return this;
    }

    public Store setStoreEndTime(Integer storeEndTime) {
        this.storeEndTime = storeEndTime;
        return this;
    }

    public Store setStoreStatus(Integer storeStatus) {
        this.storeStatus = storeStatus;
        return this;
    }

    public Store setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    public Store setMerchantName(String merchantName) {
        this.merchantName = merchantName;
        return this;
    }

    public Store setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress;
        return this;
    }

    public Store setMerchantTel(String merchantTel) {
        this.merchantTel = merchantTel;
        return this;
    }

    public Store setMerchantBus(String merchantBus) {
        this.merchantBus = merchantBus;
        return this;
    }

    public Store setIsPlatform(Integer isPlatform) {
        this.isPlatform = isPlatform;
        return this;
    }

    public Store setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Store setNote(String note) {
        this.note = note;
        return this;
    }

    public String toString() {
        return "Store(storeCategoryId=" + this.getStoreCategoryId() + ", storeCategoryName=" + this.getStoreCategoryName() + ", storeGradeId=" + this.getStoreGradeId() + ", storeGradeName=" + this.getStoreGradeName() + ", storeType=" + this.getStoreType() + ", storeName=" + this.getStoreName() + ", storeIntro=" + this.getStoreIntro() + ", storeCompanyName=" + this.getStoreCompanyName() + ", storeCompanyArea=" + this.getStoreCompanyArea() + ", storeAddress=" + this.getStoreAddress() + ", storeZipcode=" + this.getStoreZipcode() + ", storeLogo=" + this.getStoreLogo() + ", storeBanner=" + this.getStoreBanner() + ", storeAvatar=" + this.getStoreAvatar() + ", storeKeywords=" + this.getStoreKeywords() + ", storeDescription=" + this.getStoreDescription() + ", storeQq=" + this.getStoreQq() + ", storeWw=" + this.getStoreWw() + ", storePhone=" + this.getStorePhone() + ", storeMainbusiness=" + this.getStoreMainbusiness() + ", storeRecommend=" + this.getStoreRecommend() + ", storeTheme=" + this.getStoreTheme() + ", storeCredit=" + this.getStoreCredit() + ", storeDesccredit=" + this.getStoreDesccredit() + ", storeServicecredit=" + this.getStoreServicecredit() + ", storeDeliverycredit=" + this.getStoreDeliverycredit() + ", storeCollect=" + this.getStoreCollect() + ", storeSales=" + this.getStoreSales() + ", storePresales=" + this.getStorePresales() + ", storeAftersales=" + this.getStoreAftersales() + ", storeBusinessTime=" + this.getStoreBusinessTime() + ", storeStartTime=" + this.getStoreStartTime() + ", storeEndTime=" + this.getStoreEndTime() + ", storeStatus=" + this.getStoreStatus() + ", sort=" + this.getSort() + ", merchantName=" + this.getMerchantName() + ", merchantAddress=" + this.getMerchantAddress() + ", merchantTel=" + this.getMerchantTel() + ", merchantBus=" + this.getMerchantBus() + ", isPlatform=" + this.getIsPlatform() + ", status=" + this.getStatus() + ", note=" + this.getNote() + ")";
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Store)) return false;
        final Store other = (Store) o;
        if (!other.canEqual((Object) this)) return false;
        if (!super.equals(o)) return false;
        final Object this$storeCategoryId = this.getStoreCategoryId();
        final Object other$storeCategoryId = other.getStoreCategoryId();
        if (this$storeCategoryId == null ? other$storeCategoryId != null : !this$storeCategoryId.equals(other$storeCategoryId))
            return false;
        final Object this$storeCategoryName = this.getStoreCategoryName();
        final Object other$storeCategoryName = other.getStoreCategoryName();
        if (this$storeCategoryName == null ? other$storeCategoryName != null : !this$storeCategoryName.equals(other$storeCategoryName))
            return false;
        final Object this$storeGradeId = this.getStoreGradeId();
        final Object other$storeGradeId = other.getStoreGradeId();
        if (this$storeGradeId == null ? other$storeGradeId != null : !this$storeGradeId.equals(other$storeGradeId))
            return false;
        final Object this$storeGradeName = this.getStoreGradeName();
        final Object other$storeGradeName = other.getStoreGradeName();
        if (this$storeGradeName == null ? other$storeGradeName != null : !this$storeGradeName.equals(other$storeGradeName))
            return false;
        final Object this$storeType = this.getStoreType();
        final Object other$storeType = other.getStoreType();
        if (this$storeType == null ? other$storeType != null : !this$storeType.equals(other$storeType)) return false;
        final Object this$storeName = this.getStoreName();
        final Object other$storeName = other.getStoreName();
        if (this$storeName == null ? other$storeName != null : !this$storeName.equals(other$storeName)) return false;
        final Object this$storeIntro = this.getStoreIntro();
        final Object other$storeIntro = other.getStoreIntro();
        if (this$storeIntro == null ? other$storeIntro != null : !this$storeIntro.equals(other$storeIntro))
            return false;
        final Object this$storeCompanyName = this.getStoreCompanyName();
        final Object other$storeCompanyName = other.getStoreCompanyName();
        if (this$storeCompanyName == null ? other$storeCompanyName != null : !this$storeCompanyName.equals(other$storeCompanyName))
            return false;
        final Object this$storeCompanyArea = this.getStoreCompanyArea();
        final Object other$storeCompanyArea = other.getStoreCompanyArea();
        if (this$storeCompanyArea == null ? other$storeCompanyArea != null : !this$storeCompanyArea.equals(other$storeCompanyArea))
            return false;
        final Object this$storeAddress = this.getStoreAddress();
        final Object other$storeAddress = other.getStoreAddress();
        if (this$storeAddress == null ? other$storeAddress != null : !this$storeAddress.equals(other$storeAddress))
            return false;
        final Object this$storeZipcode = this.getStoreZipcode();
        final Object other$storeZipcode = other.getStoreZipcode();
        if (this$storeZipcode == null ? other$storeZipcode != null : !this$storeZipcode.equals(other$storeZipcode))
            return false;
        final Object this$storeLogo = this.getStoreLogo();
        final Object other$storeLogo = other.getStoreLogo();
        if (this$storeLogo == null ? other$storeLogo != null : !this$storeLogo.equals(other$storeLogo)) return false;
        final Object this$storeBanner = this.getStoreBanner();
        final Object other$storeBanner = other.getStoreBanner();
        if (this$storeBanner == null ? other$storeBanner != null : !this$storeBanner.equals(other$storeBanner))
            return false;
        final Object this$storeAvatar = this.getStoreAvatar();
        final Object other$storeAvatar = other.getStoreAvatar();
        if (this$storeAvatar == null ? other$storeAvatar != null : !this$storeAvatar.equals(other$storeAvatar))
            return false;
        final Object this$storeKeywords = this.getStoreKeywords();
        final Object other$storeKeywords = other.getStoreKeywords();
        if (this$storeKeywords == null ? other$storeKeywords != null : !this$storeKeywords.equals(other$storeKeywords))
            return false;
        final Object this$storeDescription = this.getStoreDescription();
        final Object other$storeDescription = other.getStoreDescription();
        if (this$storeDescription == null ? other$storeDescription != null : !this$storeDescription.equals(other$storeDescription))
            return false;
        final Object this$storeQq = this.getStoreQq();
        final Object other$storeQq = other.getStoreQq();
        if (this$storeQq == null ? other$storeQq != null : !this$storeQq.equals(other$storeQq)) return false;
        final Object this$storeWw = this.getStoreWw();
        final Object other$storeWw = other.getStoreWw();
        if (this$storeWw == null ? other$storeWw != null : !this$storeWw.equals(other$storeWw)) return false;
        final Object this$storePhone = this.getStorePhone();
        final Object other$storePhone = other.getStorePhone();
        if (this$storePhone == null ? other$storePhone != null : !this$storePhone.equals(other$storePhone))
            return false;
        final Object this$storeMainbusiness = this.getStoreMainbusiness();
        final Object other$storeMainbusiness = other.getStoreMainbusiness();
        if (this$storeMainbusiness == null ? other$storeMainbusiness != null : !this$storeMainbusiness.equals(other$storeMainbusiness))
            return false;
        final Object this$storeRecommend = this.getStoreRecommend();
        final Object other$storeRecommend = other.getStoreRecommend();
        if (this$storeRecommend == null ? other$storeRecommend != null : !this$storeRecommend.equals(other$storeRecommend))
            return false;
        final Object this$storeTheme = this.getStoreTheme();
        final Object other$storeTheme = other.getStoreTheme();
        if (this$storeTheme == null ? other$storeTheme != null : !this$storeTheme.equals(other$storeTheme))
            return false;
        final Object this$storeCredit = this.getStoreCredit();
        final Object other$storeCredit = other.getStoreCredit();
        if (this$storeCredit == null ? other$storeCredit != null : !this$storeCredit.equals(other$storeCredit))
            return false;
        final Object this$storeDesccredit = this.getStoreDesccredit();
        final Object other$storeDesccredit = other.getStoreDesccredit();
        if (this$storeDesccredit == null ? other$storeDesccredit != null : !this$storeDesccredit.equals(other$storeDesccredit))
            return false;
        final Object this$storeServicecredit = this.getStoreServicecredit();
        final Object other$storeServicecredit = other.getStoreServicecredit();
        if (this$storeServicecredit == null ? other$storeServicecredit != null : !this$storeServicecredit.equals(other$storeServicecredit))
            return false;
        final Object this$storeDeliverycredit = this.getStoreDeliverycredit();
        final Object other$storeDeliverycredit = other.getStoreDeliverycredit();
        if (this$storeDeliverycredit == null ? other$storeDeliverycredit != null : !this$storeDeliverycredit.equals(other$storeDeliverycredit))
            return false;
        final Object this$storeCollect = this.getStoreCollect();
        final Object other$storeCollect = other.getStoreCollect();
        if (this$storeCollect == null ? other$storeCollect != null : !this$storeCollect.equals(other$storeCollect))
            return false;
        final Object this$storeSales = this.getStoreSales();
        final Object other$storeSales = other.getStoreSales();
        if (this$storeSales == null ? other$storeSales != null : !this$storeSales.equals(other$storeSales))
            return false;
        final Object this$storePresales = this.getStorePresales();
        final Object other$storePresales = other.getStorePresales();
        if (this$storePresales == null ? other$storePresales != null : !this$storePresales.equals(other$storePresales))
            return false;
        final Object this$storeAftersales = this.getStoreAftersales();
        final Object other$storeAftersales = other.getStoreAftersales();
        if (this$storeAftersales == null ? other$storeAftersales != null : !this$storeAftersales.equals(other$storeAftersales))
            return false;
        final Object this$storeBusinessTime = this.getStoreBusinessTime();
        final Object other$storeBusinessTime = other.getStoreBusinessTime();
        if (this$storeBusinessTime == null ? other$storeBusinessTime != null : !this$storeBusinessTime.equals(other$storeBusinessTime))
            return false;
        final Object this$storeStartTime = this.getStoreStartTime();
        final Object other$storeStartTime = other.getStoreStartTime();
        if (this$storeStartTime == null ? other$storeStartTime != null : !this$storeStartTime.equals(other$storeStartTime))
            return false;
        final Object this$storeEndTime = this.getStoreEndTime();
        final Object other$storeEndTime = other.getStoreEndTime();
        if (this$storeEndTime == null ? other$storeEndTime != null : !this$storeEndTime.equals(other$storeEndTime))
            return false;
        final Object this$storeStatus = this.getStoreStatus();
        final Object other$storeStatus = other.getStoreStatus();
        if (this$storeStatus == null ? other$storeStatus != null : !this$storeStatus.equals(other$storeStatus))
            return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        final Object this$merchantName = this.getMerchantName();
        final Object other$merchantName = other.getMerchantName();
        if (this$merchantName == null ? other$merchantName != null : !this$merchantName.equals(other$merchantName))
            return false;
        final Object this$merchantAddress = this.getMerchantAddress();
        final Object other$merchantAddress = other.getMerchantAddress();
        if (this$merchantAddress == null ? other$merchantAddress != null : !this$merchantAddress.equals(other$merchantAddress))
            return false;
        final Object this$merchantTel = this.getMerchantTel();
        final Object other$merchantTel = other.getMerchantTel();
        if (this$merchantTel == null ? other$merchantTel != null : !this$merchantTel.equals(other$merchantTel))
            return false;
        final Object this$merchantBus = this.getMerchantBus();
        final Object other$merchantBus = other.getMerchantBus();
        if (this$merchantBus == null ? other$merchantBus != null : !this$merchantBus.equals(other$merchantBus))
            return false;
        final Object this$isPlatform = this.getIsPlatform();
        final Object other$isPlatform = other.getIsPlatform();
        if (this$isPlatform == null ? other$isPlatform != null : !this$isPlatform.equals(other$isPlatform))
            return false;
        final Object this$status = this.getStatus();
        final Object other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) return false;
        final Object this$note = this.getNote();
        final Object other$note = other.getNote();
        if (this$note == null ? other$note != null : !this$note.equals(other$note)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Store;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        final Object $storeCategoryId = this.getStoreCategoryId();
        result = result * PRIME + ($storeCategoryId == null ? 43 : $storeCategoryId.hashCode());
        final Object $storeCategoryName = this.getStoreCategoryName();
        result = result * PRIME + ($storeCategoryName == null ? 43 : $storeCategoryName.hashCode());
        final Object $storeGradeId = this.getStoreGradeId();
        result = result * PRIME + ($storeGradeId == null ? 43 : $storeGradeId.hashCode());
        final Object $storeGradeName = this.getStoreGradeName();
        result = result * PRIME + ($storeGradeName == null ? 43 : $storeGradeName.hashCode());
        final Object $storeType = this.getStoreType();
        result = result * PRIME + ($storeType == null ? 43 : $storeType.hashCode());
        final Object $storeName = this.getStoreName();
        result = result * PRIME + ($storeName == null ? 43 : $storeName.hashCode());
        final Object $storeIntro = this.getStoreIntro();
        result = result * PRIME + ($storeIntro == null ? 43 : $storeIntro.hashCode());
        final Object $storeCompanyName = this.getStoreCompanyName();
        result = result * PRIME + ($storeCompanyName == null ? 43 : $storeCompanyName.hashCode());
        final Object $storeCompanyArea = this.getStoreCompanyArea();
        result = result * PRIME + ($storeCompanyArea == null ? 43 : $storeCompanyArea.hashCode());
        final Object $storeAddress = this.getStoreAddress();
        result = result * PRIME + ($storeAddress == null ? 43 : $storeAddress.hashCode());
        final Object $storeZipcode = this.getStoreZipcode();
        result = result * PRIME + ($storeZipcode == null ? 43 : $storeZipcode.hashCode());
        final Object $storeLogo = this.getStoreLogo();
        result = result * PRIME + ($storeLogo == null ? 43 : $storeLogo.hashCode());
        final Object $storeBanner = this.getStoreBanner();
        result = result * PRIME + ($storeBanner == null ? 43 : $storeBanner.hashCode());
        final Object $storeAvatar = this.getStoreAvatar();
        result = result * PRIME + ($storeAvatar == null ? 43 : $storeAvatar.hashCode());
        final Object $storeKeywords = this.getStoreKeywords();
        result = result * PRIME + ($storeKeywords == null ? 43 : $storeKeywords.hashCode());
        final Object $storeDescription = this.getStoreDescription();
        result = result * PRIME + ($storeDescription == null ? 43 : $storeDescription.hashCode());
        final Object $storeQq = this.getStoreQq();
        result = result * PRIME + ($storeQq == null ? 43 : $storeQq.hashCode());
        final Object $storeWw = this.getStoreWw();
        result = result * PRIME + ($storeWw == null ? 43 : $storeWw.hashCode());
        final Object $storePhone = this.getStorePhone();
        result = result * PRIME + ($storePhone == null ? 43 : $storePhone.hashCode());
        final Object $storeMainbusiness = this.getStoreMainbusiness();
        result = result * PRIME + ($storeMainbusiness == null ? 43 : $storeMainbusiness.hashCode());
        final Object $storeRecommend = this.getStoreRecommend();
        result = result * PRIME + ($storeRecommend == null ? 43 : $storeRecommend.hashCode());
        final Object $storeTheme = this.getStoreTheme();
        result = result * PRIME + ($storeTheme == null ? 43 : $storeTheme.hashCode());
        final Object $storeCredit = this.getStoreCredit();
        result = result * PRIME + ($storeCredit == null ? 43 : $storeCredit.hashCode());
        final Object $storeDesccredit = this.getStoreDesccredit();
        result = result * PRIME + ($storeDesccredit == null ? 43 : $storeDesccredit.hashCode());
        final Object $storeServicecredit = this.getStoreServicecredit();
        result = result * PRIME + ($storeServicecredit == null ? 43 : $storeServicecredit.hashCode());
        final Object $storeDeliverycredit = this.getStoreDeliverycredit();
        result = result * PRIME + ($storeDeliverycredit == null ? 43 : $storeDeliverycredit.hashCode());
        final Object $storeCollect = this.getStoreCollect();
        result = result * PRIME + ($storeCollect == null ? 43 : $storeCollect.hashCode());
        final Object $storeSales = this.getStoreSales();
        result = result * PRIME + ($storeSales == null ? 43 : $storeSales.hashCode());
        final Object $storePresales = this.getStorePresales();
        result = result * PRIME + ($storePresales == null ? 43 : $storePresales.hashCode());
        final Object $storeAftersales = this.getStoreAftersales();
        result = result * PRIME + ($storeAftersales == null ? 43 : $storeAftersales.hashCode());
        final Object $storeBusinessTime = this.getStoreBusinessTime();
        result = result * PRIME + ($storeBusinessTime == null ? 43 : $storeBusinessTime.hashCode());
        final Object $storeStartTime = this.getStoreStartTime();
        result = result * PRIME + ($storeStartTime == null ? 43 : $storeStartTime.hashCode());
        final Object $storeEndTime = this.getStoreEndTime();
        result = result * PRIME + ($storeEndTime == null ? 43 : $storeEndTime.hashCode());
        final Object $storeStatus = this.getStoreStatus();
        result = result * PRIME + ($storeStatus == null ? 43 : $storeStatus.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        final Object $merchantName = this.getMerchantName();
        result = result * PRIME + ($merchantName == null ? 43 : $merchantName.hashCode());
        final Object $merchantAddress = this.getMerchantAddress();
        result = result * PRIME + ($merchantAddress == null ? 43 : $merchantAddress.hashCode());
        final Object $merchantTel = this.getMerchantTel();
        result = result * PRIME + ($merchantTel == null ? 43 : $merchantTel.hashCode());
        final Object $merchantBus = this.getMerchantBus();
        result = result * PRIME + ($merchantBus == null ? 43 : $merchantBus.hashCode());
        final Object $isPlatform = this.getIsPlatform();
        result = result * PRIME + ($isPlatform == null ? 43 : $isPlatform.hashCode());
        final Object $status = this.getStatus();
        result = result * PRIME + ($status == null ? 43 : $status.hashCode());
        final Object $note = this.getNote();
        result = result * PRIME + ($note == null ? 43 : $note.hashCode());
        return result;
    }
}