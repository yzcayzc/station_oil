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
import com.ruoyi.member.domain.MPersonalData;
import com.ruoyi.member.service.IMPersonalDataService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 会员基本信息Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Controller
@RequestMapping("/member/m_personal_data")
public class MPersonalDataController extends BaseController
{
    private String prefix = "member/m_personal_data";

    @Autowired
    private IMPersonalDataService mPersonalDataService;

    @RequiresPermissions("member:m_personal_data:view")
    @GetMapping()
    public String m_personal_data()
    {
        return prefix + "/m_personal_data";
    }

    /**
     * 查询会员基本信息列表
     */
    @RequiresPermissions("member:m_personal_data:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MPersonalData mPersonalData)
    {
        startPage();
        List<MPersonalData> list = mPersonalDataService.selectMPersonalDataList(mPersonalData);
        return getDataTable(list);
    }

    /**
     * 导出会员基本信息列表
     */
    @RequiresPermissions("member:m_personal_data:export")
    @Log(title = "会员基本信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MPersonalData mPersonalData)
    {
        List<MPersonalData> list = mPersonalDataService.selectMPersonalDataList(mPersonalData);
        ExcelUtil<MPersonalData> util = new ExcelUtil<MPersonalData>(MPersonalData.class);
        return util.exportExcel(list, "m_personal_data");
    }

    /**
     * 新增会员基本信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存会员基本信息
     */
    @RequiresPermissions("member:m_personal_data:add")
    @Log(title = "会员基本信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MPersonalData mPersonalData)
    {
        return toAjax(mPersonalDataService.insertMPersonalData(mPersonalData));
    }

    /**
     * 修改会员基本信息
     */
    @GetMapping("/edit/{dataId}")
    public String edit(@PathVariable("dataId") Long dataId, ModelMap mmap)
    {
        MPersonalData mPersonalData = mPersonalDataService.selectMPersonalDataById(dataId);
        mmap.put("mPersonalData", mPersonalData);
        return prefix + "/edit";
    }

    /**
     * 修改保存会员基本信息
     */
    @RequiresPermissions("member:m_personal_data:edit")
    @Log(title = "会员基本信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MPersonalData mPersonalData)
    {
        return toAjax(mPersonalDataService.updateMPersonalData(mPersonalData));
    }

    /**
     * 删除会员基本信息
     */
    @RequiresPermissions("member:m_personal_data:remove")
    @Log(title = "会员基本信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mPersonalDataService.deleteMPersonalDataByIds(ids));
    }
}
