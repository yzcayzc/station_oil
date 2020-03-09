package com.ruoyi.member.service;

import com.ruoyi.member.domain.MConsumptionFlow;
import java.util.List;

/**
 * 消费流水Service接口
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public interface IMConsumptionFlowService 
{
    /**
     * 查询消费流水
     * 
     * @param flowId 消费流水ID
     * @return 消费流水
     */
    public MConsumptionFlow selectMConsumptionFlowById(Long flowId);

    /**
     * 查询消费流水列表
     * 
     * @param mConsumptionFlow 消费流水
     * @return 消费流水集合
     */
    public List<MConsumptionFlow> selectMConsumptionFlowList(MConsumptionFlow mConsumptionFlow);

    /**
     * 新增消费流水
     * 
     * @param mConsumptionFlow 消费流水
     * @return 结果
     */
    public int insertMConsumptionFlow(MConsumptionFlow mConsumptionFlow);

    /**
     * 修改消费流水
     * 
     * @param mConsumptionFlow 消费流水
     * @return 结果
     */
    public int updateMConsumptionFlow(MConsumptionFlow mConsumptionFlow);

    /**
     * 批量删除消费流水
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMConsumptionFlowByIds(String ids);

    /**
     * 删除消费流水信息
     * 
     * @param flowId 消费流水ID
     * @return 结果
     */
    public int deleteMConsumptionFlowById(Long flowId);
}
