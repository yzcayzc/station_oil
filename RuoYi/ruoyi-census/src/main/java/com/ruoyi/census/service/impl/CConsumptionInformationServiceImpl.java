package com.ruoyi.census.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.census.mapper.CConsumptionInformationMapper;
import com.ruoyi.census.domain.CConsumptionInformation;
import com.ruoyi.census.service.ICConsumptionInformationService;
import com.ruoyi.common.core.text.Convert;

/**
 * 消费信息表Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Service
public class CConsumptionInformationServiceImpl implements ICConsumptionInformationService 
{
    @Autowired
    private CConsumptionInformationMapper cConsumptionInformationMapper;

    /**
     * 查询消费信息表
     * 
     * @param consumption 消费信息表ID
     * @return 消费信息表
     */
    @Override
    public CConsumptionInformation selectCConsumptionInformationById(Long consumption)
    {
        return cConsumptionInformationMapper.selectCConsumptionInformationById(consumption);
    }

    /**
     * 查询消费信息表列表
     * 
     * @param cConsumptionInformation 消费信息表
     * @return 消费信息表
     */
    @Override
    public List<CConsumptionInformation> selectCConsumptionInformationList(CConsumptionInformation cConsumptionInformation)
    {
        return cConsumptionInformationMapper.selectCConsumptionInformationList(cConsumptionInformation);
    }

    /**
     * 新增消费信息表
     * 
     * @param cConsumptionInformation 消费信息表
     * @return 结果
     */
    @Override
    public int insertCConsumptionInformation(CConsumptionInformation cConsumptionInformation)
    {
        return cConsumptionInformationMapper.insertCConsumptionInformation(cConsumptionInformation);
    }

    /**
     * 修改消费信息表
     * 
     * @param cConsumptionInformation 消费信息表
     * @return 结果
     */
    @Override
    public int updateCConsumptionInformation(CConsumptionInformation cConsumptionInformation)
    {
        return cConsumptionInformationMapper.updateCConsumptionInformation(cConsumptionInformation);
    }

    /**
     * 删除消费信息表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCConsumptionInformationByIds(String ids)
    {
        return cConsumptionInformationMapper.deleteCConsumptionInformationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除消费信息表信息
     * 
     * @param consumption 消费信息表ID
     * @return 结果
     */
    @Override
    public int deleteCConsumptionInformationById(Long consumption)
    {
        return cConsumptionInformationMapper.deleteCConsumptionInformationById(consumption);
    }
}
