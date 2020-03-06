package com.ruoyi.member.service;

import com.ruoyi.member.domain.MCommodityExchange;
import java.util.List;

/**
 * 商品兑换信息Service接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface IMCommodityExchangeService 
{
    /**
     * 查询商品兑换信息
     * 
     * @param commodityExchangeId 商品兑换信息ID
     * @return 商品兑换信息
     */
    public MCommodityExchange selectMCommodityExchangeById(Long commodityExchangeId);

    /**
     * 查询商品兑换信息列表
     * 
     * @param mCommodityExchange 商品兑换信息
     * @return 商品兑换信息集合
     */
    public List<MCommodityExchange> selectMCommodityExchangeList(MCommodityExchange mCommodityExchange);

    /**
     * 新增商品兑换信息
     * 
     * @param mCommodityExchange 商品兑换信息
     * @return 结果
     */
    public int insertMCommodityExchange(MCommodityExchange mCommodityExchange);

    /**
     * 修改商品兑换信息
     * 
     * @param mCommodityExchange 商品兑换信息
     * @return 结果
     */
    public int updateMCommodityExchange(MCommodityExchange mCommodityExchange);

    /**
     * 批量删除商品兑换信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMCommodityExchangeByIds(String ids);

    /**
     * 删除商品兑换信息信息
     * 
     * @param commodityExchangeId 商品兑换信息ID
     * @return 结果
     */
    public int deleteMCommodityExchangeById(Long commodityExchangeId);
}
