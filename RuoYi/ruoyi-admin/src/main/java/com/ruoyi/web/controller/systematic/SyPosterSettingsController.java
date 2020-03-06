package com.ruoyi.web.controller.systematic;

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
import com.ruoyi.systematic.domain.SyPosterSettings;
import com.ruoyi.systematic.service.ISyPosterSettingsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 海报设置Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Controller
@RequestMapping("/systematic/sy_poster_settings")
public class SyPosterSettingsController extends BaseController
{
    private String prefix = "systematic/sy_poster_settings";

    @Autowired
    private ISyPosterSettingsService syPosterSettingsService;

    @RequiresPermissions("systematic:sy_poster_settings:view")
    @GetMapping()
    public String sy_poster_settings()
    {
        return prefix + "/sy_poster_settings";
    }

    /**
     * 查询海报设置列表
     */
    @RequiresPermissions("systematic:sy_poster_settings:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SyPosterSettings syPosterSettings)
    {
        startPage();
        List<SyPosterSettings> list = syPosterSettingsService.selectSyPosterSettingsList(syPosterSettings);
        return getDataTable(list);
    }

    /**
     * 导出海报设置列表
     */
    @RequiresPermissions("systematic:sy_poster_settings:export")
    @Log(title = "海报设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SyPosterSettings syPosterSettings)
    {
        List<SyPosterSettings> list = syPosterSettingsService.selectSyPosterSettingsList(syPosterSettings);
        ExcelUtil<SyPosterSettings> util = new ExcelUtil<SyPosterSettings>(SyPosterSettings.class);
        return util.exportExcel(list, "sy_poster_settings");
    }

    /**
     * 新增海报设置
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存海报设置
     */
    @RequiresPermissions("systematic:sy_poster_settings:add")
    @Log(title = "海报设置", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SyPosterSettings syPosterSettings)
    {
        return toAjax(syPosterSettingsService.insertSyPosterSettings(syPosterSettings));
    }

    /**
     * 修改海报设置
     */
    @GetMapping("/edit/{posterSettingsId}")
    public String edit(@PathVariable("posterSettingsId") Long posterSettingsId, ModelMap mmap)
    {
        SyPosterSettings syPosterSettings = syPosterSettingsService.selectSyPosterSettingsById(posterSettingsId);
        mmap.put("syPosterSettings", syPosterSettings);
        return prefix + "/edit";
    }

    /**
     * 修改保存海报设置
     */
    @RequiresPermissions("systematic:sy_poster_settings:edit")
    @Log(title = "海报设置", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SyPosterSettings syPosterSettings)
    {
        return toAjax(syPosterSettingsService.updateSyPosterSettings(syPosterSettings));
    }

    /**
     * 删除海报设置
     */
    @RequiresPermissions("systematic:sy_poster_settings:remove")
    @Log(title = "海报设置", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(syPosterSettingsService.deleteSyPosterSettingsByIds(ids));
    }
}
