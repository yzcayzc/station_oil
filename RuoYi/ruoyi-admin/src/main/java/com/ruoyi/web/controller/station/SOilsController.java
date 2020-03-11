package com.ruoyi.web.controller.station;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.station.domain.SOils;
import com.ruoyi.station.service.ISOilsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 油品设置Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Api(tags = "油品设置")
@Controller
@RequestMapping("/station/s_oils")
public class SOilsController extends BaseController
{
    private String prefix = "station/s_oils";

    @Autowired
    private ISOilsService sOilsService;

    @RequiresPermissions("station:s_oils:view")
    @GetMapping()
    public String s_oils()
    {
        return prefix + "/s_oils";
    }

    /**
     * 查询油品设置列表
     */
    @ApiOperation("查询油品设置列表")
    @RequiresPermissions("station:s_oils:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SOils sOils)
    {
        startPage();
        List<SOils> list = sOilsService.selectSOilsList(sOils);
        return getDataTable(list);
    }

    /**
     * 导出油品设置列表
     */
    @ApiOperation("导出油品设置列表")
    @RequiresPermissions("station:s_oils:export")
    @Log(title = "油品设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SOils sOils)
    {
        List<SOils> list = sOilsService.selectSOilsList(sOils);
        ExcelUtil<SOils> util = new ExcelUtil<SOils>(SOils.class);
        return util.exportExcel(list, "s_oils");
    }

    /**
     * 新增油品设置
     */
    @ApiOperation("新增油品设置")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存油品设置
     */
    @ApiOperation("新增保存油品设置")
    @RequiresPermissions("station:s_oils:add")
    @Log(title = "油品设置", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SOils sOils)
    {
        return toAjax(sOilsService.insertSOils(sOils));
    }

    /**
     * 修改油品设置
     */
    @ApiOperation("修改油品设置")
    @GetMapping("/edit/{oilId}")
    public String edit(@PathVariable("oilId") Long oilId, ModelMap mmap)
    {
        SOils sOils = sOilsService.selectSOilsById(oilId);
        mmap.put("sOils", sOils);
        return prefix + "/edit";
    }

    /**
     * 修改保存油品设置
     */
    @ApiOperation("修改保存油品设置")
    @RequiresPermissions("station:s_oils:edit")
    @Log(title = "油品设置", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SOils sOils)
    {
        return toAjax(sOilsService.updateSOils(sOils));
    }

    /**
     * 删除油品设置
     */
    @ApiOperation("删除油品设置")
    @RequiresPermissions("station:s_oils:remove")
    @Log(title = "油品设置", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sOilsService.deleteSOilsByIds(ids));
    }
}
