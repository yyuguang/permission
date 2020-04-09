package com.lnzz.service;

import com.lnzz.beans.PageQuery;
import com.lnzz.beans.PageResult;
import com.lnzz.param.AclParam;
import com.lnzz.pojo.SysAcl;

/**
 * ClassName：SysAclService
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/9 9:28
 * @Description:
 */
public interface SysAclService {

    /**
     * save
     *
     * @param param
     */
    void save(AclParam param);

    /**
     * update
     *
     * @param param
     */
    void update(AclParam param);

    /**
     * getPageByAclModuleId
     *
     * @param aclModuleId
     * @param page
     * @return
     */
    PageResult<SysAcl> getPageByAclModuleId(int aclModuleId, PageQuery page);
}
