package com.ruoyi.web.controller.activity;

import com.ruoyi.activity.domain.RechargeActivity;
import com.ruoyi.activity.service.IRechargeActivityService;
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
 * 充值活动设置Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Api(tags = "充值活动设置")
@Controller
@RequestMapping("/activity/recharge_activity")
public class RechargeActivityController extends BaseController
{
    private String prefix = "activity/recharge_activity";

    @Autowired
    private IRechargeActivityService rechargeActivityService;

    @RequiresPermissions("activity:recharge_activity:view")
    @GetMapping()
    public String recharge_activity()
    {
        return prefix + "/recharge_activity";
    }

    /**
     * 查询充值活动设置列表
     */
    @ApiOperation("查询充值活动设置列表")
    @RequiresPermissions("activity:recharge_activity:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RechargeActivity rechargeActivity)
    {
        startPage();
        List<RechargeActivity> list = rechargeActivityService.selectRechargeActivityList(rechargeActivity);
        return getDataTable(list);
    }

    /**
     * 导出充值活动设置列表
     */
    @ApiOperation("导出充值活动设置列表")
    @RequiresPermissions("activity:recharge_activity:export")
    @Log(title = "充值活动设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RechargeActivity rechargeActivity)
    {
        List<RechargeActivity> list = rechargeActivityService.selectRechargeActivityList(rechargeActivity);
        ExcelUtil<RechargeActivity> util = new ExcelUtil<RechargeActivity>(RechargeActivity.class);
        return util.exportExcel(list, "recharge_activity");
    }

    /**
     * 新增充值活动设置
     */
    @ApiOperation("新增充值活动设置")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存充值活动设置
     */
    @ApiOperation("新增保存充值活动设置")
    @RequiresPermissions("activity:recharge_activity:add")
    @Log(title = "充值活动设置", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RechargeActivity rechargeActivity)
    {
        return toAjax(rechargeActivityService.insertRechargeActivity(rechargeActivity));
    }

    /**
     * 修改充值活动设置
     */
    @ApiOperation("修改充值活动设置")
    @GetMapping("/edit/{activityId}")
    public String edit(@PathVariable("activityId") Long activityId, ModelMap mmap)
    {
        RechargeActivity rechargeActivity = rechargeActivityService.selectRechargeActivityById(activityId);
        mmap.put("rechargeActivity", rechargeActivity);
        return prefix + "/edit";
    }

    /**
     * 修改保存充值活动设置
     */
    @ApiOperation("修改保存充值活动设置")
    @RequiresPermissions("activity:recharge_activity:edit")
    @Log(title = "充值活动设置", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RechargeActivity rechargeActivity)
    {
        return toAjax(rechargeActivityService.updateRechargeActivity(rechargeActivity));
    }

    /**
     * 删除充值活动设置
     */
    @ApiOperation("删除充值活动设置")
    @RequiresPermissions("activity:recharge_activity:remove")
    @Log(title = "充值活动设置", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(rechargeActivityService.deleteRechargeActivityByIds(ids));
    }
}
