package com.ruoyi.staff.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.staff.mapper.StTransactionDetailsMapper;
import com.ruoyi.staff.domain.StTransactionDetails;
import com.ruoyi.staff.service.IStTransactionDetailsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 交易详情Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-05
 */
@Service
public class StTransactionDetailsServiceImpl implements IStTransactionDetailsService 
{
    @Autowired
    private StTransactionDetailsMapper stTransactionDetailsMapper;

    /**
     * 查询交易详情
     * 
     * @param transactionDetailsId 交易详情ID
     * @return 交易详情
     */
    @Override
    public StTransactionDetails selectStTransactionDetailsById(Long transactionDetailsId)
    {
        return stTransactionDetailsMapper.selectStTransactionDetailsById(transactionDetailsId);
    }

    /**
     * 查询交易详情列表
     * 
     * @param stTransactionDetails 交易详情
     * @return 交易详情
     */
    @Override
    public List<StTransactionDetails> selectStTransactionDetailsList(StTransactionDetails stTransactionDetails)
    {
        return stTransactionDetailsMapper.selectStTransactionDetailsList(stTransactionDetails);
    }

    /**
     * 新增交易详情
     * 
     * @param stTransactionDetails 交易详情
     * @return 结果
     */
    @Override
    public int insertStTransactionDetails(StTransactionDetails stTransactionDetails)
    {
        return stTransactionDetailsMapper.insertStTransactionDetails(stTransactionDetails);
    }

    /**
     * 修改交易详情
     * 
     * @param stTransactionDetails 交易详情
     * @return 结果
     */
    @Override
    public int updateStTransactionDetails(StTransactionDetails stTransactionDetails)
    {
        return stTransactionDetailsMapper.updateStTransactionDetails(stTransactionDetails);
    }

    /**
     * 删除交易详情对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStTransactionDetailsByIds(String ids)
    {
        return stTransactionDetailsMapper.deleteStTransactionDetailsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除交易详情信息
     * 
     * @param transactionDetailsId 交易详情ID
     * @return 结果
     */
    @Override
    public int deleteStTransactionDetailsById(Long transactionDetailsId)
    {
        return stTransactionDetailsMapper.deleteStTransactionDetailsById(transactionDetailsId);
    }
}
