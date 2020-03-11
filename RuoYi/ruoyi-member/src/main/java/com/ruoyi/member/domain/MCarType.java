package com.ruoyi.member.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 车类型表对象 m_car_type
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public class MCarType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 车id */
    private Long carTypeId;

    /** 车类型 */
    @Excel(name = "车类型")
    private String carType;

    /** 编号 */
    @Excel(name = "编号")
    private Long number;

    public void setCarTypeId(Long carTypeId) 
    {
        this.carTypeId = carTypeId;
    }

    public Long getCarTypeId() 
    {
        return carTypeId;
    }
    public void setCarType(String carType) 
    {
        this.carType = carType;
    }

    public String getCarType() 
    {
        return carType;
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
            .append("carTypeId", getCarTypeId())
            .append("carType", getCarType())
            .append("number", getNumber())
            .toString();
    }
}
