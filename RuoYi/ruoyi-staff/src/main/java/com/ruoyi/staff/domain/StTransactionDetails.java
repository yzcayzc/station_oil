package com.ruoyi.staff.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 交易详情对象 st_transaction_details
 * 
 * @author ruoyi
 * @date 2020-03-05
 */
public class StTransactionDetails extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 交易详情id */
    private Long transactionDetailsId;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 订单号 */
    @Excel(name = "订单号")
    private Long orderNumber;

    /** 支付时间 */
    @Excel(name = "支付时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date paymentTime;

    /** 消费者 */
    @Excel(name = "消费者")
    private String consumer;

    /** 支付方式 */
    @Excel(name = "支付方式")
    private String paymentMethod;

    /** 支付金额 */
    @Excel(name = "支付金额")
    private Long paymentAmount;

    /** 优惠方式 */
    @Excel(name = "优惠方式")
    private String preferentialWay;

    /** 优惠金额 */
    @Excel(name = "优惠金额")
    private Long preferentialAmount;

    /** 应收 */
    @Excel(name = "应收")
    private Long receivable;

    /** 实收 */
    @Excel(name = "实收")
    private Long netReceipts;

    /** 积分 */
    @Excel(name = "积分")
    private Long integral;

    public void setTransactionDetailsId(Long transactionDetailsId) 
    {
        this.transactionDetailsId = transactionDetailsId;
    }

    public Long getTransactionDetailsId() 
    {
        return transactionDetailsId;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setOrderNumber(Long orderNumber) 
    {
        this.orderNumber = orderNumber;
    }

    public Long getOrderNumber() 
    {
        return orderNumber;
    }
    public void setPaymentTime(Date paymentTime) 
    {
        this.paymentTime = paymentTime;
    }

    public Date getPaymentTime() 
    {
        return paymentTime;
    }
    public void setConsumer(String consumer) 
    {
        this.consumer = consumer;
    }

    public String getConsumer() 
    {
        return consumer;
    }
    public void setPaymentMethod(String paymentMethod) 
    {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() 
    {
        return paymentMethod;
    }
    public void setPaymentAmount(Long paymentAmount) 
    {
        this.paymentAmount = paymentAmount;
    }

    public Long getPaymentAmount() 
    {
        return paymentAmount;
    }
    public void setPreferentialWay(String preferentialWay) 
    {
        this.preferentialWay = preferentialWay;
    }

    public String getPreferentialWay() 
    {
        return preferentialWay;
    }
    public void setPreferentialAmount(Long preferentialAmount) 
    {
        this.preferentialAmount = preferentialAmount;
    }

    public Long getPreferentialAmount() 
    {
        return preferentialAmount;
    }
    public void setReceivable(Long receivable) 
    {
        this.receivable = receivable;
    }

    public Long getReceivable() 
    {
        return receivable;
    }
    public void setNetReceipts(Long netReceipts) 
    {
        this.netReceipts = netReceipts;
    }

    public Long getNetReceipts() 
    {
        return netReceipts;
    }
    public void setIntegral(Long integral) 
    {
        this.integral = integral;
    }

    public Long getIntegral() 
    {
        return integral;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("transactionDetailsId", getTransactionDetailsId())
            .append("number", getNumber())
            .append("orderNumber", getOrderNumber())
            .append("paymentTime", getPaymentTime())
            .append("consumer", getConsumer())
            .append("paymentMethod", getPaymentMethod())
            .append("paymentAmount", getPaymentAmount())
            .append("preferentialWay", getPreferentialWay())
            .append("preferentialAmount", getPreferentialAmount())
            .append("receivable", getReceivable())
            .append("netReceipts", getNetReceipts())
            .append("integral", getIntegral())
            .toString();
    }
}
