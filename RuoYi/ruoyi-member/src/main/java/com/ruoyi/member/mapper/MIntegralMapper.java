package com.ruoyi.member.mapper;

import com.ruoyi.member.domain.MIntegral;
import java.util.List;

/**
 * 积分Mapper接口
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
public interface MIntegralMapper 
{
    /**
     * 查询积分
     * 
     * @param integral 积分ID
     * @return 积分
     */
    public MIntegral selectMIntegralById(Long integral);

    /**
     * 查询积分列表
     * 
     * @param mIntegral 积分
     * @return 积分集合
     */
    public List<MIntegral> selectMIntegralList(MIntegral mIntegral);

    /**
     * 新增积分
     * 
     * @param mIntegral 积分
     * @return 结果
     */
    public int insertMIntegral(MIntegral mIntegral);

    /**
     * 修改积分
     * 
     * @param mIntegral 积分
     * @return 结果
     */
    public int updateMIntegral(MIntegral mIntegral);

    /**
     * 删除积分
     * 
     * @param integral 积分ID
     * @return 结果
     */
    public int deleteMIntegralById(Long integral);

    /**
     * 批量删除积分
     * 
     * @param integrals 需要删除的数据ID
     * @return 结果
     */
    public int deleteMIntegralByIds(String[] integrals);
}
