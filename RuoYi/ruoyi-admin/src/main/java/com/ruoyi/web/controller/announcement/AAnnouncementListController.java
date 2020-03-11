package com.ruoyi.web.controller.announcement;

import com.ruoyi.announcement.domain.AAnnouncementList;
import com.ruoyi.announcement.service.IAAnnouncementListService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.poi.ExcelUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 公告列表Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Api(tags = "公告列表")
@Controller
@RequestMapping("/announcement/a_announcement_list")
public class AAnnouncementListController extends BaseController
{
    private String prefix = "announcement/a_announcement_list";

    @Autowired
    private IAAnnouncementListService aAnnouncementListService;

    @RequiresPermissions("announcement:a_announcement_list:view")
    @GetMapping()
    public String a_announcement_list()
    {
        return prefix + "/a_announcement_list";
    }

    /**
     * 查询公告列表列表
     */
    @ApiOperation("查询公告列表列表")
    @RequiresPermissions("announcement:a_announcement_list:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AAnnouncementList aAnnouncementList)
    {
        startPage();
        List<AAnnouncementList> list = aAnnouncementListService.selectAAnnouncementListList(aAnnouncementList);
        return getDataTable(list);
    }

    /**
     * 导出公告列表列表
     */
    @ApiOperation("导出公告列表列表")
    @RequiresPermissions("announcement:a_announcement_list:export")
    @Log(title = "公告列表", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AAnnouncementList aAnnouncementList)
    {
        List<AAnnouncementList> list = aAnnouncementListService.selectAAnnouncementListList(aAnnouncementList);
        ExcelUtil<AAnnouncementList> util = new ExcelUtil<AAnnouncementList>(AAnnouncementList.class);
        return util.exportExcel(list, "a_announcement_list");
    }

    /**
     * 新增公告列表
     */
    @ApiOperation("新增公告列表")
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存公告列表
     */
    @ApiOperation("新增保存公告列表")
    @RequiresPermissions("announcement:a_announcement_list:add")
    @Log(title = "公告列表", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(AAnnouncementList aAnnouncementList)
    {
        return toAjax(aAnnouncementListService.insertAAnnouncementList(aAnnouncementList));
    }

    /**
     * 修改公告列表
     */
    @ApiOperation("修改公告列表")
    @GetMapping("/edit/{announcementId}")
    public String edit(@PathVariable("announcementId") Long announcementId, ModelMap mmap)
    {
        AAnnouncementList aAnnouncementList = aAnnouncementListService.selectAAnnouncementListById(announcementId);
        mmap.put("aAnnouncementList", aAnnouncementList);
        return prefix + "/edit";
    }

    /**
     * 修改保存公告列表
     */
    @ApiOperation("修改保存公告列表")
    @RequiresPermissions("announcement:a_announcement_list:edit")
    @Log(title = "公告列表", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AAnnouncementList aAnnouncementList)
    {
        return toAjax(aAnnouncementListService.updateAAnnouncementList(aAnnouncementList));
    }

    /**
     * 删除公告列表
     */
    @ApiOperation("删除公告列表")
    @RequiresPermissions("announcement:a_announcement_list:remove")
    @Log(title = "公告列表", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(aAnnouncementListService.deleteAAnnouncementListByIds(ids));
    }
}
