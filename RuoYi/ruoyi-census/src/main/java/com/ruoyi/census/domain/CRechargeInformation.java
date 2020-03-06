package com.ruoyi.census.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 充值信息表对象 c_recharge_information
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public class CRechargeInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @Excel(name = "id")
    private Long rechargeId;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 会员名 */
    @Excel(name = "会员名")
    private String member;

    /** 充值金额 */
    @Excel(name = "充值金额")
    private Long rechargeAmount;

    /** 充值时间 */
    @Excel(name = "充值时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date rechargeTime;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String phone;

    /** 住址 */
    @Excel(name = "住址")
    private String address;

    /** 会员注册时间 */
    @Excel(name = "会员注册时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date memberTime;

    public void setRechargeId(Long rechargeId) 
    {
        this.rechargeId = rechargeId;
    }

    public Long getRechargeId() 
    {
        return rechargeId;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setMember(String member) 
    {
        this.member = member;
    }

    public String getMember() 
    {
        return member;
    }
    public void setRechargeAmount(Long rechargeAmount) 
    {
        this.rechargeAmount = rechargeAmount;
    }

    public Long getRechargeAmount() 
    {
        return rechargeAmount;
    }
    public void setRechargeTime(Date rechargeTime) 
    {
        this.rechargeTime = rechargeTime;
    }

    public Date getRechargeTime() 
    {
        return rechargeTime;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setMemberTime(Date memberTime) 
    {
        this.memberTime = memberTime;
    }

    public Date getMemberTime() 
    {
        return memberTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("rechargeId", getRechargeId())
            .append("number", getNumber())
            .append("member", getMember())
            .append("rechargeAmount", getRechargeAmount())
            .append("rechargeTime", getRechargeTime())
            .append("phone", getPhone())
            .append("address", getAddress())
            .append("memberTime", getMemberTime())
            .toString();
    }
}
