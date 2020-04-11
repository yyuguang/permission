package com.lnzz.param;

import lombok.Data;

/**
 * ClassName：SearchLogParam
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/9 9:29
 * @Description:
 */
@Data
public class SearchLogParam {
    private Integer type;

    private String beforeSeg;

    private String afterSeg;

    private String operator;

    private String fromTime;

    private String toTime;
}
