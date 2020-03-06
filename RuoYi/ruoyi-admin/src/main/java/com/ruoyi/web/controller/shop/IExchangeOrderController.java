package com.ruoyi.web.controller.shop;

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
import com.ruoyi.shop.domain.IExchangeOrder;
import com.ruoyi.shop.service.IIExchangeOrderService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 兑换订单Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Controller
@RequestMapping("/shop/i_exchange_order")
public class IExchangeOrderController extends BaseController
{
    private String prefix = "shop/i_exchange_order";

    @Autowired
    private IIExchangeOrderService iExchangeOrderService;

    @RequiresPermissions("shop:i_exchange_order:view")
    @GetMapping()
    public String i_exchange_order()
    {
        return prefix + "/i_exchange_order";
    }

    /**
     * 查询兑换订单列表
     */
    @RequiresPermissions("shop:i_exchange_order:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(IExchangeOrder iExchangeOrder)
    {
        startPage();
        List<IExchangeOrder> list = iExchangeOrderService.selectIExchangeOrderList(iExchangeOrder);
        return getDataTable(list);
    }

    /**
     * 导出兑换订单列表
     */
    @RequiresPermissions("shop:i_exchange_order:export")
    @Log(title = "兑换订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(IExchangeOrder iExchangeOrder)
    {
        List<IExchangeOrder> list = iExchangeOrderService.selectIExchangeOrderList(iExchangeOrder);
        ExcelUtil<IExchangeOrder> util = new ExcelUtil<IExchangeOrder>(IExchangeOrder.class);
        return util.exportExcel(list, "i_exchange_order");
    }

    /**
     * 新增兑换订单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存兑换订单
     */
    @RequiresPermissions("shop:i_exchange_order:add")
    @Log(title = "兑换订单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(IExchangeOrder iExchangeOrder)
    {
        return toAjax(iExchangeOrderService.insertIExchangeOrder(iExchangeOrder));
    }

    /**
     * 修改兑换订单
     */
    @GetMapping("/edit/{exchangeOrderId}")
    public String edit(@PathVariable("exchangeOrderId") Long exchangeOrderId, ModelMap mmap)
    {
        IExchangeOrder iExchangeOrder = iExchangeOrderService.selectIExchangeOrderById(exchangeOrderId);
        mmap.put("iExchangeOrder", iExchangeOrder);
        return prefix + "/edit";
    }

    /**
     * 修改保存兑换订单
     */
    @RequiresPermissions("shop:i_exchange_order:edit")
    @Log(title = "兑换订单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(IExchangeOrder iExchangeOrder)
    {
        return toAjax(iExchangeOrderService.updateIExchangeOrder(iExchangeOrder));
    }

    /**
     * 删除兑换订单
     */
    @RequiresPermissions("shop:i_exchange_order:remove")
    @Log(title = "兑换订单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(iExchangeOrderService.deleteIExchangeOrderByIds(ids));
    }
}
