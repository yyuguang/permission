package com.lnzz.controller;

import com.lnzz.common.JsonData;
import com.lnzz.dto.DeptLevelDto;
import com.lnzz.param.DeptParam;
import com.lnzz.service.SysDeptService;
import com.lnzz.service.SysTreeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * ClassName：SysDeptController
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/2 15:11
 * @Description:
 */
@Controller
@RequestMapping("/sys/dept")
@Slf4j
public class SysDeptController {

    @Autowired
    private SysDeptService sysDeptService;
    @Autowired
    private SysTreeService sysTreeService;

    @GetMapping("/dept.page")
    public ModelAndView page(){
        return new ModelAndView("dept");
    }

    @PostMapping("/save.json")
    @ResponseBody
    public JsonData saveDept(DeptParam param) {
        sysDeptService.save(param);
        return JsonData.success();
    }

    @GetMapping("/tree.json")
    @ResponseBody
    public JsonData tree() {
        List<DeptLevelDto> dtoList = sysTreeService.deptTree();
        return JsonData.success(dtoList);
    }

    @PostMapping("/update.json")
    @ResponseBody
    public JsonData updateDept(DeptParam param) {
        sysDeptService.update(param);
        return JsonData.success();
    }
}
