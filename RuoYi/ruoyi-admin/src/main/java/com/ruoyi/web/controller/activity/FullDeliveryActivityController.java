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
import com.ruoyi.activity.domain.FullDeliveryActivity;
import com.ruoyi.activity.service.IFullDeliveryActivityService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 加油满送活动设置Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Controller
@RequestMapping("/activity/full_delivery_activity")
public class FullDeliveryActivityController extends BaseController
{
    private String prefix = "activity/full_delivery_activity";

    @Autowired
    private IFullDeliveryActivityService fullDeliveryActivityService;

    @RequiresPermissions("activity:full_delivery_activity:view")
    @GetMapping()
    public String full_delivery_activity()
    {
        return prefix + "/full_delivery_activity";
    }

    /**
     * 查询加油满送活动设置列表
     */
    @RequiresPermissions("activity:full_delivery_activity:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(FullDeliveryActivity fullDeliveryActivity)
    {
        startPage();
        List<FullDeliveryActivity> list = fullDeliveryActivityService.selectFullDeliveryActivityList(fullDeliveryActivity);
        return getDataTable(list);
    }

    /**
     * 导出加油满送活动设置列表
     */
    @RequiresPermissions("activity:full_delivery_activity:export")
    @Log(title = "加油满送活动设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FullDeliveryActivity fullDeliveryActivity)
    {
        List<FullDeliveryActivity> list = fullDeliveryActivityService.selectFullDeliveryActivityList(fullDeliveryActivity);
        ExcelUtil<FullDeliveryActivity> util = new ExcelUtil<FullDeliveryActivity>(FullDeliveryActivity.class);
        return util.exportExcel(list, "full_delivery_activity");
    }

    /**
     * 新增加油满送活动设置
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存加油满送活动设置
     */
    @RequiresPermissions("activity:full_delivery_activity:add")
    @Log(title = "加油满送活动设置", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(FullDeliveryActivity fullDeliveryActivity)
    {
        return toAjax(fullDeliveryActivityService.insertFullDeliveryActivity(fullDeliveryActivity));
    }

    /**
     * 修改加油满送活动设置
     */
    @GetMapping("/edit/{activityId}")
    public String edit(@PathVariable("activityId") Long activityId, ModelMap mmap)
    {
        FullDeliveryActivity fullDeliveryActivity = fullDeliveryActivityService.selectFullDeliveryActivityById(activityId);
        mmap.put("fullDeliveryActivity", fullDeliveryActivity);
        return prefix + "/edit";
    }

    /**
     * 修改保存加油满送活动设置
     */
    @RequiresPermissions("activity:full_delivery_activity:edit")
    @Log(title = "加油满送活动设置", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(FullDeliveryActivity fullDeliveryActivity)
    {
        return toAjax(fullDeliveryActivityService.updateFullDeliveryActivity(fullDeliveryActivity));
    }

    /**
     * 删除加油满送活动设置
     */
    @RequiresPermissions("activity:full_delivery_activity:remove")
    @Log(title = "加油满送活动设置", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(fullDeliveryActivityService.deleteFullDeliveryActivityByIds(ids));
    }
}
