package com.lnzz.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName：SysLogWithBLOBs
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/2 14:35
 * @Description:
 */
@Data
@NoArgsConstructor
public class SysLogWithBLOBs extends SysLog {
    private String oldValue;

    private String newValue;
}