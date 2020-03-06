package com.ruoyi.census.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 油站收入对象 c_oil_station_revenue
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public class COilStationRevenue extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 油站收入id */
    private Long revenueId;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 油站 */
    @Excel(name = "油站")
    private String station;

    /** 日期 */
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 充值 */
    @Excel(name = "充值")
    private Long recharge;

    /** 消费 */
    @Excel(name = "消费")
    private Long consumption;

    /** 返利 */
    @Excel(name = "返利")
    private Long rebate;

    /** 抵扣券 */
    @Excel(name = "抵扣券")
    private Long coupon;

    /** 通用券 */
    @Excel(name = "通用券")
    private Long generalCertificate;

    /** 现金券 */
    @Excel(name = "现金券")
    private Long cashCoupon;

    /** 折扣券 */
    @Excel(name = "折扣券")
    private Long discountCoupon;

    /** 金额 */
    @Excel(name = "金额")
    private Long couponDeduction;

    /** 赠送 */
    @Excel(name = "赠送")
    private Long give;

    /** 抵扣 */
    @Excel(name = "抵扣")
    private Long deduction;

    /** 积分余额 */
    @Excel(name = "积分余额")
    private Long integral;

    /** 通用券领取 */
    @Excel(name = "通用券领取")
    private Long cGeneralCertificate;

    /** 现金券领取 */
    @Excel(name = "现金券领取")
    private Long cCashCoupon;

    /** 折扣券领取 */
    @Excel(name = "折扣券领取")
    private Long cCoupon;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String phone;

    public void setRevenueId(Long revenueId) 
    {
        this.revenueId = revenueId;
    }

    public Long getRevenueId() 
    {
        return revenueId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setStation(String station) 
    {
        this.station = station;
    }

    public String getStation() 
    {
        return station;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setRecharge(Long recharge) 
    {
        this.recharge = recharge;
    }

    public Long getRecharge() 
    {
        return recharge;
    }
    public void setConsumption(Long consumption) 
    {
        this.consumption = consumption;
    }

    public Long getConsumption() 
    {
        return consumption;
    }
    public void setRebate(Long rebate) 
    {
        this.rebate = rebate;
    }

    public Long getRebate() 
    {
        return rebate;
    }
    public void setCoupon(Long coupon) 
    {
        this.coupon = coupon;
    }

    public Long getCoupon() 
    {
        return coupon;
    }
    public void setGeneralCertificate(Long generalCertificate) 
    {
        this.generalCertificate = generalCertificate;
    }

    public Long getGeneralCertificate() 
    {
        return generalCertificate;
    }
    public void setCashCoupon(Long cashCoupon) 
    {
        this.cashCoupon = cashCoupon;
    }

    public Long getCashCoupon() 
    {
        return cashCoupon;
    }
    public void setDiscountCoupon(Long discountCoupon) 
    {
        this.discountCoupon = discountCoupon;
    }

    public Long getDiscountCoupon() 
    {
        return discountCoupon;
    }
    public void setCouponDeduction(Long couponDeduction) 
    {
        this.couponDeduction = couponDeduction;
    }

    public Long getCouponDeduction() 
    {
        return couponDeduction;
    }
    public void setGive(Long give) 
    {
        this.give = give;
    }

    public Long getGive() 
    {
        return give;
    }
    public void setDeduction(Long deduction) 
    {
        this.deduction = deduction;
    }

    public Long getDeduction() 
    {
        return deduction;
    }
    public void setIntegral(Long integral) 
    {
        this.integral = integral;
    }

    public Long getIntegral() 
    {
        return integral;
    }
    public void setcGeneralCertificate(Long cGeneralCertificate) 
    {
        this.cGeneralCertificate = cGeneralCertificate;
    }

    public Long getcGeneralCertificate() 
    {
        return cGeneralCertificate;
    }
    public void setcCashCoupon(Long cCashCoupon) 
    {
        this.cCashCoupon = cCashCoupon;
    }

    public Long getcCashCoupon() 
    {
        return cCashCoupon;
    }
    public void setcCoupon(Long cCoupon) 
    {
        this.cCoupon = cCoupon;
    }

    public Long getcCoupon() 
    {
        return cCoupon;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("revenueId", getRevenueId())
            .append("name", getName())
            .append("number", getNumber())
            .append("station", getStation())
            .append("time", getTime())
            .append("recharge", getRecharge())
            .append("consumption", getConsumption())
            .append("rebate", getRebate())
            .append("coupon", getCoupon())
            .append("generalCertificate", getGeneralCertificate())
            .append("cashCoupon", getCashCoupon())
            .append("discountCoupon", getDiscountCoupon())
            .append("couponDeduction", getCouponDeduction())
            .append("give", getGive())
            .append("deduction", getDeduction())
            .append("integral", getIntegral())
            .append("cGeneralCertificate", getcGeneralCertificate())
            .append("cCashCoupon", getcCashCoupon())
            .append("cCoupon", getcCoupon())
            .append("phone", getPhone())
            .toString();
    }
}
