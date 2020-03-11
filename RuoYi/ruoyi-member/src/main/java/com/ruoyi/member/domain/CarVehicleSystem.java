package com.ruoyi.member.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 车系表对象 car_vehicle_system
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public class CarVehicleSystem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 车系id */
    private Long vehicleSystemId;

    /** 车系 */
    @Excel(name = "车系")
    private String vehicleSystem;

    /** 编号 */
    @Excel(name = "编号")
    private Long number;

    public void setVehicleSystemId(Long vehicleSystemId) 
    {
        this.vehicleSystemId = vehicleSystemId;
    }

    public Long getVehicleSystemId() 
    {
        return vehicleSystemId;
    }
    public void setVehicleSystem(String vehicleSystem) 
    {
        this.vehicleSystem = vehicleSystem;
    }

    public String getVehicleSystem() 
    {
        return vehicleSystem;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("vehicleSystemId", getVehicleSystemId())
            .append("vehicleSystem", getVehicleSystem())
            .append("number", getNumber())
            .toString();
    }
}
