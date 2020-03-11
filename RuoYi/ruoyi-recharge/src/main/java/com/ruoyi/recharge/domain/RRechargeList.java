package com.ruoyi.recharge.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 充值列表对象 r_recharge_list
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
public class RRechargeList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 充值id */
    private Long rechargeId;

    /** 编号 */
    @Excel(name = "编号")
    private Long rechargeNumber;

    /** 加油站 */
    @Excel(name = "加油站")
    private String stationName;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 充值用户 */
    @Excel(name = "充值用户")
    private String rechargeUser;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String phone;

    /** 充值金额 */
    @Excel(name = "充值金额")
    private Long rechargeAmount;

    /** 剩余余额 */
    @Excel(name = "剩余余额")
    private Long surplusAmount;

    /** 支付方式 */
    @Excel(name = "支付方式")
    private String paymentMethod;

    /** 充值时间 */
    @Excel(name = "充值时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 确认收获 */
    @Excel(name = "确认收获")
    private String status;

    /** 积分奖励 */
    @Excel(name = "积分奖励")
    private Long bonusPoints;

    /** 赠送品 */
    @Excel(name = "赠送品")
    private String gift;

    /** 订单号 */
    @Excel(name = "订单号")
    private Long orderNumber;

    public void setRechargeId(Long rechargeId) 
    {
        this.rechargeId = rechargeId;
    }

    public Long getRechargeId() 
    {
        return rechargeId;
    }
    public void setRechargeNumber(Long rechargeNumber) 
    {
        this.rechargeNumber = rechargeNumber;
    }

    public Long getRechargeNumber() 
    {
        return rechargeNumber;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setRechargeUser(String rechargeUser) 
    {
        this.rechargeUser = rechargeUser;
    }

    public String getRechargeUser() 
    {
        return rechargeUser;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setRechargeAmount(Long rechargeAmount) 
    {
        this.rechargeAmount = rechargeAmount;
    }

    public Long getRechargeAmount() 
    {
        return rechargeAmount;
    }
    public void setSurplusAmount(Long surplusAmount) 
    {
        this.surplusAmount = surplusAmount;
    }

    public Long getSurplusAmount() 
    {
        return surplusAmount;
    }
    public void setPaymentMethod(String paymentMethod) 
    {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() 
    {
        return paymentMethod;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setBonusPoints(Long bonusPoints) 
    {
        this.bonusPoints = bonusPoints;
    }

    public Long getBonusPoints() 
    {
        return bonusPoints;
    }
    public void setGift(String gift) 
    {
        this.gift = gift;
    }

    public String getGift() 
    {
        return gift;
    }
    public void setOrderNumber(Long orderNumber) 
    {
        this.orderNumber = orderNumber;
    }

    public Long getOrderNumber() 
    {
        return orderNumber;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("rechargeId", getRechargeId())
            .append("rechargeNumber", getRechargeNumber())
            .append("stationName", getStationName())
            .append("address", getAddress())
            .append("rechargeUser", getRechargeUser())
            .append("phone", getPhone())
            .append("rechargeAmount", getRechargeAmount())
            .append("surplusAmount", getSurplusAmount())
            .append("paymentMethod", getPaymentMethod())
            .append("time", getTime())
            .append("status", getStatus())
            .append("bonusPoints", getBonusPoints())
            .append("gift", getGift())
            .append("orderNumber", getOrderNumber())
            .toString();
    }
}
