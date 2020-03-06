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
import com.ruoyi.census.domain.COilStationRevenue;
import com.ruoyi.census.service.ICOilStationRevenueService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 油站收入Controller
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Controller
@RequestMapping("/census/c_oil_station_revenue")
public class COilStationRevenueController extends BaseController
{
    private String prefix = "census/c_oil_station_revenue";

    @Autowired
    private ICOilStationRevenueService cOilStationRevenueService;

    @RequiresPermissions("census:c_oil_station_revenue:view")
    @GetMapping()
    public String c_oil_station_revenue()
    {
        return prefix + "/c_oil_station_revenue";
    }

    /**
     * 查询油站收入列表
     */
    @RequiresPermissions("census:c_oil_station_revenue:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(COilStationRevenue cOilStationRevenue)
    {
        startPage();
        List<COilStationRevenue> list = cOilStationRevenueService.selectCOilStationRevenueList(cOilStationRevenue);
        return getDataTable(list);
    }

    /**
     * 导出油站收入列表
     */
    @RequiresPermissions("census:c_oil_station_revenue:export")
    @Log(title = "油站收入", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(COilStationRevenue cOilStationRevenue)
    {
        List<COilStationRevenue> list = cOilStationRevenueService.selectCOilStationRevenueList(cOilStationRevenue);
        ExcelUtil<COilStationRevenue> util = new ExcelUtil<COilStationRevenue>(COilStationRevenue.class);
        return util.exportExcel(list, "c_oil_station_revenue");
    }

    /**
     * 新增油站收入
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存油站收入
     */
    @RequiresPermissions("census:c_oil_station_revenue:add")
    @Log(title = "油站收入", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(COilStationRevenue cOilStationRevenue)
    {
        return toAjax(cOilStationRevenueService.insertCOilStationRevenue(cOilStationRevenue));
    }

    /**
     * 修改油站收入
     */
    @GetMapping("/edit/{revenueId}")
    public String edit(@PathVariable("revenueId") Long revenueId, ModelMap mmap)
    {
        COilStationRevenue cOilStationRevenue = cOilStationRevenueService.selectCOilStationRevenueById(revenueId);
        mmap.put("cOilStationRevenue", cOilStationRevenue);
        return prefix + "/edit";
    }

    /**
     * 修改保存油站收入
     */
    @RequiresPermissions("census:c_oil_station_revenue:edit")
    @Log(title = "油站收入", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(COilStationRevenue cOilStationRevenue)
    {
        return toAjax(cOilStationRevenueService.updateCOilStationRevenue(cOilStationRevenue));
    }

    /**
     * 删除油站收入
     */
    @RequiresPermissions("census:c_oil_station_revenue:remove")
    @Log(title = "油站收入", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cOilStationRevenueService.deleteCOilStationRevenueByIds(ids));
    }
}
