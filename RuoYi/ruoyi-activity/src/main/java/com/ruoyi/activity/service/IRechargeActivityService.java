package com.ruoyi.activity.service;

import com.ruoyi.activity.domain.RechargeActivity;
import java.util.List;

/**
 * 充值活动设置Service接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface IRechargeActivityService 
{
    /**
     * 查询充值活动设置
     * 
     * @param activityId 充值活动设置ID
     * @return 充值活动设置
     */
    public RechargeActivity selectRechargeActivityById(Long activityId);

    /**
     * 查询充值活动设置列表
     * 
     * @param rechargeActivity 充值活动设置
     * @return 充值活动设置集合
     */
    public List<RechargeActivity> selectRechargeActivityList(RechargeActivity rechargeActivity);

    /**
     * 新增充值活动设置
     * 
     * @param rechargeActivity 充值活动设置
     * @return 结果
     */
    public int insertRechargeActivity(RechargeActivity rechargeActivity);

    /**
     * 修改充值活动设置
     * 
     * @param rechargeActivity 充值活动设置
     * @return 结果
     */
    public int updateRechargeActivity(RechargeActivity rechargeActivity);

    /**
     * 批量删除充值活动设置
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRechargeActivityByIds(String ids);

    /**
     * 删除充值活动设置信息
     * 
     * @param activityId 充值活动设置ID
     * @return 结果
     */
    public int deleteRechargeActivityById(Long activityId);
}
