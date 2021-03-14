package com.kestrelcjx.admin.controller;

import com.kestrelcjx.admin.query.UserAddressQuery;
import com.kestrelcjx.admin.service.IUserAddressService;
import com.kestrelcjx.common.annotation.Log;
import com.kestrelcjx.common.common.BaseController;
import com.kestrelcjx.common.enums.BusinessType;
import com.kestrelcjx.common.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * 会员地址 控制器
 */
@Controller
@RequestMapping("/useraddress")
public class UserAddressController extends BaseController {
    @Autowired
    private IUserAddressService userAddressService;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
//    @RequiresPermissions("sys:useraddress:list")
    @ResponseBody
    @PostMapping("/list")
    public JsonResult list(UserAddressQuery query) {
        return userAddressService.getList(query);
    }

    /**
     * 删除记录
     *
     * @param id 记录ID
     * @return
     */
//    @RequiresPermissions("sys:useraddress:delete")
    @Log(title = "会员地址", businessType = BusinessType.DELETE)
    @ResponseBody
    @GetMapping("/delete/{id}")
    public JsonResult delete(@PathVariable("id") Integer id) {
        return userAddressService.deleteById(id);
    }

    /**
     * 批量删除
     *
     * @param ids 记录ID(多个使用逗号","分隔)
     * @return
     */
//    @RequiresPermissions("sys:useraddress:batchDelete")
    @Log(title = "会员地址", businessType = BusinessType.BATCH_DELETE)
    @ResponseBody
    @GetMapping("/batchDelete/{ids}")
    public JsonResult batchDelete(@PathVariable("ids") String ids) {
        return userAddressService.deleteByIds(ids);
    }

}
