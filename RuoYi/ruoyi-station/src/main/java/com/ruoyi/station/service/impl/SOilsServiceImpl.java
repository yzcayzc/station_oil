package com.ruoyi.station.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.station.mapper.SOilsMapper;
import com.ruoyi.station.domain.SOils;
import com.ruoyi.station.service.ISOilsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 油品设置Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class SOilsServiceImpl implements ISOilsService 
{
    @Autowired
    private SOilsMapper sOilsMapper;

    /**
     * 查询油品设置
     * 
     * @param oilId 油品设置ID
     * @return 油品设置
     */
    @Override
    public SOils selectSOilsById(Long oilId)
    {
        return sOilsMapper.selectSOilsById(oilId);
    }

    /**
     * 查询油品设置列表
     * 
     * @param sOils 油品设置
     * @return 油品设置
     */
    @Override
    public List<SOils> selectSOilsList(SOils sOils)
    {
        return sOilsMapper.selectSOilsList(sOils);
    }

    /**
     * 新增油品设置
     * 
     * @param sOils 油品设置
     * @return 结果
     */
    @Override
    public int insertSOils(SOils sOils)
    {
        return sOilsMapper.insertSOils(sOils);
    }

    /**
     * 修改油品设置
     * 
     * @param sOils 油品设置
     * @return 结果
     */
    @Override
    public int updateSOils(SOils sOils)
    {
        return sOilsMapper.updateSOils(sOils);
    }

    /**
     * 删除油品设置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSOilsByIds(String ids)
    {
        return sOilsMapper.deleteSOilsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除油品设置信息
     * 
     * @param oilId 油品设置ID
     * @return 结果
     */
    @Override
    public int deleteSOilsById(Long oilId)
    {
        return sOilsMapper.deleteSOilsById(oilId);
    }
}
