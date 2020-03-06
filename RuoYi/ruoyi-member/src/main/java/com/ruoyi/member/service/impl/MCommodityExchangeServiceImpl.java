package com.ruoyi.member.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.member.mapper.MCommodityExchangeMapper;
import com.ruoyi.member.domain.MCommodityExchange;
import com.ruoyi.member.service.IMCommodityExchangeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 商品兑换信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class MCommodityExchangeServiceImpl implements IMCommodityExchangeService 
{
    @Autowired
    private MCommodityExchangeMapper mCommodityExchangeMapper;

    /**
     * 查询商品兑换信息
     * 
     * @param commodityExchangeId 商品兑换信息ID
     * @return 商品兑换信息
     */
    @Override
    public MCommodityExchange selectMCommodityExchangeById(Long commodityExchangeId)
    {
        return mCommodityExchangeMapper.selectMCommodityExchangeById(commodityExchangeId);
    }

    /**
     * 查询商品兑换信息列表
     * 
     * @param mCommodityExchange 商品兑换信息
     * @return 商品兑换信息
     */
    @Override
    public List<MCommodityExchange> selectMCommodityExchangeList(MCommodityExchange mCommodityExchange)
    {
        return mCommodityExchangeMapper.selectMCommodityExchangeList(mCommodityExchange);
    }

    /**
     * 新增商品兑换信息
     * 
     * @param mCommodityExchange 商品兑换信息
     * @return 结果
     */
    @Override
    public int insertMCommodityExchange(MCommodityExchange mCommodityExchange)
    {
        return mCommodityExchangeMapper.insertMCommodityExchange(mCommodityExchange);
    }

    /**
     * 修改商品兑换信息
     * 
     * @param mCommodityExchange 商品兑换信息
     * @return 结果
     */
    @Override
    public int updateMCommodityExchange(MCommodityExchange mCommodityExchange)
    {
        return mCommodityExchangeMapper.updateMCommodityExchange(mCommodityExchange);
    }

    /**
     * 删除商品兑换信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMCommodityExchangeByIds(String ids)
    {
        return mCommodityExchangeMapper.deleteMCommodityExchangeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商品兑换信息信息
     * 
     * @param commodityExchangeId 商品兑换信息ID
     * @return 结果
     */
    @Override
    public int deleteMCommodityExchangeById(Long commodityExchangeId)
    {
        return mCommodityExchangeMapper.deleteMCommodityExchangeById(commodityExchangeId);
    }
}
