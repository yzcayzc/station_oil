package com.ruoyi.shop.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 积分商城管理对象 i_points_mall_management
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class IPointsMallManagement extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 商品id */
    private Long goodsId;

    /** 加油站 */
    @Excel(name = "加油站")
    private String stationName;

    /** 商品图片 */
    @Excel(name = "商品图片")
    private String goodsImage;

    /** 商品名称 */
    @Excel(name = "商品名称")
    private String goodsName;

    /** 规格 */
    @Excel(name = "规格")
    private String specifications;

    /** 单位 */
    @Excel(name = "单位")
    private String unit;

    /** 积分兑换规则 */
    @Excel(name = "积分兑换规则")
    private Long integralExchangeRules;

    /** 金钱兑换规则 */
    @Excel(name = "金钱兑换规则")
    private Long moneyExchangeRules;

    /** 产品介绍 */
    @Excel(name = "产品介绍")
    private String productIntroduction;

    /** 兑换规则说明 */
    @Excel(name = "兑换规则说明")
    private String ruleDescription;

    /** 兑换开始时间 */
    @Excel(name = "兑换开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 兑换结束时间 */
    @Excel(name = "兑换结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 库存 */
    @Excel(name = "库存")
    private Long stock;

    public void setGoodsId(Long goodsId) 
    {
        this.goodsId = goodsId;
    }

    public Long getGoodsId() 
    {
        return goodsId;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setGoodsImage(String goodsImage) 
    {
        this.goodsImage = goodsImage;
    }

    public String getGoodsImage() 
    {
        return goodsImage;
    }
    public void setGoodsName(String goodsName) 
    {
        this.goodsName = goodsName;
    }

    public String getGoodsName() 
    {
        return goodsName;
    }
    public void setSpecifications(String specifications) 
    {
        this.specifications = specifications;
    }

    public String getSpecifications() 
    {
        return specifications;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }
    public void setIntegralExchangeRules(Long integralExchangeRules) 
    {
        this.integralExchangeRules = integralExchangeRules;
    }

    public Long getIntegralExchangeRules() 
    {
        return integralExchangeRules;
    }
    public void setMoneyExchangeRules(Long moneyExchangeRules) 
    {
        this.moneyExchangeRules = moneyExchangeRules;
    }

    public Long getMoneyExchangeRules() 
    {
        return moneyExchangeRules;
    }
    public void setProductIntroduction(String productIntroduction) 
    {
        this.productIntroduction = productIntroduction;
    }

    public String getProductIntroduction() 
    {
        return productIntroduction;
    }
    public void setRuleDescription(String ruleDescription) 
    {
        this.ruleDescription = ruleDescription;
    }

    public String getRuleDescription() 
    {
        return ruleDescription;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setStock(Long stock) 
    {
        this.stock = stock;
    }

    public Long getStock() 
    {
        return stock;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("goodsId", getGoodsId())
            .append("stationName", getStationName())
            .append("goodsImage", getGoodsImage())
            .append("goodsName", getGoodsName())
            .append("specifications", getSpecifications())
            .append("unit", getUnit())
            .append("integralExchangeRules", getIntegralExchangeRules())
            .append("moneyExchangeRules", getMoneyExchangeRules())
            .append("productIntroduction", getProductIntroduction())
            .append("ruleDescription", getRuleDescription())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("stock", getStock())
            .toString();
    }
}
