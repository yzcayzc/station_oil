package com.ruoyi.census.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.census.mapper.CIntegralStatisticsMapper;
import com.ruoyi.census.domain.CIntegralStatistics;
import com.ruoyi.census.service.ICIntegralStatisticsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 积分统计Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Service
public class CIntegralStatisticsServiceImpl implements ICIntegralStatisticsService 
{
    @Autowired
    private CIntegralStatisticsMapper cIntegralStatisticsMapper;

    /**
     * 查询积分统计
     * 
     * @param integralId 积分统计ID
     * @return 积分统计
     */
    @Override
    public CIntegralStatistics selectCIntegralStatisticsById(Long integralId)
    {
        return cIntegralStatisticsMapper.selectCIntegralStatisticsById(integralId);
    }

    /**
     * 查询积分统计列表
     * 
     * @param cIntegralStatistics 积分统计
     * @return 积分统计
     */
    @Override
    public List<CIntegralStatistics> selectCIntegralStatisticsList(CIntegralStatistics cIntegralStatistics)
    {
        return cIntegralStatisticsMapper.selectCIntegralStatisticsList(cIntegralStatistics);
    }

    /**
     * 新增积分统计
     * 
     * @param cIntegralStatistics 积分统计
     * @return 结果
     */
    @Override
    public int insertCIntegralStatistics(CIntegralStatistics cIntegralStatistics)
    {
        return cIntegralStatisticsMapper.insertCIntegralStatistics(cIntegralStatistics);
    }

    /**
     * 修改积分统计
     * 
     * @param cIntegralStatistics 积分统计
     * @return 结果
     */
    @Override
    public int updateCIntegralStatistics(CIntegralStatistics cIntegralStatistics)
    {
        return cIntegralStatisticsMapper.updateCIntegralStatistics(cIntegralStatistics);
    }

    /**
     * 删除积分统计对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCIntegralStatisticsByIds(String ids)
    {
        return cIntegralStatisticsMapper.deleteCIntegralStatisticsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除积分统计信息
     * 
     * @param integralId 积分统计ID
     * @return 结果
     */
    @Override
    public int deleteCIntegralStatisticsById(Long integralId)
    {
        return cIntegralStatisticsMapper.deleteCIntegralStatisticsById(integralId);
    }
}
