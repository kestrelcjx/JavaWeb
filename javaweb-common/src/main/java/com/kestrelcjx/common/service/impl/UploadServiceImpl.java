package com.kestrelcjx.common.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.kestrelcjx.common.service.IUploadService;
import com.kestrelcjx.common.utils.CommonUtils;
import com.kestrelcjx.common.utils.JsonResult;
import com.kestrelcjx.common.utils.UploadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 人员角色表 服务实现类
 */
@Service
public class UploadServiceImpl implements IUploadService {
    @Autowired
    private UploadUtils uploadUtils;

    /**
     * 上传图片
     *
     * @param request 网络请求
     * @param name    目录名
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public JsonResult uploadImage(HttpServletRequest request, String name) {
        UploadUtils uploadUtils = new UploadUtils();
        Map<String, Object> result = uploadUtils.uploadFile(request, name);
        List<String> imageList = (List<String>) result.get("image");
        String imageUrl = CommonUtils.getImageURL(imageList.get(0));
        return JsonResult.success("上传成功", imageUrl);
    }

    /**
     * 上传文件
     *
     * @param request 网络请求
     * @param name    目录名
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public JsonResult uploadFile(HttpServletRequest request, String name) {
        uploadUtils.setDirName("files");
        Map<String, Object> result = uploadUtils.uploadFile(request, name);
        List<String> nameList = (List<String>) result.get("name");
        List<String> imageList = (List<String>) result.get("image");
        String imageUrl = CommonUtils.getImageURL(imageList.get(imageList.size() - 1));
        Map<String, Object> map = new HashMap<>();
        map.put("fileName", nameList.get(nameList.size() - 1));
        map.put("fileUrl", imageUrl);
        return JsonResult.success("上传成功", map);
    }

    /**
     * 上传编辑器图片
     *
     * @param request 网络请求
     * @param name    目录名
     * @return
     */
    @Override
    @SuppressWarnings("unchecked")
    public String kindeditorImage(HttpServletRequest request, String name) {
        UploadUtils uploadUtils = new UploadUtils();
        Map<String, Object> result = uploadUtils.uploadFile(request, name);
        List<String> imageList = (List<String>) result.get("image");
        String imageUrl = CommonUtils.getImageURL(imageList.get(imageList.size() - 1));
        JSONObject object = new JSONObject();
        object.put("error", 0);
        object.put("url", imageUrl);
        return object.toJSONString();
    }
}
