package com.ruoyi.census.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 优惠券系统对象 c_coupon_statistics
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public class CCouponStatistics extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 优惠券统计id */
    private Long couponStatisticsId;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 油站 */
    @Excel(name = "油站")
    private String stationName;

    /** 优惠券类别 */
    @Excel(name = "优惠券类别")
    private String couponType;

    /** 优惠券金额 */
    @Excel(name = "优惠券金额")
    private Long couponMoney;

    /** 优惠券是否使用 */
    @Excel(name = "优惠券是否使用")
    private String couponUse;

    /** 领取日期 */
    @Excel(name = "领取日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date receiveTime;

    /** 使用日期 */
    @Excel(name = "使用日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date useTime;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String phone;

    public void setCouponStatisticsId(Long couponStatisticsId) 
    {
        this.couponStatisticsId = couponStatisticsId;
    }

    public Long getCouponStatisticsId() 
    {
        return couponStatisticsId;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setCouponType(String couponType) 
    {
        this.couponType = couponType;
    }

    public String getCouponType() 
    {
        return couponType;
    }
    public void setCouponMoney(Long couponMoney) 
    {
        this.couponMoney = couponMoney;
    }

    public Long getCouponMoney() 
    {
        return couponMoney;
    }
    public void setCouponUse(String couponUse) 
    {
        this.couponUse = couponUse;
    }

    public String getCouponUse() 
    {
        return couponUse;
    }
    public void setReceiveTime(Date receiveTime) 
    {
        this.receiveTime = receiveTime;
    }

    public Date getReceiveTime() 
    {
        return receiveTime;
    }
    public void setUseTime(Date useTime) 
    {
        this.useTime = useTime;
    }

    public Date getUseTime() 
    {
        return useTime;
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
            .append("couponStatisticsId", getCouponStatisticsId())
            .append("number", getNumber())
            .append("name", getName())
            .append("stationName", getStationName())
            .append("couponType", getCouponType())
            .append("couponMoney", getCouponMoney())
            .append("couponUse", getCouponUse())
            .append("receiveTime", getReceiveTime())
            .append("useTime", getUseTime())
            .append("phone", getPhone())
            .toString();
    }
}
