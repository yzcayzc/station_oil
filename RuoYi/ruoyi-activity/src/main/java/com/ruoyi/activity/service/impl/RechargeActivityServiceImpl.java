package com.ruoyi.activity.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.activity.mapper.RechargeActivityMapper;
import com.ruoyi.activity.domain.RechargeActivity;
import com.ruoyi.activity.service.IRechargeActivityService;
import com.ruoyi.common.core.text.Convert;

/**
 * 充值活动设置Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class RechargeActivityServiceImpl implements IRechargeActivityService 
{
    @Autowired
    private RechargeActivityMapper rechargeActivityMapper;

    /**
     * 查询充值活动设置
     * 
     * @param activityId 充值活动设置ID
     * @return 充值活动设置
     */
    @Override
    public RechargeActivity selectRechargeActivityById(Long activityId)
    {
        return rechargeActivityMapper.selectRechargeActivityById(activityId);
    }

    /**
     * 查询充值活动设置列表
     * 
     * @param rechargeActivity 充值活动设置
     * @return 充值活动设置
     */
    @Override
    public List<RechargeActivity> selectRechargeActivityList(RechargeActivity rechargeActivity)
    {
        return rechargeActivityMapper.selectRechargeActivityList(rechargeActivity);
    }

    /**
     * 新增充值活动设置
     * 
     * @param rechargeActivity 充值活动设置
     * @return 结果
     */
    @Override
    public int insertRechargeActivity(RechargeActivity rechargeActivity)
    {
        return rechargeActivityMapper.insertRechargeActivity(rechargeActivity);
    }

    /**
     * 修改充值活动设置
     * 
     * @param rechargeActivity 充值活动设置
     * @return 结果
     */
    @Override
    public int updateRechargeActivity(RechargeActivity rechargeActivity)
    {
        return rechargeActivityMapper.updateRechargeActivity(rechargeActivity);
    }

    /**
     * 删除充值活动设置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRechargeActivityByIds(String ids)
    {
        return rechargeActivityMapper.deleteRechargeActivityByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除充值活动设置信息
     * 
     * @param activityId 充值活动设置ID
     * @return 结果
     */
    @Override
    public int deleteRechargeActivityById(Long activityId)
    {
        return rechargeActivityMapper.deleteRechargeActivityById(activityId);
    }
}
