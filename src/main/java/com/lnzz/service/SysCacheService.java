package com.lnzz.service;

import com.lnzz.beans.CacheKeyConstants;

/**
 * ClassName：SysCacheService
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/4/11 15:02
 * @Description
 */
public interface SysCacheService {

    /**
     * 保存Cache
     *
     * @param toSavedValue
     * @param timeoutSeconds
     * @param prefix
     */
    void saveCache(String toSavedValue, int timeoutSeconds, CacheKeyConstants prefix);

    /**
     * 保存Cache
     * @param toSavedValue
     * @param timeoutSeconds
     * @param prefix
     * @param keys
     */
    void saveCache(String toSavedValue, int timeoutSeconds, CacheKeyConstants prefix, String... keys);

    /**
     * 获取Cache
     *
     * @param prefix
     * @param keys
     * @return
     */
    String getFromCache(CacheKeyConstants prefix, String... keys);
}
