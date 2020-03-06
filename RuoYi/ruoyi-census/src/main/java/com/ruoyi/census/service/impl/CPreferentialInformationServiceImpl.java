package com.ruoyi.census.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.census.mapper.CPreferentialInformationMapper;
import com.ruoyi.census.domain.CPreferentialInformation;
import com.ruoyi.census.service.ICPreferentialInformationService;
import com.ruoyi.common.core.text.Convert;

/**
 * 优惠信息表Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Service
public class CPreferentialInformationServiceImpl implements ICPreferentialInformationService 
{
    @Autowired
    private CPreferentialInformationMapper cPreferentialInformationMapper;

    /**
     * 查询优惠信息表
     * 
     * @param preferentialId 优惠信息表ID
     * @return 优惠信息表
     */
    @Override
    public CPreferentialInformation selectCPreferentialInformationById(Long preferentialId)
    {
        return cPreferentialInformationMapper.selectCPreferentialInformationById(preferentialId);
    }

    /**
     * 查询优惠信息表列表
     * 
     * @param cPreferentialInformation 优惠信息表
     * @return 优惠信息表
     */
    @Override
    public List<CPreferentialInformation> selectCPreferentialInformationList(CPreferentialInformation cPreferentialInformation)
    {
        return cPreferentialInformationMapper.selectCPreferentialInformationList(cPreferentialInformation);
    }

    /**
     * 新增优惠信息表
     * 
     * @param cPreferentialInformation 优惠信息表
     * @return 结果
     */
    @Override
    public int insertCPreferentialInformation(CPreferentialInformation cPreferentialInformation)
    {
        return cPreferentialInformationMapper.insertCPreferentialInformation(cPreferentialInformation);
    }

    /**
     * 修改优惠信息表
     * 
     * @param cPreferentialInformation 优惠信息表
     * @return 结果
     */
    @Override
    public int updateCPreferentialInformation(CPreferentialInformation cPreferentialInformation)
    {
        return cPreferentialInformationMapper.updateCPreferentialInformation(cPreferentialInformation);
    }

    /**
     * 删除优惠信息表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCPreferentialInformationByIds(String ids)
    {
        return cPreferentialInformationMapper.deleteCPreferentialInformationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除优惠信息表信息
     * 
     * @param preferentialId 优惠信息表ID
     * @return 结果
     */
    @Override
    public int deleteCPreferentialInformationById(Long preferentialId)
    {
        return cPreferentialInformationMapper.deleteCPreferentialInformationById(preferentialId);
    }
}
