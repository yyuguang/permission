package com.lnzz.dao;

import com.lnzz.pojo.SysAcl;

/**
 * ClassName：SysAclMapper
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/2 14:35
 * @Description:
 */
public interface SysAclMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysAcl record);

    int insertSelective(SysAcl record);

    SysAcl selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysAcl record);

    int updateByPrimaryKey(SysAcl record);
}