package com.ruoyi.station.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.station.mapper.SEssentialInformationMapper;
import com.ruoyi.station.domain.SEssentialInformation;
import com.ruoyi.station.service.ISEssentialInformationService;
import com.ruoyi.common.core.text.Convert;

/**
 * 基本信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class SEssentialInformationServiceImpl implements ISEssentialInformationService 
{
    @Autowired
    private SEssentialInformationMapper sEssentialInformationMapper;

    /**
     * 查询基本信息
     * 
     * @param sEssentialInformationId 基本信息ID
     * @return 基本信息
     */
    @Override
    public SEssentialInformation selectSEssentialInformationById(Long sEssentialInformationId)
    {
        return sEssentialInformationMapper.selectSEssentialInformationById(sEssentialInformationId);
    }

    /**
     * 查询基本信息列表
     * 
     * @param sEssentialInformation 基本信息
     * @return 基本信息
     */
    @Override
    public List<SEssentialInformation> selectSEssentialInformationList(SEssentialInformation sEssentialInformation)
    {
        return sEssentialInformationMapper.selectSEssentialInformationList(sEssentialInformation);
    }

    /**
     * 新增基本信息
     * 
     * @param sEssentialInformation 基本信息
     * @return 结果
     */
    @Override
    public int insertSEssentialInformation(SEssentialInformation sEssentialInformation)
    {
        sEssentialInformation.setCreateTime(DateUtils.getNowDate());
        return sEssentialInformationMapper.insertSEssentialInformation(sEssentialInformation);
    }

    /**
     * 修改基本信息
     * 
     * @param sEssentialInformation 基本信息
     * @return 结果
     */
    @Override
    public int updateSEssentialInformation(SEssentialInformation sEssentialInformation)
    {
        return sEssentialInformationMapper.updateSEssentialInformation(sEssentialInformation);
    }

    /**
     * 删除基本信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSEssentialInformationByIds(String ids)
    {
        return sEssentialInformationMapper.deleteSEssentialInformationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除基本信息信息
     * 
     * @param sEssentialInformationId 基本信息ID
     * @return 结果
     */
    @Override
    public int deleteSEssentialInformationById(Long sEssentialInformationId)
    {
        return sEssentialInformationMapper.deleteSEssentialInformationById(sEssentialInformationId);
    }
}
