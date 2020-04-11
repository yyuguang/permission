package com.lnzz.dao;

import com.lnzz.beans.PageQuery;
import com.lnzz.dto.SearchLogDto;
import com.lnzz.pojo.SysLog;
import com.lnzz.pojo.SysLogWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName：SysLogMapper
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/2 14:35
 * @Description:
 */
public interface SysLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysLogWithBLOBs record);

    int insertSelective(SysLogWithBLOBs record);

    SysLogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysLogWithBLOBs record);

    int updateByPrimaryKey(SysLog record);

    int countBySearchDto(@Param("dto") SearchLogDto dto);

    List<SysLogWithBLOBs> getPageListBySearchDto(@Param("dto") SearchLogDto dto, @Param("page") PageQuery page);
}