package com.ruoyi.web.controller.census;

import com.ruoyi.census.domain.CIntegralInformation;
import com.ruoyi.census.service.ICIntegralInformationService;
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
 * 积分信息表Controller
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Api("积分信息表")
@Controller
@RequestMapping("/census/c_integral_information")
public class CIntegralInformationController extends BaseController
{
    private String prefix = "census/c_integral_information";

    @Autowired
    private ICIntegralInformationService cIntegralInformationService;

    @RequiresPermissions("census:c_integral_information:view")
    @GetMapping()
    public String c_integral_information()
    {
        return prefix + "/c_integral_information";
    }

    /**
     * 查询积分信息表列表
     */
    @ApiOperation("查询积分信息表列表")
    @RequiresPermissions("census:c_integral_information:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CIntegralInformation cIntegralInformation)
    {
        startPage();
        List<CIntegralInformation> list = cIntegralInformationService.selectCIntegralInformationList(cIntegralInformation);
        return getDataTable(list);
    }

    /**
     * 导出积分信息表列表
     */
    @ApiOperation("导出积分信息表列表")
    @RequiresPermissions("census:c_integral_information:export")
    @Log(title = "积分信息表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CIntegralInformation cIntegralInformation)
    {
        List<CIntegralInformation> list = cIntegralInformationService.selectCIntegralInformationList(cIntegralInformation);
        ExcelUtil<CIntegralInformation> util = new ExcelUtil<CIntegralInformation>(CIntegralInformation.class);
        return util.exportExcel(list, "c_integral_information");
    }

    /**
     * 新增积分信息表
     */
    @ApiOperation("新增积分信息表")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存积分信息表
     */
    @ApiOperation("新增保存积分信息表")
    @RequiresPermissions("census:c_integral_information:add")
    @Log(title = "积分信息表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CIntegralInformation cIntegralInformation)
    {
        return toAjax(cIntegralInformationService.insertCIntegralInformation(cIntegralInformation));
    }

    /**
     * 修改积分信息表
     */
    @ApiOperation("修改积分信息表")
    @GetMapping("/edit/{integral}")
    public String edit(@PathVariable("integral") Long integral, ModelMap mmap)
    {
        CIntegralInformation cIntegralInformation = cIntegralInformationService.selectCIntegralInformationById(integral);
        mmap.put("cIntegralInformation", cIntegralInformation);
        return prefix + "/edit";
    }

    /**
     * 修改保存积分信息表
     */
    @ApiOperation("修改保存积分信息表")
    @RequiresPermissions("census:c_integral_information:edit")
    @Log(title = "积分信息表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CIntegralInformation cIntegralInformation)
    {
        return toAjax(cIntegralInformationService.updateCIntegralInformation(cIntegralInformation));
    }

    /**
     * 删除积分信息表
     */
    @ApiOperation("删除积分信息表")
    @RequiresPermissions("census:c_integral_information:remove")
    @Log(title = "积分信息表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cIntegralInformationService.deleteCIntegralInformationByIds(ids));
    }
}
