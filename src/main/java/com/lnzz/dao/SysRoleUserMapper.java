package com.lnzz.dao;

import com.lnzz.pojo.SysRoleUser;

/**
 * ClassName：SysRoleUserMapper
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/2 14:35
 * @Description:
 */
public interface SysRoleUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleUser record);

    int insertSelective(SysRoleUser record);

    SysRoleUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysRoleUser record);

    int updateByPrimaryKey(SysRoleUser record);
}