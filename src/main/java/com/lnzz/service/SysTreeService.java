package com.lnzz.service;

import com.lnzz.dto.DeptLevelDto;

import java.util.List;

/**
 * ClassName：SysTreeService
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/2 16:49
 * @Description:
 */
public interface SysTreeService {

    /**
     * 返回部门树
     *
     * @return
     */
    List<DeptLevelDto> deptTree();
}
