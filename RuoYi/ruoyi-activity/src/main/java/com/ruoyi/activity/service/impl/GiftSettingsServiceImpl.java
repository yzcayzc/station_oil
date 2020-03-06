package com.ruoyi.activity.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.activity.mapper.GiftSettingsMapper;
import com.ruoyi.activity.domain.GiftSettings;
import com.ruoyi.activity.service.IGiftSettingsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 礼物设置Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Service
public class GiftSettingsServiceImpl implements IGiftSettingsService 
{
    @Autowired
    private GiftSettingsMapper giftSettingsMapper;

    /**
     * 查询礼物设置
     * 
     * @param giftId 礼物设置ID
     * @return 礼物设置
     */
    @Override
    public GiftSettings selectGiftSettingsById(Long giftId)
    {
        return giftSettingsMapper.selectGiftSettingsById(giftId);
    }

    /**
     * 查询礼物设置列表
     * 
     * @param giftSettings 礼物设置
     * @return 礼物设置
     */
    @Override
    public List<GiftSettings> selectGiftSettingsList(GiftSettings giftSettings)
    {
        return giftSettingsMapper.selectGiftSettingsList(giftSettings);
    }

    /**
     * 新增礼物设置
     * 
     * @param giftSettings 礼物设置
     * @return 结果
     */
    @Override
    public int insertGiftSettings(GiftSettings giftSettings)
    {
        return giftSettingsMapper.insertGiftSettings(giftSettings);
    }

    /**
     * 修改礼物设置
     * 
     * @param giftSettings 礼物设置
     * @return 结果
     */
    @Override
    public int updateGiftSettings(GiftSettings giftSettings)
    {
        return giftSettingsMapper.updateGiftSettings(giftSettings);
    }

    /**
     * 删除礼物设置对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteGiftSettingsByIds(String ids)
    {
        return giftSettingsMapper.deleteGiftSettingsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除礼物设置信息
     * 
     * @param giftId 礼物设置ID
     * @return 结果
     */
    @Override
    public int deleteGiftSettingsById(Long giftId)
    {
        return giftSettingsMapper.deleteGiftSettingsById(giftId);
    }
}
