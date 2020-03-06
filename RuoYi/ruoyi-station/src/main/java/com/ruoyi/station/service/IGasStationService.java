package com.ruoyi.station.service;

import com.ruoyi.station.domain.GasStation;
import java.util.List;

/**
 * 油站列表Service接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface IGasStationService 
{
    /**
     * 查询油站列表
     * 
     * @param stationId 油站列表ID
     * @return 油站列表
     */
    public GasStation selectGasStationById(Long stationId);

    /**
     * 查询油站列表列表
     * 
     * @param gasStation 油站列表
     * @return 油站列表集合
     */
    public List<GasStation> selectGasStationList(GasStation gasStation);

    /**
     * 新增油站列表
     * 
     * @param gasStation 油站列表
     * @return 结果
     */
    public int insertGasStation(GasStation gasStation);

    /**
     * 修改油站列表
     * 
     * @param gasStation 油站列表
     * @return 结果
     */
    public int updateGasStation(GasStation gasStation);

    /**
     * 批量删除油站列表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteGasStationByIds(String ids);

    /**
     * 删除油站列表信息
     * 
     * @param stationId 油站列表ID
     * @return 结果
     */
    public int deleteGasStationById(Long stationId);
}
