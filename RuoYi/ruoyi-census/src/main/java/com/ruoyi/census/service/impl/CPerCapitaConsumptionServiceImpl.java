package com.ruoyi.census.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.census.mapper.CPerCapitaConsumptionMapper;
import com.ruoyi.census.domain.CPerCapitaConsumption;
import com.ruoyi.census.service.ICPerCapitaConsumptionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 人均消费统计Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Service
public class CPerCapitaConsumptionServiceImpl implements ICPerCapitaConsumptionService 
{
    @Autowired
    private CPerCapitaConsumptionMapper cPerCapitaConsumptionMapper;

    /**
     * 查询人均消费统计
     * 
     * @param perId 人均消费统计ID
     * @return 人均消费统计
     */
    @Override
    public CPerCapitaConsumption selectCPerCapitaConsumptionById(Long perId)
    {
        return cPerCapitaConsumptionMapper.selectCPerCapitaConsumptionById(perId);
    }

    /**
     * 查询人均消费统计列表
     * 
     * @param cPerCapitaConsumption 人均消费统计
     * @return 人均消费统计
     */
    @Override
    public List<CPerCapitaConsumption> selectCPerCapitaConsumptionList(CPerCapitaConsumption cPerCapitaConsumption)
    {
        return cPerCapitaConsumptionMapper.selectCPerCapitaConsumptionList(cPerCapitaConsumption);
    }

    /**
     * 新增人均消费统计
     * 
     * @param cPerCapitaConsumption 人均消费统计
     * @return 结果
     */
    @Override
    public int insertCPerCapitaConsumption(CPerCapitaConsumption cPerCapitaConsumption)
    {
        return cPerCapitaConsumptionMapper.insertCPerCapitaConsumption(cPerCapitaConsumption);
    }

    /**
     * 修改人均消费统计
     * 
     * @param cPerCapitaConsumption 人均消费统计
     * @return 结果
     */
    @Override
    public int updateCPerCapitaConsumption(CPerCapitaConsumption cPerCapitaConsumption)
    {
        return cPerCapitaConsumptionMapper.updateCPerCapitaConsumption(cPerCapitaConsumption);
    }

    /**
     * 删除人均消费统计对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCPerCapitaConsumptionByIds(String ids)
    {
        return cPerCapitaConsumptionMapper.deleteCPerCapitaConsumptionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除人均消费统计信息
     * 
     * @param perId 人均消费统计ID
     * @return 结果
     */
    @Override
    public int deleteCPerCapitaConsumptionById(Long perId)
    {
        return cPerCapitaConsumptionMapper.deleteCPerCapitaConsumptionById(perId);
    }
}
