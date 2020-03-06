package com.ruoyi.member.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.member.mapper.MRechargeStreamMapper;
import com.ruoyi.member.domain.MRechargeStream;
import com.ruoyi.member.service.IMRechargeStreamService;
import com.ruoyi.common.core.text.Convert;

/**
 * 充值流水Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class MRechargeStreamServiceImpl implements IMRechargeStreamService 
{
    @Autowired
    private MRechargeStreamMapper mRechargeStreamMapper;

    /**
     * 查询充值流水
     * 
     * @param rechargeStreamId 充值流水ID
     * @return 充值流水
     */
    @Override
    public MRechargeStream selectMRechargeStreamById(Long rechargeStreamId)
    {
        return mRechargeStreamMapper.selectMRechargeStreamById(rechargeStreamId);
    }

    /**
     * 查询充值流水列表
     * 
     * @param mRechargeStream 充值流水
     * @return 充值流水
     */
    @Override
    public List<MRechargeStream> selectMRechargeStreamList(MRechargeStream mRechargeStream)
    {
        return mRechargeStreamMapper.selectMRechargeStreamList(mRechargeStream);
    }

    /**
     * 新增充值流水
     * 
     * @param mRechargeStream 充值流水
     * @return 结果
     */
    @Override
    public int insertMRechargeStream(MRechargeStream mRechargeStream)
    {
        return mRechargeStreamMapper.insertMRechargeStream(mRechargeStream);
    }

    /**
     * 修改充值流水
     * 
     * @param mRechargeStream 充值流水
     * @return 结果
     */
    @Override
    public int updateMRechargeStream(MRechargeStream mRechargeStream)
    {
        return mRechargeStreamMapper.updateMRechargeStream(mRechargeStream);
    }

    /**
     * 删除充值流水对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMRechargeStreamByIds(String ids)
    {
        return mRechargeStreamMapper.deleteMRechargeStreamByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除充值流水信息
     * 
     * @param rechargeStreamId 充值流水ID
     * @return 结果
     */
    @Override
    public int deleteMRechargeStreamById(Long rechargeStreamId)
    {
        return mRechargeStreamMapper.deleteMRechargeStreamById(rechargeStreamId);
    }
}
