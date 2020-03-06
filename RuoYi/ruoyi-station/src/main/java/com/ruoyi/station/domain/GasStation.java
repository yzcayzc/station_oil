package com.ruoyi.station.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 油站列表对象 gas_station
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class GasStation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long stationId;

    /** 油站名称 */
    @Excel(name = "油站名称")
    private String name;

    /** 油站简称 */
    @Excel(name = "油站简称")
    private String abbreviation;

    /** 上级分类 */
    @Excel(name = "上级分类")
    private String parent;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String phone;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 状态（1开启，0关闭） */
    @Excel(name = "状态", readConverterExp = "1=开启，0关闭")
    private Integer status;

    /** 负责人 */
    @Excel(name = "负责人")
    private String personInCharge;

    public void setStationId(Long stationId) 
    {
        this.stationId = stationId;
    }

    public Long getStationId() 
    {
        return stationId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setAbbreviation(String abbreviation) 
    {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() 
    {
        return abbreviation;
    }
    public void setParent(String parent) 
    {
        this.parent = parent;
    }

    public String getParent() 
    {
        return parent;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setPersonInCharge(String personInCharge) 
    {
        this.personInCharge = personInCharge;
    }

    public String getPersonInCharge() 
    {
        return personInCharge;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("stationId", getStationId())
            .append("name", getName())
            .append("abbreviation", getAbbreviation())
            .append("parent", getParent())
            .append("phone", getPhone())
            .append("address", getAddress())
            .append("status", getStatus())
            .append("personInCharge", getPersonInCharge())
            .append("createTime", getCreateTime())
            .toString();
    }
}
