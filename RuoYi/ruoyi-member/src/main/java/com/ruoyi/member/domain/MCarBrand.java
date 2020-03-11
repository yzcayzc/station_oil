package com.ruoyi.member.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 车品牌表对象 m_car_brand
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public class MCarBrand extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 车品牌id */
    private Long carBrandId;

    /** 车品牌 */
    @Excel(name = "车品牌")
    private String brandId;

    /** 编号 */
    @Excel(name = "编号")
    private Long number;

    public void setCarBrandId(Long carBrandId) 
    {
        this.carBrandId = carBrandId;
    }

    public Long getCarBrandId() 
    {
        return carBrandId;
    }
    public void setBrandId(String brandId) 
    {
        this.brandId = brandId;
    }

    public String getBrandId() 
    {
        return brandId;
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
            .append("carBrandId", getCarBrandId())
            .append("brandId", getBrandId())
            .append("number", getNumber())
            .toString();
    }
}
