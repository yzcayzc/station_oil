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
import com.ruoyi.census.domain.CIntegralStatistics;
import com.ruoyi.census.service.ICIntegralStatisticsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 积分统计Controller
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Controller
@RequestMapping("/census/c_integral_statistics")
public class CIntegralStatisticsController extends BaseController
{
    private String prefix = "census/c_integral_statistics";

    @Autowired
    private ICIntegralStatisticsService cIntegralStatisticsService;

    @RequiresPermissions("census:c_integral_statistics:view")
    @GetMapping()
    public String c_integral_statistics()
    {
        return prefix + "/c_integral_statistics";
    }

    /**
     * 查询积分统计列表
     */
    @RequiresPermissions("census:c_integral_statistics:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CIntegralStatistics cIntegralStatistics)
    {
        startPage();
        List<CIntegralStatistics> list = cIntegralStatisticsService.selectCIntegralStatisticsList(cIntegralStatistics);
        return getDataTable(list);
    }

    /**
     * 导出积分统计列表
     */
    @RequiresPermissions("census:c_integral_statistics:export")
    @Log(title = "积分统计", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CIntegralStatistics cIntegralStatistics)
    {
        List<CIntegralStatistics> list = cIntegralStatisticsService.selectCIntegralStatisticsList(cIntegralStatistics);
        ExcelUtil<CIntegralStatistics> util = new ExcelUtil<CIntegralStatistics>(CIntegralStatistics.class);
        return util.exportExcel(list, "c_integral_statistics");
    }

    /**
     * 新增积分统计
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存积分统计
     */
    @RequiresPermissions("census:c_integral_statistics:add")
    @Log(title = "积分统计", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CIntegralStatistics cIntegralStatistics)
    {
        return toAjax(cIntegralStatisticsService.insertCIntegralStatistics(cIntegralStatistics));
    }

    /**
     * 修改积分统计
     */
    @GetMapping("/edit/{integralId}")
    public String edit(@PathVariable("integralId") Long integralId, ModelMap mmap)
    {
        CIntegralStatistics cIntegralStatistics = cIntegralStatisticsService.selectCIntegralStatisticsById(integralId);
        mmap.put("cIntegralStatistics", cIntegralStatistics);
        return prefix + "/edit";
    }

    /**
     * 修改保存积分统计
     */
    @RequiresPermissions("census:c_integral_statistics:edit")
    @Log(title = "积分统计", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CIntegralStatistics cIntegralStatistics)
    {
        return toAjax(cIntegralStatisticsService.updateCIntegralStatistics(cIntegralStatistics));
    }

    /**
     * 删除积分统计
     */
    @RequiresPermissions("census:c_integral_statistics:remove")
    @Log(title = "积分统计", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cIntegralStatisticsService.deleteCIntegralStatisticsByIds(ids));
    }
}
