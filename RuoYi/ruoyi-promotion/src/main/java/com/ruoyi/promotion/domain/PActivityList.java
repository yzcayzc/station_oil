package com.ruoyi.promotion.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 活动列表对象 p_activity_list
 * 
 * @author ruoyi
 * @date 2020-02-28
 */
public class PActivityList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 活动详情id */
    private Long activityDetailsId;

    /** 加油站 */
    @Excel(name = "加油站")
    private String stationName;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 商品图片 */
    @Excel(name = "商品图片")
    private String commodityPictures;

    /** 活动主题 */
    @Excel(name = "活动主题")
    private String activityTheme;

    /** 活动标题 */
    @Excel(name = "活动标题")
    private String activityTitle;

    /** 活动内容 */
    @Excel(name = "活动内容")
    private String activityContent;

    /** 促销规则说明 */
    @Excel(name = "促销规则说明")
    private String activityRule;

    /** 开始时间 */
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    public void setActivityDetailsId(Long activityDetailsId) 
    {
        this.activityDetailsId = activityDetailsId;
    }

    public Long getActivityDetailsId() 
    {
        return activityDetailsId;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setCommodityPictures(String commodityPictures) 
    {
        this.commodityPictures = commodityPictures;
    }

    public String getCommodityPictures() 
    {
        return commodityPictures;
    }
    public void setActivityTheme(String activityTheme) 
    {
        this.activityTheme = activityTheme;
    }

    public String getActivityTheme() 
    {
        return activityTheme;
    }
    public void setActivityTitle(String activityTitle) 
    {
        this.activityTitle = activityTitle;
    }

    public String getActivityTitle() 
    {
        return activityTitle;
    }
    public void setActivityContent(String activityContent) 
    {
        this.activityContent = activityContent;
    }

    public String getActivityContent() 
    {
        return activityContent;
    }
    public void setActivityRule(String activityRule) 
    {
        this.activityRule = activityRule;
    }

    public String getActivityRule() 
    {
        return activityRule;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("activityDetailsId", getActivityDetailsId())
            .append("stationName", getStationName())
            .append("address", getAddress())
            .append("commodityPictures", getCommodityPictures())
            .append("activityTheme", getActivityTheme())
            .append("activityTitle", getActivityTitle())
            .append("activityContent", getActivityContent())
            .append("activityRule", getActivityRule())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .toString();
    }
}
