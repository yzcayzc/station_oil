package com.ruoyi.member.service;

import com.ruoyi.member.domain.MCouponReceiveUse;
import java.util.List;

/**
 * 优惠券领取使用信息Service接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface IMCouponReceiveUseService 
{
    /**
     * 查询优惠券领取使用信息
     * 
     * @param couponReceiveUseId 优惠券领取使用信息ID
     * @return 优惠券领取使用信息
     */
    public MCouponReceiveUse selectMCouponReceiveUseById(Long couponReceiveUseId);

    /**
     * 查询优惠券领取使用信息列表
     * 
     * @param mCouponReceiveUse 优惠券领取使用信息
     * @return 优惠券领取使用信息集合
     */
    public List<MCouponReceiveUse> selectMCouponReceiveUseList(MCouponReceiveUse mCouponReceiveUse);

    /**
     * 新增优惠券领取使用信息
     * 
     * @param mCouponReceiveUse 优惠券领取使用信息
     * @return 结果
     */
    public int insertMCouponReceiveUse(MCouponReceiveUse mCouponReceiveUse);

    /**
     * 修改优惠券领取使用信息
     * 
     * @param mCouponReceiveUse 优惠券领取使用信息
     * @return 结果
     */
    public int updateMCouponReceiveUse(MCouponReceiveUse mCouponReceiveUse);

    /**
     * 批量删除优惠券领取使用信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMCouponReceiveUseByIds(String ids);

    /**
     * 删除优惠券领取使用信息信息
     * 
     * @param couponReceiveUseId 优惠券领取使用信息ID
     * @return 结果
     */
    public int deleteMCouponReceiveUseById(Long couponReceiveUseId);
}
