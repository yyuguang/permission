package com.lnzz.dao;

import com.lnzz.pojo.SysDept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName：SysDeptMapper
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/2 14:35
 * @Description:
 */
public interface SysDeptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysDept record);

    int insertSelective(SysDept record);

    SysDept selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysDept record);

    int updateByPrimaryKey(SysDept record);

    /**
     * 获取所有的部门列表
     *
     * @return
     */
    List<SysDept> getAllDept();

    /**
     * 获取子部门level列表
     *
     * @param level
     * @return
     */
    List<SysDept> getChildDeptListByLevel(@Param("level") String level);

    /**
     * 批量更新level
     *
     * @param sysDeptList
     */
    void batchUpdateLevel(@Param("sysDeptList") List<SysDept> sysDeptList);

    /**
     * countByNameAndParentId
     *
     * @param parentId
     * @param deptName
     * @param deptId
     * @return
     */
    int countByNameAndParentId(@Param("parentId") Integer parentId, @Param("deptName") String deptName, @Param("deptId") Integer deptId);
}