package com.kestrelcjx.system.controller;

import com.kestrelcjx.common.annotation.Log;
import com.kestrelcjx.common.common.BaseController;
import com.kestrelcjx.common.enums.BusinessType;
import com.kestrelcjx.common.utils.JsonResult;
import com.kestrelcjx.system.query.SmsLogQuery;
import com.kestrelcjx.system.service.ISmsLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 短信日志控制器
 */
@Controller
@RequestMapping("/smslog")
public class SmsLogController extends BaseController {
    @Autowired
    private ISmsLogService smsLogService;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
//    @RequiresPermissions("sys:smslog:list")
    @ResponseBody
    @PostMapping("/list")
    public JsonResult list(SmsLogQuery query) {
        return smsLogService.getList(query);
    }

    /**
     * 删除记录
     *
     * @param id 记录ID
     * @return
     */
//    @RequiresPermissions("sys:smslog:delete")
    @Log(title = "短信日志", businessType = BusinessType.DELETE)
    @ResponseBody
    @GetMapping("/delete/{id}")
    public JsonResult delete(@PathVariable("id") Integer id) {
        return smsLogService.deleteById(id);
    }

    /**
     * 批量删除
     *
     * @param ids 记录ID(多个使用逗号","分隔)
     * @return
     */
//    @RequiresPermissions("sys:smslog:batchDelete")
    @Log(title = "短信日志", businessType = BusinessType.BATCH_DELETE)
    @ResponseBody
    @GetMapping("/batchDelete/{ids}")
    public JsonResult batchDelete(@PathVariable("ids") String ids) {
        return smsLogService.deleteByIds(ids);
    }
}

