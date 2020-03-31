package com.lnzz.beans;

import com.google.common.collect.Lists;
import lombok.*;

import java.util.List;

/**
 * ClassName：PageResult
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/3/31 16:24
 * @Description:
 */
@Data
@Builder
public class PageResult<T> {

    private List<T> data = Lists.newArrayList();

    private int total = 0;
}
