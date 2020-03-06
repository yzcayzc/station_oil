package com.ruoyi.staff.mapper;

import com.ruoyi.staff.domain.StTransactionDetails;
import java.util.List;

/**
 * 交易详情Mapper接口
 * 
 * @author ruoyi
 * @date 2020-03-05
 */
public interface StTransactionDetailsMapper 
{
    /**
     * 查询交易详情
     * 
     * @param transactionDetailsId 交易详情ID
     * @return 交易详情
     */
    public StTransactionDetails selectStTransactionDetailsById(Long transactionDetailsId);

    /**
     * 查询交易详情列表
     * 
     * @param stTransactionDetails 交易详情
     * @return 交易详情集合
     */
    public List<StTransactionDetails> selectStTransactionDetailsList(StTransactionDetails stTransactionDetails);

    /**
     * 新增交易详情
     * 
     * @param stTransactionDetails 交易详情
     * @return 结果
     */
    public int insertStTransactionDetails(StTransactionDetails stTransactionDetails);

    /**
     * 修改交易详情
     * 
     * @param stTransactionDetails 交易详情
     * @return 结果
     */
    public int updateStTransactionDetails(StTransactionDetails stTransactionDetails);

    /**
     * 删除交易详情
     * 
     * @param transactionDetailsId 交易详情ID
     * @return 结果
     */
    public int deleteStTransactionDetailsById(Long transactionDetailsId);

    /**
     * 批量删除交易详情
     * 
     * @param transactionDetailsIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteStTransactionDetailsByIds(String[] transactionDetailsIds);
}
