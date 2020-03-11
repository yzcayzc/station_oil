package com.ruoyi.web.controller.member;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.member.domain.MMyCar;
import com.ruoyi.member.service.IMMyCarService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 我的爱车Controller
 * 
 * @author ruoyi
 * @date 2020-03-09
 */
@Controller
@RequestMapping("/member/m_my_car")
public class MMyCarController extends BaseController
{
    private String prefix = "member/m_my_car";

    @Autowired
    private IMMyCarService mMyCarService;

    @RequiresPermissions("member:m_my_car:view")
    @GetMapping()
    public String m_my_car()
    {
        return prefix + "/m_my_car";
    }

    /**
     * 查询我的爱车列表
     */
    @RequiresPermissions("member:m_my_car:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MMyCar mMyCar)
    {
        startPage();
        List<MMyCar> list = mMyCarService.selectMMyCarList(mMyCar);
        return getDataTable(list);
    }

    /**
     * 导出我的爱车列表
     */
    @RequiresPermissions("member:m_my_car:export")
    @Log(title = "我的爱车", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MMyCar mMyCar)
    {
        List<MMyCar> list = mMyCarService.selectMMyCarList(mMyCar);
        ExcelUtil<MMyCar> util = new ExcelUtil<MMyCar>(MMyCar.class);
        return util.exportExcel(list, "m_my_car");
    }

    /**
     * 新增我的爱车
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存我的爱车
     */
    @RequiresPermissions("member:m_my_car:add")
    @Log(title = "我的爱车", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MMyCar mMyCar)
    {
        return toAjax(mMyCarService.insertMMyCar(mMyCar));
    }

    /**
     * 修改我的爱车
     */
    @GetMapping("/edit/{myCarId}")
    public String edit(@PathVariable("myCarId") Long myCarId, ModelMap mmap)
    {
        MMyCar mMyCar = mMyCarService.selectMMyCarById(myCarId);
        mmap.put("mMyCar", mMyCar);
        return prefix + "/edit";
    }

    /**
     * 修改保存我的爱车
     */
    @RequiresPermissions("member:m_my_car:edit")
    @Log(title = "我的爱车", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MMyCar mMyCar)
    {
        return toAjax(mMyCarService.updateMMyCar(mMyCar));
    }

    /**
     * 删除我的爱车
     */
    @RequiresPermissions("member:m_my_car:remove")
    @Log(title = "我的爱车", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mMyCarService.deleteMMyCarByIds(ids));
    }
}
