package com.ruoyi.systematic.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 优惠券中心对象 sy_coupon_center
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public class SyCouponCenter extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** c序号 */
    private Long couponId;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 发布单位 */
    @Excel(name = "发布单位")
    private String publishingUnit;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 内容描述 */
    @Excel(name = "内容描述")
    private String contentDescription;

    /** 开始时间 */
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 加油站 */
    @Excel(name = "加油站")
    private String stationName;

    /** 活动 */
    @Excel(name = "活动")
    private String activity;

    /** 优惠券编号 */
    @Excel(name = "优惠券编号")
    private String couponNumber;

    /** 优惠券类别 */
    @Excel(name = "优惠券类别")
    private String couponType;

    public void setCouponId(Long couponId) 
    {
        this.couponId = couponId;
    }

    public Long getCouponId() 
    {
        return couponId;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setPublishingUnit(String publishingUnit) 
    {
        this.publishingUnit = publishingUnit;
    }

    public String getPublishingUnit() 
    {
        return publishingUnit;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setContentDescription(String contentDescription) 
    {
        this.contentDescription = contentDescription;
    }

    public String getContentDescription() 
    {
        return contentDescription;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setActivity(String activity) 
    {
        this.activity = activity;
    }

    public String getActivity() 
    {
        return activity;
    }
    public void setCouponNumber(String couponNumber) 
    {
        this.couponNumber = couponNumber;
    }

    public String getCouponNumber() 
    {
        return couponNumber;
    }
    public void setCouponType(String couponType) 
    {
        this.couponType = couponType;
    }

    public String getCouponType() 
    {
        return couponType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("couponId", getCouponId())
            .append("number", getNumber())
            .append("publishingUnit", getPublishingUnit())
            .append("title", getTitle())
            .append("contentDescription", getContentDescription())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("stationName", getStationName())
            .append("activity", getActivity())
            .append("couponNumber", getCouponNumber())
            .append("couponType", getCouponType())
            .toString();
    }
}
