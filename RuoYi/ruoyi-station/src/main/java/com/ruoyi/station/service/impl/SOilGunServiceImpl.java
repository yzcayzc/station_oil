package com.ruoyi.station.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.station.mapper.SOilGunMapper;
import com.ruoyi.station.domain.SOilGun;
import com.ruoyi.station.service.ISOilGunService;
import com.ruoyi.common.core.text.Convert;

/**
 * 油枪设置Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class SOilGunServiceImpl implements ISOilGunService 
{
    @Autowired
    private SOilGunMapper sOilGunMapper;

    /**
     * 查询油枪设置
     * 
     * @param oilGunId 油枪设置ID
     * @return 油枪设置
     */
    @Override
    public SOilGun selectSOilGunById(Long oilGunId)
    {
        return sOilGunMapper.selectSOilGunById(oilGunId);
    }

    /**
     * 查询油枪设置列表
     * 
     * @param sOilGun 油枪设置
     * @return 油枪设置
     */
    @Override
    public List<SOilGun> selectSOilGunList(SOilGun sOilGun)
    {
        return sOilGunMapper.selectSOilGunList(sOilGun);
    }

    /**
     * 新增油枪设置
     * 
     * @param sOilGun 油枪设置
     * @return 结果
     */
    @Override
    public int insertSOilGun(SOilGun sOilGun)
    {
        return sOilGunMapper.insertSOilGun(sOilGun);
    }

    /**
     * 修改油枪设置
     * 
     * @param sOilGun 油枪设置
     * @return 结果
     */
    @Override
    public int updateSOilGun(SOilGun sOilGun)
    {
        return sOilGunMapper.updateSOilGun(sOilGun);
    }

    /**
     * 删除油枪设置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSOilGunByIds(String ids)
    {
        return sOilGunMapper.deleteSOilGunByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除油枪设置信息
     * 
     * @param oilGunId 油枪设置ID
     * @return 结果
     */
    @Override
    public int deleteSOilGunById(Long oilGunId)
    {
        return sOilGunMapper.deleteSOilGunById(oilGunId);
    }
}
