package com.ruoyi.census.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 员工收费报表对象 c_employee_fee_report
 * 
 * @author ruoyi
 * @date 2020-02-28
 */
public class CEmployeeFeeReport extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long feeId;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 加油站 */
    @Excel(name = "加油站")
    private String stationName;

    /** 员工 */
    @Excel(name = "员工")
    private String employee;

    /** 日期 */
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date feeTime;

    /** 电子钱包 */
    @Excel(name = "电子钱包")
    private Long electronicWallet;

    /** 微信 */
    @Excel(name = "微信")
    private Long wechat;

    /** 支付宝 */
    @Excel(name = "支付宝")
    private Long alipay;

    /** 现金 */
    @Excel(name = "现金")
    private Long cash;

    /** 支付小计 */
    @Excel(name = "支付小计")
    private Long subtotalPayment;

    /** 返利 */
    @Excel(name = "返利")
    private Long rebate;

    /** 通用券 */
    @Excel(name = "通用券")
    private Long generalCertificate;

    /** 现金券 */
    @Excel(name = "现金券")
    private Long cashCoupon;

    /** 折扣券 */
    @Excel(name = "折扣券")
    private Long discountCoupon;

    /** 纸质券 */
    @Excel(name = "纸质券")
    private Long paperCoupon;

    /** 折扣小计 */
    @Excel(name = "折扣小计")
    private Long discountSubtotal;

    /** 合计 */
    @Excel(name = "合计")
    private Long total;

    public void setFeeId(Long feeId) 
    {
        this.feeId = feeId;
    }

    public Long getFeeId() 
    {
        return feeId;
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
    public void setEmployee(String employee) 
    {
        this.employee = employee;
    }

    public String getEmployee() 
    {
        return employee;
    }
    public void setFeeTime(Date feeTime) 
    {
        this.feeTime = feeTime;
    }

    public Date getFeeTime() 
    {
        return feeTime;
    }
    public void setElectronicWallet(Long electronicWallet) 
    {
        this.electronicWallet = electronicWallet;
    }

    public Long getElectronicWallet() 
    {
        return electronicWallet;
    }
    public void setWechat(Long wechat) 
    {
        this.wechat = wechat;
    }

    public Long getWechat() 
    {
        return wechat;
    }
    public void setAlipay(Long alipay) 
    {
        this.alipay = alipay;
    }

    public Long getAlipay() 
    {
        return alipay;
    }
    public void setCash(Long cash) 
    {
        this.cash = cash;
    }

    public Long getCash() 
    {
        return cash;
    }
    public void setSubtotalPayment(Long subtotalPayment) 
    {
        this.subtotalPayment = subtotalPayment;
    }

    public Long getSubtotalPayment() 
    {
        return subtotalPayment;
    }
    public void setRebate(Long rebate) 
    {
        this.rebate = rebate;
    }

    public Long getRebate() 
    {
        return rebate;
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
    public void setPaperCoupon(Long paperCoupon) 
    {
        this.paperCoupon = paperCoupon;
    }

    public Long getPaperCoupon() 
    {
        return paperCoupon;
    }
    public void setDiscountSubtotal(Long discountSubtotal) 
    {
        this.discountSubtotal = discountSubtotal;
    }

    public Long getDiscountSubtotal() 
    {
        return discountSubtotal;
    }
    public void setTotal(Long total) 
    {
        this.total = total;
    }

    public Long getTotal() 
    {
        return total;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("feeId", getFeeId())
            .append("number", getNumber())
            .append("stationName", getStationName())
            .append("employee", getEmployee())
            .append("feeTime", getFeeTime())
            .append("electronicWallet", getElectronicWallet())
            .append("wechat", getWechat())
            .append("alipay", getAlipay())
            .append("cash", getCash())
            .append("subtotalPayment", getSubtotalPayment())
            .append("rebate", getRebate())
            .append("generalCertificate", getGeneralCertificate())
            .append("cashCoupon", getCashCoupon())
            .append("discountCoupon", getDiscountCoupon())
            .append("paperCoupon", getPaperCoupon())
            .append("discountSubtotal", getDiscountSubtotal())
            .append("total", getTotal())
            .toString();
    }
}
