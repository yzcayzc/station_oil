package com.ruoyi.census.service;

import com.ruoyi.census.domain.CRechargeInformation;
import java.util.List;

/**
 * 充值信息表Service接口
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public interface ICRechargeInformationService 
{
    /**
     * 查询充值信息表
     * 
     * @param rechargeId 充值信息表ID
     * @return 充值信息表
     */
    public CRechargeInformation selectCRechargeInformationById(Long rechargeId);

    /**
     * 查询充值信息表列表
     * 
     * @param cRechargeInformation 充值信息表
     * @return 充值信息表集合
     */
    public List<CRechargeInformation> selectCRechargeInformationList(CRechargeInformation cRechargeInformation);

    /**
     * 新增充值信息表
     * 
     * @param cRechargeInformation 充值信息表
     * @return 结果
     */
    public int insertCRechargeInformation(CRechargeInformation cRechargeInformation);

    /**
     * 修改充值信息表
     * 
     * @param cRechargeInformation 充值信息表
     * @return 结果
     */
    public int updateCRechargeInformation(CRechargeInformation cRechargeInformation);

    /**
     * 批量删除充值信息表
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCRechargeInformationByIds(String ids);

    /**
     * 删除充值信息表信息
     * 
     * @param rechargeId 充值信息表ID
     * @return 结果
     */
    public int deleteCRechargeInformationById(Long rechargeId);
}
