package com.ruoyi.web.controller.staff;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.staff.domain.StTransactionDetails;
import com.ruoyi.staff.service.IStTransactionDetailsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 交易详情Controller
 * 
 * @author ruoyi
 * @date 2020-03-05
 */
@Api("交易详情")
@Controller
@RequestMapping("/staff/st_transaction_details")
public class StTransactionDetailsController extends BaseController
{
    private String prefix = "staff/st_transaction_details";

    @Autowired
    private IStTransactionDetailsService stTransactionDetailsService;

    @RequiresPermissions("staff:st_transaction_details:view")
    @GetMapping()
    public String st_transaction_details()
    {
        return prefix + "/st_transaction_details";
    }

    /**
     * 查询交易详情列表
     */
    @ApiOperation("查询交易详情列表")
    @RequiresPermissions("staff:st_transaction_details:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(StTransactionDetails stTransactionDetails)
    {
        startPage();
        List<StTransactionDetails> list = stTransactionDetailsService.selectStTransactionDetailsList(stTransactionDetails);
        return getDataTable(list);
    }

    /**
     * 导出交易详情列表
     */
    @ApiOperation("导出交易详情列表")
    @RequiresPermissions("staff:st_transaction_details:export")
    @Log(title = "交易详情", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StTransactionDetails stTransactionDetails)
    {
        List<StTransactionDetails> list = stTransactionDetailsService.selectStTransactionDetailsList(stTransactionDetails);
        ExcelUtil<StTransactionDetails> util = new ExcelUtil<StTransactionDetails>(StTransactionDetails.class);
        return util.exportExcel(list, "st_transaction_details");
    }

    /**
     * 新增交易详情
     */
    @ApiOperation("新增交易详情")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存交易详情
     */
    @ApiOperation("新增保存交易详情")
    @RequiresPermissions("staff:st_transaction_details:add")
    @Log(title = "交易详情", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(StTransactionDetails stTransactionDetails)
    {
        return toAjax(stTransactionDetailsService.insertStTransactionDetails(stTransactionDetails));
    }

    /**
     * 修改交易详情
     */
    @ApiOperation("修改交易详情")
    @GetMapping("/edit/{transactionDetailsId}")
    public String edit(@PathVariable("transactionDetailsId") Long transactionDetailsId, ModelMap mmap)
    {
        StTransactionDetails stTransactionDetails = stTransactionDetailsService.selectStTransactionDetailsById(transactionDetailsId);
        mmap.put("stTransactionDetails", stTransactionDetails);
        return prefix + "/edit";
    }

    /**
     * 修改保存交易详情
     */
    @ApiOperation("修改保存交易详情")
    @RequiresPermissions("staff:st_transaction_details:edit")
    @Log(title = "交易详情", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(StTransactionDetails stTransactionDetails)
    {
        return toAjax(stTransactionDetailsService.updateStTransactionDetails(stTransactionDetails));
    }

    /**
     * 删除交易详情
     */
    @ApiOperation("删除交易详情")
    @RequiresPermissions("staff:st_transaction_details:remove")
    @Log(title = "交易详情", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(stTransactionDetailsService.deleteStTransactionDetailsByIds(ids));
    }
}
