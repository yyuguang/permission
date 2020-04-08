package com.lnzz.service;

import com.lnzz.beans.PageQuery;
import com.lnzz.beans.PageResult;
import com.lnzz.param.UserParam;
import com.lnzz.pojo.SysUser;

/**
 * ClassName：SysUserService
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/6 14:24
 * @Description:
 */
public interface SysUserService {
    /**
     * 保存用户
     *
     * @param param
     */
    void save(UserParam param);

    /**
     * 更新用户
     *
     * @param param
     */
    void update(UserParam param);

    /**
     * 查询用户信息
     *
     * @param keyword
     * @return
     */
    SysUser findByKeyWord(String keyword);

    /**
     * 通过部门id查询分页
     *
     * @param deptId
     * @param pageQuery
     * @return
     */
    PageResult<SysUser> getPageByDeptId(int deptId, PageQuery pageQuery);
}
