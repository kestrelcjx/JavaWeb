package com.kestrelcjx.common.service;

import com.kestrelcjx.common.utils.JsonResult;

import javax.servlet.http.HttpServletRequest;

/**
 * 文件上传服务类
 */
public interface IUploadService {
    /**
     * 上传图片
     *
     * @param request 网络请求
     * @param name    目录名
     * @return
     */
    JsonResult uploadImage(HttpServletRequest request, String name);

    /**
     * 上传文件
     *
     * @param request 网络请求
     * @param name    目录名
     * @return
     */
    JsonResult uploadFile(HttpServletRequest request, String name);

    /**
     * 上传图片
     *
     * @param request 网络请求
     * @param name    目录名
     * @return
     */
    String kindeditorImage(HttpServletRequest request, String name);
}
