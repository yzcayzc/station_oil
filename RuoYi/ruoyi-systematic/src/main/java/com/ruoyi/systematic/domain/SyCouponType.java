package com.ruoyi.systematic.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 优惠券类型字段对象 sy_coupon_type
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public class SyCouponType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 优惠券类型id */
    private Long syCouponTypeId;

    /** 优惠券类型 */
    @Excel(name = "优惠券类型")
    private String couponType;

    /** 对应数字 */
    @Excel(name = "对应数字")
    private String number;

    public void setSyCouponTypeId(Long syCouponTypeId) 
    {
        this.syCouponTypeId = syCouponTypeId;
    }

    public Long getSyCouponTypeId() 
    {
        return syCouponTypeId;
    }
    public void setCouponType(String couponType) 
    {
        this.couponType = couponType;
    }

    public String getCouponType() 
    {
        return couponType;
    }
    public void setNumber(String number) 
    {
        this.number = number;
    }

    public String getNumber() 
    {
        return number;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("syCouponTypeId", getSyCouponTypeId())
            .append("couponType", getCouponType())
            .append("number", getNumber())
            .toString();
    }
}
