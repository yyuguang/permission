package com.lnzz.service;

import com.lnzz.param.RoleParam;
import com.lnzz.pojo.SysRole;
import com.lnzz.pojo.SysUser;

import java.util.List;

/**
 * ClassName：SysRoleService
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/9 15:50
 * @Description:
 */
public interface SysRoleService {

    void save(RoleParam param);

    void update(RoleParam param);

    List<SysRole> getAll();

    List<SysRole> getRoleListByUserId(int userId);

    List<SysRole> getRoleListByAclId(int aclId);

    List<SysUser> getUserListByRoleList(List<SysRole> roleList);
}
