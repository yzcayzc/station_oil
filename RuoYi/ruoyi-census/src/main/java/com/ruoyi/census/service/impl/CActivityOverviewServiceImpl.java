package com.ruoyi.census.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.census.mapper.CActivityOverviewMapper;
import com.ruoyi.census.domain.CActivityOverview;
import com.ruoyi.census.service.ICActivityOverviewService;
import com.ruoyi.common.core.text.Convert;

/**
 * 活动总览Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Service
public class CActivityOverviewServiceImpl implements ICActivityOverviewService 
{
    @Autowired
    private CActivityOverviewMapper cActivityOverviewMapper;

    /**
     * 查询活动总览
     * 
     * @param activity 活动总览ID
     * @return 活动总览
     */
    @Override
    public CActivityOverview selectCActivityOverviewById(Long activity)
    {
        return cActivityOverviewMapper.selectCActivityOverviewById(activity);
    }

    /**
     * 查询活动总览列表
     * 
     * @param cActivityOverview 活动总览
     * @return 活动总览
     */
    @Override
    public List<CActivityOverview> selectCActivityOverviewList(CActivityOverview cActivityOverview)
    {
        return cActivityOverviewMapper.selectCActivityOverviewList(cActivityOverview);
    }

    /**
     * 新增活动总览
     * 
     * @param cActivityOverview 活动总览
     * @return 结果
     */
    @Override
    public int insertCActivityOverview(CActivityOverview cActivityOverview)
    {
        return cActivityOverviewMapper.insertCActivityOverview(cActivityOverview);
    }

    /**
     * 修改活动总览
     * 
     * @param cActivityOverview 活动总览
     * @return 结果
     */
    @Override
    public int updateCActivityOverview(CActivityOverview cActivityOverview)
    {
        return cActivityOverviewMapper.updateCActivityOverview(cActivityOverview);
    }

    /**
     * 删除活动总览对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCActivityOverviewByIds(String ids)
    {
        return cActivityOverviewMapper.deleteCActivityOverviewByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除活动总览信息
     * 
     * @param activity 活动总览ID
     * @return 结果
     */
    @Override
    public int deleteCActivityOverviewById(Long activity)
    {
        return cActivityOverviewMapper.deleteCActivityOverviewById(activity);
    }
}
