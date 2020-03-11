package com.ruoyi.web.controller.systematic;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.systematic.domain.SyVoucherCenter;
import com.ruoyi.systematic.service.ISyVoucherCenterService;
import io.swagger.annotations.Api;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 充值中心Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Api(tags = "充值中心")
@Controller
@RequestMapping("/systematic/sy_voucher_center")
public class SyVoucherCenterController extends BaseController
{
    private String prefix = "systematic/sy_voucher_center";

    @Autowired
    private ISyVoucherCenterService syVoucherCenterService;

    @RequiresPermissions("systematic:sy_voucher_center:view")
    @GetMapping()
    public String sy_voucher_center()
    {
        return prefix + "/sy_voucher_center";
    }

    /**
     * 查询充值中心列表
     */
    @RequiresPermissions("systematic:sy_voucher_center:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SyVoucherCenter syVoucherCenter)
    {
        startPage();
        List<SyVoucherCenter> list = syVoucherCenterService.selectSyVoucherCenterList(syVoucherCenter);
        return getDataTable(list);
    }

    /**
     * 导出充值中心列表
     */
    @RequiresPermissions("systematic:sy_voucher_center:export")
    @Log(title = "充值中心", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SyVoucherCenter syVoucherCenter)
    {
        List<SyVoucherCenter> list = syVoucherCenterService.selectSyVoucherCenterList(syVoucherCenter);
        ExcelUtil<SyVoucherCenter> util = new ExcelUtil<SyVoucherCenter>(SyVoucherCenter.class);
        return util.exportExcel(list, "sy_voucher_center");
    }

    /**
     * 新增充值中心
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存充值中心
     */
    @RequiresPermissions("systematic:sy_voucher_center:add")
    @Log(title = "充值中心", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SyVoucherCenter syVoucherCenter)
    {
        return toAjax(syVoucherCenterService.insertSyVoucherCenter(syVoucherCenter));
    }

    /**
     * 修改充值中心
     */
    @GetMapping("/edit/{voucherId}")
    public String edit(@PathVariable("voucherId") Long voucherId, ModelMap mmap)
    {
        SyVoucherCenter syVoucherCenter = syVoucherCenterService.selectSyVoucherCenterById(voucherId);
        mmap.put("syVoucherCenter", syVoucherCenter);
        return prefix + "/edit";
    }

    /**
     * 修改保存充值中心
     */
    @RequiresPermissions("systematic:sy_voucher_center:edit")
    @Log(title = "充值中心", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SyVoucherCenter syVoucherCenter)
    {
        return toAjax(syVoucherCenterService.updateSyVoucherCenter(syVoucherCenter));
    }

    /**
     * 删除充值中心
     */
    @RequiresPermissions("systematic:sy_voucher_center:remove")
    @Log(title = "充值中心", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(syVoucherCenterService.deleteSyVoucherCenterByIds(ids));
    }
}
