package com.ruoyi.shop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 兑换订单对象 i_exchange_order
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class IExchangeOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 兑换订单 */
    private Long exchangeOrderId;

    /** 加油站 */
    @Excel(name = "加油站")
    private String stationName;

    /** 兑换人 */
    @Excel(name = "兑换人")
    private String changer;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String phone;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String tradeName;

    /** 兑换数量 */
    @Excel(name = "兑换数量")
    private String exchangeNumber;

    /** 兑换规则 */
    @Excel(name = "兑换规则")
    private String exchangeRule;

    /** 兑换截止时间 */
    @Excel(name = "兑换截止时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 商品状态 */
    @Excel(name = "商品状态")
    private String status;

    public void setExchangeOrderId(Long exchangeOrderId) 
    {
        this.exchangeOrderId = exchangeOrderId;
    }

    public Long getExchangeOrderId() 
    {
        return exchangeOrderId;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setChanger(String changer) 
    {
        this.changer = changer;
    }

    public String getChanger() 
    {
        return changer;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setTradeName(String tradeName) 
    {
        this.tradeName = tradeName;
    }

    public String getTradeName() 
    {
        return tradeName;
    }
    public void setExchangeNumber(String exchangeNumber) 
    {
        this.exchangeNumber = exchangeNumber;
    }

    public String getExchangeNumber() 
    {
        return exchangeNumber;
    }
    public void setExchangeRule(String exchangeRule) 
    {
        this.exchangeRule = exchangeRule;
    }

    public String getExchangeRule() 
    {
        return exchangeRule;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
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
            .append("exchangeOrderId", getExchangeOrderId())
            .append("stationName", getStationName())
            .append("changer", getChanger())
            .append("phone", getPhone())
            .append("tradeName", getTradeName())
            .append("exchangeNumber", getExchangeNumber())
            .append("exchangeRule", getExchangeRule())
            .append("endTime", getEndTime())
            .append("status", getStatus())
            .toString();
    }
}
