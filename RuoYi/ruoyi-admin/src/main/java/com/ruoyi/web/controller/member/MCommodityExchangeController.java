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
import com.ruoyi.member.domain.MCommodityExchange;
import com.ruoyi.member.service.IMCommodityExchangeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 商品兑换信息Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Controller
@RequestMapping("/member/m_commodity_exchange")
public class MCommodityExchangeController extends BaseController
{
    private String prefix = "member/m_commodity_exchange";

    @Autowired
    private IMCommodityExchangeService mCommodityExchangeService;

    @RequiresPermissions("member:m_commodity_exchange:view")
    @GetMapping()
    public String m_commodity_exchange()
    {
        return prefix + "/m_commodity_exchange";
    }

    /**
     * 查询商品兑换信息列表
     */
    @RequiresPermissions("member:m_commodity_exchange:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MCommodityExchange mCommodityExchange)
    {
        startPage();
        List<MCommodityExchange> list = mCommodityExchangeService.selectMCommodityExchangeList(mCommodityExchange);
        return getDataTable(list);
    }

    /**
     * 导出商品兑换信息列表
     */
    @RequiresPermissions("member:m_commodity_exchange:export")
    @Log(title = "商品兑换信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MCommodityExchange mCommodityExchange)
    {
        List<MCommodityExchange> list = mCommodityExchangeService.selectMCommodityExchangeList(mCommodityExchange);
        ExcelUtil<MCommodityExchange> util = new ExcelUtil<MCommodityExchange>(MCommodityExchange.class);
        return util.exportExcel(list, "m_commodity_exchange");
    }

    /**
     * 新增商品兑换信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存商品兑换信息
     */
    @RequiresPermissions("member:m_commodity_exchange:add")
    @Log(title = "商品兑换信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MCommodityExchange mCommodityExchange)
    {
        return toAjax(mCommodityExchangeService.insertMCommodityExchange(mCommodityExchange));
    }

    /**
     * 修改商品兑换信息
     */
    @GetMapping("/edit/{commodityExchangeId}")
    public String edit(@PathVariable("commodityExchangeId") Long commodityExchangeId, ModelMap mmap)
    {
        MCommodityExchange mCommodityExchange = mCommodityExchangeService.selectMCommodityExchangeById(commodityExchangeId);
        mmap.put("mCommodityExchange", mCommodityExchange);
        return prefix + "/edit";
    }

    /**
     * 修改保存商品兑换信息
     */
    @RequiresPermissions("member:m_commodity_exchange:edit")
    @Log(title = "商品兑换信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MCommodityExchange mCommodityExchange)
    {
        return toAjax(mCommodityExchangeService.updateMCommodityExchange(mCommodityExchange));
    }

    /**
     * 删除商品兑换信息
     */
    @RequiresPermissions("member:m_commodity_exchange:remove")
    @Log(title = "商品兑换信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mCommodityExchangeService.deleteMCommodityExchangeByIds(ids));
    }
}
