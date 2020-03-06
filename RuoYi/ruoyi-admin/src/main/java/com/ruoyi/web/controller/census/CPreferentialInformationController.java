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
import com.ruoyi.census.domain.CPreferentialInformation;
import com.ruoyi.census.service.ICPreferentialInformationService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 优惠信息表Controller
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Controller
@RequestMapping("/census/c_preferential_information")
public class CPreferentialInformationController extends BaseController
{
    private String prefix = "census/c_preferential_information";

    @Autowired
    private ICPreferentialInformationService cPreferentialInformationService;

    @RequiresPermissions("census:c_preferential_information:view")
    @GetMapping()
    public String c_preferential_information()
    {
        return prefix + "/c_preferential_information";
    }

    /**
     * 查询优惠信息表列表
     */
    @RequiresPermissions("census:c_preferential_information:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CPreferentialInformation cPreferentialInformation)
    {
        startPage();
        List<CPreferentialInformation> list = cPreferentialInformationService.selectCPreferentialInformationList(cPreferentialInformation);
        return getDataTable(list);
    }

    /**
     * 导出优惠信息表列表
     */
    @RequiresPermissions("census:c_preferential_information:export")
    @Log(title = "优惠信息表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CPreferentialInformation cPreferentialInformation)
    {
        List<CPreferentialInformation> list = cPreferentialInformationService.selectCPreferentialInformationList(cPreferentialInformation);
        ExcelUtil<CPreferentialInformation> util = new ExcelUtil<CPreferentialInformation>(CPreferentialInformation.class);
        return util.exportExcel(list, "c_preferential_information");
    }

    /**
     * 新增优惠信息表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存优惠信息表
     */
    @RequiresPermissions("census:c_preferential_information:add")
    @Log(title = "优惠信息表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CPreferentialInformation cPreferentialInformation)
    {
        return toAjax(cPreferentialInformationService.insertCPreferentialInformation(cPreferentialInformation));
    }

    /**
     * 修改优惠信息表
     */
    @GetMapping("/edit/{preferentialId}")
    public String edit(@PathVariable("preferentialId") Long preferentialId, ModelMap mmap)
    {
        CPreferentialInformation cPreferentialInformation = cPreferentialInformationService.selectCPreferentialInformationById(preferentialId);
        mmap.put("cPreferentialInformation", cPreferentialInformation);
        return prefix + "/edit";
    }

    /**
     * 修改保存优惠信息表
     */
    @RequiresPermissions("census:c_preferential_information:edit")
    @Log(title = "优惠信息表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CPreferentialInformation cPreferentialInformation)
    {
        return toAjax(cPreferentialInformationService.updateCPreferentialInformation(cPreferentialInformation));
    }

    /**
     * 删除优惠信息表
     */
    @RequiresPermissions("census:c_preferential_information:remove")
    @Log(title = "优惠信息表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cPreferentialInformationService.deleteCPreferentialInformationByIds(ids));
    }
}
