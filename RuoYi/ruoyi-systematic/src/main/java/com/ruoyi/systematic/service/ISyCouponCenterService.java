package com.ruoyi.systematic.service;

import com.ruoyi.systematic.domain.SyCouponCenter;
import java.util.List;

/**
 * 优惠券中心Service接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface ISyCouponCenterService 
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
     * 批量删除优惠券中心
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSyCouponCenterByIds(String ids);

    /**
     * 删除优惠券中心信息
     * 
     * @param couponId 优惠券中心ID
     * @return 结果
     */
    public int deleteSyCouponCenterById(Long couponId);
}
