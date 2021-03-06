package com.kestrelcjx.system.controller;

import com.kestrelcjx.common.common.BaseController;
import com.kestrelcjx.common.utils.JsonResult;
import com.kestrelcjx.common.utils.ServletUtils;
import com.kestrelcjx.system.entity.Config;
import com.kestrelcjx.system.service.IConfigService;
import com.kestrelcjx.system.service.IConfigWebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/configweb")
public class ConfigWebController extends BaseController {
    @Autowired
    private IConfigService configService;
    @Autowired
    private IConfigWebService configWebService;

    /**
     * 获取系统配置信息
     *
     * @param model
     * @return
     */
    @Override
    public String index(Model model) {
        String tabId = ServletUtils.getParameter("tabId");
        Integer groupId = tabId == null ? 1 : Integer.valueOf(tabId);
        model.addAttribute("tabId", groupId);

        // 获取当前类型配置列表
        List<Config> configList = configService.getConfigListByGroupId(groupId);
        model.addAttribute("configList", configList);
        return this.render();
    }

    /**
     * 编辑配置参数
     *
     * @param map
     * @return
     */
    @ResponseBody
    @PostMapping("/configEdit")
    public JsonResult configEdit(@RequestBody Map<String, Object> map) {
        return configWebService.configEdit(map);
    }
}

