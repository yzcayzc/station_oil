package com.ruoyi.activity.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 礼物设置对象 gift_settings
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class GiftSettings extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long giftId;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 礼物名称 */
    @Excel(name = "礼物名称")
    private String giftName;

    /** 礼物价值 */
    @Excel(name = "礼物价值")
    private String giftValue;

    /** 对应充值金额 */
    @Excel(name = "对应充值金额")
    private Long rechargeAmount;

    /** 对应加油满金额 */
    @Excel(name = "对应加油满金额")
    private String fullAmount;

    /** 对应特殊活动 */
    @Excel(name = "对应特殊活动")
    private String specialActivity;

    /** 礼物简介 */
    @Excel(name = "礼物简介")
    private String giftBrief;

    public void setGiftId(Long giftId) 
    {
        this.giftId = giftId;
    }

    public Long getGiftId() 
    {
        return giftId;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setGiftName(String giftName) 
    {
        this.giftName = giftName;
    }

    public String getGiftName() 
    {
        return giftName;
    }
    public void setGiftValue(String giftValue) 
    {
        this.giftValue = giftValue;
    }

    public String getGiftValue() 
    {
        return giftValue;
    }
    public void setRechargeAmount(Long rechargeAmount) 
    {
        this.rechargeAmount = rechargeAmount;
    }

    public Long getRechargeAmount() 
    {
        return rechargeAmount;
    }
    public void setFullAmount(String fullAmount) 
    {
        this.fullAmount = fullAmount;
    }

    public String getFullAmount() 
    {
        return fullAmount;
    }
    public void setSpecialActivity(String specialActivity) 
    {
        this.specialActivity = specialActivity;
    }

    public String getSpecialActivity() 
    {
        return specialActivity;
    }
    public void setGiftBrief(String giftBrief) 
    {
        this.giftBrief = giftBrief;
    }

    public String getGiftBrief() 
    {
        return giftBrief;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("giftId", getGiftId())
            .append("number", getNumber())
            .append("giftName", getGiftName())
            .append("giftValue", getGiftValue())
            .append("rechargeAmount", getRechargeAmount())
            .append("fullAmount", getFullAmount())
            .append("specialActivity", getSpecialActivity())
            .append("giftBrief", getGiftBrief())
            .toString();
    }
}
