package com.ruoyi.census.service;

import com.ruoyi.census.domain.CCouponStatistics;
import java.util.List;

/**
 * 优惠券系统Service接口
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public interface ICCouponStatisticsService 
{
    /**
     * 查询优惠券系统
     * 
     * @param couponStatisticsId 优惠券系统ID
     * @return 优惠券系统
     */
    public CCouponStatistics selectCCouponStatisticsById(Long couponStatisticsId);

    /**
     * 查询优惠券系统列表
     * 
     * @param cCouponStatistics 优惠券系统
     * @return 优惠券系统集合
     */
    public List<CCouponStatistics> selectCCouponStatisticsList(CCouponStatistics cCouponStatistics);

    /**
     * 新增优惠券系统
     * 
     * @param cCouponStatistics 优惠券系统
     * @return 结果
     */
    public int insertCCouponStatistics(CCouponStatistics cCouponStatistics);

    /**
     * 修改优惠券系统
     * 
     * @param cCouponStatistics 优惠券系统
     * @return 结果
     */
    public int updateCCouponStatistics(CCouponStatistics cCouponStatistics);

    /**
     * 批量删除优惠券系统
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCCouponStatisticsByIds(String ids);

    /**
     * 删除优惠券系统信息
     * 
     * @param couponStatisticsId 优惠券系统ID
     * @return 结果
     */
    public int deleteCCouponStatisticsById(Long couponStatisticsId);
}
