package com.lnzz.dto;

import lombok.Data;

import java.util.Date;

/**
 * ClassName：SearchLogDto
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/9 9:17
 * @Description:
 */
@Data
public class SearchLogDto {
    private Integer type;

    private String beforeSeg;

    private String afterSeg;

    private String operator;

    private Date fromTime;

    private Date toTime;
}
