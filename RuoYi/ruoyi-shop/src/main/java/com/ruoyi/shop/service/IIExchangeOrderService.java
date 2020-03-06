package com.ruoyi.shop.service;

import com.ruoyi.shop.domain.IExchangeOrder;
import java.util.List;

/**
 * 兑换订单Service接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface IIExchangeOrderService 
{
    /**
     * 查询兑换订单
     * 
     * @param exchangeOrderId 兑换订单ID
     * @return 兑换订单
     */
    public IExchangeOrder selectIExchangeOrderById(Long exchangeOrderId);

    /**
     * 查询兑换订单列表
     * 
     * @param iExchangeOrder 兑换订单
     * @return 兑换订单集合
     */
    public List<IExchangeOrder> selectIExchangeOrderList(IExchangeOrder iExchangeOrder);

    /**
     * 新增兑换订单
     * 
     * @param iExchangeOrder 兑换订单
     * @return 结果
     */
    public int insertIExchangeOrder(IExchangeOrder iExchangeOrder);

    /**
     * 修改兑换订单
     * 
     * @param iExchangeOrder 兑换订单
     * @return 结果
     */
    public int updateIExchangeOrder(IExchangeOrder iExchangeOrder);

    /**
     * 批量删除兑换订单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteIExchangeOrderByIds(String ids);

    /**
     * 删除兑换订单信息
     * 
     * @param exchangeOrderId 兑换订单ID
     * @return 结果
     */
    public int deleteIExchangeOrderById(Long exchangeOrderId);
}
