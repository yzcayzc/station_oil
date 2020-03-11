package com.ruoyi.member.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 我的爱车对象 m_my_car
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public class MMyCar extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long myCarId;

    /** 车牌号 */
    @Excel(name = "车牌号")
    private String licensePlateNumber;

    /** 品牌 */
    @Excel(name = "品牌")
    private String carBrand;

    /** 类型 */
    @Excel(name = "类型")
    private String carType;

    /** 车系 */
    @Excel(name = "车系")
    private String vehicleSystem;

    /** 型号 */
    @Excel(name = "型号")
    private String model;

    /** 油品 */
    @Excel(name = "油品")
    private String oils;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String phone;

    /** 车编号 */
    @Excel(name = "车编号")
    private String carNumber;

    public void setMyCarId(Long myCarId) 
    {
        this.myCarId = myCarId;
    }

    public Long getMyCarId() 
    {
        return myCarId;
    }
    public void setLicensePlateNumber(String licensePlateNumber) 
    {
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getLicensePlateNumber() 
    {
        return licensePlateNumber;
    }
    public void setCarBrand(String carBrand) 
    {
        this.carBrand = carBrand;
    }

    public String getCarBrand() 
    {
        return carBrand;
    }
    public void setCarType(String carType) 
    {
        this.carType = carType;
    }

    public String getCarType() 
    {
        return carType;
    }
    public void setVehicleSystem(String vehicleSystem) 
    {
        this.vehicleSystem = vehicleSystem;
    }

    public String getVehicleSystem() 
    {
        return vehicleSystem;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }
    public void setOils(String oils) 
    {
        this.oils = oils;
    }

    public String getOils() 
    {
        return oils;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setCarNumber(String carNumber) 
    {
        this.carNumber = carNumber;
    }

    public String getCarNumber() 
    {
        return carNumber;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("myCarId", getMyCarId())
            .append("licensePlateNumber", getLicensePlateNumber())
            .append("carBrand", getCarBrand())
            .append("carType", getCarType())
            .append("vehicleSystem", getVehicleSystem())
            .append("model", getModel())
            .append("oils", getOils())
            .append("phone", getPhone())
            .append("carNumber", getCarNumber())
            .toString();
    }
}
