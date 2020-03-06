package com.ruoyi.census.service;

import com.ruoyi.census.domain.CActivityOverview;
import java.util.List;

/**
 * 活动总览Service接口
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public interface ICActivityOverviewService 
{
    /**
     * 查询活动总览
     * 
     * @param activity 活动总览ID
     * @return 活动总览
     */
    public CActivityOverview selectCActivityOverviewById(Long activity);

    /**
     * 查询活动总览列表
     * 
     * @param cActivityOverview 活动总览
     * @return 活动总览集合
     */
    public List<CActivityOverview> selectCActivityOverviewList(CActivityOverview cActivityOverview);

    /**
     * 新增活动总览
     * 
     * @param cActivityOverview 活动总览
     * @return 结果
     */
    public int insertCActivityOverview(CActivityOverview cActivityOverview);

    /**
     * 修改活动总览
     * 
     * @param cActivityOverview 活动总览
     * @return 结果
     */
    public int updateCActivityOverview(CActivityOverview cActivityOverview);

    /**
     * 批量删除活动总览
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCActivityOverviewByIds(String ids);

    /**
     * 删除活动总览信息
     * 
     * @param activity 活动总览ID
     * @return 结果
     */
    public int deleteCActivityOverviewById(Long activity);
}
