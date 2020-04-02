package com.lnzz.dto;

import com.google.common.collect.Lists;
import com.lnzz.pojo.SysDept;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * ClassName：DeptLevelDto
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/2 16:46
 * @Description:
 */
@Data
public class DeptLevelDto extends SysDept {

    private List<DeptLevelDto> deptList = Lists.newArrayList();

    public static DeptLevelDto adapt(SysDept dept) {
        DeptLevelDto dto = new DeptLevelDto();
        BeanUtils.copyProperties(dept, dto);
        return dto;
    }
}
