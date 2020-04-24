package com.xiaoyingge.chainofresponsibility;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/24 0:39
 */
public class PermissionFilter implements Filter {

    private Filter next;

    @Override
    public void doFilter () {
        System.out.println("当前用户未注册，不允许访问");
        //处理截止，不再调用next.doFilter;
    }

    @Override
    public void setNext (Filter filter) {
        this.next = filter;
    }
}
