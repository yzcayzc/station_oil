package com.ruoyi.census.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.census.mapper.CRechargeInformationMapper;
import com.ruoyi.census.domain.CRechargeInformation;
import com.ruoyi.census.service.ICRechargeInformationService;
import com.ruoyi.common.core.text.Convert;

/**
 * 充值信息表Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Service
public class CRechargeInformationServiceImpl implements ICRechargeInformationService 
{
    @Autowired
    private CRechargeInformationMapper cRechargeInformationMapper;

    /**
     * 查询充值信息表
     * 
     * @param rechargeId 充值信息表ID
     * @return 充值信息表
     */
    @Override
    public CRechargeInformation selectCRechargeInformationById(Long rechargeId)
    {
        return cRechargeInformationMapper.selectCRechargeInformationById(rechargeId);
    }

    /**
     * 查询充值信息表列表
     * 
     * @param cRechargeInformation 充值信息表
     * @return 充值信息表
     */
    @Override
    public List<CRechargeInformation> selectCRechargeInformationList(CRechargeInformation cRechargeInformation)
    {
        return cRechargeInformationMapper.selectCRechargeInformationList(cRechargeInformation);
    }

    /**
     * 新增充值信息表
     * 
     * @param cRechargeInformation 充值信息表
     * @return 结果
     */
    @Override
    public int insertCRechargeInformation(CRechargeInformation cRechargeInformation)
    {
        return cRechargeInformationMapper.insertCRechargeInformation(cRechargeInformation);
    }

    /**
     * 修改充值信息表
     * 
     * @param cRechargeInformation 充值信息表
     * @return 结果
     */
    @Override
    public int updateCRechargeInformation(CRechargeInformation cRechargeInformation)
    {
        return cRechargeInformationMapper.updateCRechargeInformation(cRechargeInformation);
    }

    /**
     * 删除充值信息表对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCRechargeInformationByIds(String ids)
    {
        return cRechargeInformationMapper.deleteCRechargeInformationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除充值信息表信息
     * 
     * @param rechargeId 充值信息表ID
     * @return 结果
     */
    @Override
    public int deleteCRechargeInformationById(Long rechargeId)
    {
        return cRechargeInformationMapper.deleteCRechargeInformationById(rechargeId);
    }
}
