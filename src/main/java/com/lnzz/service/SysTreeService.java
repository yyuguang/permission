package com.lnzz.service;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.lnzz.dto.AclModuleLevelDto;
import com.lnzz.dto.DeptLevelDto;
import org.apache.commons.collections.CollectionUtils;

import java.util.Collections;
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
     * deptTree
     *
     * @return
     */
    List<DeptLevelDto> deptTree();

    /**
     * aclModuleTree
     *
     * @return
     */
    List<AclModuleLevelDto> aclModuleTree();

    /**
     * aclModuleListToTree
     *
     * @param dtoList
     * @return
     */
    List<AclModuleLevelDto> aclModuleListToTree(List<AclModuleLevelDto> dtoList);

    /**
     * transformAclModuleTree
     *
     * @param dtoList
     * @param level
     * @param levelAclModuleMap
     */
    void transformAclModuleTree(List<AclModuleLevelDto> dtoList, String level, Multimap<String, AclModuleLevelDto> levelAclModuleMap);

    /**
     * 权限列表
     *
     * @param roleId
     * @return
     */
    List<AclModuleLevelDto> roleTree(int roleId);

    /**
     * 用户权限数据
     * @param userId
     * @return
     */
    List<AclModuleLevelDto> userAclTree(int userId);
}
