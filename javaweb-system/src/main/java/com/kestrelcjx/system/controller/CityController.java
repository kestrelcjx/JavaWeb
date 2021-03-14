package com.kestrelcjx.system.controller;

import com.kestrelcjx.common.annotation.Log;
import com.kestrelcjx.common.common.BaseController;
import com.kestrelcjx.common.enums.BusinessType;
import com.kestrelcjx.common.utils.JsonResult;
import com.kestrelcjx.system.entity.City;
import com.kestrelcjx.system.query.CityQuery;
import com.kestrelcjx.system.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 城市控制器
 */
@Controller
@RequestMapping("/city")
public class CityController extends BaseController {
    @Autowired
    private ICityService cityService;

    /**
     * 获取数据列表
     *
     * @param query 查询条件
     * @return
     */
//    @RequiresPermissions("sys:city:list")
    @ResponseBody
    @PostMapping("/list")
    public JsonResult list(CityQuery query) {
        return cityService.getList(query);
    }

    /**
     * 添加记录
     *
     * @param entity 实体对象
     * @return
     */
//    @RequiresPermissions("sys:city:add")
    @Log(title = "城市", businessType = BusinessType.INSERT)
    @ResponseBody
    @PostMapping("/add")
    public JsonResult add(@RequestBody City entity) {
        return cityService.edit(entity);
    }

    /**
     * 修改记录
     *
     * @param entity 实体对象
     * @return
     */
//    @RequiresPermissions("sys:city:update")
    @Log(title = "城市", businessType = BusinessType.UPDATE)
    @ResponseBody
    @PostMapping("/update")
    public JsonResult update(@RequestBody City entity) {
        return cityService.edit(entity);
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
            info = cityService.info(id);
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
//    @RequiresPermissions("sys:city:delete")
    @Log(title = "城市", businessType = BusinessType.DELETE)
    @ResponseBody
    @GetMapping("/delete/{id}")
    public JsonResult delete(@PathVariable("id") Integer id) {
        return cityService.deleteById(id);
    }

    /**
     * 批量删除
     *
     * @param ids 记录ID(多个使用逗号","分隔)
     * @return
     */
//    @RequiresPermissions("sys:city:batchDelete")
    @Log(title = "城市", businessType = BusinessType.BATCH_DELETE)
    @ResponseBody
    @GetMapping("/batchDelete/{ids}")
    public JsonResult batchDelete(@PathVariable("ids") String ids) {
        return cityService.deleteByIds(ids);
    }

    /**
     * 获取父级ID获取子级城市
     *
     * @param pid 父级城市ID
     * @return
     */
    @ResponseBody
    @PostMapping("/getCityListByPid")
    public JsonResult getCityListByPid(Integer pid) {
        return cityService.getCityListByPid(pid);
    }
}

