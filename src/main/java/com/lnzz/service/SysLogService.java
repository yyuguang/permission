package com.lnzz.service;

import com.lnzz.beans.PageQuery;
import com.lnzz.beans.PageResult;
import com.lnzz.param.SearchLogParam;
import com.lnzz.pojo.*;

/**
 * ClassName：SysLogService
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/11 15:52
 * @Description
 */
public interface SysLogService {
    /**
     * 还原
     *
     * @param id
     */
    void recover(int id);

    /**
     * searchPageList
     *
     * @param param
     * @param page
     * @return
     */
    PageResult<SysLogWithBLOBs> searchPageList(SearchLogParam param, PageQuery page);

    /**
     * saveDeptLog
     *
     * @param before
     * @param after
     */
    void saveDeptLog(SysDept before, SysDept after);

    /**
     * saveUserLog
     *
     * @param before
     * @param after
     */
    void saveUserLog(SysUser before, SysUser after);

    /**
     * saveAclModuleLog
     *
     * @param before
     * @param after
     */
    void saveAclModuleLog(SysAclModule before, SysAclModule after);

    /**
     * saveAclLog
     *
     * @param before
     * @param after
     */
    void saveAclLog(SysAcl before, SysAcl after);

    /**
     * saveRoleLog
     *
     * @param before
     * @param after
     */
    void saveRoleLog(SysRole before, SysRole after);
}
