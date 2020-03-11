package com.ruoyi.systematic.service;

import com.ruoyi.systematic.domain.SyCouponType;
import java.util.List;

/**
 * 优惠券类型字段Service接口
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public interface ISyCouponTypeService 
{
    /**
     * 查询优惠券类型字段
     * 
     * @param syCouponTypeId 优惠券类型字段ID
     * @return 优惠券类型字段
     */
    public SyCouponType selectSyCouponTypeById(Long syCouponTypeId);

    /**
     * 查询优惠券类型字段列表
     * 
     * @param syCouponType 优惠券类型字段
     * @return 优惠券类型字段集合
     */
    public List<SyCouponType> selectSyCouponTypeList(SyCouponType syCouponType);

    /**
     * 新增优惠券类型字段
     * 
     * @param syCouponType 优惠券类型字段
     * @return 结果
     */
    public int insertSyCouponType(SyCouponType syCouponType);

    /**
     * 修改优惠券类型字段
     * 
     * @param syCouponType 优惠券类型字段
     * @return 结果
     */
    public int updateSyCouponType(SyCouponType syCouponType);

    /**
     * 批量删除优惠券类型字段
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSyCouponTypeByIds(String ids);

    /**
     * 删除优惠券类型字段信息
     * 
     * @param syCouponTypeId 优惠券类型字段ID
     * @return 结果
     */
    public int deleteSyCouponTypeById(Long syCouponTypeId);
}
