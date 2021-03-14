package com.kestrelcjx.system.controller;

import com.kestrelcjx.common.annotation.Log;
import com.kestrelcjx.common.common.BaseController;
import com.kestrelcjx.common.enums.BusinessType;
import com.kestrelcjx.common.utils.JsonResult;
import com.kestrelcjx.system.entity.LoginLog;
import com.kestrelcjx.system.query.LoginLogQuery;
import com.kestrelcjx.system.service.ILoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 登录日志控制器
 */
@Controller
@RequestMapping("/loginlog")
public class LoginLogController extends BaseController {
    @Autowired
    private ILoginLogService loginLogService;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
//    @RequiresPermissions("sys:loginlog:list")
    @ResponseBody
    @PostMapping("/list")
    public JsonResult list(LoginLogQuery query) {
        return loginLogService.getList(query);
    }

    /**
     * 删除记录
     *
     * @param id 记录ID
     * @return
     */
//    @RequiresPermissions("sys:loginlog:delete")
    @Log(title = "登录日志", businessType = BusinessType.DELETE)
    @ResponseBody
    @GetMapping("/delete/{id}")
    public JsonResult delete(@PathVariable("id") Integer id) {
        return loginLogService.deleteById(id);
    }

    /**
     * 批量删除
     *
     * @param ids 记录ID(多个使用逗号","分隔)
     * @return
     */
//    @RequiresPermissions("sys:loginlog:batchDelete")
    @Log(title = "登录日志", businessType = BusinessType.BATCH_DELETE)
    @ResponseBody
    @GetMapping("/batchDelete/{ids}")
    public JsonResult batchDelete(@PathVariable("ids") String ids) {
        return loginLogService.deleteByIds(ids);
    }

    /**
     * 设置状态
     *
     * @param entity 实体对象
     * @return
     */
//    @RequiresPermissions("sys:loginlog:status")
    @Log(title = "登录日志", businessType = BusinessType.STATUS)
    @ResponseBody
    @PostMapping("/setStatus")
    public JsonResult setStatus(@RequestBody LoginLog entity) {
        return loginLogService.setStatus(entity);
    }
}

