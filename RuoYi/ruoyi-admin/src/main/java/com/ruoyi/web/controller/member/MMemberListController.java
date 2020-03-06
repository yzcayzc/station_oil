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
import com.ruoyi.member.domain.MMemberList;
import com.ruoyi.member.service.IMMemberListService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 会员列表Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Controller
@RequestMapping("/member/m_member_list")
public class MMemberListController extends BaseController
{
    private String prefix = "member/m_member_list";

    @Autowired
    private IMMemberListService mMemberListService;

    @RequiresPermissions("member:m_member_list:view")
    @GetMapping()
    public String m_member_list()
    {
        return prefix + "/m_member_list";
    }

    /**
     * 查询会员列表列表
     */
    @RequiresPermissions("member:m_member_list:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MMemberList mMemberList)
    {
        startPage();
        List<MMemberList> list = mMemberListService.selectMMemberListList(mMemberList);
        return getDataTable(list);
    }

    /**
     * 导出会员列表列表
     */
    @RequiresPermissions("member:m_member_list:export")
    @Log(title = "会员列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MMemberList mMemberList)
    {
        List<MMemberList> list = mMemberListService.selectMMemberListList(mMemberList);
        ExcelUtil<MMemberList> util = new ExcelUtil<MMemberList>(MMemberList.class);
        return util.exportExcel(list, "m_member_list");
    }

    /**
     * 新增会员列表
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存会员列表
     */
    @RequiresPermissions("member:m_member_list:add")
    @Log(title = "会员列表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MMemberList mMemberList)
    {
        return toAjax(mMemberListService.insertMMemberList(mMemberList));
    }

    /**
     * 修改会员列表
     */
    @GetMapping("/edit/{memberId}")
    public String edit(@PathVariable("memberId") Long memberId, ModelMap mmap)
    {
        MMemberList mMemberList = mMemberListService.selectMMemberListById(memberId);
        mmap.put("mMemberList", mMemberList);
        return prefix + "/edit";
    }

    /**
     * 修改保存会员列表
     */
    @RequiresPermissions("member:m_member_list:edit")
    @Log(title = "会员列表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MMemberList mMemberList)
    {
        return toAjax(mMemberListService.updateMMemberList(mMemberList));
    }

    /**
     * 删除会员列表
     */
    @RequiresPermissions("member:m_member_list:remove")
    @Log(title = "会员列表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mMemberListService.deleteMMemberListByIds(ids));
    }
}
