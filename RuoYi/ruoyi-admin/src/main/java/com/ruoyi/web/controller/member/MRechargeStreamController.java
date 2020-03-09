package com.ruoyi.web.controller.member;

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
import com.ruoyi.member.domain.MRechargeStream;
import com.ruoyi.member.service.IMRechargeStreamService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 充值流水Controller
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
@Controller
@RequestMapping("/member/m_recharge_stream")
public class MRechargeStreamController extends BaseController
{
    private String prefix = "member/m_recharge_stream";

    @Autowired
    private IMRechargeStreamService mRechargeStreamService;

    @RequiresPermissions("member:m_recharge_stream:view")
    @GetMapping()
    public String m_recharge_stream()
    {
        return prefix + "/m_recharge_stream";
    }

    /**
     * 查询充值流水列表
     */
    @RequiresPermissions("member:m_recharge_stream:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MRechargeStream mRechargeStream)
    {
        startPage();
        List<MRechargeStream> list = mRechargeStreamService.selectMRechargeStreamList(mRechargeStream);
        return getDataTable(list);
    }

    /**
     * 导出充值流水列表
     */
    @RequiresPermissions("member:m_recharge_stream:export")
    @Log(title = "充值流水", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MRechargeStream mRechargeStream)
    {
        List<MRechargeStream> list = mRechargeStreamService.selectMRechargeStreamList(mRechargeStream);
        ExcelUtil<MRechargeStream> util = new ExcelUtil<MRechargeStream>(MRechargeStream.class);
        return util.exportExcel(list, "m_recharge_stream");
    }

    /**
     * 新增充值流水
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存充值流水
     */
    @RequiresPermissions("member:m_recharge_stream:add")
    @Log(title = "充值流水", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MRechargeStream mRechargeStream)
    {
        return toAjax(mRechargeStreamService.insertMRechargeStream(mRechargeStream));
    }

    /**
     * 修改充值流水
     */
    @GetMapping("/edit/{rechargeStreamId}")
    public String edit(@PathVariable("rechargeStreamId") Long rechargeStreamId, ModelMap mmap)
    {
        MRechargeStream mRechargeStream = mRechargeStreamService.selectMRechargeStreamById(rechargeStreamId);
        mmap.put("mRechargeStream", mRechargeStream);
        return prefix + "/edit";
    }

    /**
     * 修改保存充值流水
     */
    @RequiresPermissions("member:m_recharge_stream:edit")
    @Log(title = "充值流水", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MRechargeStream mRechargeStream)
    {
        return toAjax(mRechargeStreamService.updateMRechargeStream(mRechargeStream));
    }

    /**
     * 删除充值流水
     */
    @RequiresPermissions("member:m_recharge_stream:remove")
    @Log(title = "充值流水", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mRechargeStreamService.deleteMRechargeStreamByIds(ids));
    }
}
