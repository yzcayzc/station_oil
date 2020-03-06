package com.ruoyi.station.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 基本信息对象 s_essential_information
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class SEssentialInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 基本信息id */
    private Long sEssentialInformationId;

    /** 油站名称 */
    @Excel(name = "油站名称")
    private String stationName;

    /** 油站昵称 */
    @Excel(name = "油站昵称")
    private String stationNickname;

    /** 负责人 */
    @Excel(name = "负责人")
    private String personLiable;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 地址 */
    @Excel(name = "地址")
    private String adress;

    /** 上级分类 */
    @Excel(name = "上级分类")
    private String categoryParent;

    public void setsEssentialInformationId(Long sEssentialInformationId) 
    {
        this.sEssentialInformationId = sEssentialInformationId;
    }

    public Long getsEssentialInformationId() 
    {
        return sEssentialInformationId;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setStationNickname(String stationNickname) 
    {
        this.stationNickname = stationNickname;
    }

    public String getStationNickname() 
    {
        return stationNickname;
    }
    public void setPersonLiable(String personLiable) 
    {
        this.personLiable = personLiable;
    }

    public String getPersonLiable() 
    {
        return personLiable;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setAdress(String adress) 
    {
        this.adress = adress;
    }

    public String getAdress() 
    {
        return adress;
    }
    public void setCategoryParent(String categoryParent) 
    {
        this.categoryParent = categoryParent;
    }

    public String getCategoryParent() 
    {
        return categoryParent;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("sEssentialInformationId", getsEssentialInformationId())
            .append("stationName", getStationName())
            .append("stationNickname", getStationNickname())
            .append("personLiable", getPersonLiable())
            .append("phone", getPhone())
            .append("adress", getAdress())
            .append("categoryParent", getCategoryParent())
            .append("createTime", getCreateTime())
            .toString();
    }
}
