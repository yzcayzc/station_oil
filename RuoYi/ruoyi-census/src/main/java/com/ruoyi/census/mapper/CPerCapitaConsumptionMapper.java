package com.ruoyi.census.mapper;

import com.ruoyi.census.domain.CPerCapitaConsumption;
import java.util.List;

/**
 * 人均消费统计Mapper接口
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public interface CPerCapitaConsumptionMapper 
{
    /**
     * 查询人均消费统计
     * 
     * @param perId 人均消费统计ID
     * @return 人均消费统计
     */
    public CPerCapitaConsumption selectCPerCapitaConsumptionById(Long perId);

    /**
     * 查询人均消费统计列表
     * 
     * @param cPerCapitaConsumption 人均消费统计
     * @return 人均消费统计集合
     */
    public List<CPerCapitaConsumption> selectCPerCapitaConsumptionList(CPerCapitaConsumption cPerCapitaConsumption);

    /**
     * 新增人均消费统计
     * 
     * @param cPerCapitaConsumption 人均消费统计
     * @return 结果
     */
    public int insertCPerCapitaConsumption(CPerCapitaConsumption cPerCapitaConsumption);

    /**
     * 修改人均消费统计
     * 
     * @param cPerCapitaConsumption 人均消费统计
     * @return 结果
     */
    public int updateCPerCapitaConsumption(CPerCapitaConsumption cPerCapitaConsumption);

    /**
     * 删除人均消费统计
     * 
     * @param perId 人均消费统计ID
     * @return 结果
     */
    public int deleteCPerCapitaConsumptionById(Long perId);

    /**
     * 批量删除人均消费统计
     * 
     * @param perIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCPerCapitaConsumptionByIds(String[] perIds);
}
