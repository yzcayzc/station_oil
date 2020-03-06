package com.ruoyi.systematic.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.systematic.mapper.SyPosterSettingsMapper;
import com.ruoyi.systematic.domain.SyPosterSettings;
import com.ruoyi.systematic.service.ISyPosterSettingsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 海报设置Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class SyPosterSettingsServiceImpl implements ISyPosterSettingsService 
{
    @Autowired
    private SyPosterSettingsMapper syPosterSettingsMapper;

    /**
     * 查询海报设置
     * 
     * @param posterSettingsId 海报设置ID
     * @return 海报设置
     */
    @Override
    public SyPosterSettings selectSyPosterSettingsById(Long posterSettingsId)
    {
        return syPosterSettingsMapper.selectSyPosterSettingsById(posterSettingsId);
    }

    /**
     * 查询海报设置列表
     * 
     * @param syPosterSettings 海报设置
     * @return 海报设置
     */
    @Override
    public List<SyPosterSettings> selectSyPosterSettingsList(SyPosterSettings syPosterSettings)
    {
        List<SyPosterSettings> syPosterSettings1 = syPosterSettingsMapper.selectSyPosterSettingsList(syPosterSettings);
        for (SyPosterSettings posterSettings : syPosterSettings1) {
            String image = posterSettings.getImage();
            posterSettings.setImage("["+image+"]");
        }
        return syPosterSettings1;
    }

    /**
     * 新增海报设置
     * 
     * @param syPosterSettings 海报设置
     * @return 结果
     */
    @Override
    public int insertSyPosterSettings(SyPosterSettings syPosterSettings)
    {
        return syPosterSettingsMapper.insertSyPosterSettings(syPosterSettings);
    }

    /**
     * 修改海报设置
     * 
     * @param syPosterSettings 海报设置
     * @return 结果
     */
    @Override
    public int updateSyPosterSettings(SyPosterSettings syPosterSettings)
    {
        return syPosterSettingsMapper.updateSyPosterSettings(syPosterSettings);
    }

    /**
     * 删除海报设置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSyPosterSettingsByIds(String ids)
    {
        return syPosterSettingsMapper.deleteSyPosterSettingsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除海报设置信息
     * 
     * @param posterSettingsId 海报设置ID
     * @return 结果
     */
    @Override
    public int deleteSyPosterSettingsById(Long posterSettingsId)
    {
        return syPosterSettingsMapper.deleteSyPosterSettingsById(posterSettingsId);
    }
}
