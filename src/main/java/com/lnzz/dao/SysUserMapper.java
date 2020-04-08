package com.lnzz.dao;

import com.lnzz.beans.PageQuery;
import com.lnzz.pojo.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName：SysUserMapper
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/2 14:35
 * @Description:
 */
public interface SysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    /**
     * 查询用户信息
     *
     * @param keyword
     * @return
     */
    SysUser findByKeyWord(@Param("keyword") String keyword);

    /**
     * 根据id查询邮箱
     *
     * @param mail
     * @param id
     * @return
     */
    int countByMail(@Param("mail") String mail, @Param("id") Integer id);

    /**
     * 根据id查询手机
     *
     * @param telephone
     * @param id
     * @return
     */
    int countByTelephone(@Param("telephone") String telephone, @Param("id") Integer id);

    /**
     * 查询部门
     *
     * @param deptId
     * @return
     */
    int countByDeptId(@Param("deptId") int deptId);

    /**
     * getPageByDeptId
     *
     * @param deptId
     * @param page
     * @return
     */
    List<SysUser> getPageByDeptId(@Param("deptId") int deptId, @Param("page") PageQuery page);

    /**
     * getByIdList
     *
     * @param idList
     * @return
     */
    List<SysUser> getByIdList(@Param("idList") List<Integer> idList);

    /**
     * getAll
     *
     * @return
     */
    List<SysUser> getAll();
}