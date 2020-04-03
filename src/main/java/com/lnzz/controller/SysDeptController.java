package com.lnzz.controller;

import com.lnzz.common.JsonData;
import com.lnzz.dto.DeptLevelDto;
import com.lnzz.param.DeptParam;
import com.lnzz.service.SysDeptService;
import com.lnzz.service.SysTreeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
@Api(value = "部门相关", tags = {"部门相关接口"})
@Slf4j
public class SysDeptController {

    @Autowired
    private SysDeptService sysDeptService;
    @Autowired
    private SysTreeService sysTreeService;

    @ApiOperation(value = "新增部门", notes = "新增部门", httpMethod = "POST")
    @PostMapping("/save.json")
    @ResponseBody
    public JsonData saveDept(@RequestBody DeptParam param) {
        sysDeptService.save(param);
        return JsonData.success();
    }

    @ApiOperation(value = "查询部门树", notes = "查询部门树", httpMethod = "GET")
    @GetMapping("/tree.json")
    @ResponseBody
    public JsonData tree() {
        List<DeptLevelDto> dtoList = sysTreeService.deptTree();
        return JsonData.success(dtoList);
    }

    @ApiOperation(value = "编辑部门", notes = "编辑部门", httpMethod = "PUT")
    @PutMapping("/update.json")
    @ResponseBody
    public JsonData updateDept(@RequestBody DeptParam param) {
        sysDeptService.update(param);
        return JsonData.success();
    }
}
