package com.ruoyi.census.mapper;

import com.ruoyi.census.domain.CIntegralStatistics;
import java.util.List;

/**
 * 积分统计Mapper接口
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public interface CIntegralStatisticsMapper 
{
    /**
     * 查询积分统计
     * 
     * @param integralId 积分统计ID
     * @return 积分统计
     */
    public CIntegralStatistics selectCIntegralStatisticsById(Long integralId);

    /**
     * 查询积分统计列表
     * 
     * @param cIntegralStatistics 积分统计
     * @return 积分统计集合
     */
    public List<CIntegralStatistics> selectCIntegralStatisticsList(CIntegralStatistics cIntegralStatistics);

    /**
     * 新增积分统计
     * 
     * @param cIntegralStatistics 积分统计
     * @return 结果
     */
    public int insertCIntegralStatistics(CIntegralStatistics cIntegralStatistics);

    /**
     * 修改积分统计
     * 
     * @param cIntegralStatistics 积分统计
     * @return 结果
     */
    public int updateCIntegralStatistics(CIntegralStatistics cIntegralStatistics);

    /**
     * 删除积分统计
     * 
     * @param integralId 积分统计ID
     * @return 结果
     */
    public int deleteCIntegralStatisticsById(Long integralId);

    /**
     * 批量删除积分统计
     * 
     * @param integralIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCIntegralStatisticsByIds(String[] integralIds);
}
