package com.ruoyi.member.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 商品兑换信息对象 m_commodity_exchange
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class MCommodityExchange extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品id */
    private Long commodityExchangeId;

    /** 商品编号 */
    @Excel(name = "商品编号")
    private Long commodityNumber;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String tradeName;

    /** 兑换时间 */
    @Excel(name = "兑换时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date exchangeTime;

    /** 兑换条件 */
    @Excel(name = "兑换条件")
    private String conditionT;

    /** 剩余积分 */
    @Excel(name = "剩余积分")
    private Long residualIntegral;

    /** 商品状态 */
    @Excel(name = "商品状态")
    private String status;

    public void setCommodityExchangeId(Long commodityExchangeId) 
    {
        this.commodityExchangeId = commodityExchangeId;
    }

    public Long getCommodityExchangeId() 
    {
        return commodityExchangeId;
    }
    public void setCommodityNumber(Long commodityNumber) 
    {
        this.commodityNumber = commodityNumber;
    }

    public Long getCommodityNumber() 
    {
        return commodityNumber;
    }
    public void setTradeName(String tradeName) 
    {
        this.tradeName = tradeName;
    }

    public String getTradeName() 
    {
        return tradeName;
    }
    public void setExchangeTime(Date exchangeTime) 
    {
        this.exchangeTime = exchangeTime;
    }

    public Date getExchangeTime() 
    {
        return exchangeTime;
    }
    public void setConditionT(String conditionT) 
    {
        this.conditionT = conditionT;
    }

    public String getConditionT() 
    {
        return conditionT;
    }
    public void setResidualIntegral(Long residualIntegral) 
    {
        this.residualIntegral = residualIntegral;
    }

    public Long getResidualIntegral() 
    {
        return residualIntegral;
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
            .append("commodityExchangeId", getCommodityExchangeId())
            .append("commodityNumber", getCommodityNumber())
            .append("tradeName", getTradeName())
            .append("exchangeTime", getExchangeTime())
            .append("conditionT", getConditionT())
            .append("residualIntegral", getResidualIntegral())
            .append("status", getStatus())
            .toString();
    }
}
