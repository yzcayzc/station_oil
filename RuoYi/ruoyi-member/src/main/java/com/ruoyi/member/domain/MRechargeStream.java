package com.ruoyi.member.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 充值流水对象 m_recharge_stream
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class MRechargeStream extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 充值流水id */
    private Long rechargeStreamId;

    /** 充值时间 */
    @Excel(name = "充值时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 加油站名称 */
    @Excel(name = "加油站名称")
    private String stationName;

    /** 充值金额 */
    @Excel(name = "充值金额")
    private Long rechargeAmount;

    /** 操作员 */
    @Excel(name = "操作员")
    private String operator;

    /** 余额 */
    @Excel(name = "余额")
    private Long recharge;

    /** 充值状态 */
    @Excel(name = "充值状态")
    private String status;

    public void setRechargeStreamId(Long rechargeStreamId) 
    {
        this.rechargeStreamId = rechargeStreamId;
    }

    public Long getRechargeStreamId() 
    {
        return rechargeStreamId;
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
    public void setRechargeAmount(Long rechargeAmount) 
    {
        this.rechargeAmount = rechargeAmount;
    }

    public Long getRechargeAmount() 
    {
        return rechargeAmount;
    }
    public void setOperator(String operator) 
    {
        this.operator = operator;
    }

    public String getOperator() 
    {
        return operator;
    }
    public void setRecharge(Long recharge) 
    {
        this.recharge = recharge;
    }

    public Long getRecharge() 
    {
        return recharge;
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
            .append("rechargeStreamId", getRechargeStreamId())
            .append("time", getTime())
            .append("stationName", getStationName())
            .append("rechargeAmount", getRechargeAmount())
            .append("operator", getOperator())
            .append("recharge", getRecharge())
            .append("status", getStatus())
            .toString();
    }
}
