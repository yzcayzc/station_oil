package com.ruoyi.web.controller.staff;

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
import com.ruoyi.staff.domain.StClassKnot;
import com.ruoyi.staff.service.IStClassKnotService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 班结Controller
 * 
 * @author ruoyi
 * @date 2020-03-05
 */
@Controller
@RequestMapping("/staff/st_class_knot")
public class StClassKnotController extends BaseController
{
    private String prefix = "staff/st_class_knot";

    @Autowired
    private IStClassKnotService stClassKnotService;

    @RequiresPermissions("staff:st_class_knot:view")
    @GetMapping()
    public String st_class_knot()
    {
        return prefix + "/st_class_knot";
    }

    /**
     * 查询班结列表
     */
    @RequiresPermissions("staff:st_class_knot:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(StClassKnot stClassKnot)
    {
        startPage();
        List<StClassKnot> list = stClassKnotService.selectStClassKnotList(stClassKnot);
        return getDataTable(list);
    }

    /**
     * 导出班结列表
     */
    @RequiresPermissions("staff:st_class_knot:export")
    @Log(title = "班结", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StClassKnot stClassKnot)
    {
        List<StClassKnot> list = stClassKnotService.selectStClassKnotList(stClassKnot);
        ExcelUtil<StClassKnot> util = new ExcelUtil<StClassKnot>(StClassKnot.class);
        return util.exportExcel(list, "st_class_knot");
    }

    /**
     * 新增班结
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存班结
     */
    @RequiresPermissions("staff:st_class_knot:add")
    @Log(title = "班结", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(StClassKnot stClassKnot)
    {
        return toAjax(stClassKnotService.insertStClassKnot(stClassKnot));
    }

    /**
     * 修改班结
     */
    @GetMapping("/edit/{classKnotId}")
    public String edit(@PathVariable("classKnotId") Long classKnotId, ModelMap mmap)
    {
        StClassKnot stClassKnot = stClassKnotService.selectStClassKnotById(classKnotId);
        mmap.put("stClassKnot", stClassKnot);
        return prefix + "/edit";
    }

    /**
     * 修改保存班结
     */
    @RequiresPermissions("staff:st_class_knot:edit")
    @Log(title = "班结", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(StClassKnot stClassKnot)
    {
        return toAjax(stClassKnotService.updateStClassKnot(stClassKnot));
    }

    /**
     * 删除班结
     */
    @RequiresPermissions("staff:st_class_knot:remove")
    @Log(title = "班结", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(stClassKnotService.deleteStClassKnotByIds(ids));
    }
}
