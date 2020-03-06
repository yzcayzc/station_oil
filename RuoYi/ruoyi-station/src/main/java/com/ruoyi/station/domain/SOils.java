package com.ruoyi.station.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 油品设置对象 s_oils
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class SOils extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long oilId;

    /** 编号 */
    @Excel(name = "编号")
    private Long number;

    /** 油品类别 */
    @Excel(name = "油品类别")
    private String oils;

    /** 油号 */
    @Excel(name = "油号")
    private String oilNumber;

    /** 状态（0开启，1关闭） */
    @Excel(name = "状态", readConverterExp = "0=开启，1关闭")
    private String status;

    /** 添加人 */
    @Excel(name = "添加人")
    private String addPeople;

    public void setOilId(Long oilId) 
    {
        this.oilId = oilId;
    }

    public Long getOilId() 
    {
        return oilId;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
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
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setAddPeople(String addPeople) 
    {
        this.addPeople = addPeople;
    }

    public String getAddPeople() 
    {
        return addPeople;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("oilId", getOilId())
            .append("number", getNumber())
            .append("oils", getOils())
            .append("oilNumber", getOilNumber())
            .append("status", getStatus())
            .append("addPeople", getAddPeople())
            .toString();
    }
}
