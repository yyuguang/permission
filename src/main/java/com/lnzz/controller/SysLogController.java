package com.lnzz.controller;

import com.lnzz.beans.PageQuery;
import com.lnzz.common.JsonData;
import com.lnzz.param.SearchLogParam;
import com.lnzz.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * ClassName：SysLogController
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/11 15:52
 * @Description
 */
@Controller
@RequestMapping("/sys/log")
public class SysLogController {
    @Autowired
    private SysLogService sysLogService;

    @RequestMapping("/log.page")
    public ModelAndView page() {
        return new ModelAndView("log");
    }

    @RequestMapping("/recover.json")
    @ResponseBody
    public JsonData recover(@RequestParam("id") int id) {
        sysLogService.recover(id);
        return JsonData.success();
    }

    @RequestMapping("/page.json")
    @ResponseBody
    public JsonData searchPage(SearchLogParam param, PageQuery page) {
        return JsonData.success(sysLogService.searchPageList(param, page));
    }
}
