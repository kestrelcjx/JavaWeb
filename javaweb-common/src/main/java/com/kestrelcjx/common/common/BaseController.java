package com.kestrelcjx.common.common;

import com.kestrelcjx.common.utils.StringUtils;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 基类控制器
 */
public class BaseController {
    /**
     * 构造函数
     */
    public BaseController() {

    }

    /**
     * 列表页
     *
     * @param model
     * @return
     */
    @GetMapping("/index")
    public String index(Model model) {
        return this.render();
    }

    /**
     * 获取记录详情
     *
     * @param id    记录ID
     * @param model 模型
     * @return
     */
    @GetMapping("/edit")
    public String edit(Integer id, Model model) {
        return this.render();
    }

    /**
     * 渲染模板
     *
     * @param tql 模板路径
     * @return
     */
    public String render(String tql) {
        if (StringUtils.isEmpty(tql)) {
            HttpServletRequest request =
                    ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            String url = request.getRequestURI();
            return url.substring(1);
        } else {
            return tql;
        }
    }

    /**
     * 渲染模板
     *
     * @return
     */
    public String render() {
        return this.render("");
    }
}
