package com.ruoyi.member.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.member.mapper.MIntegralMapper;
import com.ruoyi.member.domain.MIntegral;
import com.ruoyi.member.service.IMIntegralService;
import com.ruoyi.common.core.text.Convert;

/**
 * 积分Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-05
 */
@Service
public class MIntegralServiceImpl implements IMIntegralService 
{
    @Autowired
    private MIntegralMapper mIntegralMapper;

    /**
     * 查询积分
     * 
     * @param integral 积分ID
     * @return 积分
     */
    @Override
    public MIntegral selectMIntegralById(Long integral)
    {
        return mIntegralMapper.selectMIntegralById(integral);
    }

    /**
     * 查询积分列表
     * 
     * @param mIntegral 积分
     * @return 积分
     */
    @Override
    public List<MIntegral> selectMIntegralList(MIntegral mIntegral)
    {
        return mIntegralMapper.selectMIntegralList(mIntegral);
    }

    /**
     * 新增积分
     * 
     * @param mIntegral 积分
     * @return 结果
     */
    @Override
    public int insertMIntegral(MIntegral mIntegral)
    {
        return mIntegralMapper.insertMIntegral(mIntegral);
    }

    /**
     * 修改积分
     * 
     * @param mIntegral 积分
     * @return 结果
     */
    @Override
    public int updateMIntegral(MIntegral mIntegral)
    {
        return mIntegralMapper.updateMIntegral(mIntegral);
    }

    /**
     * 删除积分对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMIntegralByIds(String ids)
    {
        return mIntegralMapper.deleteMIntegralByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除积分信息
     * 
     * @param integral 积分ID
     * @return 结果
     */
    @Override
    public int deleteMIntegralById(Long integral)
    {
        return mIntegralMapper.deleteMIntegralById(integral);
    }
}
