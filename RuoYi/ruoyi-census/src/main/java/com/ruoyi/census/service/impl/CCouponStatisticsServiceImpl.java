package com.ruoyi.census.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.census.mapper.CCouponStatisticsMapper;
import com.ruoyi.census.domain.CCouponStatistics;
import com.ruoyi.census.service.ICCouponStatisticsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 优惠券系统Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Service
public class CCouponStatisticsServiceImpl implements ICCouponStatisticsService 
{
    @Autowired
    private CCouponStatisticsMapper cCouponStatisticsMapper;

    /**
     * 查询优惠券系统
     * 
     * @param couponStatisticsId 优惠券系统ID
     * @return 优惠券系统
     */
    @Override
    public CCouponStatistics selectCCouponStatisticsById(Long couponStatisticsId)
    {
        return cCouponStatisticsMapper.selectCCouponStatisticsById(couponStatisticsId);
    }

    /**
     * 查询优惠券系统列表
     * 
     * @param cCouponStatistics 优惠券系统
     * @return 优惠券系统
     */
    @Override
    public List<CCouponStatistics> selectCCouponStatisticsList(CCouponStatistics cCouponStatistics)
    {
        return cCouponStatisticsMapper.selectCCouponStatisticsList(cCouponStatistics);
    }

    /**
     * 新增优惠券系统
     * 
     * @param cCouponStatistics 优惠券系统
     * @return 结果
     */
    @Override
    public int insertCCouponStatistics(CCouponStatistics cCouponStatistics)
    {
        return cCouponStatisticsMapper.insertCCouponStatistics(cCouponStatistics);
    }

    /**
     * 修改优惠券系统
     * 
     * @param cCouponStatistics 优惠券系统
     * @return 结果
     */
    @Override
    public int updateCCouponStatistics(CCouponStatistics cCouponStatistics)
    {
        return cCouponStatisticsMapper.updateCCouponStatistics(cCouponStatistics);
    }

    /**
     * 删除优惠券系统对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCCouponStatisticsByIds(String ids)
    {
        return cCouponStatisticsMapper.deleteCCouponStatisticsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除优惠券系统信息
     * 
     * @param couponStatisticsId 优惠券系统ID
     * @return 结果
     */
    @Override
    public int deleteCCouponStatisticsById(Long couponStatisticsId)
    {
        return cCouponStatisticsMapper.deleteCCouponStatisticsById(couponStatisticsId);
    }
}
