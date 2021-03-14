package com.kestrelcjx.admin.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 运费模版列表Vo
 */
public class FeightTemplateListVo {
    /**
     * 运费模版ID
     */
    private Integer id;
    /**
     * 模板名称
     */
    private String name;
    /**
     * 计费类型：1按重量 2按件数
     */
    private Integer chargeType;
    /**
     * 计费类型描述
     */
    private String chargeTypeName;
    /**
     * 首重kg
     */
    private BigDecimal firstWeight;
    /**
     * 首费（元）
     */
    private BigDecimal firstFee;
    /**
     * 后重量
     */
    private BigDecimal continueWeight;
    /**
     * 后费用
     */
    private BigDecimal continueFee;
    /**
     * 目的地（省、市）
     */
    private String dest;
    /**
     * 排序号
     */
    private Integer sort;
    /**
     * 所属店铺ID
     */
    private Integer storeId;
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

    public FeightTemplateListVo() {
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getChargeType() {
        return this.chargeType;
    }

    public String getChargeTypeName() {
        return this.chargeTypeName;
    }

    public BigDecimal getFirstWeight() {
        return this.firstWeight;
    }

    public BigDecimal getFirstFee() {
        return this.firstFee;
    }

    public BigDecimal getContinueWeight() {
        return this.continueWeight;
    }

    public BigDecimal getContinueFee() {
        return this.continueFee;
    }

    public String getDest() {
        return this.dest;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Integer getStoreId() {
        return this.storeId;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }

    public void setChargeTypeName(String chargeTypeName) {
        this.chargeTypeName = chargeTypeName;
    }

    public void setFirstWeight(BigDecimal firstWeight) {
        this.firstWeight = firstWeight;
    }

    public void setFirstFee(BigDecimal firstFee) {
        this.firstFee = firstFee;
    }

    public void setContinueWeight(BigDecimal continueWeight) {
        this.continueWeight = continueWeight;
    }

    public void setContinueFee(BigDecimal continueFee) {
        this.continueFee = continueFee;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
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
        if (!(o instanceof FeightTemplateListVo)) return false;
        final FeightTemplateListVo other = (FeightTemplateListVo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$chargeType = this.getChargeType();
        final Object other$chargeType = other.getChargeType();
        if (this$chargeType == null ? other$chargeType != null : !this$chargeType.equals(other$chargeType))
            return false;
        final Object this$chargeTypeName = this.getChargeTypeName();
        final Object other$chargeTypeName = other.getChargeTypeName();
        if (this$chargeTypeName == null ? other$chargeTypeName != null : !this$chargeTypeName.equals(other$chargeTypeName))
            return false;
        final Object this$firstWeight = this.getFirstWeight();
        final Object other$firstWeight = other.getFirstWeight();
        if (this$firstWeight == null ? other$firstWeight != null : !this$firstWeight.equals(other$firstWeight))
            return false;
        final Object this$firstFee = this.getFirstFee();
        final Object other$firstFee = other.getFirstFee();
        if (this$firstFee == null ? other$firstFee != null : !this$firstFee.equals(other$firstFee)) return false;
        final Object this$continueWeight = this.getContinueWeight();
        final Object other$continueWeight = other.getContinueWeight();
        if (this$continueWeight == null ? other$continueWeight != null : !this$continueWeight.equals(other$continueWeight))
            return false;
        final Object this$continueFee = this.getContinueFee();
        final Object other$continueFee = other.getContinueFee();
        if (this$continueFee == null ? other$continueFee != null : !this$continueFee.equals(other$continueFee))
            return false;
        final Object this$dest = this.getDest();
        final Object other$dest = other.getDest();
        if (this$dest == null ? other$dest != null : !this$dest.equals(other$dest)) return false;
        final Object this$sort = this.getSort();
        final Object other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !this$sort.equals(other$sort)) return false;
        final Object this$storeId = this.getStoreId();
        final Object other$storeId = other.getStoreId();
        if (this$storeId == null ? other$storeId != null : !this$storeId.equals(other$storeId)) return false;
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
        return other instanceof FeightTemplateListVo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $chargeType = this.getChargeType();
        result = result * PRIME + ($chargeType == null ? 43 : $chargeType.hashCode());
        final Object $chargeTypeName = this.getChargeTypeName();
        result = result * PRIME + ($chargeTypeName == null ? 43 : $chargeTypeName.hashCode());
        final Object $firstWeight = this.getFirstWeight();
        result = result * PRIME + ($firstWeight == null ? 43 : $firstWeight.hashCode());
        final Object $firstFee = this.getFirstFee();
        result = result * PRIME + ($firstFee == null ? 43 : $firstFee.hashCode());
        final Object $continueWeight = this.getContinueWeight();
        result = result * PRIME + ($continueWeight == null ? 43 : $continueWeight.hashCode());
        final Object $continueFee = this.getContinueFee();
        result = result * PRIME + ($continueFee == null ? 43 : $continueFee.hashCode());
        final Object $dest = this.getDest();
        result = result * PRIME + ($dest == null ? 43 : $dest.hashCode());
        final Object $sort = this.getSort();
        result = result * PRIME + ($sort == null ? 43 : $sort.hashCode());
        final Object $storeId = this.getStoreId();
        result = result * PRIME + ($storeId == null ? 43 : $storeId.hashCode());
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
        return "FeightTemplateListVo(id=" + this.getId() + ", name=" + this.getName() + ", chargeType=" + this.getChargeType() + ", chargeTypeName=" + this.getChargeTypeName() + ", firstWeight=" + this.getFirstWeight() + ", firstFee=" + this.getFirstFee() + ", continueWeight=" + this.getContinueWeight() + ", continueFee=" + this.getContinueFee() + ", dest=" + this.getDest() + ", sort=" + this.getSort() + ", storeId=" + this.getStoreId() + ", createUser=" + this.getCreateUser() + ", createUserName=" + this.getCreateUserName() + ", createTime=" + this.getCreateTime() + ", updateUser=" + this.getUpdateUser() + ", updateUserName=" + this.getUpdateUserName() + ", updateTime=" + this.getUpdateTime() + ")";
    }
}