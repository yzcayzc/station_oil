package com.ruoyi.web.controller.shop;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.shop.domain.IPointsMallManagement;
import com.ruoyi.shop.service.IIPointsMallManagementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 积分商城管理Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Api(tags = "积分商城管理")
@Controller
@RequestMapping("/shop/i_points_mall_management")
public class IPointsMallManagementController extends BaseController
{
    private String prefix = "shop/i_points_mall_management";

    @Autowired
    private IIPointsMallManagementService iPointsMallManagementService;

    @RequiresPermissions("shop:i_points_mall_management:view")
    @GetMapping()
    public String i_points_mall_management()
    {
        return prefix + "/i_points_mall_management";
    }

    /**
     * 查询积分商城管理列表
     */
    @ApiOperation("查询积分商城管理列表")
    @RequiresPermissions("shop:i_points_mall_management:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(IPointsMallManagement iPointsMallManagement)
    {
        startPage();
        List<IPointsMallManagement> list = iPointsMallManagementService.selectIPointsMallManagementList(iPointsMallManagement);
        return getDataTable(list);
    }

    /**
     * 导出积分商城管理列表
     */
    @ApiOperation("导出积分商城管理列表")
    @RequiresPermissions("shop:i_points_mall_management:export")
    @Log(title = "积分商城管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(IPointsMallManagement iPointsMallManagement)
    {
        List<IPointsMallManagement> list = iPointsMallManagementService.selectIPointsMallManagementList(iPointsMallManagement);
        ExcelUtil<IPointsMallManagement> util = new ExcelUtil<IPointsMallManagement>(IPointsMallManagement.class);
        return util.exportExcel(list, "i_points_mall_management");
    }

    /**
     * 新增积分商城管理
     */
    @ApiOperation("新增积分商城管理")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存积分商城管理
     */
    @ApiOperation("新增保存积分商城管理")
    @RequiresPermissions("shop:i_points_mall_management:add")
    @Log(title = "积分商城管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(IPointsMallManagement iPointsMallManagement)
    {
        return toAjax(iPointsMallManagementService.insertIPointsMallManagement(iPointsMallManagement));
    }

    /**
     * 修改积分商城管理
     */
    @ApiOperation("修改积分商城管理")
    @GetMapping("/edit/{goodsId}")
    public String edit(@PathVariable("goodsId") Long goodsId, ModelMap mmap)
    {
        IPointsMallManagement iPointsMallManagement = iPointsMallManagementService.selectIPointsMallManagementById(goodsId);
        mmap.put("iPointsMallManagement", iPointsMallManagement);
        return prefix + "/edit";
    }

    /**
     * 修改保存积分商城管理
     */
    @ApiOperation("修改保存积分商城管理")
    @RequiresPermissions("shop:i_points_mall_management:edit")
    @Log(title = "积分商城管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(IPointsMallManagement iPointsMallManagement)
    {
        return toAjax(iPointsMallManagementService.updateIPointsMallManagement(iPointsMallManagement));
    }

    /**
     * 删除积分商城管理
     */
    @ApiOperation("删除积分商城管理")
    @RequiresPermissions("shop:i_points_mall_management:remove")
    @Log(title = "积分商城管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(iPointsMallManagementService.deleteIPointsMallManagementByIds(ids));
    }
}
