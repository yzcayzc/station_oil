package com.ruoyi.web.controller.station;

import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.ruoyi.station.domain.SOldOilprice;
import com.ruoyi.station.service.ISOldOilpriceService;
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
import com.ruoyi.station.domain.SOilPrice;
import com.ruoyi.station.service.ISOilPriceService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 油价信息设置Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Controller
@RequestMapping("/station/s_oil_price")
public class SOilPriceController extends BaseController
{
    private String prefix = "station/s_oil_price";

    @Autowired
    private ISOilPriceService sOilPriceService;



    @RequiresPermissions("station:s_oil_price:view")
    @GetMapping()
    public String s_oil_price()
    {
        return prefix + "/s_oil_price";
    }

    /**
     * 查询油价信息设置列表
     */
    @RequiresPermissions("station:s_oil_price:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SOilPrice sOilPrice)
    {
        startPage();
        List<SOilPrice> list = sOilPriceService.selectSOilPriceList(sOilPrice);
        return getDataTable(list);
    }

    /**
     * 导出油价信息设置列表
     */
    @RequiresPermissions("station:s_oil_price:export")
    @Log(title = "油价信息设置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SOilPrice sOilPrice)
    {
        List<SOilPrice> list = sOilPriceService.selectSOilPriceList(sOilPrice);
        ExcelUtil<SOilPrice> util = new ExcelUtil<SOilPrice>(SOilPrice.class);
        return util.exportExcel(list, "s_oil_price");
    }

    /**
     * 新增油价信息设置
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存油价信息设置
     */
    @RequiresPermissions("station:s_oil_price:add")
    @Log(title = "油价信息设置", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SOilPrice sOilPrice)
    {
        return toAjax(sOilPriceService.insertSOilPrice(sOilPrice));
    }

    /**
     * 修改油价信息设置
     */
    @GetMapping("/edit")
    public String edit()
    {
        return prefix + "/edit";
    }

    /**
     * 修改保存油价信息设置
     */
    @RequiresPermissions("station:s_oil_price:edit")
    @Log(title = "油价信息设置", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(String sOilPrices)
    {
        List<SOilPrice> sOilPrices1 = JSONArray.parseArray(sOilPrices, SOilPrice.class);
        if (sOilPrices1==null){
            return toAjax(0);
        }else {
            for (SOilPrice sOilPrice : sOilPrices1) {
                sOilPriceService.updateSOilPrice(sOilPrice);
            }
            return toAjax(1);
        }
    }



    /**
     * 删除油价信息设置
     */
    @RequiresPermissions("station:s_oil_price:remove")
    @Log(title = "油价信息设置", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sOilPriceService.deleteSOilPriceByIds(ids));
    }
}
