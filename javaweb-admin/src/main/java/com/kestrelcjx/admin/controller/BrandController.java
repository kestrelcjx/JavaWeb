package com.kestrelcjx.admin.controller;


import com.kestrelcjx.admin.entity.Brand;
import com.kestrelcjx.admin.query.BrandQuery;
import com.kestrelcjx.admin.service.IBrandService;
import com.kestrelcjx.common.annotation.Log;
import com.kestrelcjx.common.common.BaseController;
import com.kestrelcjx.common.enums.BusinessType;
import com.kestrelcjx.common.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 商品品牌 控制器
 */
@Controller
@RequestMapping("/brand")
public class BrandController extends BaseController {
    @Autowired
    private IBrandService brandService;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
//    @RequiresPermissions("sys:brand:list")
    @ResponseBody
    @PostMapping("/list")
    public JsonResult list(BrandQuery query) {
        return brandService.getList(query);
    }

    /**
     * 添加记录
     *
     * @param entity 实体对象
     * @return
     */
//    @RequiresPermissions("sys:brand:add")
    @Log(title = "商品品牌", businessType = BusinessType.INSERT)
    @ResponseBody
    @PostMapping("/add")
    public JsonResult add(@RequestBody Brand entity) {
        return brandService.edit(entity);
    }

    /**
     * 修改记录
     *
     * @param entity 实体对象
     * @return
     */
//    @RequiresPermissions("sys:brand:update")
    @Log(title = "商品品牌", businessType = BusinessType.UPDATE)
    @ResponseBody
    @PostMapping("/update")
    public JsonResult update(@RequestBody Brand entity) {
        return brandService.edit(entity);
    }

    /**
     * 获取记录详情
     *
     * @param id    记录ID
     * @param model 模型
     * @return
     */
    @Override
    public String edit(Integer id, Model model) {
        Map<String, Object> info = new HashMap<>();
        if (id != null && id > 0) {
            info = brandService.info(id);
        }
        model.addAttribute("info", info);
        return super.edit(id, model);
    }

    /**
     * 删除记录
     *
     * @param id 记录ID
     * @return
     */
//    @RequiresPermissions("sys:brand:delete")
    @Log(title = "商品品牌", businessType = BusinessType.DELETE)
    @ResponseBody
    @GetMapping("/delete/{id}")
    public JsonResult delete(@PathVariable("id") Integer id) {
        return brandService.deleteById(id);
    }

    /**
     * 批量删除
     *
     * @param ids 记录ID(多个使用逗号","分隔)
     * @return
     */
//    @RequiresPermissions("sys:brand:batchDelete")
    @Log(title = "商品品牌", businessType = BusinessType.BATCH_DELETE)
    @ResponseBody
    @GetMapping("/batchDelete/{ids}")
    public JsonResult batchDelete(@PathVariable("ids") String ids) {
        return brandService.deleteByIds(ids);
    }

    /**
     * 设置状态
     *
     * @param entity 实体对象
     * @return
     */
//    @RequiresPermissions("sys:brand:status")
    @Log(title = "商品品牌", businessType = BusinessType.STATUS)
    @ResponseBody
    @PostMapping("/setStatus")
    public JsonResult setStatus(@RequestBody Brand entity) {
        return brandService.setStatus(entity);
    }
}
