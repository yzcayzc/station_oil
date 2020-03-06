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
import com.ruoyi.census.domain.CNewMember;
import com.ruoyi.census.service.ICNewMemberService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 新会员成长率Controller
 * 
 * @author ruoyi
 * @date 2020-03-02
 */
@Controller
@RequestMapping("/census/c_new_member")
public class CNewMemberController extends BaseController
{
    private String prefix = "census/c_new_member";

    @Autowired
    private ICNewMemberService cNewMemberService;

    @RequiresPermissions("census:c_new_member:view")
    @GetMapping()
    public String c_new_member()
    {
        return prefix + "/c_new_member";
    }

    /**
     * 查询新会员成长率列表
     */
    @RequiresPermissions("census:c_new_member:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CNewMember cNewMember)
    {
        startPage();
        List<CNewMember> list = cNewMemberService.selectCNewMemberList(cNewMember);
        return getDataTable(list);
    }

    /**
     * 导出新会员成长率列表
     */
    @RequiresPermissions("census:c_new_member:export")
    @Log(title = "新会员成长率", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CNewMember cNewMember)
    {
        List<CNewMember> list = cNewMemberService.selectCNewMemberList(cNewMember);
        ExcelUtil<CNewMember> util = new ExcelUtil<CNewMember>(CNewMember.class);
        return util.exportExcel(list, "c_new_member");
    }

    /**
     * 新增新会员成长率
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存新会员成长率
     */
    @RequiresPermissions("census:c_new_member:add")
    @Log(title = "新会员成长率", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CNewMember cNewMember)
    {
        return toAjax(cNewMemberService.insertCNewMember(cNewMember));
    }

    /**
     * 修改新会员成长率
     */
    @GetMapping("/edit/{memberId}")
    public String edit(@PathVariable("memberId") Long memberId, ModelMap mmap)
    {
        CNewMember cNewMember = cNewMemberService.selectCNewMemberById(memberId);
        mmap.put("cNewMember", cNewMember);
        return prefix + "/edit";
    }

    /**
     * 修改保存新会员成长率
     */
    @RequiresPermissions("census:c_new_member:edit")
    @Log(title = "新会员成长率", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CNewMember cNewMember)
    {
        return toAjax(cNewMemberService.updateCNewMember(cNewMember));
    }

    /**
     * 删除新会员成长率
     */
    @RequiresPermissions("census:c_new_member:remove")
    @Log(title = "新会员成长率", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cNewMemberService.deleteCNewMemberByIds(ids));
    }
}
