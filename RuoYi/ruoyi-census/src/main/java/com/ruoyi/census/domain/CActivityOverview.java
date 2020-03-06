package com.ruoyi.census.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 活动总览对象 c_activity_overview
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public class CActivityOverview extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long activity;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 加油站 */
    @Excel(name = "加油站")
    private String stationName;

    /** 活动主题 */
    @Excel(name = "活动主题")
    private String activityTheme;

    /** 日期 */
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 充值 */
    @Excel(name = "充值")
    private Long recharge;

    /** 消费 */
    @Excel(name = "消费")
    private Long consumption;

    /** 优惠抵抗 */
    @Excel(name = "优惠抵抗")
    private Long preferentialDeduction;

    /** 收益 */
    @Excel(name = "收益")
    private Long profit;

    /** 新增会员 */
    @Excel(name = "新增会员")
    private Long newMember;

    /** 积分净值 */
    @Excel(name = "积分净值")
    private Long integralNetValue;

    /** 电子优惠券发放 */
    @Excel(name = "电子优惠券发放")
    private Long eCouponIssuance;

    public void setActivity(Long activity) 
    {
        this.activity = activity;
    }

    public Long getActivity() 
    {
        return activity;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setActivityTheme(String activityTheme) 
    {
        this.activityTheme = activityTheme;
    }

    public String getActivityTheme() 
    {
        return activityTheme;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setRecharge(Long recharge) 
    {
        this.recharge = recharge;
    }

    public Long getRecharge() 
    {
        return recharge;
    }
    public void setConsumption(Long consumption) 
    {
        this.consumption = consumption;
    }

    public Long getConsumption() 
    {
        return consumption;
    }
    public void setPreferentialDeduction(Long preferentialDeduction) 
    {
        this.preferentialDeduction = preferentialDeduction;
    }

    public Long getPreferentialDeduction() 
    {
        return preferentialDeduction;
    }
    public void setProfit(Long profit) 
    {
        this.profit = profit;
    }

    public Long getProfit() 
    {
        return profit;
    }
    public void setNewMember(Long newMember) 
    {
        this.newMember = newMember;
    }

    public Long getNewMember() 
    {
        return newMember;
    }
    public void setIntegralNetValue(Long integralNetValue) 
    {
        this.integralNetValue = integralNetValue;
    }

    public Long getIntegralNetValue() 
    {
        return integralNetValue;
    }
    public void seteCouponIssuance(Long eCouponIssuance) 
    {
        this.eCouponIssuance = eCouponIssuance;
    }

    public Long geteCouponIssuance() 
    {
        return eCouponIssuance;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("activity", getActivity())
            .append("number", getNumber())
            .append("stationName", getStationName())
            .append("activityTheme", getActivityTheme())
            .append("time", getTime())
            .append("recharge", getRecharge())
            .append("consumption", getConsumption())
            .append("preferentialDeduction", getPreferentialDeduction())
            .append("profit", getProfit())
            .append("newMember", getNewMember())
            .append("integralNetValue", getIntegralNetValue())
            .append("eCouponIssuance", geteCouponIssuance())
            .toString();
    }
}
