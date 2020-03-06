package com.ruoyi.web.controller.recharge;

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
import com.ruoyi.recharge.domain.RRechargeList;
import com.ruoyi.recharge.service.IRRechargeListService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 充值列表Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Controller
@RequestMapping("/recharge/r_recharge_list")
public class RRechargeListController extends BaseController
{
    private String prefix = "recharge/r_recharge_list";

    @Autowired
    private IRRechargeListService rRechargeListService;

    @RequiresPermissions("recharge:r_recharge_list:view")
    @GetMapping()
    public String r_recharge_list()
    {
        return prefix + "/r_recharge_list";
    }

    /**
     * 查询充值列表列表
     */
    @RequiresPermissions("recharge:r_recharge_list:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RRechargeList rRechargeList)
    {
        startPage();
        List<RRechargeList> list = rRechargeListService.selectRRechargeListList(rRechargeList);
        return getDataTable(list);
    }

    /**
     * 导出充值列表列表
     */
    @RequiresPermissions("recharge:r_recharge_list:export")
    @Log(title = "充值列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RRechargeList rRechargeList)
    {
        List<RRechargeList> list = rRechargeListService.selectRRechargeListList(rRechargeList);
        ExcelUtil<RRechargeList> util = new ExcelUtil<RRechargeList>(RRechargeList.class);
        return util.exportExcel(list, "r_recharge_list");
    }

    /**
     * 新增充值列表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存充值列表
     */
    @RequiresPermissions("recharge:r_recharge_list:add")
    @Log(title = "充值列表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RRechargeList rRechargeList)
    {
        return toAjax(rRechargeListService.insertRRechargeList(rRechargeList));
    }

    /**
     * 修改充值列表
     */
    @GetMapping("/edit/{rechargeId}")
    public String edit(@PathVariable("rechargeId") Long rechargeId, ModelMap mmap)
    {
        RRechargeList rRechargeList = rRechargeListService.selectRRechargeListById(rechargeId);
        mmap.put("rRechargeList", rRechargeList);
        return prefix + "/edit";
    }

    /**
     * 修改保存充值列表
     */
    @RequiresPermissions("recharge:r_recharge_list:edit")
    @Log(title = "充值列表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RRechargeList rRechargeList)
    {
        return toAjax(rRechargeListService.updateRRechargeList(rRechargeList));
    }

    /**
     * 删除充值列表
     */
    @RequiresPermissions("recharge:r_recharge_list:remove")
    @Log(title = "充值列表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(rRechargeListService.deleteRRechargeListByIds(ids));
    }
}
