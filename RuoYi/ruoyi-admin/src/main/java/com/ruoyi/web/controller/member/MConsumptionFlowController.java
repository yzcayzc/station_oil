package com.ruoyi.web.controller.member;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.member.domain.MConsumptionFlow;
import com.ruoyi.member.service.IMConsumptionFlowService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 消费流水Controller
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
@Api(tags = "消费流水")
@Controller
@RequestMapping("/member/m_consumption_flow")
public class MConsumptionFlowController extends BaseController
{
    private String prefix = "member/m_consumption_flow";

    @Autowired
    private IMConsumptionFlowService mConsumptionFlowService;

    @RequiresPermissions("member:m_consumption_flow:view")
    @GetMapping()
    public String m_consumption_flow()
    {
        return prefix + "/m_consumption_flow";
    }

    /**
     * 查询消费流水列表
     */
    @ApiOperation("查询消费流水列表")
    @RequiresPermissions("member:m_consumption_flow:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MConsumptionFlow mConsumptionFlow)
    {
        startPage();
        List<MConsumptionFlow> list = mConsumptionFlowService.selectMConsumptionFlowList(mConsumptionFlow);
        return getDataTable(list);
    }

    /**
     * 导出消费流水列表
     */
    @ApiOperation("出消费流水列表")
    @RequiresPermissions("member:m_consumption_flow:export")
    @Log(title = "消费流水", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MConsumptionFlow mConsumptionFlow)
    {
        List<MConsumptionFlow> list = mConsumptionFlowService.selectMConsumptionFlowList(mConsumptionFlow);
        ExcelUtil<MConsumptionFlow> util = new ExcelUtil<MConsumptionFlow>(MConsumptionFlow.class);
        return util.exportExcel(list, "m_consumption_flow");
    }

    /**
     * 新增消费流水
     */
    @ApiOperation("新增消费流水")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存消费流水
     */
    @ApiOperation("新增保存消费流水")
    @RequiresPermissions("member:m_consumption_flow:add")
    @Log(title = "消费流水", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MConsumptionFlow mConsumptionFlow)
    {
        return toAjax(mConsumptionFlowService.insertMConsumptionFlow(mConsumptionFlow));
    }

    /**
     * 修改消费流水
     */
    @ApiOperation("修改消费流水")
    @GetMapping("/edit/{flowId}")
    public String edit(@PathVariable("flowId") Long flowId, ModelMap mmap)
    {
        MConsumptionFlow mConsumptionFlow = mConsumptionFlowService.selectMConsumptionFlowById(flowId);
        mmap.put("mConsumptionFlow", mConsumptionFlow);
        return prefix + "/edit";
    }

    /**
     * 修改保存消费流水
     */
    @ApiOperation("修改保存消费流水")
    @RequiresPermissions("member:m_consumption_flow:edit")
    @Log(title = "消费流水", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MConsumptionFlow mConsumptionFlow)
    {
        return toAjax(mConsumptionFlowService.updateMConsumptionFlow(mConsumptionFlow));
    }

    /**
     * 删除消费流水
     */
    @ApiOperation("删除消费流水")
    @RequiresPermissions("member:m_consumption_flow:remove")
    @Log(title = "消费流水", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mConsumptionFlowService.deleteMConsumptionFlowByIds(ids));
    }
}
