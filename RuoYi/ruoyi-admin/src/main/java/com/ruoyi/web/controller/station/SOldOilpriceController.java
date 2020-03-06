package com.ruoyi.web.controller.station;

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
import com.ruoyi.station.domain.SOldOilprice;
import com.ruoyi.station.service.ISOldOilpriceService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 历史油价Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Controller
@RequestMapping("/station/s_old_oilprice")
public class SOldOilpriceController extends BaseController
{
    private String prefix = "station/s_old_oilprice";

    @Autowired
    private ISOldOilpriceService sOldOilpriceService;

    @RequiresPermissions("station:s_old_oilprice:view")
    @GetMapping()
    public String s_old_oilprice()
    {
        return prefix + "/s_old_oilprice";
    }

    /**
     * 查询历史油价列表
     */
    @RequiresPermissions("station:s_old_oilprice:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SOldOilprice sOldOilprice)
    {
        startPage();
        List<SOldOilprice> list = sOldOilpriceService.selectSOldOilpriceList(sOldOilprice);
        return getDataTable(list);
    }

    /**
     * 导出历史油价列表
     */
    @RequiresPermissions("station:s_old_oilprice:export")
    @Log(title = "历史油价", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SOldOilprice sOldOilprice)
    {
        List<SOldOilprice> list = sOldOilpriceService.selectSOldOilpriceList(sOldOilprice);
        ExcelUtil<SOldOilprice> util = new ExcelUtil<SOldOilprice>(SOldOilprice.class);
        return util.exportExcel(list, "s_old_oilprice");
    }

    /**
     * 新增历史油价
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存历史油价
     */
    @RequiresPermissions("station:s_old_oilprice:add")
    @Log(title = "历史油价", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SOldOilprice sOldOilprice)
    {
        return toAjax(sOldOilpriceService.insertSOldOilprice(sOldOilprice));
    }

    /**
     * 修改历史油价
     */
    @GetMapping("/edit/{oldOilId}")
    public String edit(@PathVariable("oldOilId") Long oldOilId, ModelMap mmap)
    {
        SOldOilprice sOldOilprice = sOldOilpriceService.selectSOldOilpriceById(oldOilId);
        mmap.put("sOldOilprice", sOldOilprice);
        return prefix + "/edit";
    }

    /**
     * 修改保存历史油价
     */
    @RequiresPermissions("station:s_old_oilprice:edit")
    @Log(title = "历史油价", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SOldOilprice sOldOilprice)
    {
        return toAjax(sOldOilpriceService.updateSOldOilprice(sOldOilprice));
    }

    /**
     * 删除历史油价
     */
    @RequiresPermissions("station:s_old_oilprice:remove")
    @Log(title = "历史油价", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sOldOilpriceService.deleteSOldOilpriceByIds(ids));
    }
}
