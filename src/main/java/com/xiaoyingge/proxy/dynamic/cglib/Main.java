package com.xiaoyingge.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/25 15:50
 */
public class Main {

    public static void main (String[] args) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Man.class);
        enhancer.setCallback(new ManInterceptor());
        Man man = (Man) enhancer.create();
        man.run();
    }
}
