package com.lnzz.dto;

import com.lnzz.pojo.SysAcl;
import lombok.Data;
import org.springframework.beans.BeanUtils;

/**
 * ClassName：AclDto
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/9 9:16
 * @Description:
 */
@Data
public class AclDto extends SysAcl {

    /**
     * 是否要默认选中
     */
    private boolean checked = false;

    /**
     * 是否有权限操作
     */
    private boolean hasAcl = false;

    public static AclDto adapt(SysAcl acl) {
        AclDto dto = new AclDto();
        BeanUtils.copyProperties(acl, dto);
        return dto;
    }
}
