package com.ruoyi.web.controller.member;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.member.domain.MIntegral;
import com.ruoyi.member.service.IMIntegralService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 积分Controller
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
@Api("积分")
@Controller
@RequestMapping("/member/m_integral")
public class MIntegralController extends BaseController
{
    private String prefix = "member/m_integral";

    @Autowired
    private IMIntegralService mIntegralService;

    @RequiresPermissions("member:m_integral:view")
    @GetMapping()
    public String m_integral()
    {
        return prefix + "/m_integral";
    }

    /**
     * 查询积分列表
     */
    @ApiOperation("查询积分列表")
    @RequiresPermissions("member:m_integral:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MIntegral mIntegral)
    {
        startPage();
        List<MIntegral> list = mIntegralService.selectMIntegralList(mIntegral);
        return getDataTable(list);
    }

    /**
     * 导出积分列表
     */
    @ApiOperation("导出积分列表")
    @RequiresPermissions("member:m_integral:export")
    @Log(title = "积分", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MIntegral mIntegral)
    {
        List<MIntegral> list = mIntegralService.selectMIntegralList(mIntegral);
        ExcelUtil<MIntegral> util = new ExcelUtil<MIntegral>(MIntegral.class);
        return util.exportExcel(list, "m_integral");
    }

    /**
     * 新增积分
     */
    @ApiOperation("新增积分")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存积分
     */
    @ApiOperation("新增保存积分")
    @RequiresPermissions("member:m_integral:add")
    @Log(title = "积分", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MIntegral mIntegral)
    {
        return toAjax(mIntegralService.insertMIntegral(mIntegral));
    }

    /**
     * 修改积分
     */
    @ApiOperation("修改积分")
    @GetMapping("/edit/{integral}")
    public String edit(@PathVariable("integral") Long integral, ModelMap mmap)
    {
        MIntegral mIntegral = mIntegralService.selectMIntegralById(integral);
        mmap.put("mIntegral", mIntegral);
        return prefix + "/edit";
    }

    /**
     * 修改保存积分
     */
    @ApiOperation("修改保存积分")
    @RequiresPermissions("member:m_integral:edit")
    @Log(title = "积分", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MIntegral mIntegral)
    {
        return toAjax(mIntegralService.updateMIntegral(mIntegral));
    }

    /**
     * 删除积分
     */
    @ApiOperation("删除积分")
    @RequiresPermissions("member:m_integral:remove")
    @Log(title = "积分", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mIntegralService.deleteMIntegralByIds(ids));
    }
}
