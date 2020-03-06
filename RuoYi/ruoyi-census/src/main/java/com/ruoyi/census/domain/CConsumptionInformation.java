package com.ruoyi.census.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 消费信息表对象 c_consumption_information
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public class CConsumptionInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long consumption;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 消费者 */
    @Excel(name = "消费者")
    private String consumer;

    /** 消费金额 */
    @Excel(name = "消费金额")
    private Long consumptionAmount;

    /** 消费时间 */
    @Excel(name = "消费时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date consumptionTime;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String phone;

    public void setConsumption(Long consumption) 
    {
        this.consumption = consumption;
    }

    public Long getConsumption() 
    {
        return consumption;
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
    public void setConsumptionAmount(Long consumptionAmount) 
    {
        this.consumptionAmount = consumptionAmount;
    }

    public Long getConsumptionAmount() 
    {
        return consumptionAmount;
    }
    public void setConsumptionTime(Date consumptionTime) 
    {
        this.consumptionTime = consumptionTime;
    }

    public Date getConsumptionTime() 
    {
        return consumptionTime;
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
            .append("consumption", getConsumption())
            .append("number", getNumber())
            .append("consumer", getConsumer())
            .append("consumptionAmount", getConsumptionAmount())
            .append("consumptionTime", getConsumptionTime())
            .append("phone", getPhone())
            .toString();
    }
}
