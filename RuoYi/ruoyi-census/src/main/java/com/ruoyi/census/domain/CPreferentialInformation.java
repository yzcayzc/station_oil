package com.ruoyi.census.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 优惠信息表对象 c_preferential_information
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public class CPreferentialInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long preferentialId;

    /** 消费者 */
    @Excel(name = "消费者")
    private String consumer;

    /** 加以日期 */
    @Excel(name = "加以日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date transactionTime;

    /** 充值额 */
    @Excel(name = "充值额")
    private Long recharge;

    /** 消费额 */
    @Excel(name = "消费额")
    private Long consumptionVolume;

    /** 金额 */
    @Excel(name = "金额")
    private Long money;

    /** 返利 */
    @Excel(name = "返利")
    private Long rebate;

    /** 抵扣券 */
    @Excel(name = "抵扣券")
    private Long coupon;

    /** 通用券 */
    @Excel(name = "通用券")
    private Long generalCertificate;

    /** 现金券 */
    @Excel(name = "现金券")
    private Long cashCoupon;

    /** 折扣券 */
    @Excel(name = "折扣券")
    private Long discountCoupon;

    /** 通用券领取 */
    @Excel(name = "通用券领取")
    private Long cGeneralCertificate;

    /** 现金券领取 */
    @Excel(name = "现金券领取")
    private Long cCashCoupon;

    /** 折扣券领取 */
    @Excel(name = "折扣券领取")
    private Long cCoupon;

    public void setPreferentialId(Long preferentialId) 
    {
        this.preferentialId = preferentialId;
    }

    public Long getPreferentialId() 
    {
        return preferentialId;
    }
    public void setConsumer(String consumer) 
    {
        this.consumer = consumer;
    }

    public String getConsumer() 
    {
        return consumer;
    }
    public void setTransactionTime(Date transactionTime) 
    {
        this.transactionTime = transactionTime;
    }

    public Date getTransactionTime() 
    {
        return transactionTime;
    }
    public void setRecharge(Long recharge) 
    {
        this.recharge = recharge;
    }

    public Long getRecharge() 
    {
        return recharge;
    }
    public void setConsumptionVolume(Long consumptionVolume) 
    {
        this.consumptionVolume = consumptionVolume;
    }

    public Long getConsumptionVolume() 
    {
        return consumptionVolume;
    }
    public void setMoney(Long money) 
    {
        this.money = money;
    }

    public Long getMoney() 
    {
        return money;
    }
    public void setRebate(Long rebate) 
    {
        this.rebate = rebate;
    }

    public Long getRebate() 
    {
        return rebate;
    }
    public void setCoupon(Long coupon) 
    {
        this.coupon = coupon;
    }

    public Long getCoupon() 
    {
        return coupon;
    }
    public void setGeneralCertificate(Long generalCertificate) 
    {
        this.generalCertificate = generalCertificate;
    }

    public Long getGeneralCertificate() 
    {
        return generalCertificate;
    }
    public void setCashCoupon(Long cashCoupon) 
    {
        this.cashCoupon = cashCoupon;
    }

    public Long getCashCoupon() 
    {
        return cashCoupon;
    }
    public void setDiscountCoupon(Long discountCoupon) 
    {
        this.discountCoupon = discountCoupon;
    }

    public Long getDiscountCoupon() 
    {
        return discountCoupon;
    }
    public void setcGeneralCertificate(Long cGeneralCertificate) 
    {
        this.cGeneralCertificate = cGeneralCertificate;
    }

    public Long getcGeneralCertificate() 
    {
        return cGeneralCertificate;
    }
    public void setcCashCoupon(Long cCashCoupon) 
    {
        this.cCashCoupon = cCashCoupon;
    }

    public Long getcCashCoupon() 
    {
        return cCashCoupon;
    }
    public void setcCoupon(Long cCoupon) 
    {
        this.cCoupon = cCoupon;
    }

    public Long getcCoupon() 
    {
        return cCoupon;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("preferentialId", getPreferentialId())
            .append("consumer", getConsumer())
            .append("transactionTime", getTransactionTime())
            .append("recharge", getRecharge())
            .append("consumptionVolume", getConsumptionVolume())
            .append("money", getMoney())
            .append("rebate", getRebate())
            .append("coupon", getCoupon())
            .append("generalCertificate", getGeneralCertificate())
            .append("cashCoupon", getCashCoupon())
            .append("discountCoupon", getDiscountCoupon())
            .append("cGeneralCertificate", getcGeneralCertificate())
            .append("cCashCoupon", getcCashCoupon())
            .append("cCoupon", getcCoupon())
            .toString();
    }
}
