package com.ruoyi.station.mapper;

import com.ruoyi.station.domain.SEssentialInformation;
import java.util.List;

/**
 * 基本信息Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface SEssentialInformationMapper 
{
    /**
     * 查询基本信息
     * 
     * @param sEssentialInformationId 基本信息ID
     * @return 基本信息
     */
    public SEssentialInformation selectSEssentialInformationById(Long sEssentialInformationId);

    /**
     * 查询基本信息列表
     * 
     * @param sEssentialInformation 基本信息
     * @return 基本信息集合
     */
    public List<SEssentialInformation> selectSEssentialInformationList(SEssentialInformation sEssentialInformation);

    /**
     * 新增基本信息
     * 
     * @param sEssentialInformation 基本信息
     * @return 结果
     */
    public int insertSEssentialInformation(SEssentialInformation sEssentialInformation);

    /**
     * 修改基本信息
     * 
     * @param sEssentialInformation 基本信息
     * @return 结果
     */
    public int updateSEssentialInformation(SEssentialInformation sEssentialInformation);

    /**
     * 删除基本信息
     * 
     * @param sEssentialInformationId 基本信息ID
     * @return 结果
     */
    public int deleteSEssentialInformationById(Long sEssentialInformationId);

    /**
     * 批量删除基本信息
     * 
     * @param sEssentialInformationIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSEssentialInformationByIds(String[] sEssentialInformationIds);
}
