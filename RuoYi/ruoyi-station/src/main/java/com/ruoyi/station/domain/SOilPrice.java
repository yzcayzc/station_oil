package com.ruoyi.station.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 油价信息设置对象 s_oil_price
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class SOilPrice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 油价ID */
    private Long oilId;

    /** 加油站名称 */
    @Excel(name = "加油站名称")
    private String name;

    /** 油品 */
    @Excel(name = "油品")
    private String oils;

    /** 油号 */
    @Excel(name = "油号")
    private String oilNumber;

    /** 油价 */
    @Excel(name = "油价")
    private String price;

    /** 星期几 */
    @Excel(name = "星期几")
    private String week;

    /** 油价生效时间 */
    @Excel(name = "油价生效时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date oilStartTime;

    /** 油价结束时间 */
    @Excel(name = "油价结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date oilEndTime;

    public void setOilId(Long oilId) 
    {
        this.oilId = oilId;
    }

    public Long getOilId() 
    {
        return oilId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
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
    public void setPrice(String price) 
    {
        this.price = price;
    }

    public String getPrice() 
    {
        return price;
    }
    public void setWeek(String week) 
    {
        this.week = week;
    }

    public String getWeek() 
    {
        return week;
    }
    public void setOilStartTime(Date oilStartTime) 
    {
        this.oilStartTime = oilStartTime;
    }

    public Date getOilStartTime() 
    {
        return oilStartTime;
    }
    public void setOilEndTime(Date oilEndTime) 
    {
        this.oilEndTime = oilEndTime;
    }

    public Date getOilEndTime() 
    {
        return oilEndTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("oilId", getOilId())
            .append("name", getName())
            .append("oils", getOils())
            .append("oilNumber", getOilNumber())
            .append("price", getPrice())
            .append("week", getWeek())
            .append("oilStartTime", getOilStartTime())
            .append("oilEndTime", getOilEndTime())
            .toString();
    }
}
