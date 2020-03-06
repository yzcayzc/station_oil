package com.ruoyi.census.mapper;

import com.ruoyi.census.domain.COilStationRevenue;
import java.util.List;

/**
 * 油站收入Mapper接口
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public interface COilStationRevenueMapper 
{
    /**
     * 查询油站收入
     * 
     * @param revenueId 油站收入ID
     * @return 油站收入
     */
    public COilStationRevenue selectCOilStationRevenueById(Long revenueId);

    /**
     * 查询油站收入列表
     * 
     * @param cOilStationRevenue 油站收入
     * @return 油站收入集合
     */
    public List<COilStationRevenue> selectCOilStationRevenueList(COilStationRevenue cOilStationRevenue);

    /**
     * 新增油站收入
     * 
     * @param cOilStationRevenue 油站收入
     * @return 结果
     */
    public int insertCOilStationRevenue(COilStationRevenue cOilStationRevenue);

    /**
     * 修改油站收入
     * 
     * @param cOilStationRevenue 油站收入
     * @return 结果
     */
    public int updateCOilStationRevenue(COilStationRevenue cOilStationRevenue);

    /**
     * 删除油站收入
     * 
     * @param revenueId 油站收入ID
     * @return 结果
     */
    public int deleteCOilStationRevenueById(Long revenueId);

    /**
     * 批量删除油站收入
     * 
     * @param revenueIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCOilStationRevenueByIds(String[] revenueIds);
}
