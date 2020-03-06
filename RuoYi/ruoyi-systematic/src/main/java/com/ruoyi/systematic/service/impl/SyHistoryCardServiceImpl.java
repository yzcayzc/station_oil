package com.ruoyi.systematic.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.systematic.mapper.SyHistoryCardMapper;
import com.ruoyi.systematic.domain.SyHistoryCard;
import com.ruoyi.systematic.service.ISyHistoryCardService;
import com.ruoyi.common.core.text.Convert;

/**
 * 历史信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class SyHistoryCardServiceImpl implements ISyHistoryCardService 
{
    @Autowired
    private SyHistoryCardMapper syHistoryCardMapper;

    /**
     * 查询历史信息
     * 
     * @param card 历史信息ID
     * @return 历史信息
     */
    @Override
    public SyHistoryCard selectSyHistoryCardById(Long card)
    {
        return syHistoryCardMapper.selectSyHistoryCardById(card);
    }

    /**
     * 查询历史信息列表
     * 
     * @param syHistoryCard 历史信息
     * @return 历史信息
     */
    @Override
    public List<SyHistoryCard> selectSyHistoryCardList(SyHistoryCard syHistoryCard)
    {
        return syHistoryCardMapper.selectSyHistoryCardList(syHistoryCard);
    }

    /**
     * 新增历史信息
     * 
     * @param syHistoryCard 历史信息
     * @return 结果
     */
    @Override
    public int insertSyHistoryCard(SyHistoryCard syHistoryCard)
    {
        syHistoryCard.setCreateTime(DateUtils.getNowDate());
        return syHistoryCardMapper.insertSyHistoryCard(syHistoryCard);
    }

    /**
     * 修改历史信息
     * 
     * @param syHistoryCard 历史信息
     * @return 结果
     */
    @Override
    public int updateSyHistoryCard(SyHistoryCard syHistoryCard)
    {
        return syHistoryCardMapper.updateSyHistoryCard(syHistoryCard);
    }

    /**
     * 删除历史信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSyHistoryCardByIds(String ids)
    {
        return syHistoryCardMapper.deleteSyHistoryCardByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除历史信息信息
     * 
     * @param card 历史信息ID
     * @return 结果
     */
    @Override
    public int deleteSyHistoryCardById(Long card)
    {
        return syHistoryCardMapper.deleteSyHistoryCardById(card);
    }
}
