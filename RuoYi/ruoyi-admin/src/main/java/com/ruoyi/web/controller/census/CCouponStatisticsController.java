package com.ruoyi.web.controller.census;

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
import com.ruoyi.census.domain.CCouponStatistics;
import com.ruoyi.census.service.ICCouponStatisticsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 优惠券系统Controller
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Controller
@RequestMapping("/census/c_coupon_statistics")
public class CCouponStatisticsController extends BaseController
{
    private String prefix = "census/c_coupon_statistics";

    @Autowired
    private ICCouponStatisticsService cCouponStatisticsService;

    @RequiresPermissions("census:c_coupon_statistics:view")
    @GetMapping()
    public String c_coupon_statistics()
    {
        return prefix + "/c_coupon_statistics";
    }

    /**
     * 查询优惠券系统列表
     */
    @RequiresPermissions("census:c_coupon_statistics:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CCouponStatistics cCouponStatistics)
    {
        startPage();
        List<CCouponStatistics> list = cCouponStatisticsService.selectCCouponStatisticsList(cCouponStatistics);
        return getDataTable(list);
    }

    /**
     * 导出优惠券系统列表
     */
    @RequiresPermissions("census:c_coupon_statistics:export")
    @Log(title = "优惠券系统", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CCouponStatistics cCouponStatistics)
    {
        List<CCouponStatistics> list = cCouponStatisticsService.selectCCouponStatisticsList(cCouponStatistics);
        ExcelUtil<CCouponStatistics> util = new ExcelUtil<CCouponStatistics>(CCouponStatistics.class);
        return util.exportExcel(list, "c_coupon_statistics");
    }

    /**
     * 新增优惠券系统
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存优惠券系统
     */
    @RequiresPermissions("census:c_coupon_statistics:add")
    @Log(title = "优惠券系统", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CCouponStatistics cCouponStatistics)
    {
        return toAjax(cCouponStatisticsService.insertCCouponStatistics(cCouponStatistics));
    }

    /**
     * 修改优惠券系统
     */
    @GetMapping("/edit/{couponStatisticsId}")
    public String edit(@PathVariable("couponStatisticsId") Long couponStatisticsId, ModelMap mmap)
    {
        CCouponStatistics cCouponStatistics = cCouponStatisticsService.selectCCouponStatisticsById(couponStatisticsId);
        mmap.put("cCouponStatistics", cCouponStatistics);
        return prefix + "/edit";
    }

    /**
     * 修改保存优惠券系统
     */
    @RequiresPermissions("census:c_coupon_statistics:edit")
    @Log(title = "优惠券系统", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CCouponStatistics cCouponStatistics)
    {
        return toAjax(cCouponStatisticsService.updateCCouponStatistics(cCouponStatistics));
    }

    /**
     * 删除优惠券系统
     */
    @RequiresPermissions("census:c_coupon_statistics:remove")
    @Log(title = "优惠券系统", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cCouponStatisticsService.deleteCCouponStatisticsByIds(ids));
    }
}
