package com.ruoyi.activity.mapper;

import com.ruoyi.activity.domain.GiftSettings;
import java.util.List;

/**
 * 礼物设置Mapper接口
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
public interface GiftSettingsMapper 
{
    /**
     * 查询礼物设置
     * 
     * @param giftId 礼物设置ID
     * @return 礼物设置
     */
    public GiftSettings selectGiftSettingsById(Long giftId);

    /**
     * 查询礼物设置列表
     * 
     * @param giftSettings 礼物设置
     * @return 礼物设置集合
     */
    public List<GiftSettings> selectGiftSettingsList(GiftSettings giftSettings);

    /**
     * 新增礼物设置
     * 
     * @param giftSettings 礼物设置
     * @return 结果
     */
    public int insertGiftSettings(GiftSettings giftSettings);

    /**
     * 修改礼物设置
     * 
     * @param giftSettings 礼物设置
     * @return 结果
     */
    public int updateGiftSettings(GiftSettings giftSettings);

    /**
     * 删除礼物设置
     * 
     * @param giftId 礼物设置ID
     * @return 结果
     */
    public int deleteGiftSettingsById(Long giftId);

    /**
     * 批量删除礼物设置
     * 
     * @param giftIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteGiftSettingsByIds(String[] giftIds);
}
