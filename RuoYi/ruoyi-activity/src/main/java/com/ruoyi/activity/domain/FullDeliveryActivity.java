package com.ruoyi.activity.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 加油满送活动设置对象 full_delivery_activity
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class FullDeliveryActivity extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long activityId;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 身份 */
    @Excel(name = "身份")
    private String identity;

    /** 节假日 */
    @Excel(name = "节假日")
    private String festival;

    /** 礼物（0勾选，1不勾选） */
    @Excel(name = "礼物", readConverterExp = "0=勾选，1不勾选")
    private String gift;

    /** 赠送金额 */
    @Excel(name = "赠送金额")
    private String donationAmount;

    /** 电子优惠券（0勾选，1不勾选） */
    @Excel(name = "电子优惠券", readConverterExp = "0=勾选，1不勾选")
    private String electronicCoupons;

    public void setActivityId(Long activityId) 
    {
        this.activityId = activityId;
    }

    public Long getActivityId() 
    {
        return activityId;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setIdentity(String identity) 
    {
        this.identity = identity;
    }

    public String getIdentity() 
    {
        return identity;
    }
    public void setFestival(String festival) 
    {
        this.festival = festival;
    }

    public String getFestival() 
    {
        return festival;
    }
    public void setGift(String gift) 
    {
        this.gift = gift;
    }

    public String getGift() 
    {
        return gift;
    }
    public void setDonationAmount(String donationAmount) 
    {
        this.donationAmount = donationAmount;
    }

    public String getDonationAmount() 
    {
        return donationAmount;
    }
    public void setElectronicCoupons(String electronicCoupons) 
    {
        this.electronicCoupons = electronicCoupons;
    }

    public String getElectronicCoupons() 
    {
        return electronicCoupons;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("activityId", getActivityId())
            .append("number", getNumber())
            .append("identity", getIdentity())
            .append("festival", getFestival())
            .append("gift", getGift())
            .append("donationAmount", getDonationAmount())
            .append("electronicCoupons", getElectronicCoupons())
            .toString();
    }
}
