package com.ruoyi.census.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.census.mapper.CHighConsumptionOfWordsMapper;
import com.ruoyi.census.domain.CHighConsumptionOfWords;
import com.ruoyi.census.service.ICHighConsumptionOfWordsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 单次高额消费统计Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Service
public class CHighConsumptionOfWordsServiceImpl implements ICHighConsumptionOfWordsService 
{
    @Autowired
    private CHighConsumptionOfWordsMapper cHighConsumptionOfWordsMapper;

    /**
     * 查询单次高额消费统计
     * 
     * @param consumptionId 单次高额消费统计ID
     * @return 单次高额消费统计
     */
    @Override
    public CHighConsumptionOfWords selectCHighConsumptionOfWordsById(Long consumptionId)
    {
        return cHighConsumptionOfWordsMapper.selectCHighConsumptionOfWordsById(consumptionId);
    }

    /**
     * 查询单次高额消费统计列表
     * 
     * @param cHighConsumptionOfWords 单次高额消费统计
     * @return 单次高额消费统计
     */
    @Override
    public List<CHighConsumptionOfWords> selectCHighConsumptionOfWordsList(CHighConsumptionOfWords cHighConsumptionOfWords)
    {
        return cHighConsumptionOfWordsMapper.selectCHighConsumptionOfWordsList(cHighConsumptionOfWords);
    }

    /**
     * 新增单次高额消费统计
     * 
     * @param cHighConsumptionOfWords 单次高额消费统计
     * @return 结果
     */
    @Override
    public int insertCHighConsumptionOfWords(CHighConsumptionOfWords cHighConsumptionOfWords)
    {
        return cHighConsumptionOfWordsMapper.insertCHighConsumptionOfWords(cHighConsumptionOfWords);
    }

    /**
     * 修改单次高额消费统计
     * 
     * @param cHighConsumptionOfWords 单次高额消费统计
     * @return 结果
     */
    @Override
    public int updateCHighConsumptionOfWords(CHighConsumptionOfWords cHighConsumptionOfWords)
    {
        return cHighConsumptionOfWordsMapper.updateCHighConsumptionOfWords(cHighConsumptionOfWords);
    }

    /**
     * 删除单次高额消费统计对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCHighConsumptionOfWordsByIds(String ids)
    {
        return cHighConsumptionOfWordsMapper.deleteCHighConsumptionOfWordsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除单次高额消费统计信息
     * 
     * @param consumptionId 单次高额消费统计ID
     * @return 结果
     */
    @Override
    public int deleteCHighConsumptionOfWordsById(Long consumptionId)
    {
        return cHighConsumptionOfWordsMapper.deleteCHighConsumptionOfWordsById(consumptionId);
    }
}
