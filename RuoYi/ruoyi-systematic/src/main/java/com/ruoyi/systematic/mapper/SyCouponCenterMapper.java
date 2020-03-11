package com.ruoyi.systematic.mapper;

import com.ruoyi.systematic.domain.SyCouponCenter;
import java.util.List;

/**
 * 优惠券中心Mapper接口
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public interface SyCouponCenterMapper 
{
    /**
     * 查询优惠券中心
     * 
     * @param couponId 优惠券中心ID
     * @return 优惠券中心
     */
    public SyCouponCenter selectSyCouponCenterById(Long couponId);

    /**
     * 查询优惠券中心列表
     * 
     * @param syCouponCenter 优惠券中心
     * @return 优惠券中心集合
     */
    public List<SyCouponCenter> selectSyCouponCenterList(SyCouponCenter syCouponCenter);

    /**
     * 新增优惠券中心
     * 
     * @param syCouponCenter 优惠券中心
     * @return 结果
     */
    public int insertSyCouponCenter(SyCouponCenter syCouponCenter);

    /**
     * 修改优惠券中心
     * 
     * @param syCouponCenter 优惠券中心
     * @return 结果
     */
    public int updateSyCouponCenter(SyCouponCenter syCouponCenter);

    /**
     * 删除优惠券中心
     * 
     * @param couponId 优惠券中心ID
     * @return 结果
     */
    public int deleteSyCouponCenterById(Long couponId);

    /**
     * 批量删除优惠券中心
     * 
     * @param couponIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSyCouponCenterByIds(String[] couponIds);
}
