package com.ruoyi.promotion.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.promotion.mapper.PActivityListMapper;
import com.ruoyi.promotion.domain.PActivityList;
import com.ruoyi.promotion.service.IPActivityListService;
import com.ruoyi.common.core.text.Convert;

/**
 * 活动列表Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-28
 */
@Service
public class PActivityListServiceImpl implements IPActivityListService 
{
    @Autowired
    private PActivityListMapper pActivityListMapper;

    /**
     * 查询活动列表
     * 
     * @param activityDetailsId 活动列表ID
     * @return 活动列表
     */
    @Override
    public PActivityList selectPActivityListById(Long activityDetailsId)
    {
        return pActivityListMapper.selectPActivityListById(activityDetailsId);
    }

    /**
     * 查询活动列表列表
     * 
     * @param pActivityList 活动列表
     * @return 活动列表
     */
    @Override
    public List<PActivityList> selectPActivityListList(PActivityList pActivityList)
    {
        List<PActivityList> pActivityLists = pActivityListMapper.selectPActivityListList(pActivityList);
        for (PActivityList activityList : pActivityLists) {
            String commodityPictures = activityList.getCommodityPictures();
            activityList.setCommodityPictures("["+commodityPictures+"]");
        }
        return pActivityLists;
    }

    /**
     * 新增活动列表
     * 
     * @param pActivityList 活动列表
     * @return 结果
     */
    @Override
    public int insertPActivityList(PActivityList pActivityList)
    {
        return pActivityListMapper.insertPActivityList(pActivityList);
    }

    /**
     * 修改活动列表
     * 
     * @param pActivityList 活动列表
     * @return 结果
     */
    @Override
    public int updatePActivityList(PActivityList pActivityList)
    {
        return pActivityListMapper.updatePActivityList(pActivityList);
    }

    /**
     * 删除活动列表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePActivityListByIds(String ids)
    {
        return pActivityListMapper.deletePActivityListByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除活动列表信息
     * 
     * @param activityDetailsId 活动列表ID
     * @return 结果
     */
    @Override
    public int deletePActivityListById(Long activityDetailsId)
    {
        return pActivityListMapper.deletePActivityListById(activityDetailsId);
    }
}
