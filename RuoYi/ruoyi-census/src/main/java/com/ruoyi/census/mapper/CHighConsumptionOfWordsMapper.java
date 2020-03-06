package com.ruoyi.census.mapper;

import com.ruoyi.census.domain.CHighConsumptionOfWords;
import java.util.List;

/**
 * 单次高额消费统计Mapper接口
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public interface CHighConsumptionOfWordsMapper 
{
    /**
     * 查询单次高额消费统计
     * 
     * @param consumptionId 单次高额消费统计ID
     * @return 单次高额消费统计
     */
    public CHighConsumptionOfWords selectCHighConsumptionOfWordsById(Long consumptionId);

    /**
     * 查询单次高额消费统计列表
     * 
     * @param cHighConsumptionOfWords 单次高额消费统计
     * @return 单次高额消费统计集合
     */
    public List<CHighConsumptionOfWords> selectCHighConsumptionOfWordsList(CHighConsumptionOfWords cHighConsumptionOfWords);

    /**
     * 新增单次高额消费统计
     * 
     * @param cHighConsumptionOfWords 单次高额消费统计
     * @return 结果
     */
    public int insertCHighConsumptionOfWords(CHighConsumptionOfWords cHighConsumptionOfWords);

    /**
     * 修改单次高额消费统计
     * 
     * @param cHighConsumptionOfWords 单次高额消费统计
     * @return 结果
     */
    public int updateCHighConsumptionOfWords(CHighConsumptionOfWords cHighConsumptionOfWords);

    /**
     * 删除单次高额消费统计
     * 
     * @param consumptionId 单次高额消费统计ID
     * @return 结果
     */
    public int deleteCHighConsumptionOfWordsById(Long consumptionId);

    /**
     * 批量删除单次高额消费统计
     * 
     * @param consumptionIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCHighConsumptionOfWordsByIds(String[] consumptionIds);
}
