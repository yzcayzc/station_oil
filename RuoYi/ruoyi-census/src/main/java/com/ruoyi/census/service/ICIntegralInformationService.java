package com.ruoyi.census.service;

import com.ruoyi.census.domain.CIntegralInformation;
import java.util.List;

/**
 * 积分信息表Service接口
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public interface ICIntegralInformationService 
{
    /**
     * 查询积分信息表
     * 
     * @param integral 积分信息表ID
     * @return 积分信息表
     */
    public CIntegralInformation selectCIntegralInformationById(Long integral);

    /**
     * 查询积分信息表列表
     * 
     * @param cIntegralInformation 积分信息表
     * @return 积分信息表集合
     */
    public List<CIntegralInformation> selectCIntegralInformationList(CIntegralInformation cIntegralInformation);

    /**
     * 新增积分信息表
     * 
     * @param cIntegralInformation 积分信息表
     * @return 结果
     */
    public int insertCIntegralInformation(CIntegralInformation cIntegralInformation);

    /**
     * 修改积分信息表
     * 
     * @param cIntegralInformation 积分信息表
     * @return 结果
     */
    public int updateCIntegralInformation(CIntegralInformation cIntegralInformation);

    /**
     * 批量删除积分信息表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCIntegralInformationByIds(String ids);

    /**
     * 删除积分信息表信息
     * 
     * @param integral 积分信息表ID
     * @return 结果
     */
    public int deleteCIntegralInformationById(Long integral);
}
