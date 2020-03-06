package com.ruoyi.systematic.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 充值中心对象 sy_voucher_center
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class SyVoucherCenter extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** v序号id */
    private Long voucherId;

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

    public void setVoucherId(Long voucherId) 
    {
        this.voucherId = voucherId;
    }

    public Long getVoucherId() 
    {
        return voucherId;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("voucherId", getVoucherId())
            .append("number", getNumber())
            .append("publishingUnit", getPublishingUnit())
            .append("title", getTitle())
            .append("contentDescription", getContentDescription())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .toString();
    }
}
