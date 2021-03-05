package com.kestrelcjx.common.controller;

import com.kestrelcjx.common.config.UploadFileConfig;
import com.kestrelcjx.common.utils.FileUtils;
import com.kestrelcjx.common.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/common")
public class CommonController {
    private static final Logger log = LoggerFactory.getLogger(CommonController.class);

    /**
     * 下载文件
     *
     * @param fileName 文件名
     * @param isDelete 是否下载后删除
     * @param request  网络情趣
     * @param response 网络响应
     */
    @GetMapping("/download")
    public void downloadFile(String fileName, boolean isDelete,
                             HttpServletRequest request, HttpServletResponse response) {
        try {
            if (!FileUtils.isValidFilename(fileName)) {
                throw new Exception(StringUtils.format("文件名称（{}）非法，不允许下载。", fileName));
            }
            String realFileName = System.currentTimeMillis() + fileName.substring(fileName.indexOf("_") + 1);
            String filePath = UploadFileConfig.uploadFolder + fileName;
            response.setCharacterEncoding("utf-8");
            response.setContentType("multipart/form-data");
            response.setHeader("Content-Disposition",
                    "attachment;fileName=" + FileUtils.setFileDownloadHeader(request, realFileName));
            FileUtils.writeBytes(filePath, response.getOutputStream());
            if (isDelete) {
                FileUtils.deleteFile(filePath);
            }
        } catch (Exception e) {
            log.error("下载文件失败", e);
        }
    }
}
