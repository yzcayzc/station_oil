package com.ruoyi.census.mapper;

import com.ruoyi.census.domain.CPreferentialInformation;
import java.util.List;

/**
 * 优惠信息表Mapper接口
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
public interface CPreferentialInformationMapper 
{
    /**
     * 查询优惠信息表
     * 
     * @param preferentialId 优惠信息表ID
     * @return 优惠信息表
     */
    public CPreferentialInformation selectCPreferentialInformationById(Long preferentialId);

    /**
     * 查询优惠信息表列表
     * 
     * @param cPreferentialInformation 优惠信息表
     * @return 优惠信息表集合
     */
    public List<CPreferentialInformation> selectCPreferentialInformationList(CPreferentialInformation cPreferentialInformation);

    /**
     * 新增优惠信息表
     * 
     * @param cPreferentialInformation 优惠信息表
     * @return 结果
     */
    public int insertCPreferentialInformation(CPreferentialInformation cPreferentialInformation);

    /**
     * 修改优惠信息表
     * 
     * @param cPreferentialInformation 优惠信息表
     * @return 结果
     */
    public int updateCPreferentialInformation(CPreferentialInformation cPreferentialInformation);

    /**
     * 删除优惠信息表
     * 
     * @param preferentialId 优惠信息表ID
     * @return 结果
     */
    public int deleteCPreferentialInformationById(Long preferentialId);

    /**
     * 批量删除优惠信息表
     * 
     * @param preferentialIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCPreferentialInformationByIds(String[] preferentialIds);
}
