package com.ruoyi.activity.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.activity.mapper.FullDeliveryActivityMapper;
import com.ruoyi.activity.domain.FullDeliveryActivity;
import com.ruoyi.activity.service.IFullDeliveryActivityService;
import com.ruoyi.common.core.text.Convert;

/**
 * 加油满送活动设置Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class FullDeliveryActivityServiceImpl implements IFullDeliveryActivityService 
{
    @Autowired
    private FullDeliveryActivityMapper fullDeliveryActivityMapper;

    /**
     * 查询加油满送活动设置
     * 
     * @param activityId 加油满送活动设置ID
     * @return 加油满送活动设置
     */
    @Override
    public FullDeliveryActivity selectFullDeliveryActivityById(Long activityId)
    {
        return fullDeliveryActivityMapper.selectFullDeliveryActivityById(activityId);
    }

    /**
     * 查询加油满送活动设置列表
     * 
     * @param fullDeliveryActivity 加油满送活动设置
     * @return 加油满送活动设置
     */
    @Override
    public List<FullDeliveryActivity> selectFullDeliveryActivityList(FullDeliveryActivity fullDeliveryActivity)
    {
        return fullDeliveryActivityMapper.selectFullDeliveryActivityList(fullDeliveryActivity);
    }

    /**
     * 新增加油满送活动设置
     * 
     * @param fullDeliveryActivity 加油满送活动设置
     * @return 结果
     */
    @Override
    public int insertFullDeliveryActivity(FullDeliveryActivity fullDeliveryActivity)
    {
        return fullDeliveryActivityMapper.insertFullDeliveryActivity(fullDeliveryActivity);
    }

    /**
     * 修改加油满送活动设置
     * 
     * @param fullDeliveryActivity 加油满送活动设置
     * @return 结果
     */
    @Override
    public int updateFullDeliveryActivity(FullDeliveryActivity fullDeliveryActivity)
    {
        return fullDeliveryActivityMapper.updateFullDeliveryActivity(fullDeliveryActivity);
    }

    /**
     * 删除加油满送活动设置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteFullDeliveryActivityByIds(String ids)
    {
        return fullDeliveryActivityMapper.deleteFullDeliveryActivityByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除加油满送活动设置信息
     * 
     * @param activityId 加油满送活动设置ID
     * @return 结果
     */
    @Override
    public int deleteFullDeliveryActivityById(Long activityId)
    {
        return fullDeliveryActivityMapper.deleteFullDeliveryActivityById(activityId);
    }
}
