package com.lnzz.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName：HelloController
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/3/31 17:35
 * @Description:
 */
@Controller
@RequestMapping("/")
@Slf4j
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        log.info("hello");
        return "hello world";
    }
}
