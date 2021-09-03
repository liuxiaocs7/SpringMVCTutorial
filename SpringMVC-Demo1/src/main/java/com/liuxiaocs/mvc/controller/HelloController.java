package com.liuxiaocs.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    // "/" --> /WEB-INF/templates/index.html
    // @RequestMapping注解是将请求和控制器方法之间创建映射关系
    @RequestMapping(value = "/")
    public String index() {
        // 返回视图名称
        // 去掉前缀和后缀即可获取视图名称
        return "index";
    }
}
