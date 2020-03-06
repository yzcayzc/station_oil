package com.ruoyi.activity.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 电子优惠券设置对象 electronic_coupons
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class ElectronicCoupons extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long couponsId;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 优惠券金额 */
    @Excel(name = "优惠券金额")
    private String couponsAmount;

    /** 对应充值金额 */
    @Excel(name = "对应充值金额")
    private Long rechargeAmount;

    /** 对应加油满金额 */
    @Excel(name = "对应加油满金额")
    private String fullAmount;

    /** 对应特殊活动 */
    @Excel(name = "对应特殊活动")
    private String specialActivity;

    public void setCouponsId(Long couponsId) 
    {
        this.couponsId = couponsId;
    }

    public Long getCouponsId() 
    {
        return couponsId;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setCouponsAmount(String couponsAmount) 
    {
        this.couponsAmount = couponsAmount;
    }

    public String getCouponsAmount() 
    {
        return couponsAmount;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("couponsId", getCouponsId())
            .append("number", getNumber())
            .append("couponsAmount", getCouponsAmount())
            .append("rechargeAmount", getRechargeAmount())
            .append("fullAmount", getFullAmount())
            .append("specialActivity", getSpecialActivity())
            .toString();
    }
}
