package com.lnzz.common;

import com.lnzz.pojo.SysUser;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName：RequestHolder
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/3/31 16:19
 * @Description:
 */
public class RequestHolder {

    private static final ThreadLocal<SysUser> userHolder = new ThreadLocal<SysUser>();

    private static final ThreadLocal<HttpServletRequest> requestHolder = new ThreadLocal<HttpServletRequest>();

    public static void add(SysUser sysUser) {
        userHolder.set(sysUser);
    }

    public static void add(HttpServletRequest request) {
        requestHolder.set(request);
    }

    public static SysUser getCurrentUser() {
        return userHolder.get();
    }

    public static HttpServletRequest getCurrentRequest() {
        return requestHolder.get();
    }

    public static void remove() {
        userHolder.remove();
        requestHolder.remove();
    }
}
