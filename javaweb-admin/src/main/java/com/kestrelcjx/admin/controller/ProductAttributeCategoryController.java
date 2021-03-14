package com.kestrelcjx.admin.controller;

import com.kestrelcjx.admin.entity.ProductAttributeCategory;
import com.kestrelcjx.admin.query.ProductAttributeCategoryQuery;
import com.kestrelcjx.admin.service.IProductAttributeCategoryService;
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
 * 产品属性分类 控制器
 */
@Controller
@RequestMapping("/productattributecategory")
public class ProductAttributeCategoryController extends BaseController {
    @Autowired
    private IProductAttributeCategoryService productAttributeCategoryService;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
//    @RequiresPermissions("sys:productattributecategory:list")
    @ResponseBody
    @PostMapping("/list")
    public JsonResult list(ProductAttributeCategoryQuery query) {
        return productAttributeCategoryService.getList(query);
    }

    /**
     * 添加记录
     *
     * @param entity 实体对象
     * @return
     */
//    @RequiresPermissions("sys:productattributecategory:add")
    @Log(title = "产品属性分类", businessType = BusinessType.INSERT)
    @ResponseBody
    @PostMapping("/add")
    public JsonResult add(@RequestBody ProductAttributeCategory entity) {
        return productAttributeCategoryService.edit(entity);
    }

    /**
     * 修改记录
     *
     * @param entity 实体对象
     * @return
     */
//    @RequiresPermissions("sys:productattributecategory:update")
    @Log(title = "产品属性分类", businessType = BusinessType.UPDATE)
    @ResponseBody
    @PostMapping("/update")
    public JsonResult update(@RequestBody ProductAttributeCategory entity) {
        return productAttributeCategoryService.edit(entity);
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
            info = productAttributeCategoryService.info(id);
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
//    @RequiresPermissions("sys:productattributecategory:delete")
    @Log(title = "产品属性分类", businessType = BusinessType.DELETE)
    @ResponseBody
    @GetMapping("/delete/{id}")
    public JsonResult delete(@PathVariable("id") Integer id) {
        return productAttributeCategoryService.deleteById(id);
    }

    /**
     * 批量删除
     *
     * @param ids 记录ID(多个使用逗号","分隔)
     * @return
     */
//    @RequiresPermissions("sys:productattributecategory:batchDelete")
    @Log(title = "产品属性分类", businessType = BusinessType.BATCH_DELETE)
    @ResponseBody
    @GetMapping("/batchDelete/{ids}")
    public JsonResult batchDelete(@PathVariable("ids") String ids) {
        return productAttributeCategoryService.deleteByIds(ids);
    }

}
