package com.ruoyi.station.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 历史油价对象 s_old_oilprice
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class SOldOilprice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 历史油价id */
    private Long oldOilId;

    /** 加油站名 */
    @Excel(name = "加油站名")
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

    /** 查询日期 */
    @Excel(name = "查询日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date queryTime;

    public void setOldOilId(Long oldOilId) 
    {
        this.oldOilId = oldOilId;
    }

    public Long getOldOilId() 
    {
        return oldOilId;
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
    public void setQueryTime(Date queryTime) 
    {
        this.queryTime = queryTime;
    }

    public Date getQueryTime() 
    {
        return queryTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("oldOilId", getOldOilId())
            .append("name", getName())
            .append("oils", getOils())
            .append("oilNumber", getOilNumber())
            .append("price", getPrice())
            .append("queryTime", getQueryTime())
            .toString();
    }
}
