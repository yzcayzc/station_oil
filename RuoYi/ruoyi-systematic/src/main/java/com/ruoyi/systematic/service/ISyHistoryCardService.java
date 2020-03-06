package com.ruoyi.systematic.service;

import com.ruoyi.systematic.domain.SyHistoryCard;
import java.util.List;

/**
 * 历史信息Service接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface ISyHistoryCardService 
{
    /**
     * 查询历史信息
     * 
     * @param card 历史信息ID
     * @return 历史信息
     */
    public SyHistoryCard selectSyHistoryCardById(Long card);

    /**
     * 查询历史信息列表
     * 
     * @param syHistoryCard 历史信息
     * @return 历史信息集合
     */
    public List<SyHistoryCard> selectSyHistoryCardList(SyHistoryCard syHistoryCard);

    /**
     * 新增历史信息
     * 
     * @param syHistoryCard 历史信息
     * @return 结果
     */
    public int insertSyHistoryCard(SyHistoryCard syHistoryCard);

    /**
     * 修改历史信息
     * 
     * @param syHistoryCard 历史信息
     * @return 结果
     */
    public int updateSyHistoryCard(SyHistoryCard syHistoryCard);

    /**
     * 批量删除历史信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSyHistoryCardByIds(String ids);

    /**
     * 删除历史信息信息
     * 
     * @param card 历史信息ID
     * @return 结果
     */
    public int deleteSyHistoryCardById(Long card);
}
