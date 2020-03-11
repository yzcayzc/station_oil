package com.ruoyi.web.controller.station;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.station.domain.SEssentialInformation;
import com.ruoyi.station.service.ISEssentialInformationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 基本信息Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Api(tags = "基本信息")
@Controller
@RequestMapping("/station/s_essential_information")
public class SEssentialInformationController extends BaseController
{
    private String prefix = "station/s_essential_information";

    @Autowired
    private ISEssentialInformationService sEssentialInformationService;

    @RequiresPermissions("station:s_essential_information:view")
    @GetMapping()
    public String s_essential_information()
    {
        return prefix + "/s_essential_information";
    }

    /**
     * 查询基本信息列表
     */
    @ApiOperation("查询基本信息列表")
    @RequiresPermissions("station:s_essential_information:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SEssentialInformation sEssentialInformation)
    {
        startPage();
        List<SEssentialInformation> list = sEssentialInformationService.selectSEssentialInformationList(sEssentialInformation);
        return getDataTable(list);
    }

    /**
     * 导出基本信息列表
     */
    @ApiOperation("导出基本信息列表")
    @RequiresPermissions("station:s_essential_information:export")
    @Log(title = "基本信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SEssentialInformation sEssentialInformation)
    {
        List<SEssentialInformation> list = sEssentialInformationService.selectSEssentialInformationList(sEssentialInformation);
        ExcelUtil<SEssentialInformation> util = new ExcelUtil<SEssentialInformation>(SEssentialInformation.class);
        return util.exportExcel(list, "s_essential_information");
    }

    /**
     * 新增基本信息
     */
    @ApiOperation("新增基本信息")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存基本信息
     */
    @ApiOperation("新增保存基本信息")
    @RequiresPermissions("station:s_essential_information:add")
    @Log(title = "基本信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SEssentialInformation sEssentialInformation)
    {
        return toAjax(sEssentialInformationService.insertSEssentialInformation(sEssentialInformation));
    }

    /**
     * 修改基本信息
     */
    @ApiOperation("修改基本信息")
    @GetMapping("/edit/{sEssentialInformationId}")
    public String edit(@PathVariable("sEssentialInformationId") Long sEssentialInformationId, ModelMap mmap)
    {
        SEssentialInformation sEssentialInformation = sEssentialInformationService.selectSEssentialInformationById(sEssentialInformationId);
        mmap.put("sEssentialInformation", sEssentialInformation);
        return prefix + "/edit";
    }

    /**
     * 修改保存基本信息
     */
    @ApiOperation("修改保存基本信息")
    @RequiresPermissions("station:s_essential_information:edit")
    @Log(title = "基本信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SEssentialInformation sEssentialInformation)
    {
        return toAjax(sEssentialInformationService.updateSEssentialInformation(sEssentialInformation));
    }

    /**
     * 删除基本信息
     */
    @ApiOperation("删除基本信息")
    @RequiresPermissions("station:s_essential_information:remove")
    @Log(title = "基本信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sEssentialInformationService.deleteSEssentialInformationByIds(ids));
    }
}
