package com.ruoyi.member.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 消费流水对象 m_consumption_flow
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class MConsumptionFlow extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 消费流水id */
    private Long flowId;

    /** 消费时间 */
    @Excel(name = "消费时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 加油站名称 */
    @Excel(name = "加油站名称")
    private String stationName;

    /** 油枪 */
    @Excel(name = "油枪")
    private String oils;

    /** 油号 */
    @Excel(name = "油号")
    private String oilNumber;

    /** 操作员 */
    @Excel(name = "操作员")
    private String operator;

    /** 消费金额 */
    @Excel(name = "消费金额")
    private Long monetary;

    /** 余额 */
    @Excel(name = "余额")
    private Long balance;

    /** 消费状态 */
    @Excel(name = "消费状态")
    private String status;

    public void setFlowId(Long flowId) 
    {
        this.flowId = flowId;
    }

    public Long getFlowId() 
    {
        return flowId;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setOils(String oils) 
    {
        this.oils = oils;
    }

    public String getOils() 
    {
        return oils;
    }
    public void setOilNumber(String oilNumber) 
    {
        this.oilNumber = oilNumber;
    }

    public String getOilNumber() 
    {
        return oilNumber;
    }
    public void setOperator(String operator) 
    {
        this.operator = operator;
    }

    public String getOperator() 
    {
        return operator;
    }
    public void setMonetary(Long monetary) 
    {
        this.monetary = monetary;
    }

    public Long getMonetary() 
    {
        return monetary;
    }
    public void setBalance(Long balance) 
    {
        this.balance = balance;
    }

    public Long getBalance() 
    {
        return balance;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("flowId", getFlowId())
            .append("time", getTime())
            .append("stationName", getStationName())
            .append("oils", getOils())
            .append("oilNumber", getOilNumber())
            .append("operator", getOperator())
            .append("monetary", getMonetary())
            .append("balance", getBalance())
            .append("status", getStatus())
            .toString();
    }
}
