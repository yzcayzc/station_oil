package com.ruoyi.activity.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 纸质优惠券设置对象 paper_coupons
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class PaperCoupons extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long couponsId;

    /** 序号 */
    @Excel(name = "序号")
    private Long numberId;

    /** 优惠券金额 */
    @Excel(name = "优惠券金额")
    private String couponsAmount;

    /** 优惠券数量（张） */
    @Excel(name = "优惠券数量", readConverterExp = "张=")
    private Long number;

    /** 优惠券范围 */
    @Excel(name = "优惠券范围")
    private String couponRange;

    /** 起始号码 */
    @Excel(name = "起始号码")
    private Long startNumber;

    /** 结束号码 */
    @Excel(name = "结束号码")
    private Long endNumber;

    public void setCouponsId(Long couponsId) 
    {
        this.couponsId = couponsId;
    }

    public Long getCouponsId() 
    {
        return couponsId;
    }
    public void setNumberId(Long numberId) 
    {
        this.numberId = numberId;
    }

    public Long getNumberId() 
    {
        return numberId;
    }
    public void setCouponsAmount(String couponsAmount) 
    {
        this.couponsAmount = couponsAmount;
    }

    public String getCouponsAmount() 
    {
        return couponsAmount;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setCouponRange(String couponRange) 
    {
        this.couponRange = couponRange;
    }

    public String getCouponRange() 
    {
        return couponRange;
    }
    public void setStartNumber(Long startNumber) 
    {
        this.startNumber = startNumber;
    }

    public Long getStartNumber() 
    {
        return startNumber;
    }
    public void setEndNumber(Long endNumber) 
    {
        this.endNumber = endNumber;
    }

    public Long getEndNumber() 
    {
        return endNumber;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("couponsId", getCouponsId())
            .append("numberId", getNumberId())
            .append("couponsAmount", getCouponsAmount())
            .append("number", getNumber())
            .append("couponRange", getCouponRange())
            .append("startNumber", getStartNumber())
            .append("endNumber", getEndNumber())
            .toString();
    }
}
