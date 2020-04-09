package com.lnzz.dao;

import com.lnzz.pojo.SysAclModule;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName：SysAclModuleMapper
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/2 14:35
 * @Description:
 */
public interface SysAclModuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysAclModule record);

    int insertSelective(SysAclModule record);

    SysAclModule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAclModule record);

    int updateByPrimaryKey(SysAclModule record);

    /**
     * countByNameAndParentId
     *
     * @param parentId
     * @param name
     * @param id
     * @return
     */
    int countByNameAndParentId(@Param("parentId") Integer parentId, @Param("name") String name, @Param("id") Integer id);

    /**
     * getChildAclModuleListByLevel
     *
     * @param level
     * @return
     */
    List<SysAclModule> getChildAclModuleListByLevel(@Param("level") String level);

    /**
     * 批量更新
     *
     * @param sysAclModuleList
     */
    void batchUpdateLevel(@Param("sysAclModuleList") List<SysAclModule> sysAclModuleList);

    /**
     * getAllAclModule
     *
     * @return
     */
    List<SysAclModule> getAllAclModule();

    /**
     * countByParentId
     *
     * @param aclModuleId
     * @return
     */
    int countByParentId(@Param("aclModuleId") int aclModuleId);
}