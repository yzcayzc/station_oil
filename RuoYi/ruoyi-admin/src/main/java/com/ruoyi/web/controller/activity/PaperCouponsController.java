package com.ruoyi.web.controller.activity;

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
import com.ruoyi.activity.domain.PaperCoupons;
import com.ruoyi.activity.service.IPaperCouponsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 纸质优惠券设置Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Controller
@RequestMapping("/activity/paper_coupons")
public class PaperCouponsController extends BaseController
{
    private String prefix = "activity/paper_coupons";

    @Autowired
    private IPaperCouponsService paperCouponsService;

    @RequiresPermissions("activity:paper_coupons:view")
    @GetMapping()
    public String paper_coupons()
    {
        return prefix + "/paper_coupons";
    }

    /**
     * 查询纸质优惠券设置列表
     */
    @RequiresPermissions("activity:paper_coupons:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PaperCoupons paperCoupons)
    {
        startPage();
        List<PaperCoupons> list = paperCouponsService.selectPaperCouponsList(paperCoupons);
        return getDataTable(list);
    }

    /**
     * 导出纸质优惠券设置列表
     */
    @RequiresPermissions("activity:paper_coupons:export")
    @Log(title = "纸质优惠券设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PaperCoupons paperCoupons)
    {
        List<PaperCoupons> list = paperCouponsService.selectPaperCouponsList(paperCoupons);
        ExcelUtil<PaperCoupons> util = new ExcelUtil<PaperCoupons>(PaperCoupons.class);
        return util.exportExcel(list, "paper_coupons");
    }

    /**
     * 新增纸质优惠券设置
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存纸质优惠券设置
     */
    @RequiresPermissions("activity:paper_coupons:add")
    @Log(title = "纸质优惠券设置", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PaperCoupons paperCoupons)
    {
        return toAjax(paperCouponsService.insertPaperCoupons(paperCoupons));
    }

    /**
     * 修改纸质优惠券设置
     */
    @GetMapping("/edit/{couponsId}")
    public String edit(@PathVariable("couponsId") Long couponsId, ModelMap mmap)
    {
        PaperCoupons paperCoupons = paperCouponsService.selectPaperCouponsById(couponsId);
        mmap.put("paperCoupons", paperCoupons);
        return prefix + "/edit";
    }

    /**
     * 修改保存纸质优惠券设置
     */
    @RequiresPermissions("activity:paper_coupons:edit")
    @Log(title = "纸质优惠券设置", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PaperCoupons paperCoupons)
    {
        return toAjax(paperCouponsService.updatePaperCoupons(paperCoupons));
    }

    /**
     * 删除纸质优惠券设置
     */
    @RequiresPermissions("activity:paper_coupons:remove")
    @Log(title = "纸质优惠券设置", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(paperCouponsService.deletePaperCouponsByIds(ids));
    }
}
