package com.ruoyi.promotion.mapper;

import com.ruoyi.promotion.domain.PActivityList;
import java.util.List;

/**
 * 活动列表Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-28
 */
public interface PActivityListMapper 
{
    /**
     * 查询活动列表
     * 
     * @param activityDetailsId 活动列表ID
     * @return 活动列表
     */
    public PActivityList selectPActivityListById(Long activityDetailsId);

    /**
     * 查询活动列表列表
     * 
     * @param pActivityList 活动列表
     * @return 活动列表集合
     */
    public List<PActivityList> selectPActivityListList(PActivityList pActivityList);

    /**
     * 新增活动列表
     * 
     * @param pActivityList 活动列表
     * @return 结果
     */
    public int insertPActivityList(PActivityList pActivityList);

    /**
     * 修改活动列表
     * 
     * @param pActivityList 活动列表
     * @return 结果
     */
    public int updatePActivityList(PActivityList pActivityList);

    /**
     * 删除活动列表
     * 
     * @param activityDetailsId 活动列表ID
     * @return 结果
     */
    public int deletePActivityListById(Long activityDetailsId);

    /**
     * 批量删除活动列表
     * 
     * @param activityDetailsIds 需要删除的数据ID
     * @return 结果
     */
    public int deletePActivityListByIds(String[] activityDetailsIds);
}
