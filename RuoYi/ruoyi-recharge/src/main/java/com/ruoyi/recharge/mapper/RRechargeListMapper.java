package com.ruoyi.recharge.mapper;

import com.ruoyi.recharge.domain.RRechargeList;
import java.util.List;

/**
 * 充值列表Mapper接口
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
public interface RRechargeListMapper 
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
     * 删除充值列表
     * 
     * @param rechargeId 充值列表ID
     * @return 结果
     */
    public int deleteRRechargeListById(Long rechargeId);

    /**
     * 批量删除充值列表
     * 
     * @param rechargeIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteRRechargeListByIds(String[] rechargeIds);
}
