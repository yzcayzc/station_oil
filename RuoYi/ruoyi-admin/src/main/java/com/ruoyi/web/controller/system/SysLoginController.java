package com.ruoyi.web.controller.system;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.service.ISysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.ServletUtils;
import com.ruoyi.common.utils.StringUtils;

import java.util.List;

/**
 * 登录验证
 * 
 * @author ruoyi
 */
@Api(tags = "登录验证")
@Controller
public class SysLoginController extends BaseController
{

    @Autowired
    private ISysUserService iSysUserService;
    @ApiOperation("员工登录")
    @GetMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response)
    {
        // 如果是Ajax请求，返回Json字符串。
        if (ServletUtils.isAjaxRequest(request))
        {
            return ServletUtils.renderString(response, "{\"code\":\"1\",\"msg\":\"未登录或登录超时。请重新登录\"}");
        }

        return "login";
    }

    @PostMapping("/loginon")
    public String ajaxLogin(String oppenid){

        SysUser sysUser = iSysUserService.selectUserByOppenid(oppenid);
        if (sysUser==null){
            return "forward:/system/users/adds";
        }
        String username = sysUser.getLoginName();
        String password = "123456";

        return "forward:/login?username="+username+"&password="+password;


//        UsernamePasswordToken token = new UsernamePasswordToken(username, password, false);
//
//        Subject subject = SecurityUtils.getSubject();
//        try
//        {
//            subject.login(token);
//            return success();
//        }
//        catch (AuthenticationException e)
//        {
//            String msg = "用户或密码错误";
//            if (StringUtils.isNotEmpty(e.getMessage()))
//            {
//                msg = e.getMessage();
//            }
//            return error(msg);
//        }
    }
    @PostMapping("/login")
@ResponseBody
public AjaxResult ajaxLogin(String username, String password)
{
    UsernamePasswordToken token = new UsernamePasswordToken(username, password, false);

    Subject subject = SecurityUtils.getSubject();
    try
    {
        subject.login(token);
        return success();
    }
    catch (AuthenticationException e)
    {
        String msg = "用户或密码错误";
        if (StringUtils.isNotEmpty(e.getMessage()))
        {
            msg = e.getMessage();
        }
        return error(msg);
    }
}
    @GetMapping("/unauth")
    public String unauth()
    {
        return "error/unauth";
    }
}
