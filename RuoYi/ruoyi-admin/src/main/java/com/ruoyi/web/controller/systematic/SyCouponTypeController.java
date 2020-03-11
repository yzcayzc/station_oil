package com.ruoyi.web.controller.systematic;

import java.util.List;

import io.swagger.annotations.Api;
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
import com.ruoyi.systematic.domain.SyCouponType;
import com.ruoyi.systematic.service.ISyCouponTypeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 优惠券类型字段Controller
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
@Api(tags = "优惠券类型字段")
@Controller
@RequestMapping("/systematic/sy_coupon_type")
public class SyCouponTypeController extends BaseController
{
    private String prefix = "systematic/sy_coupon_type";

    @Autowired
    private ISyCouponTypeService syCouponTypeService;

    @RequiresPermissions("systematic:sy_coupon_type:view")
    @GetMapping()
    public String sy_coupon_type()
    {
        return prefix + "/sy_coupon_type";
    }

    /**
     * 查询优惠券类型字段列表
     */
    @ApiOperation("查询优惠券类型字段列表")
    @RequiresPermissions("systematic:sy_coupon_type:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SyCouponType syCouponType)
    {
        startPage();
        List<SyCouponType> list = syCouponTypeService.selectSyCouponTypeList(syCouponType);
        return getDataTable(list);
    }

    /**
     * 导出优惠券类型字段列表
     */
    @ApiOperation("导出优惠券类型字段列表")
    @RequiresPermissions("systematic:sy_coupon_type:export")
    @Log(title = "优惠券类型字段", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SyCouponType syCouponType)
    {
        List<SyCouponType> list = syCouponTypeService.selectSyCouponTypeList(syCouponType);
        ExcelUtil<SyCouponType> util = new ExcelUtil<SyCouponType>(SyCouponType.class);
        return util.exportExcel(list, "sy_coupon_type");
    }

    /**
     * 新增优惠券类型字段
     */
    @ApiOperation("新增优惠券类型字段")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存优惠券类型字段
     */
    @ApiOperation("新增保存优惠券类型字段")
    @RequiresPermissions("systematic:sy_coupon_type:add")
    @Log(title = "优惠券类型字段", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SyCouponType syCouponType)
    {
        return toAjax(syCouponTypeService.insertSyCouponType(syCouponType));
    }

    /**
     * 修改优惠券类型字段
     */
    @ApiOperation("修改优惠券类型字段")
    @GetMapping("/edit/{syCouponTypeId}")
    public String edit(@PathVariable("syCouponTypeId") Long syCouponTypeId, ModelMap mmap)
    {
        SyCouponType syCouponType = syCouponTypeService.selectSyCouponTypeById(syCouponTypeId);
        mmap.put("syCouponType", syCouponType);
        return prefix + "/edit";
    }

    /**
     * 修改保存优惠券类型字段
     */
    @ApiOperation("修改保存优惠券类型字段")
    @RequiresPermissions("systematic:sy_coupon_type:edit")
    @Log(title = "优惠券类型字段", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SyCouponType syCouponType)
    {
        return toAjax(syCouponTypeService.updateSyCouponType(syCouponType));
    }

    /**
     * 删除优惠券类型字段
     */
    @ApiOperation("删除优惠券类型字段")
    @RequiresPermissions("systematic:sy_coupon_type:remove")
    @Log(title = "优惠券类型字段", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(syCouponTypeService.deleteSyCouponTypeByIds(ids));
    }
}
