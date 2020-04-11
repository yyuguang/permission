package com.lnzz.service;

import com.lnzz.pojo.SysUser;

import java.util.List;

/**
 * ClassName：SysRoleUserService
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/9 17:20
 * @Description:
 */
public interface SysRoleUserService {

    List<SysUser> getListByRoleId(int roleId);

    void changeRoleUsers(int roleId, List<Integer> userIdList);

}
