package com.ruoyi.announcement.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 公告列表对象 a_announcement_list
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class AAnnouncementList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long announcementId;

    /** 所属加油站 */
    @Excel(name = "所属加油站")
    private String stationName;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 公告内容 */
    @Excel(name = "公告内容")
    private String announcementConten;

    /** 上架时间 */
    @Excel(name = "上架时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date statrtTime;

    /** 下架时间 */
    @Excel(name = "下架时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 发布人 */
    @Excel(name = "发布人")
    private String publisher;

    /** 状态（0正常，1关闭） */
    @Excel(name = "状态", readConverterExp = "0=正常，1关闭")
    private Integer status;

    public void setAnnouncementId(Long announcementId) 
    {
        this.announcementId = announcementId;
    }

    public Long getAnnouncementId() 
    {
        return announcementId;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setAnnouncementConten(String announcementConten) 
    {
        this.announcementConten = announcementConten;
    }

    public String getAnnouncementConten() 
    {
        return announcementConten;
    }
    public void setStatrtTime(Date statrtTime) 
    {
        this.statrtTime = statrtTime;
    }

    public Date getStatrtTime() 
    {
        return statrtTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setPublisher(String publisher) 
    {
        this.publisher = publisher;
    }

    public String getPublisher() 
    {
        return publisher;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("announcementId", getAnnouncementId())
            .append("stationName", getStationName())
            .append("title", getTitle())
            .append("announcementConten", getAnnouncementConten())
            .append("statrtTime", getStatrtTime())
            .append("endTime", getEndTime())
            .append("publisher", getPublisher())
            .append("status", getStatus())
            .toString();
    }
}
