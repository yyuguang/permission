package com.lnzz.service;

import com.lnzz.pojo.SysAcl;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.type.TypeReference;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * ClassName：SysCoreService
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/9 9:27
 * @Description:
 */
public interface SysCoreService {
    /**
     * hasUrlAcl
     *
     * @param url
     * @return
     */
    boolean hasUrlAcl(String url);

    /**
     * 获取当前用户列表
     *
     * @return
     */
    List<SysAcl> getCurrentUserAclList();

    /**
     * 获取当前权限列表
     *
     * @param roleId
     * @return
     */
    List<SysAcl> getRoleAclList(int roleId);

    /**
     * 获取当前用户权限
     *
     * @param userId
     * @return
     */
    List<SysAcl> getUserAclList(int userId);

    List<SysAcl> getCurrentUserAclListFromCache();
}
