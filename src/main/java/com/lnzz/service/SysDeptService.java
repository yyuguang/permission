package com.lnzz.service;

import com.lnzz.param.DeptParam;

/**
 * ClassName：SysDeptService
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/2 15:13
 * @Description:
 */
public interface SysDeptService {
    /**
     * 保存部门信息
     *
     * @param param
     */
    void save(DeptParam param);

    /**
     * 更新部门信息
     *
     * @param param
     */
    void update(DeptParam param);

    /**
     * 删除部门
     *
     * @param deptId
     */
    void delete(int deptId);
}
