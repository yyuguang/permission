package com.lnzz.dto;

import com.google.common.collect.Lists;
import com.lnzz.pojo.SysAclModule;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * ClassName：AclModuleLevelDto
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/9 9:16
 * @Description:
 */
@Data
public class AclModuleLevelDto extends SysAclModule {

    private List<AclModuleLevelDto> aclModuleList = Lists.newArrayList();

    private List<AclDto> aclList = Lists.newArrayList();

    public static AclModuleLevelDto adapt(SysAclModule aclModule) {
        AclModuleLevelDto dto = new AclModuleLevelDto();
        BeanUtils.copyProperties(aclModule, dto);
        return dto;
    }
}
