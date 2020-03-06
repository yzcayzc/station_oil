package com.ruoyi.member.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 电子钱包对象 m_electronic_wallet
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class MElectronicWallet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long electronicWalletId;

    /** 加油站 */
    @Excel(name = "加油站")
    private String stationName;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 卡号 */
    @Excel(name = "卡号")
    private Long card;

    /** 开卡时间 */
    @Excel(name = "开卡时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date cardOpen;

    /** 余额 */
    @Excel(name = "余额")
    private Long balance;

    /** 状态（0正常，1关闭） */
    @Excel(name = "状态", readConverterExp = "0=正常，1关闭")
    private String status;

    public void setElectronicWalletId(Long electronicWalletId) 
    {
        this.electronicWalletId = electronicWalletId;
    }

    public Long getElectronicWalletId() 
    {
        return electronicWalletId;
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
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setCard(Long card) 
    {
        this.card = card;
    }

    public Long getCard() 
    {
        return card;
    }
    public void setCardOpen(Date cardOpen) 
    {
        this.cardOpen = cardOpen;
    }

    public Date getCardOpen() 
    {
        return cardOpen;
    }
    public void setBalance(Long balance) 
    {
        this.balance = balance;
    }

    public Long getBalance() 
    {
        return balance;
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
            .append("electronicWalletId", getElectronicWalletId())
            .append("stationName", getStationName())
            .append("address", getAddress())
            .append("name", getName())
            .append("card", getCard())
            .append("cardOpen", getCardOpen())
            .append("balance", getBalance())
            .append("status", getStatus())
            .toString();
    }
}
