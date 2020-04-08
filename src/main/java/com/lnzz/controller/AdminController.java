package com.lnzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ClassName：AdminController
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/6 14:58
 * @Description:
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/index.page")
    public ModelAndView index() {
        return new ModelAndView("admin");
    }
}
