package com.ruoyi.recharge.service;

import com.ruoyi.recharge.domain.RRechargeList;
import java.util.List;

/**
 * 充值列表Service接口
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
public interface IRRechargeListService 
{
    /**
     * 查询充值列表
     * 
     * @param rechargeId 充值列表ID
     * @return 充值列表
     */
    public RRechargeList selectRRechargeListById(Long rechargeId);

    /**
     * 查询充值列表列表
     * 
     * @param rRechargeList 充值列表
     * @return 充值列表集合
     */
    public List<RRechargeList> selectRRechargeListList(RRechargeList rRechargeList);

    /**
     * 新增充值列表
     * 
     * @param rRechargeList 充值列表
     * @return 结果
     */
    public int insertRRechargeList(RRechargeList rRechargeList);

    /**
     * 修改充值列表
     * 
     * @param rRechargeList 充值列表
     * @return 结果
     */
    public int updateRRechargeList(RRechargeList rRechargeList);

    /**
     * 批量删除充值列表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRRechargeListByIds(String ids);

    /**
     * 删除充值列表信息
     * 
     * @param rechargeId 充值列表ID
     * @return 结果
     */
    public int deleteRRechargeListById(Long rechargeId);
}
