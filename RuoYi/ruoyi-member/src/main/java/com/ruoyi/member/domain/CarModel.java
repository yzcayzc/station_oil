package com.ruoyi.member.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 型号表对象 car_model
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public class CarModel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long modelId;

    /** 型号 */
    @Excel(name = "型号")
    private String model;

    /** 编号 */
    @Excel(name = "编号")
    private Long number;

    public void setModelId(Long modelId) 
    {
        this.modelId = modelId;
    }

    public Long getModelId() 
    {
        return modelId;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("modelId", getModelId())
            .append("model", getModel())
            .append("number", getNumber())
            .toString();
    }
}
