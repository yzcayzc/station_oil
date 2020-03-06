package com.ruoyi.station.mapper;

import com.ruoyi.station.domain.SOils;
import java.util.List;

/**
 * 油品设置Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface SOilsMapper 
{
    /**
     * 查询油品设置
     * 
     * @param oilId 油品设置ID
     * @return 油品设置
     */
    public SOils selectSOilsById(Long oilId);

    /**
     * 查询油品设置列表
     * 
     * @param sOils 油品设置
     * @return 油品设置集合
     */
    public List<SOils> selectSOilsList(SOils sOils);

    /**
     * 新增油品设置
     * 
     * @param sOils 油品设置
     * @return 结果
     */
    public int insertSOils(SOils sOils);

    /**
     * 修改油品设置
     * 
     * @param sOils 油品设置
     * @return 结果
     */
    public int updateSOils(SOils sOils);

    /**
     * 删除油品设置
     * 
     * @param oilId 油品设置ID
     * @return 结果
     */
    public int deleteSOilsById(Long oilId);

    /**
     * 批量删除油品设置
     * 
     * @param oilIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSOilsByIds(String[] oilIds);
}
