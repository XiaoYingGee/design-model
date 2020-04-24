package com.xiaoyingge.chainofresponsibility;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/24 0:45
 */
public class Main {

    public static void main (String[] args) {
        //组装成链,这个过程可以灵活配置
        Filter userFilter = new UserFilter();
        Filter permissionFilter = new PermissionFilter();
        userFilter.setNext(permissionFilter);
        //执行头
        userFilter.doFilter();
    }
}
