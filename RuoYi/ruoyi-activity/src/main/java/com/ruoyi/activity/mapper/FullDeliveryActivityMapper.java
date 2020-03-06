package com.ruoyi.activity.mapper;

import com.ruoyi.activity.domain.FullDeliveryActivity;
import java.util.List;

/**
 * 加油满送活动设置Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface FullDeliveryActivityMapper 
{
    /**
     * 查询加油满送活动设置
     * 
     * @param activityId 加油满送活动设置ID
     * @return 加油满送活动设置
     */
    public FullDeliveryActivity selectFullDeliveryActivityById(Long activityId);

    /**
     * 查询加油满送活动设置列表
     * 
     * @param fullDeliveryActivity 加油满送活动设置
     * @return 加油满送活动设置集合
     */
    public List<FullDeliveryActivity> selectFullDeliveryActivityList(FullDeliveryActivity fullDeliveryActivity);

    /**
     * 新增加油满送活动设置
     * 
     * @param fullDeliveryActivity 加油满送活动设置
     * @return 结果
     */
    public int insertFullDeliveryActivity(FullDeliveryActivity fullDeliveryActivity);

    /**
     * 修改加油满送活动设置
     * 
     * @param fullDeliveryActivity 加油满送活动设置
     * @return 结果
     */
    public int updateFullDeliveryActivity(FullDeliveryActivity fullDeliveryActivity);

    /**
     * 删除加油满送活动设置
     * 
     * @param activityId 加油满送活动设置ID
     * @return 结果
     */
    public int deleteFullDeliveryActivityById(Long activityId);

    /**
     * 批量删除加油满送活动设置
     * 
     * @param activityIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteFullDeliveryActivityByIds(String[] activityIds);
}
