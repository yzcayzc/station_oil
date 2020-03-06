package com.ruoyi.systematic.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.systematic.mapper.SyCouponCenterMapper;
import com.ruoyi.systematic.domain.SyCouponCenter;
import com.ruoyi.systematic.service.ISyCouponCenterService;
import com.ruoyi.common.core.text.Convert;

/**
 * 优惠券中心Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class SyCouponCenterServiceImpl implements ISyCouponCenterService 
{
    @Autowired
    private SyCouponCenterMapper syCouponCenterMapper;

    /**
     * 查询优惠券中心
     * 
     * @param couponId 优惠券中心ID
     * @return 优惠券中心
     */
    @Override
    public SyCouponCenter selectSyCouponCenterById(Long couponId)
    {
        return syCouponCenterMapper.selectSyCouponCenterById(couponId);
    }

    /**
     * 查询优惠券中心列表
     * 
     * @param syCouponCenter 优惠券中心
     * @return 优惠券中心
     */
    @Override
    public List<SyCouponCenter> selectSyCouponCenterList(SyCouponCenter syCouponCenter)
    {
        return syCouponCenterMapper.selectSyCouponCenterList(syCouponCenter);
    }

    /**
     * 新增优惠券中心
     * 
     * @param syCouponCenter 优惠券中心
     * @return 结果
     */
    @Override
    public int insertSyCouponCenter(SyCouponCenter syCouponCenter)
    {
        return syCouponCenterMapper.insertSyCouponCenter(syCouponCenter);
    }

    /**
     * 修改优惠券中心
     * 
     * @param syCouponCenter 优惠券中心
     * @return 结果
     */
    @Override
    public int updateSyCouponCenter(SyCouponCenter syCouponCenter)
    {
        return syCouponCenterMapper.updateSyCouponCenter(syCouponCenter);
    }

    /**
     * 删除优惠券中心对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSyCouponCenterByIds(String ids)
    {
        return syCouponCenterMapper.deleteSyCouponCenterByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除优惠券中心信息
     * 
     * @param couponId 优惠券中心ID
     * @return 结果
     */
    @Override
    public int deleteSyCouponCenterById(Long couponId)
    {
        return syCouponCenterMapper.deleteSyCouponCenterById(couponId);
    }
}
