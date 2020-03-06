package com.ruoyi.recharge.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.recharge.mapper.RRechargeListMapper;
import com.ruoyi.recharge.domain.RRechargeList;
import com.ruoyi.recharge.service.IRRechargeListService;
import com.ruoyi.common.core.text.Convert;

/**
 * 充值列表Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class RRechargeListServiceImpl implements IRRechargeListService 
{
    @Autowired
    private RRechargeListMapper rRechargeListMapper;

    /**
     * 查询充值列表
     * 
     * @param rechargeId 充值列表ID
     * @return 充值列表
     */
    @Override
    public RRechargeList selectRRechargeListById(Long rechargeId)
    {
        return rRechargeListMapper.selectRRechargeListById(rechargeId);
    }

    /**
     * 查询充值列表列表
     * 
     * @param rRechargeList 充值列表
     * @return 充值列表
     */
    @Override
    public List<RRechargeList> selectRRechargeListList(RRechargeList rRechargeList)
    {
        return rRechargeListMapper.selectRRechargeListList(rRechargeList);
    }

    /**
     * 新增充值列表
     * 
     * @param rRechargeList 充值列表
     * @return 结果
     */
    @Override
    public int insertRRechargeList(RRechargeList rRechargeList)
    {
        return rRechargeListMapper.insertRRechargeList(rRechargeList);
    }

    /**
     * 修改充值列表
     * 
     * @param rRechargeList 充值列表
     * @return 结果
     */
    @Override
    public int updateRRechargeList(RRechargeList rRechargeList)
    {
        return rRechargeListMapper.updateRRechargeList(rRechargeList);
    }

    /**
     * 删除充值列表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRRechargeListByIds(String ids)
    {
        return rRechargeListMapper.deleteRRechargeListByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除充值列表信息
     * 
     * @param rechargeId 充值列表ID
     * @return 结果
     */
    @Override
    public int deleteRRechargeListById(Long rechargeId)
    {
        return rRechargeListMapper.deleteRRechargeListById(rechargeId);
    }
}
