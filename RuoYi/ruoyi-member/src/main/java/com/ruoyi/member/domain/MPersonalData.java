package com.ruoyi.member.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 会员基本信息对象 m_personal_data
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public class MPersonalData extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 信息id */
    private Long dataId;

    /** 昵称 */
    @Excel(name = "昵称")
    private String petName;

    /** 真实姓名 */
    @Excel(name = "真实姓名")
    private String name;

    /** 生日 */
    @Excel(name = "生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birth;

    /** 性别（0男，1女，2不知） */
    @Excel(name = "性别", readConverterExp = "0=男，1女，2不知")
    private String sex;

    /** 职业 */
    @Excel(name = "职业")
    private String occupation;

    /** 身份证号码 */
    @Excel(name = "身份证号码")
    private String idCard;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phone;

    /** 工作单位 */
    @Excel(name = "工作单位")
    private String workUnit;

    /** 住址 */
    @Excel(name = "住址")
    private String address;

    /** 积分余额 */
    @Excel(name = "积分余额")
    private Long integralBalance;

    /** 钱包余额 */
    @Excel(name = "钱包余额")
    private Long walletBalance;

    /** 车品牌 */
    @Excel(name = "车品牌")
    private String carBrand;

    /** 车牌号 */
    @Excel(name = "车牌号")
    private String licensePlate;

    /** 油品 */
    @Excel(name = "油品")
    private String oils;

    /** 车类型 */
    @Excel(name = "车类型")
    private String carType;

    /** 加油站 */
    @Excel(name = "加油站")
    private String stationName;

    public void setDataId(Long dataId) 
    {
        this.dataId = dataId;
    }

    public Long getDataId() 
    {
        return dataId;
    }
    public void setPetName(String petName) 
    {
        this.petName = petName;
    }

    public String getPetName() 
    {
        return petName;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setBirth(Date birth) 
    {
        this.birth = birth;
    }

    public Date getBirth() 
    {
        return birth;
    }
    public void setSex(String sex) 
    {
        this.sex = sex;
    }

    public String getSex() 
    {
        return sex;
    }
    public void setOccupation(String occupation) 
    {
        this.occupation = occupation;
    }

    public String getOccupation() 
    {
        return occupation;
    }
    public void setIdCard(String idCard) 
    {
        this.idCard = idCard;
    }

    public String getIdCard() 
    {
        return idCard;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setWorkUnit(String workUnit) 
    {
        this.workUnit = workUnit;
    }

    public String getWorkUnit() 
    {
        return workUnit;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setIntegralBalance(Long integralBalance) 
    {
        this.integralBalance = integralBalance;
    }

    public Long getIntegralBalance() 
    {
        return integralBalance;
    }
    public void setWalletBalance(Long walletBalance) 
    {
        this.walletBalance = walletBalance;
    }

    public Long getWalletBalance() 
    {
        return walletBalance;
    }
    public void setCarBrand(String carBrand) 
    {
        this.carBrand = carBrand;
    }

    public String getCarBrand() 
    {
        return carBrand;
    }
    public void setLicensePlate(String licensePlate) 
    {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() 
    {
        return licensePlate;
    }
    public void setOils(String oils) 
    {
        this.oils = oils;
    }

    public String getOils() 
    {
        return oils;
    }
    public void setCarType(String carType) 
    {
        this.carType = carType;
    }

    public String getCarType() 
    {
        return carType;
    }
    public void setStationName(String stationName) 
    {
        this.stationName = stationName;
    }

    public String getStationName() 
    {
        return stationName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("dataId", getDataId())
            .append("petName", getPetName())
            .append("name", getName())
            .append("birth", getBirth())
            .append("sex", getSex())
            .append("occupation", getOccupation())
            .append("idCard", getIdCard())
            .append("phone", getPhone())
            .append("workUnit", getWorkUnit())
            .append("address", getAddress())
            .append("integralBalance", getIntegralBalance())
            .append("walletBalance", getWalletBalance())
            .append("carBrand", getCarBrand())
            .append("licensePlate", getLicensePlate())
            .append("oils", getOils())
            .append("carType", getCarType())
            .append("stationName", getStationName())
            .toString();
    }
}
