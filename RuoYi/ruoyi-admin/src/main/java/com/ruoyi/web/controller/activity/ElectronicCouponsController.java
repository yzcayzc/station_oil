package com.ruoyi.web.controller.activity;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
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
import com.ruoyi.activity.domain.ElectronicCoupons;
import com.ruoyi.activity.service.IElectronicCouponsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 电子优惠券设置Controller
 *
 * @author ruoyi
 * @date 2020-02-27
 */
@Api(tags = "电子优惠券设置")
@Controller
@RequestMapping("/activity/electronic_coupons")
public class ElectronicCouponsController extends BaseController
{
    private String prefix = "activity/electronic_coupons";

    @Autowired
    private IElectronicCouponsService electronicCouponsService;

    @RequiresPermissions("activity:electronic_coupons:view")
    @GetMapping()
    public String electronic_coupons()
    {
        return prefix + "/electronic_coupons";
    }

    /**
     * 查询电子优惠券设置列表
     */
    @ApiOperation("查询电子优惠券设置列表")
    @RequiresPermissions("activity:electronic_coupons:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ElectronicCoupons electronicCoupons)
    {
        startPage();
        List<ElectronicCoupons> list = electronicCouponsService.selectElectronicCouponsList(electronicCoupons);
        return getDataTable(list);
    }

    /**
     * 导出电子优惠券设置列表
     */
    @ApiOperation("导出电子优惠券设置列表")
    @RequiresPermissions("activity:electronic_coupons:export")
    @Log(title = "电子优惠券设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ElectronicCoupons electronicCoupons)
    {
        List<ElectronicCoupons> list = electronicCouponsService.selectElectronicCouponsList(electronicCoupons);
        ExcelUtil<ElectronicCoupons> util = new ExcelUtil<ElectronicCoupons>(ElectronicCoupons.class);
        return util.exportExcel(list, "electronic_coupons");
    }

    /**
     * 新增电子优惠券设置
     */
    @ApiOperation("新增电子优惠券设置")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存电子优惠券设置
     */
    @ApiOperation("新增保存电子优惠券设置")
    @RequiresPermissions("activity:electronic_coupons:add")
    @Log(title = "电子优惠券设置", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ElectronicCoupons electronicCoupons)
    {
        return toAjax(electronicCouponsService.insertElectronicCoupons(electronicCoupons));
    }

    /**
     * 修改电子优惠券设置
     */
    @ApiOperation("修改电子优惠券设置")
    @GetMapping("/edit/{couponsId}")
    public String edit(@PathVariable("couponsId") Long couponsId, ModelMap mmap)
    {
        ElectronicCoupons electronicCoupons = electronicCouponsService.selectElectronicCouponsById(couponsId);
        mmap.put("electronicCoupons", electronicCoupons);
        return prefix + "/edit";
    }

    /**
     * 修改保存电子优惠券设置
     */
    @ApiOperation("修改保存电子优惠券设置")
    @RequiresPermissions("activity:electronic_coupons:edit")
    @Log(title = "电子优惠券设置", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ElectronicCoupons electronicCoupons)
    {
        return toAjax(electronicCouponsService.updateElectronicCoupons(electronicCoupons));
    }

    /**
     * 删除电子优惠券设置
     */
    @ApiOperation("删除电子优惠券设置")
    @RequiresPermissions("activity:electronic_coupons:remove")
    @Log(title = "电子优惠券设置", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(electronicCouponsService.deleteElectronicCouponsByIds(ids));
    }
}
