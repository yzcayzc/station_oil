package com.ruoyi.systematic.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.ruoyi.station.domain.GasStation;
import com.ruoyi.station.service.IGasStationService;
import com.ruoyi.systematic.domain.SyCouponType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.systematic.mapper.SyCouponCenterMapper;
import com.ruoyi.systematic.domain.SyCouponCenter;
import com.ruoyi.systematic.service.ISyCouponCenterService;
import com.ruoyi.common.core.text.Convert;

import javax.xml.crypto.Data;

/**
 * 优惠券中心Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
@Service
public class SyCouponCenterServiceImpl implements ISyCouponCenterService 
{
    @Autowired
    private SyCouponCenterMapper syCouponCenterMapper;

    @Autowired
    private IGasStationService iGasStationService;

    @Autowired
    private SyCouponTypeServiceImpl syCouponTypeService;
    /**
     * 查询优惠券中心
     * 
     * @param couponId 优惠券中心ID
     * @return 优惠券中心
     */
    @Override
    public SyCouponCenter selectSyCouponCenterById(Long couponId)
    {
        return syCouponCenterMapper.selectSyCouponCenterById(couponId);
    }

    /**
     * 查询优惠券中心列表
     * 
     * @param syCouponCenter 优惠券中心
     * @return 优惠券中心
     */
    @Override
    public List<SyCouponCenter> selectSyCouponCenterList(SyCouponCenter syCouponCenter)
    {
        return syCouponCenterMapper.selectSyCouponCenterList(syCouponCenter);
    }

    /**
     * 新增优惠券中心
     * 
     * @param syCouponCenter 优惠券中心
     * @return 结果
     */
    @Override
    public int insertSyCouponCenter(SyCouponCenter syCouponCenter)
    {
        String s = new String();
        s = "8";
        //获得优惠券类型与优惠券类型表进行比较得出number
        String couponType = syCouponCenter.getCouponType();
        SyCouponType syCouponType = new SyCouponType();
        syCouponType.setCouponType(couponType);
        List<SyCouponType> syCouponTypes = syCouponTypeService.selectSyCouponTypeList(syCouponType);
        String s1 = null;
        for (SyCouponType type : syCouponTypes) {
            if (type.getNumber()!=null) {
                s1 = type.getNumber();
            }else{
                return 0;
            }
        }
        //通过加油站名称得出加油站编号
        String stationName = syCouponCenter.getStationName();
        GasStation gasStation = new GasStation();
        gasStation.setName(stationName);
        List<GasStation> gasStations = iGasStationService.selectGasStationList(gasStation);
        Long stationId = null;
        for (GasStation station : gasStations) {
            if (station.getStationId()!=null) {
                stationId = station.getStationId();
            }else{
                return 0;
            }
        }
        //得出加油站编号
        String s2 = stationId.toString();
        int length = s1.length();
        int i = 4-length;
        if (i>0){
            for (int l = 0;l<i;l++){
                s1 = "0"+s1;
            }
        }
        //得出时间把时间转化为字符串
        Date startTime = syCouponCenter.getStartTime();
        SimpleDateFormat simdate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str=simdate.format(startTime);
        //切割字符出串得出年末两位
        String s3 = str.substring(2,4);
        //切割字符串得出月分
        String s4 = str.substring(5,7);
        //得出编号
        Long number = syCouponCenter.getNumber();
        String s5 = number.toString();
        int length1 = s5.length();
        int h = 6-length1;
        if (h>0){
            for (int l = 0;l<h;l++){
                s5 = "0"+s5;
            }
        }
        syCouponCenter.setCouponNumber(s+s1+s2+s3+s4+s5);
        return syCouponCenterMapper.insertSyCouponCenter(syCouponCenter);
    }


    /**
     * 修改优惠券中心
     * 
     * @param syCouponCenter 优惠券中心
     * @return 结果
     */
    @Override
    public int updateSyCouponCenter(SyCouponCenter syCouponCenter)
    {
        return syCouponCenterMapper.updateSyCouponCenter(syCouponCenter);
    }

    /**
     * 删除优惠券中心对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSyCouponCenterByIds(String ids)
    {
        return syCouponCenterMapper.deleteSyCouponCenterByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除优惠券中心信息
     * 
     * @param couponId 优惠券中心ID
     * @return 结果
     */
    @Override
    public int deleteSyCouponCenterById(Long couponId)
    {
        return syCouponCenterMapper.deleteSyCouponCenterById(couponId);
    }
}
