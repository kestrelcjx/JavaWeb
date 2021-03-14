package com.kestrelcjx.system.controller;

import com.kestrelcjx.common.annotation.Log;
import com.kestrelcjx.common.common.BaseController;
import com.kestrelcjx.common.enums.BusinessType;
import com.kestrelcjx.common.utils.JsonResult;
import com.kestrelcjx.system.query.OperLogQuery;
import com.kestrelcjx.system.service.IOperLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 操作日志控制器
 */
@Controller
@RequestMapping("/operlog")
public class OperLogController extends BaseController {
    @Autowired
    private IOperLogService operLogService;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
//    @RequiresPermissions("sys:operlog:list")
    @ResponseBody
    @PostMapping("/list")
    public JsonResult list(OperLogQuery query) {
        return operLogService.getList(query);
    }

    /**
     * 删除记录
     *
     * @param id 记录ID
     * @return
     */
//    @RequiresPermissions("sys:operlog:delete")
    @Log(title = "操作日志", businessType = BusinessType.DELETE)
    @ResponseBody
    @GetMapping("/delete/{id}")
    public JsonResult delete(@PathVariable("id") Integer id) {
        return operLogService.deleteById(id);
    }

    /**
     * 批量删除
     *
     * @param ids 记录ID(多个使用逗号","分隔)
     * @return
     */
//    @RequiresPermissions("sys:operlog:batchDelete")
    @Log(title = "操作日志", businessType = BusinessType.BATCH_DELETE)
    @ResponseBody
    @GetMapping("/batchDelete/{ids}")
    public JsonResult batchDelete(@PathVariable("ids") String ids) {
        return operLogService.deleteByIds(ids);
    }
}

