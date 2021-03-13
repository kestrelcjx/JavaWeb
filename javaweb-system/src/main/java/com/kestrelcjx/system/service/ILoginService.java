package com.kestrelcjx.system.service;

import com.kestrelcjx.common.utils.JsonResult;
import com.kestrelcjx.system.dto.LoginDto;
import com.kestrelcjx.system.entity.Admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 系统登录服务类
 */
public interface ILoginService {
    /**
     * 获取验证码
     *
     * @param response 请求响应
     * @return
     */
    JsonResult captcha(HttpServletResponse response);

    /**
     * 系统登录
     *
     * @param request  网络请求
     * @param loginDto 登录参数
     * @return
     */
    JsonResult login(HttpServletRequest request, LoginDto loginDto);

    /**
     * 退出登录
     *
     * @return
     */
    JsonResult logout();

    /**
     * 系统登录
     *
     * @param username 用户名
     * @param password 密码
     * @return
     */
    Admin login(String username, String password);
}
