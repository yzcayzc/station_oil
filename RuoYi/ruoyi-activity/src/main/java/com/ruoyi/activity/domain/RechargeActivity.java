package com.ruoyi.activity.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 充值活动设置对象 recharge_activity
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class RechargeActivity extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long activityId;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 充值金额（元） */
    @Excel(name = "充值金额", readConverterExp = "元=")
    private String rechargeAmount;

    /** 返利（元） */
    @Excel(name = "返利", readConverterExp = "元=")
    private String rebate;

    /** 礼物（0勾选，1不勾选） */
    @Excel(name = "礼物", readConverterExp = "0=勾选，1不勾选")
    private String gift;

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
    public void setRechargeAmount(String rechargeAmount) 
    {
        this.rechargeAmount = rechargeAmount;
    }

    public String getRechargeAmount() 
    {
        return rechargeAmount;
    }
    public void setRebate(String rebate) 
    {
        this.rebate = rebate;
    }

    public String getRebate() 
    {
        return rebate;
    }
    public void setGift(String gift) 
    {
        this.gift = gift;
    }

    public String getGift() 
    {
        return gift;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("activityId", getActivityId())
            .append("number", getNumber())
            .append("rechargeAmount", getRechargeAmount())
            .append("rebate", getRebate())
            .append("gift", getGift())
            .toString();
    }
}
