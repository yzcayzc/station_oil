package com.ruoyi.station.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 油枪设置对象 s_oil_gun
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class SOilGun extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 油枪id */
    private Long oilGunId;

    /** 加油站 */
    @Excel(name = "加油站")
    private String stationName;

    /** 油枪号 */
    @Excel(name = "油枪号")
    private Long gunId;

    /** 油品类别 */
    @Excel(name = "油品类别")
    private String oils;

    /** 油品号 */
    @Excel(name = "油品号")
    private String oilNumber;

    /** 状态（0开启，1关闭） */
    @Excel(name = "状态", readConverterExp = "0=开启，1关闭")
    private Integer status;

    /** 添加人 */
    @Excel(name = "添加人")
    private String addPeopre;

    public void setOilGunId(Long oilGunId) 
    {
        this.oilGunId = oilGunId;
    }

    public Long getOilGunId() 
    {
        return oilGunId;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setGunId(Long gunId) 
    {
        this.gunId = gunId;
    }

    public Long getGunId() 
    {
        return gunId;
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
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setAddPeopre(String addPeopre) 
    {
        this.addPeopre = addPeopre;
    }

    public String getAddPeopre() 
    {
        return addPeopre;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("oilGunId", getOilGunId())
            .append("stationName", getStationName())
            .append("gunId", getGunId())
            .append("oils", getOils())
            .append("oilNumber", getOilNumber())
            .append("status", getStatus())
            .append("addPeopre", getAddPeopre())
            .toString();
    }
}
