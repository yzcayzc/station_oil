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
import com.ruoyi.census.domain.CEmployeeFeeReport;
import com.ruoyi.census.service.ICEmployeeFeeReportService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 员工收费报表Controller
 * 
 * @author ruoyi
 * @date 2020-02-28
 */
@Controller
@RequestMapping("/census/c_employee_fee_report")
public class CEmployeeFeeReportController extends BaseController
{
    private String prefix = "census/c_employee_fee_report";

    @Autowired
    private ICEmployeeFeeReportService cEmployeeFeeReportService;

    @RequiresPermissions("census:c_employee_fee_report:view")
    @GetMapping()
    public String c_employee_fee_report()
    {
        return prefix + "/c_employee_fee_report";
    }

    /**
     * 查询员工收费报表列表
     */
    @RequiresPermissions("census:c_employee_fee_report:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CEmployeeFeeReport cEmployeeFeeReport)
    {
        startPage();
        List<CEmployeeFeeReport> list = cEmployeeFeeReportService.selectCEmployeeFeeReportList(cEmployeeFeeReport);
        return getDataTable(list);
    }

    /**
     * 导出员工收费报表列表
     */
    @RequiresPermissions("census:c_employee_fee_report:export")
    @Log(title = "员工收费报表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CEmployeeFeeReport cEmployeeFeeReport)
    {
        List<CEmployeeFeeReport> list = cEmployeeFeeReportService.selectCEmployeeFeeReportList(cEmployeeFeeReport);
        ExcelUtil<CEmployeeFeeReport> util = new ExcelUtil<CEmployeeFeeReport>(CEmployeeFeeReport.class);
        return util.exportExcel(list, "c_employee_fee_report");
    }

    /**
     * 新增员工收费报表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存员工收费报表
     */
    @RequiresPermissions("census:c_employee_fee_report:add")
    @Log(title = "员工收费报表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CEmployeeFeeReport cEmployeeFeeReport)
    {
        return toAjax(cEmployeeFeeReportService.insertCEmployeeFeeReport(cEmployeeFeeReport));
    }

    /**
     * 修改员工收费报表
     */
    @GetMapping("/edit/{feeId}")
    public String edit(@PathVariable("feeId") Long feeId, ModelMap mmap)
    {
        CEmployeeFeeReport cEmployeeFeeReport = cEmployeeFeeReportService.selectCEmployeeFeeReportById(feeId);
        mmap.put("cEmployeeFeeReport", cEmployeeFeeReport);
        return prefix + "/edit";
    }

    /**
     * 修改保存员工收费报表
     */
    @RequiresPermissions("census:c_employee_fee_report:edit")
    @Log(title = "员工收费报表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CEmployeeFeeReport cEmployeeFeeReport)
    {
        return toAjax(cEmployeeFeeReportService.updateCEmployeeFeeReport(cEmployeeFeeReport));
    }

    /**
     * 删除员工收费报表
     */
    @RequiresPermissions("census:c_employee_fee_report:remove")
    @Log(title = "员工收费报表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cEmployeeFeeReportService.deleteCEmployeeFeeReportByIds(ids));
    }
}
