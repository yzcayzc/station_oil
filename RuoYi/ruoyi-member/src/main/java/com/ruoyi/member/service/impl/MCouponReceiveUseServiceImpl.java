package com.ruoyi.member.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.member.mapper.MCouponReceiveUseMapper;
import com.ruoyi.member.domain.MCouponReceiveUse;
import com.ruoyi.member.service.IMCouponReceiveUseService;
import com.ruoyi.common.core.text.Convert;

/**
 * 优惠券领取使用信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class MCouponReceiveUseServiceImpl implements IMCouponReceiveUseService 
{
    @Autowired
    private MCouponReceiveUseMapper mCouponReceiveUseMapper;

    /**
     * 查询优惠券领取使用信息
     * 
     * @param couponReceiveUseId 优惠券领取使用信息ID
     * @return 优惠券领取使用信息
     */
    @Override
    public MCouponReceiveUse selectMCouponReceiveUseById(Long couponReceiveUseId)
    {
        return mCouponReceiveUseMapper.selectMCouponReceiveUseById(couponReceiveUseId);
    }

    /**
     * 查询优惠券领取使用信息列表
     * 
     * @param mCouponReceiveUse 优惠券领取使用信息
     * @return 优惠券领取使用信息
     */
    @Override
    public List<MCouponReceiveUse> selectMCouponReceiveUseList(MCouponReceiveUse mCouponReceiveUse)
    {
        return mCouponReceiveUseMapper.selectMCouponReceiveUseList(mCouponReceiveUse);
    }

    /**
     * 新增优惠券领取使用信息
     * 
     * @param mCouponReceiveUse 优惠券领取使用信息
     * @return 结果
     */
    @Override
    public int insertMCouponReceiveUse(MCouponReceiveUse mCouponReceiveUse)
    {
        return mCouponReceiveUseMapper.insertMCouponReceiveUse(mCouponReceiveUse);
    }

    /**
     * 修改优惠券领取使用信息
     * 
     * @param mCouponReceiveUse 优惠券领取使用信息
     * @return 结果
     */
    @Override
    public int updateMCouponReceiveUse(MCouponReceiveUse mCouponReceiveUse)
    {
        return mCouponReceiveUseMapper.updateMCouponReceiveUse(mCouponReceiveUse);
    }

    /**
     * 删除优惠券领取使用信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMCouponReceiveUseByIds(String ids)
    {
        return mCouponReceiveUseMapper.deleteMCouponReceiveUseByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除优惠券领取使用信息信息
     * 
     * @param couponReceiveUseId 优惠券领取使用信息ID
     * @return 结果
     */
    @Override
    public int deleteMCouponReceiveUseById(Long couponReceiveUseId)
    {
        return mCouponReceiveUseMapper.deleteMCouponReceiveUseById(couponReceiveUseId);
    }
}
