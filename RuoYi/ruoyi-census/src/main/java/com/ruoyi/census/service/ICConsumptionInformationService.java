package com.ruoyi.census.service;

import com.ruoyi.census.domain.CConsumptionInformation;
import java.util.List;

/**
 * 消费信息表Service接口
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public interface ICConsumptionInformationService 
{
    /**
     * 查询消费信息表
     * 
     * @param consumption 消费信息表ID
     * @return 消费信息表
     */
    public CConsumptionInformation selectCConsumptionInformationById(Long consumption);

    /**
     * 查询消费信息表列表
     * 
     * @param cConsumptionInformation 消费信息表
     * @return 消费信息表集合
     */
    public List<CConsumptionInformation> selectCConsumptionInformationList(CConsumptionInformation cConsumptionInformation);

    /**
     * 新增消费信息表
     * 
     * @param cConsumptionInformation 消费信息表
     * @return 结果
     */
    public int insertCConsumptionInformation(CConsumptionInformation cConsumptionInformation);

    /**
     * 修改消费信息表
     * 
     * @param cConsumptionInformation 消费信息表
     * @return 结果
     */
    public int updateCConsumptionInformation(CConsumptionInformation cConsumptionInformation);

    /**
     * 批量删除消费信息表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCConsumptionInformationByIds(String ids);

    /**
     * 删除消费信息表信息
     * 
     * @param consumption 消费信息表ID
     * @return 结果
     */
    public int deleteCConsumptionInformationById(Long consumption);
}
