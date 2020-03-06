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
import com.ruoyi.census.domain.CRechargeInformation;
import com.ruoyi.census.service.ICRechargeInformationService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 充值信息表Controller
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Controller
@RequestMapping("/census/c_recharge_information")
public class CRechargeInformationController extends BaseController
{
    private String prefix = "census/c_recharge_information";

    @Autowired
    private ICRechargeInformationService cRechargeInformationService;

    @RequiresPermissions("census:c_recharge_information:view")
    @GetMapping()
    public String c_recharge_information()
    {
        return prefix + "/c_recharge_information";
    }

    /**
     * 查询充值信息表列表
     */
    @RequiresPermissions("census:c_recharge_information:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CRechargeInformation cRechargeInformation)
    {
        startPage();
        List<CRechargeInformation> list = cRechargeInformationService.selectCRechargeInformationList(cRechargeInformation);
        return getDataTable(list);
    }

    /**
     * 导出充值信息表列表
     */
    @RequiresPermissions("census:c_recharge_information:export")
    @Log(title = "充值信息表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CRechargeInformation cRechargeInformation)
    {
        List<CRechargeInformation> list = cRechargeInformationService.selectCRechargeInformationList(cRechargeInformation);
        ExcelUtil<CRechargeInformation> util = new ExcelUtil<CRechargeInformation>(CRechargeInformation.class);
        return util.exportExcel(list, "c_recharge_information");
    }

    /**
     * 新增充值信息表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存充值信息表
     */
    @RequiresPermissions("census:c_recharge_information:add")
    @Log(title = "充值信息表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CRechargeInformation cRechargeInformation)
    {
        return toAjax(cRechargeInformationService.insertCRechargeInformation(cRechargeInformation));
    }

    /**
     * 修改充值信息表
     */
    @GetMapping("/edit/{rechargeId}")
    public String edit(@PathVariable("rechargeId") Long rechargeId, ModelMap mmap)
    {
        CRechargeInformation cRechargeInformation = cRechargeInformationService.selectCRechargeInformationById(rechargeId);
        mmap.put("cRechargeInformation", cRechargeInformation);
        return prefix + "/edit";
    }

    /**
     * 修改保存充值信息表
     */
    @RequiresPermissions("census:c_recharge_information:edit")
    @Log(title = "充值信息表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CRechargeInformation cRechargeInformation)
    {
        return toAjax(cRechargeInformationService.updateCRechargeInformation(cRechargeInformation));
    }

    /**
     * 删除充值信息表
     */
    @RequiresPermissions("census:c_recharge_information:remove")
    @Log(title = "充值信息表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cRechargeInformationService.deleteCRechargeInformationByIds(ids));
    }
}
