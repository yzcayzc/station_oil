package com.ruoyi.web.controller.activity;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.activity.domain.GiftSettings;
import com.ruoyi.activity.service.IGiftSettingsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 礼物设置Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Controller
@RequestMapping("/activity/gift_settings")
public class GiftSettingsController extends BaseController
{
    private String prefix = "activity/gift_settings";

    @Autowired
    private IGiftSettingsService giftSettingsService;

    @RequiresPermissions("activity:gift_settings:view")
    @GetMapping()
    public String gift_settings()
    {
        return prefix + "/gift_settings";
    }

    /**
     * 查询礼物设置列表
     */
    @RequiresPermissions("activity:gift_settings:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GiftSettings giftSettings)
    {
        startPage();
        List<GiftSettings> list = giftSettingsService.selectGiftSettingsList(giftSettings);
        return getDataTable(list);
    }

    /**
     * 导出礼物设置列表
     */
    @RequiresPermissions("activity:gift_settings:export")
    @Log(title = "礼物设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GiftSettings giftSettings)
    {
        List<GiftSettings> list = giftSettingsService.selectGiftSettingsList(giftSettings);
        ExcelUtil<GiftSettings> util = new ExcelUtil<GiftSettings>(GiftSettings.class);
        return util.exportExcel(list, "gift_settings");
    }

    /**
     * 新增礼物设置
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存礼物设置
     */
    @RequiresPermissions("activity:gift_settings:add")
    @Log(title = "礼物设置", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GiftSettings giftSettings)
    {
        return toAjax(giftSettingsService.insertGiftSettings(giftSettings));
    }

    /**
     * 修改礼物设置
     */
    @GetMapping("/edit/{giftId}")
    public String edit(@PathVariable("giftId") Long giftId, ModelMap mmap)
    {
        GiftSettings giftSettings = giftSettingsService.selectGiftSettingsById(giftId);
        mmap.put("giftSettings", giftSettings);
        return prefix + "/edit";
    }

    /**
     * 修改保存礼物设置
     */
    @RequiresPermissions("activity:gift_settings:edit")
    @Log(title = "礼物设置", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GiftSettings giftSettings)
    {
        return toAjax(giftSettingsService.updateGiftSettings(giftSettings));
    }

    /**
     * 删除礼物设置
     */
    @RequiresPermissions("activity:gift_settings:remove")
    @Log(title = "礼物设置", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(giftSettingsService.deleteGiftSettingsByIds(ids));
    }
}
