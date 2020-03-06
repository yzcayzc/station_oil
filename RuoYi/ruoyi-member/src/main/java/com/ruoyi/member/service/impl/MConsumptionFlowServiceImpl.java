package com.ruoyi.member.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.member.mapper.MConsumptionFlowMapper;
import com.ruoyi.member.domain.MConsumptionFlow;
import com.ruoyi.member.service.IMConsumptionFlowService;
import com.ruoyi.common.core.text.Convert;

/**
 * 消费流水Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class MConsumptionFlowServiceImpl implements IMConsumptionFlowService 
{
    @Autowired
    private MConsumptionFlowMapper mConsumptionFlowMapper;

    /**
     * 查询消费流水
     * 
     * @param flowId 消费流水ID
     * @return 消费流水
     */
    @Override
    public MConsumptionFlow selectMConsumptionFlowById(Long flowId)
    {
        return mConsumptionFlowMapper.selectMConsumptionFlowById(flowId);
    }

    /**
     * 查询消费流水列表
     * 
     * @param mConsumptionFlow 消费流水
     * @return 消费流水
     */
    @Override
    public List<MConsumptionFlow> selectMConsumptionFlowList(MConsumptionFlow mConsumptionFlow)
    {
        return mConsumptionFlowMapper.selectMConsumptionFlowList(mConsumptionFlow);
    }

    /**
     * 新增消费流水
     * 
     * @param mConsumptionFlow 消费流水
     * @return 结果
     */
    @Override
    public int insertMConsumptionFlow(MConsumptionFlow mConsumptionFlow)
    {
        return mConsumptionFlowMapper.insertMConsumptionFlow(mConsumptionFlow);
    }

    /**
     * 修改消费流水
     * 
     * @param mConsumptionFlow 消费流水
     * @return 结果
     */
    @Override
    public int updateMConsumptionFlow(MConsumptionFlow mConsumptionFlow)
    {
        return mConsumptionFlowMapper.updateMConsumptionFlow(mConsumptionFlow);
    }

    /**
     * 删除消费流水对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMConsumptionFlowByIds(String ids)
    {
        return mConsumptionFlowMapper.deleteMConsumptionFlowByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除消费流水信息
     * 
     * @param flowId 消费流水ID
     * @return 结果
     */
    @Override
    public int deleteMConsumptionFlowById(Long flowId)
    {
        return mConsumptionFlowMapper.deleteMConsumptionFlowById(flowId);
    }
}
