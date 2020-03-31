package com.lnzz.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * ClassName：LevelUtil
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/3/31 16:23
 * @Description:
 */
public class LevelUtil {

    public final static String SEPARATOR = ".";

    public final static String ROOT = "0";


    public static String calculateLevel(String parentLevel, int parentId) {
        if (StringUtils.isBlank(parentLevel)) {
            return ROOT;
        } else {
            return StringUtils.join(parentLevel, SEPARATOR, parentId);
        }
    }
}

