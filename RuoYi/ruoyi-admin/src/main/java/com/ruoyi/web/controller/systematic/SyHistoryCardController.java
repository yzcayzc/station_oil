package com.ruoyi.web.controller.systematic;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.systematic.domain.SyHistoryCard;
import com.ruoyi.systematic.service.ISyHistoryCardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 历史信息Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Api(tags = "历史信息")
@Controller
@RequestMapping("/systematic/sy_history_card")
public class SyHistoryCardController extends BaseController
{
    private String prefix = "systematic/sy_history_card";

    @Autowired
    private ISyHistoryCardService syHistoryCardService;

    @RequiresPermissions("systematic:sy_history_card:view")
    @GetMapping()
    public String sy_history_card()
    {
        return prefix + "/sy_history_card";
    }

    /**
     * 查询历史信息列表
     */
    @ApiOperation("查询历史信息列表")
    @RequiresPermissions("systematic:sy_history_card:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SyHistoryCard syHistoryCard)
    {
        startPage();
        List<SyHistoryCard> list = syHistoryCardService.selectSyHistoryCardList(syHistoryCard);
        return getDataTable(list);
    }

    /**
     * 导出历史信息列表
     */
    @ApiOperation("导出历史信息列表")
    @RequiresPermissions("systematic:sy_history_card:export")
    @Log(title = "历史信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SyHistoryCard syHistoryCard)
    {
        List<SyHistoryCard> list = syHistoryCardService.selectSyHistoryCardList(syHistoryCard);
        ExcelUtil<SyHistoryCard> util = new ExcelUtil<SyHistoryCard>(SyHistoryCard.class);
        return util.exportExcel(list, "sy_history_card");
    }

    /**
     * 新增历史信息
     */
    @ApiOperation("新增历史信息")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存历史信息
     */
    @ApiOperation("新增保存历史信息")
    @RequiresPermissions("systematic:sy_history_card:add")
    @Log(title = "历史信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SyHistoryCard syHistoryCard)
    {
        return toAjax(syHistoryCardService.insertSyHistoryCard(syHistoryCard));
    }

    /**
     * 修改历史信息
     */
    @ApiOperation("修改历史信息")
    @GetMapping("/edit/{card}")
    public String edit(@PathVariable("card") Long card, ModelMap mmap)
    {
        SyHistoryCard syHistoryCard = syHistoryCardService.selectSyHistoryCardById(card);
        mmap.put("syHistoryCard", syHistoryCard);
        return prefix + "/edit";
    }

    /**
     * 修改保存历史信息
     */
    @ApiOperation("修改保存历史信息")
    @RequiresPermissions("systematic:sy_history_card:edit")
    @Log(title = "历史信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SyHistoryCard syHistoryCard)
    {
        return toAjax(syHistoryCardService.updateSyHistoryCard(syHistoryCard));
    }

    /**
     * 删除历史信息
     */
    @ApiOperation("删除历史信息")
    @RequiresPermissions("systematic:sy_history_card:remove")
    @Log(title = "历史信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(syHistoryCardService.deleteSyHistoryCardByIds(ids));
    }
}
