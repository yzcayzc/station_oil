package com.ruoyi.systematic.service;

import com.ruoyi.systematic.domain.SyPosterSettings;
import java.util.List;

/**
 * 海报设置Service接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface ISyPosterSettingsService 
{
    /**
     * 查询海报设置
     * 
     * @param posterSettingsId 海报设置ID
     * @return 海报设置
     */
    public SyPosterSettings selectSyPosterSettingsById(Long posterSettingsId);

    /**
     * 查询海报设置列表
     * 
     * @param syPosterSettings 海报设置
     * @return 海报设置集合
     */
    public List<SyPosterSettings> selectSyPosterSettingsList(SyPosterSettings syPosterSettings);

    /**
     * 新增海报设置
     * 
     * @param syPosterSettings 海报设置
     * @return 结果
     */
    public int insertSyPosterSettings(SyPosterSettings syPosterSettings);

    /**
     * 修改海报设置
     * 
     * @param syPosterSettings 海报设置
     * @return 结果
     */
    public int updateSyPosterSettings(SyPosterSettings syPosterSettings);

    /**
     * 批量删除海报设置
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSyPosterSettingsByIds(String ids);

    /**
     * 删除海报设置信息
     * 
     * @param posterSettingsId 海报设置ID
     * @return 结果
     */
    public int deleteSyPosterSettingsById(Long posterSettingsId);
}
