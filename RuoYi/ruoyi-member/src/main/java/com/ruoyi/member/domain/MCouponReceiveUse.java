package com.ruoyi.member.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 优惠券的领取和使用对象 m_coupon_receive_use
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public class MCouponReceiveUse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 优惠券领取使用id */
    private Long couponReceiveUseId;

    /** 领取时间 */
    @Excel(name = "领取时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 生效时间 */
    @Excel(name = "生效时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 优惠券类型 */
    @Excel(name = "优惠券类型")
    private String type;

    /** 券值 */
    @Excel(name = "券值")
    private Long voucherValue;

    /** 使用要求 */
    @Excel(name = "使用要求")
    private String requirement;

    /** 使用状态 */
    @Excel(name = "使用状态")
    private String status;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String phone;

    public void setCouponReceiveUseId(Long couponReceiveUseId) 
    {
        this.couponReceiveUseId = couponReceiveUseId;
    }

    public Long getCouponReceiveUseId() 
    {
        return couponReceiveUseId;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
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
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setVoucherValue(Long voucherValue) 
    {
        this.voucherValue = voucherValue;
    }

    public Long getVoucherValue() 
    {
        return voucherValue;
    }
    public void setRequirement(String requirement) 
    {
        this.requirement = requirement;
    }

    public String getRequirement() 
    {
        return requirement;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
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
            .append("couponReceiveUseId", getCouponReceiveUseId())
            .append("time", getTime())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("title", getTitle())
            .append("type", getType())
            .append("voucherValue", getVoucherValue())
            .append("requirement", getRequirement())
            .append("status", getStatus())
            .append("phone", getPhone())
            .toString();
    }
}
