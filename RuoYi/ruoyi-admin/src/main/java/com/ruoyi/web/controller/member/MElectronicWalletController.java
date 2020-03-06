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
import com.ruoyi.member.domain.MElectronicWallet;
import com.ruoyi.member.service.IMElectronicWalletService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 电子钱包Controller
 * 
 * @author ruoyi
 * @date 2020-02-27
 */
@Controller
@RequestMapping("/member/m_electronic_wallet")
public class MElectronicWalletController extends BaseController
{
    private String prefix = "member/m_electronic_wallet";

    @Autowired
    private IMElectronicWalletService mElectronicWalletService;

    @RequiresPermissions("member:m_electronic_wallet:view")
    @GetMapping()
    public String m_electronic_wallet()
    {
        return prefix + "/m_electronic_wallet";
    }

    /**
     * 查询电子钱包列表
     */
    @RequiresPermissions("member:m_electronic_wallet:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MElectronicWallet mElectronicWallet)
    {
        startPage();
        List<MElectronicWallet> list = mElectronicWalletService.selectMElectronicWalletList(mElectronicWallet);
        return getDataTable(list);
    }

    /**
     * 导出电子钱包列表
     */
    @RequiresPermissions("member:m_electronic_wallet:export")
    @Log(title = "电子钱包", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MElectronicWallet mElectronicWallet)
    {
        List<MElectronicWallet> list = mElectronicWalletService.selectMElectronicWalletList(mElectronicWallet);
        ExcelUtil<MElectronicWallet> util = new ExcelUtil<MElectronicWallet>(MElectronicWallet.class);
        return util.exportExcel(list, "m_electronic_wallet");
    }

    /**
     * 新增电子钱包
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存电子钱包
     */
    @RequiresPermissions("member:m_electronic_wallet:add")
    @Log(title = "电子钱包", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MElectronicWallet mElectronicWallet)
    {
        return toAjax(mElectronicWalletService.insertMElectronicWallet(mElectronicWallet));
    }

    /**
     * 修改电子钱包
     */
    @GetMapping("/edit/{electronicWalletId}")
    public String edit(@PathVariable("electronicWalletId") Long electronicWalletId, ModelMap mmap)
    {
        MElectronicWallet mElectronicWallet = mElectronicWalletService.selectMElectronicWalletById(electronicWalletId);
        mmap.put("mElectronicWallet", mElectronicWallet);
        return prefix + "/edit";
    }

    /**
     * 修改保存电子钱包
     */
    @RequiresPermissions("member:m_electronic_wallet:edit")
    @Log(title = "电子钱包", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MElectronicWallet mElectronicWallet)
    {
        return toAjax(mElectronicWalletService.updateMElectronicWallet(mElectronicWallet));
    }

    /**
     * 删除电子钱包
     */
    @RequiresPermissions("member:m_electronic_wallet:remove")
    @Log(title = "电子钱包", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mElectronicWalletService.deleteMElectronicWalletByIds(ids));
    }
}
