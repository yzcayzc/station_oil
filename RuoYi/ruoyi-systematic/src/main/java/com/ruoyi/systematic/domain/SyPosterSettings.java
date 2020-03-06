package com.ruoyi.systematic.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 海报设置对象 sy_poster_settings
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class SyPosterSettings extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long posterSettingsId;

    /** 编号 */
    @Excel(name = "编号")
    private Long number;

    /** 图片 */
    @Excel(name = "图片")
    private String image;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 状态（0正常，1关闭） */
    @Excel(name = "状态", readConverterExp = "0=正常，1关闭")
    private String status;

    public void setPosterSettingsId(Long posterSettingsId) 
    {
        this.posterSettingsId = posterSettingsId;
    }

    public Long getPosterSettingsId() 
    {
        return posterSettingsId;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setImage(String image) 
    {
        this.image = image;
    }

    public String getImage() 
    {
        return image;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
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
            .append("posterSettingsId", getPosterSettingsId())
            .append("number", getNumber())
            .append("image", getImage())
            .append("title", getTitle())
            .append("status", getStatus())
            .toString();
    }
}
