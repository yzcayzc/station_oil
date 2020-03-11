package com.ruoyi.systematic.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.systematic.mapper.SyCouponTypeMapper;
import com.ruoyi.systematic.domain.SyCouponType;
import com.ruoyi.systematic.service.ISyCouponTypeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 优惠券类型字段Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
@Service
public class SyCouponTypeServiceImpl implements ISyCouponTypeService 
{
    @Autowired
    private SyCouponTypeMapper syCouponTypeMapper;

    /**
     * 查询优惠券类型字段
     * 
     * @param syCouponTypeId 优惠券类型字段ID
     * @return 优惠券类型字段
     */
    @Override
    public SyCouponType selectSyCouponTypeById(Long syCouponTypeId)
    {
        return syCouponTypeMapper.selectSyCouponTypeById(syCouponTypeId);
    }

    /**
     * 查询优惠券类型字段列表
     * 
     * @param syCouponType 优惠券类型字段
     * @return 优惠券类型字段
     */
    @Override
    public List<SyCouponType> selectSyCouponTypeList(SyCouponType syCouponType)
    {
        return syCouponTypeMapper.selectSyCouponTypeList(syCouponType);
    }

    /**
     * 新增优惠券类型字段
     * 
     * @param syCouponType 优惠券类型字段
     * @return 结果
     */
    @Override
    public int insertSyCouponType(SyCouponType syCouponType)
    {
        return syCouponTypeMapper.insertSyCouponType(syCouponType);
    }

    /**
     * 修改优惠券类型字段
     * 
     * @param syCouponType 优惠券类型字段
     * @return 结果
     */
    @Override
    public int updateSyCouponType(SyCouponType syCouponType)
    {
        return syCouponTypeMapper.updateSyCouponType(syCouponType);
    }

    /**
     * 删除优惠券类型字段对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSyCouponTypeByIds(String ids)
    {
        return syCouponTypeMapper.deleteSyCouponTypeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除优惠券类型字段信息
     * 
     * @param syCouponTypeId 优惠券类型字段ID
     * @return 结果
     */
    @Override
    public int deleteSyCouponTypeById(Long syCouponTypeId)
    {
        return syCouponTypeMapper.deleteSyCouponTypeById(syCouponTypeId);
    }
}
