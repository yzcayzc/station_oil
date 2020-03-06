package com.ruoyi.census.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 积分信息表对象 c_integral_information
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public class CIntegralInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 积分信息id */
    private Long integral;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 消费者 */
    @Excel(name = "消费者")
    private String consumer;

    /** 赠送 */
    @Excel(name = "赠送")
    private Long give;

    /** 抵扣 */
    @Excel(name = "抵扣")
    private Long deduction;

    /** 余额 */
    @Excel(name = "余额")
    private Long balance;

    /** 赠/扣时间 */
    @Excel(name = "赠/扣时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 住址 */
    @Excel(name = "住址")
    private String address;

    public void setIntegral(Long integral) 
    {
        this.integral = integral;
    }

    public Long getIntegral() 
    {
        return integral;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setConsumer(String consumer) 
    {
        this.consumer = consumer;
    }

    public String getConsumer() 
    {
        return consumer;
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
    public void setBalance(Long balance) 
    {
        this.balance = balance;
    }

    public Long getBalance() 
    {
        return balance;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("integral", getIntegral())
            .append("number", getNumber())
            .append("consumer", getConsumer())
            .append("give", getGive())
            .append("deduction", getDeduction())
            .append("balance", getBalance())
            .append("time", getTime())
            .append("phone", getPhone())
            .append("address", getAddress())
            .toString();
    }
}
