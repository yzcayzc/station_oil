package com.ruoyi.web.controller.census;

import com.ruoyi.census.domain.CPerCapitaConsumption;
import com.ruoyi.census.service.ICPerCapitaConsumptionService;
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
 * 人均消费统计Controller
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Api(tags = "人均消费统计")
@Controller
@RequestMapping("/census/c_per_capita_consumption")
public class CPerCapitaConsumptionController extends BaseController
{
    private String prefix = "census/c_per_capita_consumption";

    @Autowired
    private ICPerCapitaConsumptionService cPerCapitaConsumptionService;

    @RequiresPermissions("census:c_per_capita_consumption:view")
    @GetMapping()
    public String c_per_capita_consumption()
    {
        return prefix + "/c_per_capita_consumption";
    }

    /**
     * 查询人均消费统计列表
     */
    @ApiOperation("查询人均消费统计列表")
    @RequiresPermissions("census:c_per_capita_consumption:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CPerCapitaConsumption cPerCapitaConsumption)
    {
        startPage();
        List<CPerCapitaConsumption> list = cPerCapitaConsumptionService.selectCPerCapitaConsumptionList(cPerCapitaConsumption);
        return getDataTable(list);
    }

    /**
     * 导出人均消费统计列表
     */
    @ApiOperation("导出人均消费统计列表")
    @RequiresPermissions("census:c_per_capita_consumption:export")
    @Log(title = "人均消费统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CPerCapitaConsumption cPerCapitaConsumption)
    {
        List<CPerCapitaConsumption> list = cPerCapitaConsumptionService.selectCPerCapitaConsumptionList(cPerCapitaConsumption);
        ExcelUtil<CPerCapitaConsumption> util = new ExcelUtil<CPerCapitaConsumption>(CPerCapitaConsumption.class);
        return util.exportExcel(list, "c_per_capita_consumption");
    }

    /**
     * 新增人均消费统计
     */
    @ApiOperation("新增人均消费统计")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存人均消费统计
     */
    @ApiOperation("新增保存人均消费统计")
    @RequiresPermissions("census:c_per_capita_consumption:add")
    @Log(title = "人均消费统计", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CPerCapitaConsumption cPerCapitaConsumption)
    {
        return toAjax(cPerCapitaConsumptionService.insertCPerCapitaConsumption(cPerCapitaConsumption));
    }

    /**
     * 修改人均消费统计
     */
    @ApiOperation("修改人均消费统计")
    @GetMapping("/edit/{perId}")
    public String edit(@PathVariable("perId") Long perId, ModelMap mmap)
    {
        CPerCapitaConsumption cPerCapitaConsumption = cPerCapitaConsumptionService.selectCPerCapitaConsumptionById(perId);
        mmap.put("cPerCapitaConsumption", cPerCapitaConsumption);
        return prefix + "/edit";
    }

    /**
     * 修改保存人均消费统计
     */
    @ApiOperation("修改保存人均消费统计")
    @RequiresPermissions("census:c_per_capita_consumption:edit")
    @Log(title = "人均消费统计", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CPerCapitaConsumption cPerCapitaConsumption)
    {
        return toAjax(cPerCapitaConsumptionService.updateCPerCapitaConsumption(cPerCapitaConsumption));
    }

    /**
     * 删除人均消费统计
     */
    @ApiOperation("删除人均消费统计")
    @RequiresPermissions("census:c_per_capita_consumption:remove")
    @Log(title = "人均消费统计", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cPerCapitaConsumptionService.deleteCPerCapitaConsumptionByIds(ids));
    }
}
