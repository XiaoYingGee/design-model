package com.xiaoyingge.chainofresponsibility;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/24 0:38
 */
public interface Filter {

    void doFilter ();

    void setNext (Filter filter);

}
