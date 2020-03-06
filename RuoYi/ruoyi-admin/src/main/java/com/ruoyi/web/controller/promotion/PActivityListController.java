package com.ruoyi.web.controller.promotion;

import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.ruoyi.common.json.JSONObject;
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
import com.ruoyi.promotion.domain.PActivityList;
import com.ruoyi.promotion.service.IPActivityListService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 活动列表Controller
 * 
 * @author ruoyi
 * @date 2020-02-28
 */
@Controller
@RequestMapping("/promotion/p_activity_list")
public class PActivityListController extends BaseController
{
    private String prefix = "promotion/p_activity_list";

    @Autowired
    private IPActivityListService pActivityListService;

    @RequiresPermissions("promotion:p_activity_list:view")
    @GetMapping()
    public String p_activity_list()
    {
        return prefix + "/p_activity_list";
    }

    /**
     * 查询活动列表列表
     */
    @RequiresPermissions("promotion:p_activity_list:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PActivityList pActivityList)
    {
        startPage();
        List<PActivityList> list = pActivityListService.selectPActivityListList(pActivityList);
        return getDataTable(list);
    }

    /**
     * 导出活动列表列表
     */
    @RequiresPermissions("promotion:p_activity_list:export")
    @Log(title = "活动列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PActivityList pActivityList)
    {
        List<PActivityList> list = pActivityListService.selectPActivityListList(pActivityList);
        ExcelUtil<PActivityList> util = new ExcelUtil<PActivityList>(PActivityList.class);
        return util.exportExcel(list, "p_activity_list");
    }

    /**
     * 新增活动列表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存活动列表
     */
    @RequiresPermissions("promotion:p_activity_list:add")
    @Log(title = "活动列表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(String pActivityLists)
    {
        if (pActivityLists==null){
            return toAjax(0);
        }
        List<PActivityList> pActivityLists1 = JSONArray.parseArray(pActivityLists, PActivityList.class);
        for (PActivityList pActivityList : pActivityLists1) {
            pActivityListService.insertPActivityList(pActivityList);
        }
        return toAjax(1);
    }

    /**
     * 修改活动列表
     */
    @GetMapping("/edit/{activityDetailsId}")
    public String edit(@PathVariable("activityDetailsId") Long activityDetailsId, ModelMap mmap)
    {
        PActivityList pActivityList = pActivityListService.selectPActivityListById(activityDetailsId);
        mmap.put("pActivityList", pActivityList);
        return prefix + "/edit";
    }

    /**
     * 修改保存活动列表
     */
    @RequiresPermissions("promotion:p_activity_list:edit")
    @Log(title = "活动列表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PActivityList pActivityList)
    {
        return toAjax(pActivityListService.updatePActivityList(pActivityList));
    }

    /**
     * 删除活动列表
     */
    @RequiresPermissions("promotion:p_activity_list:remove")
    @Log(title = "活动列表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(pActivityListService.deletePActivityListByIds(ids));
    }
}
