package com.ruoyi.member.service;

import com.ruoyi.member.domain.MRechargeStream;
import java.util.List;

/**
 * 充值流水Service接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface IMRechargeStreamService 
{
    /**
     * 查询充值流水
     * 
     * @param rechargeStreamId 充值流水ID
     * @return 充值流水
     */
    public MRechargeStream selectMRechargeStreamById(Long rechargeStreamId);

    /**
     * 查询充值流水列表
     * 
     * @param mRechargeStream 充值流水
     * @return 充值流水集合
     */
    public List<MRechargeStream> selectMRechargeStreamList(MRechargeStream mRechargeStream);

    /**
     * 新增充值流水
     * 
     * @param mRechargeStream 充值流水
     * @return 结果
     */
    public int insertMRechargeStream(MRechargeStream mRechargeStream);

    /**
     * 修改充值流水
     * 
     * @param mRechargeStream 充值流水
     * @return 结果
     */
    public int updateMRechargeStream(MRechargeStream mRechargeStream);

    /**
     * 批量删除充值流水
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMRechargeStreamByIds(String ids);

    /**
     * 删除充值流水信息
     * 
     * @param rechargeStreamId 充值流水ID
     * @return 结果
     */
    public int deleteMRechargeStreamById(Long rechargeStreamId);
}
