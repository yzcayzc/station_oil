package com.ruoyi.activity.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.activity.mapper.ElectronicCouponsMapper;
import com.ruoyi.activity.domain.ElectronicCoupons;
import com.ruoyi.activity.service.IElectronicCouponsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 电子优惠券设置Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class ElectronicCouponsServiceImpl implements IElectronicCouponsService 
{
    @Autowired
    private ElectronicCouponsMapper electronicCouponsMapper;

    /**
     * 查询电子优惠券设置
     * 
     * @param couponsId 电子优惠券设置ID
     * @return 电子优惠券设置
     */
    @Override
    public ElectronicCoupons selectElectronicCouponsById(Long couponsId)
    {
        return electronicCouponsMapper.selectElectronicCouponsById(couponsId);
    }

    /**
     * 查询电子优惠券设置列表
     * 
     * @param electronicCoupons 电子优惠券设置
     * @return 电子优惠券设置
     */
    @Override
    public List<ElectronicCoupons> selectElectronicCouponsList(ElectronicCoupons electronicCoupons)
    {
        return electronicCouponsMapper.selectElectronicCouponsList(electronicCoupons);
    }

    /**
     * 新增电子优惠券设置
     * 
     * @param electronicCoupons 电子优惠券设置
     * @return 结果
     */
    @Override
    public int insertElectronicCoupons(ElectronicCoupons electronicCoupons)
    {
        return electronicCouponsMapper.insertElectronicCoupons(electronicCoupons);
    }

    /**
     * 修改电子优惠券设置
     * 
     * @param electronicCoupons 电子优惠券设置
     * @return 结果
     */
    @Override
    public int updateElectronicCoupons(ElectronicCoupons electronicCoupons)
    {
        return electronicCouponsMapper.updateElectronicCoupons(electronicCoupons);
    }

    /**
     * 删除电子优惠券设置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteElectronicCouponsByIds(String ids)
    {
        return electronicCouponsMapper.deleteElectronicCouponsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除电子优惠券设置信息
     * 
     * @param couponsId 电子优惠券设置ID
     * @return 结果
     */
    @Override
    public int deleteElectronicCouponsById(Long couponsId)
    {
        return electronicCouponsMapper.deleteElectronicCouponsById(couponsId);
    }
}
