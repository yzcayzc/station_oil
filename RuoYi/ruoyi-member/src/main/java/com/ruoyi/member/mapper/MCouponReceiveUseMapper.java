package com.ruoyi.member.mapper;

import com.ruoyi.member.domain.MCouponReceiveUse;
import java.util.List;

/**
 * 优惠券的领取和使用Mapper接口
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public interface MCouponReceiveUseMapper 
{
    /**
     * 查询优惠券的领取和使用
     * 
     * @param couponReceiveUseId 优惠券的领取和使用ID
     * @return 优惠券的领取和使用
     */
    public MCouponReceiveUse selectMCouponReceiveUseById(Long couponReceiveUseId);

    /**
     * 查询优惠券的领取和使用列表
     * 
     * @param mCouponReceiveUse 优惠券的领取和使用
     * @return 优惠券的领取和使用集合
     */
    public List<MCouponReceiveUse> selectMCouponReceiveUseList(MCouponReceiveUse mCouponReceiveUse);

    /**
     * 新增优惠券的领取和使用
     * 
     * @param mCouponReceiveUse 优惠券的领取和使用
     * @return 结果
     */
    public int insertMCouponReceiveUse(MCouponReceiveUse mCouponReceiveUse);

    /**
     * 修改优惠券的领取和使用
     * 
     * @param mCouponReceiveUse 优惠券的领取和使用
     * @return 结果
     */
    public int updateMCouponReceiveUse(MCouponReceiveUse mCouponReceiveUse);

    /**
     * 删除优惠券的领取和使用
     * 
     * @param couponReceiveUseId 优惠券的领取和使用ID
     * @return 结果
     */
    public int deleteMCouponReceiveUseById(Long couponReceiveUseId);

    /**
     * 批量删除优惠券的领取和使用
     * 
     * @param couponReceiveUseIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteMCouponReceiveUseByIds(String[] couponReceiveUseIds);
}
