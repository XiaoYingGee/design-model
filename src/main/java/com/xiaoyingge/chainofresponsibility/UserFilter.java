package com.xiaoyingge.chainofresponsibility;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/24 0:39
 */
public class UserFilter implements Filter {

    private Filter next;

    @Override
    public void doFilter () {
        System.out.println("用户身份认证通过");
        //处理成功，向后传递
        next.doFilter();
    }

    @Override
    public void setNext (Filter filter) {
        this.next = filter;
    }
}
