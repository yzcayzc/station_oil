package com.ruoyi.station.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.station.mapper.GasStationMapper;
import com.ruoyi.station.domain.GasStation;
import com.ruoyi.station.service.IGasStationService;
import com.ruoyi.common.core.text.Convert;

/**
 * 油站列表Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class GasStationServiceImpl implements IGasStationService 
{
    @Autowired
    private GasStationMapper gasStationMapper;

    /**
     * 查询油站列表
     * 
     * @param stationId 油站列表ID
     * @return 油站列表
     */
    @Override
    public GasStation selectGasStationById(Long stationId)
    {
        return gasStationMapper.selectGasStationById(stationId);
    }

    /**
     * 查询油站列表列表
     * 
     * @param gasStation 油站列表
     * @return 油站列表
     */
    @Override
    public List<GasStation> selectGasStationList(GasStation gasStation)
    {
        return gasStationMapper.selectGasStationList(gasStation);
    }

    /**
     * 新增油站列表
     * 
     * @param gasStation 油站列表
     * @return 结果
     */
    @Override
    public int insertGasStation(GasStation gasStation)
    {
        gasStation.setCreateTime(DateUtils.getNowDate());
        return gasStationMapper.insertGasStation(gasStation);
    }

    /**
     * 修改油站列表
     * 
     * @param gasStation 油站列表
     * @return 结果
     */
    @Override
    public int updateGasStation(GasStation gasStation)
    {
        return gasStationMapper.updateGasStation(gasStation);
    }

    /**
     * 删除油站列表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteGasStationByIds(String ids)
    {
        return gasStationMapper.deleteGasStationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除油站列表信息
     * 
     * @param stationId 油站列表ID
     * @return 结果
     */
    @Override
    public int deleteGasStationById(Long stationId)
    {
        return gasStationMapper.deleteGasStationById(stationId);
    }
}
