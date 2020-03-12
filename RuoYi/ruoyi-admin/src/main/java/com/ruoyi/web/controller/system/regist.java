package com.ruoyi.web.controller.system;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.framework.shiro.service.SysPasswordService;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.service.ISysUserService;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/system/users")
public class regist extends BaseController {
    @Autowired
    private SysPasswordService passwordService;
    @Autowired
    private ISysUserService userService;


    @ApiOperation("员工注册")
    @Log(title = "用户管理", businessType = BusinessType.INSERT)
    @PostMapping("/adds")
    @ResponseBody
    public AjaxResult login(String oppenid){

        SysUser user = new SysUser();
        user.setOppenid(oppenid);
        List<SysUser> sysUsers = userService.selectUnallocatedList(user);
        for (SysUser sysUser : sysUsers) {
            String oppenid1 = sysUser.getOppenid();
            if (!oppenid.equals(oppenid1)){
                user.setLoginName("user"+oppenid);
                user.setPassword("123456");
            }else{
                return AjaxResult.warn("已注册");
            }
        }
        user.setSalt(ShiroUtils.randomSalt());
        user.setPassword(passwordService.encryptPassword(user.getLoginName(), user.getPassword(), user.getSalt()));
        user.setCreateBy(user.getLoginName());
        return toAjax(userService.insertUser(user));
    }
}
