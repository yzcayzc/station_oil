package com.ruoyi.member.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 积分对象 m_integral
 * 
 * @author ruoyi
 * @date 2020-03-05
 */
public class MIntegral extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 积分id */
    private Long integral;

    /** 商品编号 */
    @Excel(name = "商品编号")
    private Long number;

    /** 活动时间 */
    @Excel(name = "活动时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date activityTime;

    /** 积分明细 */
    @Excel(name = "积分明细")
    private String integralDetails;

    /** 剩余积分 */
    @Excel(name = "剩余积分")
    private Long residualIntegral;

    /** 积分状态 */
    @Excel(name = "积分状态")
    private String integralState;

    public void setIntegral(Long integral) 
    {
        this.integral = integral;
    }

    public Long getIntegral() 
    {
        return integral;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setActivityTime(Date activityTime) 
    {
        this.activityTime = activityTime;
    }

    public Date getActivityTime() 
    {
        return activityTime;
    }
    public void setIntegralDetails(String integralDetails) 
    {
        this.integralDetails = integralDetails;
    }

    public String getIntegralDetails() 
    {
        return integralDetails;
    }
    public void setResidualIntegral(Long residualIntegral) 
    {
        this.residualIntegral = residualIntegral;
    }

    public Long getResidualIntegral() 
    {
        return residualIntegral;
    }
    public void setIntegralState(String integralState) 
    {
        this.integralState = integralState;
    }

    public String getIntegralState() 
    {
        return integralState;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("integral", getIntegral())
            .append("number", getNumber())
            .append("activityTime", getActivityTime())
            .append("integralDetails", getIntegralDetails())
            .append("residualIntegral", getResidualIntegral())
            .append("integralState", getIntegralState())
            .toString();
    }
}
