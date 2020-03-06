package com.ruoyi.census.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.census.mapper.COilStationRevenueMapper;
import com.ruoyi.census.domain.COilStationRevenue;
import com.ruoyi.census.service.ICOilStationRevenueService;
import com.ruoyi.common.core.text.Convert;

/**
 * 油站收入Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Service
public class COilStationRevenueServiceImpl implements ICOilStationRevenueService 
{
    @Autowired
    private COilStationRevenueMapper cOilStationRevenueMapper;

    /**
     * 查询油站收入
     * 
     * @param revenueId 油站收入ID
     * @return 油站收入
     */
    @Override
    public COilStationRevenue selectCOilStationRevenueById(Long revenueId)
    {
        return cOilStationRevenueMapper.selectCOilStationRevenueById(revenueId);
    }

    /**
     * 查询油站收入列表
     * 
     * @param cOilStationRevenue 油站收入
     * @return 油站收入
     */
    @Override
    public List<COilStationRevenue> selectCOilStationRevenueList(COilStationRevenue cOilStationRevenue)
    {
        return cOilStationRevenueMapper.selectCOilStationRevenueList(cOilStationRevenue);
    }

    /**
     * 新增油站收入
     * 
     * @param cOilStationRevenue 油站收入
     * @return 结果
     */
    @Override
    public int insertCOilStationRevenue(COilStationRevenue cOilStationRevenue)
    {
        return cOilStationRevenueMapper.insertCOilStationRevenue(cOilStationRevenue);
    }

    /**
     * 修改油站收入
     * 
     * @param cOilStationRevenue 油站收入
     * @return 结果
     */
    @Override
    public int updateCOilStationRevenue(COilStationRevenue cOilStationRevenue)
    {
        return cOilStationRevenueMapper.updateCOilStationRevenue(cOilStationRevenue);
    }

    /**
     * 删除油站收入对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCOilStationRevenueByIds(String ids)
    {
        return cOilStationRevenueMapper.deleteCOilStationRevenueByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除油站收入信息
     * 
     * @param revenueId 油站收入ID
     * @return 结果
     */
    @Override
    public int deleteCOilStationRevenueById(Long revenueId)
    {
        return cOilStationRevenueMapper.deleteCOilStationRevenueById(revenueId);
    }
}
