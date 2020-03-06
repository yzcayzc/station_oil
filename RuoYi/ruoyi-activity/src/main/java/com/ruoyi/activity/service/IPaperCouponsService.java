package com.ruoyi.activity.service;

import com.ruoyi.activity.domain.PaperCoupons;
import java.util.List;

/**
 * 纸质优惠券设置Service接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface IPaperCouponsService 
{
    /**
     * 查询纸质优惠券设置
     * 
     * @param couponsId 纸质优惠券设置ID
     * @return 纸质优惠券设置
     */
    public PaperCoupons selectPaperCouponsById(Long couponsId);

    /**
     * 查询纸质优惠券设置列表
     * 
     * @param paperCoupons 纸质优惠券设置
     * @return 纸质优惠券设置集合
     */
    public List<PaperCoupons> selectPaperCouponsList(PaperCoupons paperCoupons);

    /**
     * 新增纸质优惠券设置
     * 
     * @param paperCoupons 纸质优惠券设置
     * @return 结果
     */
    public int insertPaperCoupons(PaperCoupons paperCoupons);

    /**
     * 修改纸质优惠券设置
     * 
     * @param paperCoupons 纸质优惠券设置
     * @return 结果
     */
    public int updatePaperCoupons(PaperCoupons paperCoupons);

    /**
     * 批量删除纸质优惠券设置
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deletePaperCouponsByIds(String ids);

    /**
     * 删除纸质优惠券设置信息
     * 
     * @param couponsId 纸质优惠券设置ID
     * @return 结果
     */
    public int deletePaperCouponsById(Long couponsId);
}
