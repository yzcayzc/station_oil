package com.ruoyi.shop.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.shop.mapper.IExchangeOrderMapper;
import com.ruoyi.shop.domain.IExchangeOrder;
import com.ruoyi.shop.service.IIExchangeOrderService;
import com.ruoyi.common.core.text.Convert;

/**
 * 兑换订单Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class IExchangeOrderServiceImpl implements IIExchangeOrderService 
{
    @Autowired
    private IExchangeOrderMapper iExchangeOrderMapper;

    /**
     * 查询兑换订单
     * 
     * @param exchangeOrderId 兑换订单ID
     * @return 兑换订单
     */
    @Override
    public IExchangeOrder selectIExchangeOrderById(Long exchangeOrderId)
    {
        return iExchangeOrderMapper.selectIExchangeOrderById(exchangeOrderId);
    }

    /**
     * 查询兑换订单列表
     * 
     * @param iExchangeOrder 兑换订单
     * @return 兑换订单
     */
    @Override
    public List<IExchangeOrder> selectIExchangeOrderList(IExchangeOrder iExchangeOrder)
    {
        return iExchangeOrderMapper.selectIExchangeOrderList(iExchangeOrder);
    }

    /**
     * 新增兑换订单
     * 
     * @param iExchangeOrder 兑换订单
     * @return 结果
     */
    @Override
    public int insertIExchangeOrder(IExchangeOrder iExchangeOrder)
    {
        return iExchangeOrderMapper.insertIExchangeOrder(iExchangeOrder);
    }

    /**
     * 修改兑换订单
     * 
     * @param iExchangeOrder 兑换订单
     * @return 结果
     */
    @Override
    public int updateIExchangeOrder(IExchangeOrder iExchangeOrder)
    {
        return iExchangeOrderMapper.updateIExchangeOrder(iExchangeOrder);
    }

    /**
     * 删除兑换订单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteIExchangeOrderByIds(String ids)
    {
        return iExchangeOrderMapper.deleteIExchangeOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除兑换订单信息
     * 
     * @param exchangeOrderId 兑换订单ID
     * @return 结果
     */
    @Override
    public int deleteIExchangeOrderById(Long exchangeOrderId)
    {
        return iExchangeOrderMapper.deleteIExchangeOrderById(exchangeOrderId);
    }
}
