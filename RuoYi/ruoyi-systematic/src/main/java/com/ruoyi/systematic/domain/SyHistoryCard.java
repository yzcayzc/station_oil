package com.ruoyi.systematic.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 历史信息对象 sy_history_card
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class SyHistoryCard extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long card;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 类别 */
    @Excel(name = "类别")
    private String cardType;

    /** 发布单位 */
    @Excel(name = "发布单位")
    private String publishingUnit;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 内容描述 */
    @Excel(name = "内容描述")
    private String contentDescription;

    /** 开始时间 */
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 操作人 */
    @Excel(name = "操作人")
    private String operator;

    /** 操作 */
    @Excel(name = "操作")
    private String operation;

    public void setCard(Long card) 
    {
        this.card = card;
    }

    public Long getCard() 
    {
        return card;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setCardType(String cardType) 
    {
        this.cardType = cardType;
    }

    public String getCardType() 
    {
        return cardType;
    }
    public void setPublishingUnit(String publishingUnit) 
    {
        this.publishingUnit = publishingUnit;
    }

    public String getPublishingUnit() 
    {
        return publishingUnit;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setContentDescription(String contentDescription) 
    {
        this.contentDescription = contentDescription;
    }

    public String getContentDescription() 
    {
        return contentDescription;
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
    public void setOperator(String operator) 
    {
        this.operator = operator;
    }

    public String getOperator() 
    {
        return operator;
    }
    public void setOperation(String operation) 
    {
        this.operation = operation;
    }

    public String getOperation() 
    {
        return operation;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("card", getCard())
            .append("number", getNumber())
            .append("cardType", getCardType())
            .append("publishingUnit", getPublishingUnit())
            .append("title", getTitle())
            .append("contentDescription", getContentDescription())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("operator", getOperator())
            .append("operation", getOperation())
            .append("createTime", getCreateTime())
            .toString();
    }
}
