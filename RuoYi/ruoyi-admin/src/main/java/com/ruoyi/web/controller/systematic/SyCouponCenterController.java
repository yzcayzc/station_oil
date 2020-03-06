package com.ruoyi.web.controller.systematic;

import java.util.List;
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
import com.ruoyi.systematic.domain.SyCouponCenter;
import com.ruoyi.systematic.service.ISyCouponCenterService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 优惠券中心Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Controller
@RequestMapping("/systematic/sy_coupon_center")
public class SyCouponCenterController extends BaseController
{
    private String prefix = "systematic/sy_coupon_center";

    @Autowired
    private ISyCouponCenterService syCouponCenterService;

    @RequiresPermissions("systematic:sy_coupon_center:view")
    @GetMapping()
    public String sy_coupon_center()
    {
        return prefix + "/sy_coupon_center";
    }

    /**
     * 查询优惠券中心列表
     */
    @RequiresPermissions("systematic:sy_coupon_center:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SyCouponCenter syCouponCenter)
    {
        startPage();
        List<SyCouponCenter> list = syCouponCenterService.selectSyCouponCenterList(syCouponCenter);
        return getDataTable(list);
    }

    /**
     * 导出优惠券中心列表
     */
    @RequiresPermissions("systematic:sy_coupon_center:export")
    @Log(title = "优惠券中心", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SyCouponCenter syCouponCenter)
    {
        List<SyCouponCenter> list = syCouponCenterService.selectSyCouponCenterList(syCouponCenter);
        ExcelUtil<SyCouponCenter> util = new ExcelUtil<SyCouponCenter>(SyCouponCenter.class);
        return util.exportExcel(list, "sy_coupon_center");
    }

    /**
     * 新增优惠券中心
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存优惠券中心
     */
    @RequiresPermissions("systematic:sy_coupon_center:add")
    @Log(title = "优惠券中心", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SyCouponCenter syCouponCenter)
    {
        return toAjax(syCouponCenterService.insertSyCouponCenter(syCouponCenter));
    }

    /**
     * 修改优惠券中心
     */
    @GetMapping("/edit/{couponId}")
    public String edit(@PathVariable("couponId") Long couponId, ModelMap mmap)
    {
        SyCouponCenter syCouponCenter = syCouponCenterService.selectSyCouponCenterById(couponId);
        mmap.put("syCouponCenter", syCouponCenter);
        return prefix + "/edit";
    }

    /**
     * 修改保存优惠券中心
     */
    @RequiresPermissions("systematic:sy_coupon_center:edit")
    @Log(title = "优惠券中心", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SyCouponCenter syCouponCenter)
    {
        return toAjax(syCouponCenterService.updateSyCouponCenter(syCouponCenter));
    }

    /**
     * 删除优惠券中心
     */
    @RequiresPermissions("systematic:sy_coupon_center:remove")
    @Log(title = "优惠券中心", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(syCouponCenterService.deleteSyCouponCenterByIds(ids));
    }
}
