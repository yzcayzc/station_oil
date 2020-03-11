package com.ruoyi.web.controller.census;

import com.ruoyi.census.domain.CActivityOverview;
import com.ruoyi.census.service.ICActivityOverviewService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 活动总览Controller
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Api(tags = "活动总览")
@Controller
@RequestMapping("/census/c_activity_overview")
public class CActivityOverviewController extends BaseController
{
    private String prefix = "census/c_activity_overview";

    @Autowired
    private ICActivityOverviewService cActivityOverviewService;

    @RequiresPermissions("census:c_activity_overview:view")
    @GetMapping()
    public String c_activity_overview()
    {
        return prefix + "/c_activity_overview";
    }

    /**
     * 查询活动总览列表
     */
    @ApiOperation("查询活动总览列表")
    @RequiresPermissions("census:c_activity_overview:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CActivityOverview cActivityOverview)
    {
        startPage();
        List<CActivityOverview> list = cActivityOverviewService.selectCActivityOverviewList(cActivityOverview);
        return getDataTable(list);
    }

    /**
     * 导出活动总览列表
     */
    @ApiOperation("导出活动总览列表")
    @RequiresPermissions("census:c_activity_overview:export")
    @Log(title = "活动总览", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CActivityOverview cActivityOverview)
    {
        List<CActivityOverview> list = cActivityOverviewService.selectCActivityOverviewList(cActivityOverview);
        ExcelUtil<CActivityOverview> util = new ExcelUtil<CActivityOverview>(CActivityOverview.class);
        return util.exportExcel(list, "c_activity_overview");
    }

    /**
     * 新增活动总览
     */
    @ApiOperation("新增活动总览")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存活动总览
     */
    @ApiOperation("新增保存活动总览")
    @RequiresPermissions("census:c_activity_overview:add")
    @Log(title = "活动总览", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CActivityOverview cActivityOverview)
    {
        return toAjax(cActivityOverviewService.insertCActivityOverview(cActivityOverview));
    }

    /**
     * 修改活动总览
     */
    @ApiOperation("修改活动总览")
    @GetMapping("/edit/{activity}")
    public String edit(@PathVariable("activity") Long activity, ModelMap mmap)
    {
        CActivityOverview cActivityOverview = cActivityOverviewService.selectCActivityOverviewById(activity);
        mmap.put("cActivityOverview", cActivityOverview);
        return prefix + "/edit";
    }

    /**
     * 修改保存活动总览
     */
    @ApiOperation("修改保存活动总览")
    @RequiresPermissions("census:c_activity_overview:edit")
    @Log(title = "活动总览", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CActivityOverview cActivityOverview)
    {
        return toAjax(cActivityOverviewService.updateCActivityOverview(cActivityOverview));
    }

    /**
     * 删除活动总览
     */
    @ApiOperation("删除活动总览")
    @RequiresPermissions("census:c_activity_overview:remove")
    @Log(title = "活动总览", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cActivityOverviewService.deleteCActivityOverviewByIds(ids));
    }
}
