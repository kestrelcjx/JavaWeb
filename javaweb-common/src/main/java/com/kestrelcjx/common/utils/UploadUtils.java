package com.kestrelcjx.common.utils;

import com.kestrelcjx.common.config.UploadFileConfig;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 上传文件工具类
 */
@Component
public class UploadUtils {
    // 表单字段常量
    public static final String FORM_FIELDS = "form_fields";
    // 文件域常量
    public static final String FILE_FIELDS = "file";
    // 定义允许上传的文件扩展名
    private Map<String, String> extMap = new HashMap<>();
    // 文件保存目录路径
    private String uploadPath = UploadFileConfig.uploadFolder;
    // 文件目录名
    private String dirName = "images";
    // 上传临时路径
    private static final String TEMP_PATH = "temp";
    // 临时存储相对路径
    private String tempPath = uploadPath + TEMP_PATH;
    // 单个文件最大上传大小（10M)
    private long fileMaxSize = 1024 * 1024 * 10;
    // 最大文件大小（100M)
    private long maxSize = 1024 * 1024 * 100;
    // 文件保存目录url
    private String saveUrl;
    // 文件最终的url包括文件名
    private List<String> fileUrlList = new ArrayList<>();
    // 上传文件原名
    private List<String> fileNameList = new ArrayList<>();

    public UploadUtils() {
        // key-文件夹名称
        // value-该文件夹内可以上传文件的后缀名
        extMap.put("images", "gif,jpg,jpeg,png,bmp");
        extMap.put("flashs", "swf,flv");
        extMap.put("medias", "swf,flv,mp3,wav,wma,wmv,mid,avi,mpg,asf,rm,rmvb");
        extMap.put("files", "doc,docx,xls,xlsx,ppt,htm,html,txt,zip,rar,gz,bz2,mp3,mp4,mov");
    }

    /**
     * 文件上传
     *
     * @param request
     * @param name
     * @return
     */
    public Map<String, Object> uploadFile(HttpServletRequest request, String name) {
        // 验证文件并返回错误信息
        String error = this.validateFields(request, name);
        // 初始化表单元素
        Map<String, Object> fieldsMap = new HashMap<>();
        if (error.equals("")) {
            fieldsMap = this.initFields(request);
        }
        List<FileItem> fileItemList = (List<FileItem>) fieldsMap.get(UploadUtils.FILE_FIELDS);
        if (fileItemList != null) {
            for (FileItem item : fileItemList) {
                // 上传文件并返回错误信息
                error = this.saveFile(item);
            }
        }
        // 返回结果
        Map<String, Object> result = new HashMap<>();
        result.put("error", error);
        result.put("image", this.fileUrlList);
        result.put("name", this.fileNameList);
        return result;
    }

    /**
     * 上传验证并初始化目录
     *
     * @param request
     * @param name
     * @return
     */
    public String validateFields(HttpServletRequest request, String name) {
        // 错误信息
        String errorInfo = "";
        // 上传内容类型
        String contentType = request.getContentType();
        // 上传内容长度
        int contentLength = request.getContentLength();
        // 上传目录
        File uploadDir = new File(uploadPath);
        // 目录不存在则创建
        if (!uploadDir.exists()) {
            uploadDir.mkdirs();
        }
        if (null == contentType || !contentType.startsWith("multipart")) {
            System.out.println("请求不包含multipart/form-data流");
            errorInfo = "请求不包含multipart/form-data流";
        } else if (maxSize < contentLength) {
            System.out.println("上传文件大小超出文件最大大小");
            errorInfo = "上传文件大小超出文件最大大小[" + maxSize + "]";
        } else if (!ServletFileUpload.isMultipartContent(request)) {
            errorInfo = "请选择文件";
        } else if (!uploadDir.isDirectory()) {
            errorInfo = "上传目录[" + uploadPath + "]不存在";
        } else if (!uploadDir.canWrite()) {
            errorInfo = "上传目录[" + uploadPath + "]没有写权限";
        } else if (!extMap.containsKey(dirName)) {
            errorInfo = "目录名不正确";
        } else {
            // 上传路径
            uploadPath = UploadFileConfig.uploadFolder + dirName + "/" + name + "/"; // 上传路径
            // 保存目录Url
            saveUrl = "/" + dirName + "/" + name + "/";
            // 创建一级目录
            File saveDirFile = new File(uploadPath);
            if (!saveDirFile.exists()) {
                saveDirFile.mkdirs();
            }
            // 创建二级目录（格式：年月日）
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            String ymd = sdf.format(new Date());
            uploadPath += ymd + "/";
            saveUrl += ymd + "/";
            File dirFile = new File(uploadPath);
            if (!dirFile.exists()) {
                dirFile.mkdirs();
            }
            // 创建临时上传目录
            File file = new File(tempPath);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return errorInfo;
    }

    /**
     * 处理上传内容
     *
     * @param request
     * @return
     */
    private Map<String, Object> initFields(HttpServletRequest request) {
        // 存储表单字段和非表单字段
        Map<String, Object> map = new HashMap<>();
        // 第一步：判断request
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        // 第二步：解析request
        if (isMultipart) {
            // 设置环境：创建一个DiskFileItemFactory工厂
            DiskFileItemFactory factory = new DiskFileItemFactory();
            // 阈值，超过这个值才会写到临时目录，否则在内容中
            factory.setSizeThreshold(1024 * 1024 * 10);
            // 设置上传文件的临时目录
            factory.setRepository(new File(tempPath));
            // 核心操作类：创建一个文件上传解析器
            ServletFileUpload upload = new ServletFileUpload(factory);
            // 设置文件名称编码（解决上传文件名的中文乱码问题）
            upload.setHeaderEncoding("UTF-8");
            // 限制单个文件上传大小
            upload.setFileSizeMax(fileMaxSize);
            // 限制总上传文件大小
            upload.setSizeMax(maxSize);
            // 使用ServletFileUpload解析器解析上传数据
            // 解析结果返回的是一个List<FileItem>集合，每一个FileItem对应一个Form表单的输入项
            List<FileItem> items = null;
            try {
                items = upload.parseRequest(request);
            } catch (FileUploadException e) {
                e.printStackTrace();
            }
            // 第三步：处理upload items
            if (items != null && items.size() > 0) {
                Iterator<FileItem> iterator = items.iterator();
                // 文件域对象
                List<FileItem> list = new ArrayList<>();
                // 表单字段
                Map<String, String> fields = new HashMap<>();
                while (iterator.hasNext()) {
                    FileItem item = iterator.next();
                    // 处理所有表单元素和文件域表单元素
                    if (item.isFormField()) {
                        // 如果FileItem中封装的是普通输入项的数据（输出名、值）
                        String name = item.getFieldName();
                        String value = item.getString();
                        fields.put(name, value);
                    } else {
                        // 如果FileItem中封装的是上传文件
                        list.add(item);
                    }
                }
                map.put(FORM_FIELDS, fields);
                map.put(FILE_FIELDS, list);
            }
        }
        return map;
    }

    /**
     * 保存文件
     *
     * @param item
     * @return
     */
    private String saveFile(FileItem item) {
        String error = "";
        String fileName = item.getName();
        String fileExt = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
        if (item.getSize() > maxSize) {
            error = "上传文件大小超过限制";
        } else if (!Arrays.asList(extMap.get(dirName).split(",")).contains(fileExt)) {
            error = "上传文件扩展名是不允许的扩展名。\n只允许" + extMap.get(dirName) + "格式。";
        } else {
            // 存储文件重命名
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String newFileName = sdf.format(new Date()) + new Random().nextInt(1000) + "." + fileExt;
            // 新增文件原名数组（带后缀）
            fileNameList.add(fileName);
            // 新增文件数组
            String filePath = saveUrl + newFileName;
            fileUrlList.add(filePath);
            // 写入文件
            try {
                File uploadFile = new File(uploadPath, newFileName);
                item.write(uploadFile);
            } catch (NullPointerException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("上传失败了！！！");
            }
        }
        return error;
    }

    /***************getter/setter***************/

    public static String getFormFields() {
        return FORM_FIELDS;
    }

    public static String getFileFields() {
        return FILE_FIELDS;
    }

    public Map<String, String> getExtMap() {
        return extMap;
    }

    public void setExtMap(Map<String, String> extMap) {
        this.extMap = extMap;
    }

    public String getUploadPath() {
        return uploadPath;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }

    public String getDirName() {
        return dirName;
    }

    public void setDirName(String dirName) {
        this.dirName = dirName;
    }

    public static String getTempPath() {
        return TEMP_PATH;
    }

    public void setTempPath(String tempPath) {
        this.tempPath = tempPath;
    }

    public long getFileMaxSize() {
        return fileMaxSize;
    }

    public void setFileMaxSize(int fileMaxSize) {
        this.fileMaxSize = fileMaxSize;
    }

    public long getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public String getSaveUrl() {
        return saveUrl;
    }

    public void setSaveUrl(String saveUrl) {
        this.saveUrl = saveUrl;
    }

    public List<String> getFileUrlList() {
        return fileUrlList;
    }

    public void setFileUrlList(List<String> fileUrlList) {
        this.fileUrlList = fileUrlList;
    }

    public List<String> getFileNameList() {
        return fileNameList;
    }

    public void setFileNameList(List<String> fileNameList) {
        this.fileNameList = fileNameList;
    }
}
