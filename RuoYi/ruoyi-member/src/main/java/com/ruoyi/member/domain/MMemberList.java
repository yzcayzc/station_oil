package com.ruoyi.member.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 会员列表对象 m_member_list
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class MMemberList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long memberId;

    /** 编号 */
    @Excel(name = "编号")
    private Long memberNumber;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phone;

    /** 加油站名称 */
    @Excel(name = "加油站名称")
    private String stationName;

    /** 用户名 */
    @Excel(name = "用户名")
    private String userName;

    /** 身份 */
    @Excel(name = "身份")
    private String identity;

    /** 余额 */
    @Excel(name = "余额")
    private Long balance;

    /** 总充值额度 */
    @Excel(name = "总充值额度")
    private Long totalRechargeLimit;

    /** 注册时间 */
    @Excel(name = "注册时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date registrationTime;

    /** 状态（0正常，1关闭） */
    @Excel(name = "状态", readConverterExp = "0=正常，1关闭")
    private String status;

    public void setMemberId(Long memberId) 
    {
        this.memberId = memberId;
    }

    public Long getMemberId() 
    {
        return memberId;
    }
    public void setMemberNumber(Long memberNumber) 
    {
        this.memberNumber = memberNumber;
    }

    public Long getMemberNumber() 
    {
        return memberNumber;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }
    public void setIdentity(String identity) 
    {
        this.identity = identity;
    }

    public String getIdentity() 
    {
        return identity;
    }
    public void setBalance(Long balance) 
    {
        this.balance = balance;
    }

    public Long getBalance() 
    {
        return balance;
    }
    public void setTotalRechargeLimit(Long totalRechargeLimit) 
    {
        this.totalRechargeLimit = totalRechargeLimit;
    }

    public Long getTotalRechargeLimit() 
    {
        return totalRechargeLimit;
    }
    public void setRegistrationTime(Date registrationTime) 
    {
        this.registrationTime = registrationTime;
    }

    public Date getRegistrationTime() 
    {
        return registrationTime;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("memberId", getMemberId())
            .append("memberNumber", getMemberNumber())
            .append("phone", getPhone())
            .append("stationName", getStationName())
            .append("userName", getUserName())
            .append("identity", getIdentity())
            .append("balance", getBalance())
            .append("totalRechargeLimit", getTotalRechargeLimit())
            .append("registrationTime", getRegistrationTime())
            .append("status", getStatus())
            .toString();
    }
}
