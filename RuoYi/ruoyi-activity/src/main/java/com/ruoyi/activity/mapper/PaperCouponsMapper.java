package com.ruoyi.activity.mapper;

import com.ruoyi.activity.domain.PaperCoupons;
import java.util.List;

/**
 * 纸质优惠券设置Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface PaperCouponsMapper 
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
     * 删除纸质优惠券设置
     * 
     * @param couponsId 纸质优惠券设置ID
     * @return 结果
     */
    public int deletePaperCouponsById(Long couponsId);

    /**
     * 批量删除纸质优惠券设置
     * 
     * @param couponsIds 需要删除的数据ID
     * @return 结果
     */
    public int deletePaperCouponsByIds(String[] couponsIds);
}
