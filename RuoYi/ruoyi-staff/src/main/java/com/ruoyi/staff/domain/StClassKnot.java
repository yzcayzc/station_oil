package com.ruoyi.staff.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 班结对象 st_class_knot
 * 
 * @author ruoyi
 * @date 2020-03-05
 */
public class StClassKnot extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 班结id */
    private Long classKnotId;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 员工 */
    @Excel(name = "员工")
    private String stationName;

    /** 登录名 */
    @Excel(name = "登录名")
    private String loginName;

    /** 上班时间 */
    @Excel(name = "上班时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date workShift;

    /** 下班时间 */
    @Excel(name = "下班时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date closingTime;

    /** 收入 */
    @Excel(name = "收入")
    private Long income;

    /** 交易笔数 */
    @Excel(name = "交易笔数")
    private Long transactionNumber;

    /** 应收金额 */
    @Excel(name = "应收金额")
    private Long amountReceivable;

    /** 优惠金额 */
    @Excel(name = "优惠金额")
    private Long preferentialAmount;

    /** 现金金额 */
    @Excel(name = "现金金额")
    private Long cashAmount;

    public void setClassKnotId(Long classKnotId) 
    {
        this.classKnotId = classKnotId;
    }

    public Long getClassKnotId() 
    {
        return classKnotId;
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
    public void setLoginName(String loginName) 
    {
        this.loginName = loginName;
    }

    public String getLoginName() 
    {
        return loginName;
    }
    public void setWorkShift(Date workShift) 
    {
        this.workShift = workShift;
    }

    public Date getWorkShift() 
    {
        return workShift;
    }
    public void setClosingTime(Date closingTime) 
    {
        this.closingTime = closingTime;
    }

    public Date getClosingTime() 
    {
        return closingTime;
    }
    public void setIncome(Long income) 
    {
        this.income = income;
    }

    public Long getIncome() 
    {
        return income;
    }
    public void setTransactionNumber(Long transactionNumber) 
    {
        this.transactionNumber = transactionNumber;
    }

    public Long getTransactionNumber() 
    {
        return transactionNumber;
    }
    public void setAmountReceivable(Long amountReceivable) 
    {
        this.amountReceivable = amountReceivable;
    }

    public Long getAmountReceivable() 
    {
        return amountReceivable;
    }
    public void setPreferentialAmount(Long preferentialAmount) 
    {
        this.preferentialAmount = preferentialAmount;
    }

    public Long getPreferentialAmount() 
    {
        return preferentialAmount;
    }
    public void setCashAmount(Long cashAmount) 
    {
        this.cashAmount = cashAmount;
    }

    public Long getCashAmount() 
    {
        return cashAmount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("classKnotId", getClassKnotId())
            .append("number", getNumber())
            .append("stationName", getStationName())
            .append("loginName", getLoginName())
            .append("workShift", getWorkShift())
            .append("closingTime", getClosingTime())
            .append("income", getIncome())
            .append("transactionNumber", getTransactionNumber())
            .append("amountReceivable", getAmountReceivable())
            .append("preferentialAmount", getPreferentialAmount())
            .append("cashAmount", getCashAmount())
            .toString();
    }
}
