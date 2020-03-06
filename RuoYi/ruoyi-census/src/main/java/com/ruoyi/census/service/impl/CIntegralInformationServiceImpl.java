package com.ruoyi.census.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.census.mapper.CIntegralInformationMapper;
import com.ruoyi.census.domain.CIntegralInformation;
import com.ruoyi.census.service.ICIntegralInformationService;
import com.ruoyi.common.core.text.Convert;

/**
 * 积分信息表Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Service
public class CIntegralInformationServiceImpl implements ICIntegralInformationService 
{
    @Autowired
    private CIntegralInformationMapper cIntegralInformationMapper;

    /**
     * 查询积分信息表
     * 
     * @param integral 积分信息表ID
     * @return 积分信息表
     */
    @Override
    public CIntegralInformation selectCIntegralInformationById(Long integral)
    {
        return cIntegralInformationMapper.selectCIntegralInformationById(integral);
    }

    /**
     * 查询积分信息表列表
     * 
     * @param cIntegralInformation 积分信息表
     * @return 积分信息表
     */
    @Override
    public List<CIntegralInformation> selectCIntegralInformationList(CIntegralInformation cIntegralInformation)
    {
        return cIntegralInformationMapper.selectCIntegralInformationList(cIntegralInformation);
    }

    /**
     * 新增积分信息表
     * 
     * @param cIntegralInformation 积分信息表
     * @return 结果
     */
    @Override
    public int insertCIntegralInformation(CIntegralInformation cIntegralInformation)
    {
        return cIntegralInformationMapper.insertCIntegralInformation(cIntegralInformation);
    }

    /**
     * 修改积分信息表
     * 
     * @param cIntegralInformation 积分信息表
     * @return 结果
     */
    @Override
    public int updateCIntegralInformation(CIntegralInformation cIntegralInformation)
    {
        return cIntegralInformationMapper.updateCIntegralInformation(cIntegralInformation);
    }

    /**
     * 删除积分信息表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCIntegralInformationByIds(String ids)
    {
        return cIntegralInformationMapper.deleteCIntegralInformationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除积分信息表信息
     * 
     * @param integral 积分信息表ID
     * @return 结果
     */
    @Override
    public int deleteCIntegralInformationById(Long integral)
    {
        return cIntegralInformationMapper.deleteCIntegralInformationById(integral);
    }
}
