package com.ruoyi.web.controller.station;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.station.domain.SOilGun;
import com.ruoyi.station.service.ISOilGunService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 油枪设置Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Api(tags = "油枪设置")
@Controller
@RequestMapping("/station/s_oil_gun")
public class SOilGunController extends BaseController
{
    private String prefix = "station/s_oil_gun";

    @Autowired
    private ISOilGunService sOilGunService;

    @RequiresPermissions("station:s_oil_gun:view")
    @GetMapping()
    public String s_oil_gun()
    {
        return prefix + "/s_oil_gun";
    }

    /**
     * 查询油枪设置列表
     */
    @ApiOperation("查询油枪设置列表")
    @RequiresPermissions("station:s_oil_gun:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SOilGun sOilGun)
    {
        startPage();
        List<SOilGun> list = sOilGunService.selectSOilGunList(sOilGun);
        return getDataTable(list);
    }

    /**
     * 导出油枪设置列表
     */
    @ApiOperation("导出油枪设置列表")
    @RequiresPermissions("station:s_oil_gun:export")
    @Log(title = "油枪设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SOilGun sOilGun)
    {
        List<SOilGun> list = sOilGunService.selectSOilGunList(sOilGun);
        ExcelUtil<SOilGun> util = new ExcelUtil<SOilGun>(SOilGun.class);
        return util.exportExcel(list, "s_oil_gun");
    }

    /**
     * 新增油枪设置
     */
    @ApiOperation("新增油枪设置")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存油枪设置
     */
    @ApiOperation("新增保存油枪设置")
    @RequiresPermissions("station:s_oil_gun:add")
    @Log(title = "油枪设置", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SOilGun sOilGun)
    {
        return toAjax(sOilGunService.insertSOilGun(sOilGun));
    }

    /**
     * 修改油枪设置
     */
    @ApiOperation("修改油枪设置")
    @GetMapping("/edit/{oilGunId}")
    public String edit(@PathVariable("oilGunId") Long oilGunId, ModelMap mmap)
    {
        SOilGun sOilGun = sOilGunService.selectSOilGunById(oilGunId);
        mmap.put("sOilGun", sOilGun);
        return prefix + "/edit";
    }

    /**
     * 修改保存油枪设置
     */
    @ApiOperation("修改保存油枪设置")
    @RequiresPermissions("station:s_oil_gun:edit")
    @Log(title = "油枪设置", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SOilGun sOilGun)
    {
        return toAjax(sOilGunService.updateSOilGun(sOilGun));
    }

    /**
     * 删除油枪设置
     */
    @ApiOperation("删除油枪设置")
    @RequiresPermissions("station:s_oil_gun:remove")
    @Log(title = "油枪设置", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sOilGunService.deleteSOilGunByIds(ids));
    }
}
