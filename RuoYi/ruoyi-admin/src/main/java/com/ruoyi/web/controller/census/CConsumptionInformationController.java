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
import com.ruoyi.census.domain.CConsumptionInformation;
import com.ruoyi.census.service.ICConsumptionInformationService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 消费信息表Controller
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Controller
@RequestMapping("/census/c_consumption_information")
public class CConsumptionInformationController extends BaseController
{
    private String prefix = "census/c_consumption_information";

    @Autowired
    private ICConsumptionInformationService cConsumptionInformationService;

    @RequiresPermissions("census:c_consumption_information:view")
    @GetMapping()
    public String c_consumption_information()
    {
        return prefix + "/c_consumption_information";
    }

    /**
     * 查询消费信息表列表
     */
    @RequiresPermissions("census:c_consumption_information:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CConsumptionInformation cConsumptionInformation)
    {
        startPage();
        List<CConsumptionInformation> list = cConsumptionInformationService.selectCConsumptionInformationList(cConsumptionInformation);
        return getDataTable(list);
    }

    /**
     * 导出消费信息表列表
     */
    @RequiresPermissions("census:c_consumption_information:export")
    @Log(title = "消费信息表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CConsumptionInformation cConsumptionInformation)
    {
        List<CConsumptionInformation> list = cConsumptionInformationService.selectCConsumptionInformationList(cConsumptionInformation);
        ExcelUtil<CConsumptionInformation> util = new ExcelUtil<CConsumptionInformation>(CConsumptionInformation.class);
        return util.exportExcel(list, "c_consumption_information");
    }

    /**
     * 新增消费信息表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存消费信息表
     */
    @RequiresPermissions("census:c_consumption_information:add")
    @Log(title = "消费信息表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CConsumptionInformation cConsumptionInformation)
    {
        return toAjax(cConsumptionInformationService.insertCConsumptionInformation(cConsumptionInformation));
    }

    /**
     * 修改消费信息表
     */
    @GetMapping("/edit/{consumption}")
    public String edit(@PathVariable("consumption") Long consumption, ModelMap mmap)
    {
        CConsumptionInformation cConsumptionInformation = cConsumptionInformationService.selectCConsumptionInformationById(consumption);
        mmap.put("cConsumptionInformation", cConsumptionInformation);
        return prefix + "/edit";
    }

    /**
     * 修改保存消费信息表
     */
    @RequiresPermissions("census:c_consumption_information:edit")
    @Log(title = "消费信息表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CConsumptionInformation cConsumptionInformation)
    {
        return toAjax(cConsumptionInformationService.updateCConsumptionInformation(cConsumptionInformation));
    }

    /**
     * 删除消费信息表
     */
    @RequiresPermissions("census:c_consumption_information:remove")
    @Log(title = "消费信息表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cConsumptionInformationService.deleteCConsumptionInformationByIds(ids));
    }
}
