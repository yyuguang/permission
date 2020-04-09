package com.lnzz.service;

import java.util.List;

/**
 * ClassName：SysRoleAclService
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/9 17:19
 * @Description:
 */
public interface SysRoleAclService {

    void changeRoleAcls(Integer roleId, List<Integer> aclIdList);

    void updateRoleAcls(int roleId, List<Integer> aclIdList);

    void saveRoleAclLog(int roleId, List<Integer> before, List<Integer> after);
}
