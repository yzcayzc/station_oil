package com.ruoyi.activity.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.activity.mapper.PaperCouponsMapper;
import com.ruoyi.activity.domain.PaperCoupons;
import com.ruoyi.activity.service.IPaperCouponsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 纸质优惠券设置Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class PaperCouponsServiceImpl implements IPaperCouponsService 
{
    @Autowired
    private PaperCouponsMapper paperCouponsMapper;

    /**
     * 查询纸质优惠券设置
     * 
     * @param couponsId 纸质优惠券设置ID
     * @return 纸质优惠券设置
     */
    @Override
    public PaperCoupons selectPaperCouponsById(Long couponsId)
    {
        return paperCouponsMapper.selectPaperCouponsById(couponsId);
    }

    /**
     * 查询纸质优惠券设置列表
     * 
     * @param paperCoupons 纸质优惠券设置
     * @return 纸质优惠券设置
     */
    @Override
    public List<PaperCoupons> selectPaperCouponsList(PaperCoupons paperCoupons)
    {
        return paperCouponsMapper.selectPaperCouponsList(paperCoupons);
    }

    /**
     * 新增纸质优惠券设置
     * 
     * @param paperCoupons 纸质优惠券设置
     * @return 结果
     */
    @Override
    public int insertPaperCoupons(PaperCoupons paperCoupons)
    {
        return paperCouponsMapper.insertPaperCoupons(paperCoupons);
    }

    /**
     * 修改纸质优惠券设置
     * 
     * @param paperCoupons 纸质优惠券设置
     * @return 结果
     */
    @Override
    public int updatePaperCoupons(PaperCoupons paperCoupons)
    {
        return paperCouponsMapper.updatePaperCoupons(paperCoupons);
    }

    /**
     * 删除纸质优惠券设置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deletePaperCouponsByIds(String ids)
    {
        return paperCouponsMapper.deletePaperCouponsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除纸质优惠券设置信息
     * 
     * @param couponsId 纸质优惠券设置ID
     * @return 结果
     */
    @Override
    public int deletePaperCouponsById(Long couponsId)
    {
        return paperCouponsMapper.deletePaperCouponsById(couponsId);
    }
}
