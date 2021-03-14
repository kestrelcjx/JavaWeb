package com.kestrelcjx.admin.controller;

import com.kestrelcjx.admin.dto.DeleteSkuDto;
import com.kestrelcjx.admin.dto.GenerateSkuDto;
import com.kestrelcjx.admin.dto.UpdateSkuDto;
import com.kestrelcjx.admin.entity.Product;
import com.kestrelcjx.admin.entity.ProductAttributeValue;
import com.kestrelcjx.admin.entity.ProductSku;
import com.kestrelcjx.admin.query.ProductQuery;
import com.kestrelcjx.admin.service.IProductAttributeValueService;
import com.kestrelcjx.admin.service.IProductService;
import com.kestrelcjx.admin.service.IProductSkuService;
import com.kestrelcjx.common.annotation.Log;
import com.kestrelcjx.common.common.BaseController;
import com.kestrelcjx.common.enums.BusinessType;
import com.kestrelcjx.common.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 商品 控制器
 */
@Controller
@RequestMapping("/product")
public class ProductController extends BaseController {
    @Autowired
    private IProductService productService;
    @Autowired
    private IProductAttributeValueService productAttributeValueService;
    @Autowired
    private IProductSkuService productSkuService;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
//    @RequiresPermissions("sys:product:list")
    @ResponseBody
    @PostMapping("/list")
    public JsonResult list(ProductQuery query) {
        return productService.getList(query);
    }

    /**
     * 添加记录
     *
     * @param entity 实体对象
     * @return
     */
//    @RequiresPermissions("sys:product:add")
    @Log(title = "商品", businessType = BusinessType.INSERT)
    @ResponseBody
    @PostMapping("/add")
    public JsonResult add(@RequestBody Product entity) {
        return productService.edit(entity);
    }

    /**
     * 修改记录
     *
     * @param entity 实体对象
     * @return
     */
//    @RequiresPermissions("sys:product:update")
    @Log(title = "商品", businessType = BusinessType.UPDATE)
    @ResponseBody
    @PostMapping("/update")
    public JsonResult update(@RequestBody Product entity) {
        return productService.edit(entity);
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
            info = productService.info(id);
        }
        model.addAttribute("info", info);
        // 获取SKU规格属性列表
        List<ProductAttributeValue> productAttributeValueList = productAttributeValueService.getProductAttributeValueByProductId(id);
        model.addAttribute("productAttributeValueList", productAttributeValueList);
        // 获取SKU列表
        List<ProductSku> productSkuList = productSkuService.getProductSkuList(id);
        model.addAttribute("productSkuList", productSkuList);
        return super.edit(id, model);
    }

    /**
     * 删除记录
     *
     * @param id 记录ID
     * @return
     */
//    @RequiresPermissions("sys:product:delete")
    @Log(title = "商品", businessType = BusinessType.DELETE)
    @ResponseBody
    @GetMapping("/delete/{id}")
    public JsonResult delete(@PathVariable("id") Integer id) {
        return productService.deleteById(id);
    }

    /**
     * 批量删除
     *
     * @param ids 记录ID(多个使用逗号","分隔)
     * @return
     */
//    @RequiresPermissions("sys:product:batchDelete")
    @Log(title = "商品", businessType = BusinessType.BATCH_DELETE)
    @ResponseBody
    @GetMapping("/batchDelete/{ids}")
    public JsonResult batchDelete(@PathVariable("ids") String ids) {
        return productService.deleteByIds(ids);
    }

    /**
     * 设置状态
     *
     * @param entity 实体对象
     * @return
     */
//    @RequiresPermissions("sys:product:status")
    @Log(title = "商品", businessType = BusinessType.STATUS)
    @ResponseBody
    @PostMapping("/setStatus")
    public JsonResult setStatus(@RequestBody Product entity) {
        return productService.setStatus(entity);
    }

    /**
     * 生成SKU列表
     *
     * @param productSkuDto 参数
     * @return
     */
    @ResponseBody
    @PostMapping("/generateSku")
    public JsonResult generateSku(@RequestBody GenerateSkuDto productSkuDto) {
        return productService.generateSku(productSkuDto);
    }

    /**
     * 更新SKU列表
     *
     * @param updateSkuDto 参数
     * @return
     */
    @ResponseBody
    @PostMapping("/updateSku")
    public JsonResult updateSku(@RequestBody UpdateSkuDto updateSkuDto) {
        return productService.updateSku(updateSkuDto);
    }

    /**
     * 删除SKU列表
     *
     * @param deleteSkuDto 参数
     * @return
     */
    @ResponseBody
    @PostMapping("/deleteSku")
    public JsonResult deleteSku(@RequestBody DeleteSkuDto deleteSkuDto) {
        return productService.deleteSku(deleteSkuDto);
    }
}
