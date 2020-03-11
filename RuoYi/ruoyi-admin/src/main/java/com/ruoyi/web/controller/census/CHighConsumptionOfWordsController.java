package com.ruoyi.web.controller.census;

import com.ruoyi.census.domain.CHighConsumptionOfWords;
import com.ruoyi.census.service.ICHighConsumptionOfWordsService;
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
 * 单次高额消费统计Controller
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Api(tags = "单次高额消费统计")
@Controller
@RequestMapping("/census/c_high_consumption_of_words")
public class CHighConsumptionOfWordsController extends BaseController
{
    private String prefix = "census/c_high_consumption_of_words";

    @Autowired
    private ICHighConsumptionOfWordsService cHighConsumptionOfWordsService;

    @RequiresPermissions("census:c_high_consumption_of_words:view")
    @GetMapping()
    public String c_high_consumption_of_words()
    {
        return prefix + "/c_high_consumption_of_words";
    }

    /**
     * 查询单次高额消费统计列表
     */
    @ApiOperation("查询单次高额消费统计列表")
    @RequiresPermissions("census:c_high_consumption_of_words:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CHighConsumptionOfWords cHighConsumptionOfWords)
    {
        startPage();
        List<CHighConsumptionOfWords> list = cHighConsumptionOfWordsService.selectCHighConsumptionOfWordsList(cHighConsumptionOfWords);
        return getDataTable(list);
    }

    /**
     * 导出单次高额消费统计列表
     */
    @ApiOperation("导出单次高额消费统计列表")
    @RequiresPermissions("census:c_high_consumption_of_words:export")
    @Log(title = "单次高额消费统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CHighConsumptionOfWords cHighConsumptionOfWords)
    {
        List<CHighConsumptionOfWords> list = cHighConsumptionOfWordsService.selectCHighConsumptionOfWordsList(cHighConsumptionOfWords);
        ExcelUtil<CHighConsumptionOfWords> util = new ExcelUtil<CHighConsumptionOfWords>(CHighConsumptionOfWords.class);
        return util.exportExcel(list, "c_high_consumption_of_words");
    }

    /**
     * 新增单次高额消费统计
     */
    @ApiOperation("新增单次高额消费统计")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存单次高额消费统计
     */
    @ApiOperation("新增保存单次高额消费统计")
    @RequiresPermissions("census:c_high_consumption_of_words:add")
    @Log(title = "单次高额消费统计", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CHighConsumptionOfWords cHighConsumptionOfWords)
    {
        return toAjax(cHighConsumptionOfWordsService.insertCHighConsumptionOfWords(cHighConsumptionOfWords));
    }

    /**
     * 修改单次高额消费统计
     */
    @ApiOperation("修改单次高额消费统计")
    @GetMapping("/edit/{consumptionId}")
    public String edit(@PathVariable("consumptionId") Long consumptionId, ModelMap mmap)
    {
        CHighConsumptionOfWords cHighConsumptionOfWords = cHighConsumptionOfWordsService.selectCHighConsumptionOfWordsById(consumptionId);
        mmap.put("cHighConsumptionOfWords", cHighConsumptionOfWords);
        return prefix + "/edit";
    }

    /**
     * 修改保存单次高额消费统计
     */
    @ApiOperation("修改保存单次高额消费统计")
    @RequiresPermissions("census:c_high_consumption_of_words:edit")
    @Log(title = "单次高额消费统计", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CHighConsumptionOfWords cHighConsumptionOfWords)
    {
        return toAjax(cHighConsumptionOfWordsService.updateCHighConsumptionOfWords(cHighConsumptionOfWords));
    }

    /**
     * 删除单次高额消费统计
     */
    @ApiOperation("删除单次高额消费统计")
    @RequiresPermissions("census:c_high_consumption_of_words:remove")
    @Log(title = "单次高额消费统计", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cHighConsumptionOfWordsService.deleteCHighConsumptionOfWordsByIds(ids));
    }
}
