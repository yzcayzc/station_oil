package com.ruoyi.station.service;

import com.ruoyi.station.domain.SOilGun;
import java.util.List;

/**
 * 油枪设置Service接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface ISOilGunService 
{
    /**
     * 查询油枪设置
     * 
     * @param oilGunId 油枪设置ID
     * @return 油枪设置
     */
    public SOilGun selectSOilGunById(Long oilGunId);

    /**
     * 查询油枪设置列表
     * 
     * @param sOilGun 油枪设置
     * @return 油枪设置集合
     */
    public List<SOilGun> selectSOilGunList(SOilGun sOilGun);

    /**
     * 新增油枪设置
     * 
     * @param sOilGun 油枪设置
     * @return 结果
     */
    public int insertSOilGun(SOilGun sOilGun);

    /**
     * 修改油枪设置
     * 
     * @param sOilGun 油枪设置
     * @return 结果
     */
    public int updateSOilGun(SOilGun sOilGun);

    /**
     * 批量删除油枪设置
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSOilGunByIds(String ids);

    /**
     * 删除油枪设置信息
     * 
     * @param oilGunId 油枪设置ID
     * @return 结果
     */
    public int deleteSOilGunById(Long oilGunId);
}
