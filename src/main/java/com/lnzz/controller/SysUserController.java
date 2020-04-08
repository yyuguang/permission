package com.lnzz.controller;

import com.lnzz.beans.PageQuery;
import com.lnzz.beans.PageResult;
import com.lnzz.common.JsonData;
import com.lnzz.param.UserParam;
import com.lnzz.pojo.SysUser;
import com.lnzz.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * ClassName：SysUserController
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/6 14:22
 * @Description:
 */
@Controller
@RequestMapping("/sys/user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @PostMapping("/save.json")
    @ResponseBody
    public JsonData saveUser(UserParam param) {
        sysUserService.save(param);
        return JsonData.success();
    }

    @PostMapping("/update.json")
    @ResponseBody
    public JsonData updateUser(UserParam param) {
        sysUserService.update(param);
        return JsonData.success();
    }

    @RequestMapping("/page.json")
    @ResponseBody
    public JsonData page(@RequestParam("deptId") int deptId, PageQuery pageQuery) {
        PageResult<SysUser> result = sysUserService.getPageByDeptId(deptId, pageQuery);
        return JsonData.success(result);
    }
}