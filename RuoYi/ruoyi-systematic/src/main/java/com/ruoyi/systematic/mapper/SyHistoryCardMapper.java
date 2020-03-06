package com.ruoyi.systematic.mapper;

import com.ruoyi.systematic.domain.SyHistoryCard;
import java.util.List;

/**
 * 历史信息Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface SyHistoryCardMapper 
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
     * 删除历史信息
     * 
     * @param card 历史信息ID
     * @return 结果
     */
    public int deleteSyHistoryCardById(Long card);

    /**
     * 批量删除历史信息
     * 
     * @param cards 需要删除的数据ID
     * @return 结果
     */
    public int deleteSyHistoryCardByIds(String[] cards);
}
