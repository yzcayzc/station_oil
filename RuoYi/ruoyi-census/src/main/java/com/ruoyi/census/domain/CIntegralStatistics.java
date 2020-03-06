package com.ruoyi.census.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 积分统计对象 c_integral_statistics
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public class CIntegralStatistics extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 积分统计 */
    private Long integralId;

    /** 序号 */
    @Excel(name = "序号")
    private Long number;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 加油站名称 */
    @Excel(name = "加油站名称")
    private String stationName;

    /** 积分赠送 */
    @Excel(name = "积分赠送")
    private Long presentationOfPoints;

    /** 积分抵扣 */
    @Excel(name = "积分抵扣")
    private Long integralDeduction;

    /** 剩余积分 */
    @Excel(name = "剩余积分")
    private Long residualIntegral;

    /** 日期 */
    @Excel(name = "日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date time;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String phone;

    public void setIntegralId(Long integralId) 
    {
        this.integralId = integralId;
    }

    public Long getIntegralId() 
    {
        return integralId;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }
    public void setPresentationOfPoints(Long presentationOfPoints) 
    {
        this.presentationOfPoints = presentationOfPoints;
    }

    public Long getPresentationOfPoints() 
    {
        return presentationOfPoints;
    }
    public void setIntegralDeduction(Long integralDeduction) 
    {
        this.integralDeduction = integralDeduction;
    }

    public Long getIntegralDeduction() 
    {
        return integralDeduction;
    }
    public void setResidualIntegral(Long residualIntegral) 
    {
        this.residualIntegral = residualIntegral;
    }

    public Long getResidualIntegral() 
    {
        return residualIntegral;
    }
    public void setTime(Date time) 
    {
        this.time = time;
    }

    public Date getTime() 
    {
        return time;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("integralId", getIntegralId())
            .append("number", getNumber())
            .append("name", getName())
            .append("stationName", getStationName())
            .append("presentationOfPoints", getPresentationOfPoints())
            .append("integralDeduction", getIntegralDeduction())
            .append("residualIntegral", getResidualIntegral())
            .append("time", getTime())
            .append("phone", getPhone())
            .toString();
    }
}
