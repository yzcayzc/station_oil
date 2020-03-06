package com.ruoyi.census.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 单次高额消费统计对象 c_high_consumption_of_words
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public class CHighConsumptionOfWords extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long consumptionId;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 油站 */
    @Excel(name = "油站")
    private String stationName;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 手机 */
    @Excel(name = "手机")
    private String phone;

    /** 充值总额 */
    @Excel(name = "充值总额")
    private Long totalRecharge;

    /** 消费总额 */
    @Excel(name = "消费总额")
    private Long totalConsumption;

    /** 余额 */
    @Excel(name = "余额")
    private Long balance;

    /** 首次消费时间 */
    @Excel(name = "首次消费时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date firstConsumptionTime;

    /** 会员注册时间 */
    @Excel(name = "会员注册时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date memberRegistrationTime;

    public void setConsumptionId(Long consumptionId) 
    {
        this.consumptionId = consumptionId;
    }

    public Long getConsumptionId() 
    {
        return consumptionId;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setTotalRecharge(Long totalRecharge) 
    {
        this.totalRecharge = totalRecharge;
    }

    public Long getTotalRecharge() 
    {
        return totalRecharge;
    }
    public void setTotalConsumption(Long totalConsumption) 
    {
        this.totalConsumption = totalConsumption;
    }

    public Long getTotalConsumption() 
    {
        return totalConsumption;
    }
    public void setBalance(Long balance) 
    {
        this.balance = balance;
    }

    public Long getBalance() 
    {
        return balance;
    }
    public void setFirstConsumptionTime(Date firstConsumptionTime) 
    {
        this.firstConsumptionTime = firstConsumptionTime;
    }

    public Date getFirstConsumptionTime() 
    {
        return firstConsumptionTime;
    }
    public void setMemberRegistrationTime(Date memberRegistrationTime) 
    {
        this.memberRegistrationTime = memberRegistrationTime;
    }

    public Date getMemberRegistrationTime() 
    {
        return memberRegistrationTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("consumptionId", getConsumptionId())
            .append("number", getNumber())
            .append("stationName", getStationName())
            .append("name", getName())
            .append("phone", getPhone())
            .append("totalRecharge", getTotalRecharge())
            .append("totalConsumption", getTotalConsumption())
            .append("balance", getBalance())
            .append("firstConsumptionTime", getFirstConsumptionTime())
            .append("memberRegistrationTime", getMemberRegistrationTime())
            .toString();
    }
}
