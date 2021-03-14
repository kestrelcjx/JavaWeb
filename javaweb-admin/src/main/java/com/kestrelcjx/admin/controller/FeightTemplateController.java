package com.kestrelcjx.admin.controller;

import com.kestrelcjx.admin.entity.FeightTemplate;
import com.kestrelcjx.admin.query.FeightTemplateQuery;
import com.kestrelcjx.admin.service.IFeightTemplateService;
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
 * 运费模版 控制器
 */
@Controller
@RequestMapping("/feighttemplate")
public class FeightTemplateController extends BaseController {
    @Autowired
    private IFeightTemplateService feightTemplateService;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
//    @RequiresPermissions("sys:feighttemplate:list")
    @ResponseBody
    @PostMapping("/list")
    public JsonResult list(FeightTemplateQuery query) {
        return feightTemplateService.getList(query);
    }

    /**
     * 添加记录
     *
     * @param entity 实体对象
     * @return
     */
//    @RequiresPermissions("sys:feighttemplate:add")
    @Log(title = "运费模版", businessType = BusinessType.INSERT)
    @ResponseBody
    @PostMapping("/add")
    public JsonResult add(@RequestBody FeightTemplate entity) {
        return feightTemplateService.edit(entity);
    }

    /**
     * 修改记录
     *
     * @param entity 实体对象
     * @return
     */
//    @RequiresPermissions("sys:feighttemplate:update")
    @Log(title = "运费模版", businessType = BusinessType.UPDATE)
    @ResponseBody
    @PostMapping("/update")
    public JsonResult update(@RequestBody FeightTemplate entity) {
        return feightTemplateService.edit(entity);
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
            info = feightTemplateService.info(id);
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
//    @RequiresPermissions("sys:feighttemplate:delete")
    @Log(title = "运费模版", businessType = BusinessType.DELETE)
    @ResponseBody
    @GetMapping("/delete/{id}")
    public JsonResult delete(@PathVariable("id") Integer id) {
        return feightTemplateService.deleteById(id);
    }

    /**
     * 批量删除
     *
     * @param ids 记录ID(多个使用逗号","分隔)
     * @return
     */
//    @RequiresPermissions("sys:feighttemplate:batchDelete")
    @Log(title = "运费模版", businessType = BusinessType.BATCH_DELETE)
    @ResponseBody
    @GetMapping("/batchDelete/{ids}")
    public JsonResult batchDelete(@PathVariable("ids") String ids) {
        return feightTemplateService.deleteByIds(ids);
    }

}
