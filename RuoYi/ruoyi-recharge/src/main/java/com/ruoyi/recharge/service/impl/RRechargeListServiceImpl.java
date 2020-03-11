package com.ruoyi.recharge.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.ruoyi.station.domain.GasStation;
import com.ruoyi.station.service.IGasStationService;
import com.ruoyi.station.service.impl.GasStationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.recharge.mapper.RRechargeListMapper;
import com.ruoyi.recharge.domain.RRechargeList;
import com.ruoyi.recharge.service.IRRechargeListService;
import com.ruoyi.common.core.text.Convert;

/**
 * 充值列表Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
@Service
public class RRechargeListServiceImpl implements IRRechargeListService 
{
    @Autowired
    private RRechargeListMapper rRechargeListMapper;

    @Autowired
    private IGasStationService iGasStationService;

    /**
     * 查询充值列表
     * 
     * @param rechargeId 充值列表ID
     * @return 充值列表
     */
    @Override
    public RRechargeList selectRRechargeListById(Long rechargeId)
    {
        return rRechargeListMapper.selectRRechargeListById(rechargeId);
    }

    /**
     * 查询充值列表列表
     * 
     * @param rRechargeList 充值列表
     * @return 充值列表
     */
    @Override
    public List<RRechargeList> selectRRechargeListList(RRechargeList rRechargeList)
    {
        return rRechargeListMapper.selectRRechargeListList(rRechargeList);
    }

    /**
     * 新增充值列表
     * 
     * @param rRechargeList 充值列表
     * @return 结果
     */
    @Override
    public int insertRRechargeList(RRechargeList rRechargeList)
    {
        //通过加油站得出加油站编号
        String stationName = rRechargeList.getStationName();
        GasStation gasStation = new GasStation();
        gasStation.setName(stationName);
        List<GasStation> gasStations = iGasStationService.selectGasStationList(gasStation);
        Long stationId = null;
        for (GasStation station : gasStations) {
            stationId = station.getStationId();
        }
        //得出加油站编号
        String s = stationId.toString();
        int length = s.length();
        int i = 4-length;
        if (i>0){
            for (int l = 0;l<i;l++){
                s = "0"+s;
            }
        }
        //得出时间把时间转化为字符串
        Date startTime = rRechargeList.getTime();
        SimpleDateFormat simdate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str=simdate.format(startTime);
        //切割字符串得出年月日
        String s1 = str.substring(0, 4);
        String s2 = str.substring(5, 7);
        String s3 = str.substring(8, 10);
        //通过id得到编号
        Long rechargeId = rRechargeList.getRechargeNumber();
        String s4 = rechargeId.toString();
        int length1 = s4.length();
        int h = 6-length1;
        if (h>0){
            for (int l = 0;l<h;l++){
                s4 = "0"+s4;
            }
        }
        //得出订单号
        String s5 = s+s1+s2+s3+s4;
        Long aDouble = Long.valueOf(s5);
        rRechargeList.setOrderNumber(aDouble);
        return rRechargeListMapper.insertRRechargeList(rRechargeList);
    }

    /**
     * 修改充值列表
     * 
     * @param rRechargeList 充值列表
     * @return 结果
     */
    @Override
    public int updateRRechargeList(RRechargeList rRechargeList)
    {
        return rRechargeListMapper.updateRRechargeList(rRechargeList);
    }

    /**
     * 删除充值列表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRRechargeListByIds(String ids)
    {
        return rRechargeListMapper.deleteRRechargeListByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除充值列表信息
     * 
     * @param rechargeId 充值列表ID
     * @return 结果
     */
    @Override
    public int deleteRRechargeListById(Long rechargeId)
    {
        return rRechargeListMapper.deleteRRechargeListById(rechargeId);
    }
}
