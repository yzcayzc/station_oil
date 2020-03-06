package com.ruoyi.web.controller.station;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.station.domain.GasStation;
import com.ruoyi.station.service.IGasStationService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 油站列表Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Controller
@RequestMapping("/station/gas_station")
public class GasStationController extends BaseController
{
    private String prefix = "station/gas_station";

    @Autowired
    private IGasStationService gasStationService;

    @RequiresPermissions("station:gas_station:view")
    @GetMapping()
    public String gas_station()
    {
        return prefix + "/gas_station";
    }

    /**
     * 查询油站列表列表
     */
    @RequiresPermissions("station:gas_station:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(GasStation gasStation)
    {
        startPage();
        List<GasStation> list = gasStationService.selectGasStationList(gasStation);
        return getDataTable(list);
    }

    /**
     * 导出油站列表列表
     */
    @RequiresPermissions("station:gas_station:export")
    @Log(title = "油站列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(GasStation gasStation)
    {
        List<GasStation> list = gasStationService.selectGasStationList(gasStation);
        ExcelUtil<GasStation> util = new ExcelUtil<GasStation>(GasStation.class);
        return util.exportExcel(list, "gas_station");
    }

    /**
     * 新增油站列表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存油站列表
     */
    @RequiresPermissions("station:gas_station:add")
    @Log(title = "油站列表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(GasStation gasStation)
    {
        return toAjax(gasStationService.insertGasStation(gasStation));

    }

    /**
     * 修改油站列表
     */
    @GetMapping("/edit/{stationId}")
    public String edit(@PathVariable("stationId") Long stationId, ModelMap mmap)
    {
        GasStation gasStation = gasStationService.selectGasStationById(stationId);
        mmap.put("gasStation", gasStation);
        return prefix + "/edit";
    }

    /**
     * 修改保存油站列表
     */
    @RequiresPermissions("station:gas_station:edit")
    @Log(title = "油站列表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(GasStation gasStation)
    {
        return toAjax(gasStationService.updateGasStation(gasStation));
    }

    /**
     * 删除油站列表
     */
    @RequiresPermissions("station:gas_station:remove")
    @Log(title = "油站列表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(gasStationService.deleteGasStationByIds(ids));
    }
}
