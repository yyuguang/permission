package com.lnzz.service;

import com.lnzz.param.AclModuleParam;

/**
 * ClassName：SysAclModuleService
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/9 8:57
 * @Description:
 */
public interface SysAclModuleService {
    /**
     * save
     *
     * @param param
     */
    void save(AclModuleParam param);

    /**
     * update
     *
     * @param param
     */
    void update(AclModuleParam param);

    /**
     * delete
     *
     * @param aclModuleId
     */
    void delete(int aclModuleId);
}
