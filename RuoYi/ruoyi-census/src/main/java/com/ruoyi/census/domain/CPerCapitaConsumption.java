package com.ruoyi.census.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 人均消费统计对象 c_per_capita_consumption
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public class CPerCapitaConsumption extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 人均消费id */
    private Long perId;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 油站 */
    @Excel(name = "油站")
    private String stationName;

    /** 日期 */
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 充值总额 */
    @Excel(name = "充值总额")
    private Long rechargeAmount;

    /** 消费总额 */
    @Excel(name = "消费总额")
    private Long totalConsumption;

    /** 余额 */
    @Excel(name = "余额")
    private Long balance;

    /** 是否会员 */
    @Excel(name = "是否会员")
    private String memberUse;

    /** 交易时间 */
    @Excel(name = "交易时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date transactionTime;

    public void setPerId(Long perId) 
    {
        this.perId = perId;
    }

    public Long getPerId() 
    {
        return perId;
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
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setRechargeAmount(Long rechargeAmount) 
    {
        this.rechargeAmount = rechargeAmount;
    }

    public Long getRechargeAmount() 
    {
        return rechargeAmount;
    }
    public void setTotalConsumption(Long totalConsumption) 
    {
        this.totalConsumption = totalConsumption;
    }

    public Long getTotalConsumption() 
    {
        return totalConsumption;
    }
    public void setBalance(Long balance) 
    {
        this.balance = balance;
    }

    public Long getBalance() 
    {
        return balance;
    }
    public void setMemberUse(String memberUse) 
    {
        this.memberUse = memberUse;
    }

    public String getMemberUse() 
    {
        return memberUse;
    }
    public void setTransactionTime(Date transactionTime) 
    {
        this.transactionTime = transactionTime;
    }

    public Date getTransactionTime() 
    {
        return transactionTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("perId", getPerId())
            .append("number", getNumber())
            .append("stationName", getStationName())
            .append("time", getTime())
            .append("rechargeAmount", getRechargeAmount())
            .append("totalConsumption", getTotalConsumption())
            .append("balance", getBalance())
            .append("memberUse", getMemberUse())
            .append("transactionTime", getTransactionTime())
            .toString();
    }
}
