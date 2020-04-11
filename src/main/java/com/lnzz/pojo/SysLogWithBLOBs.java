package com.lnzz.pojo;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class SysLogWithBLOBs extends SysLog {
    private String oldValue;

    private String newValue;
}