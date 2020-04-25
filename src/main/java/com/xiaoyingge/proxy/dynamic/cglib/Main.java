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
        //设置代理类的父类为Man
        //所以final类型的类没有子类，就无法通过cglib处理
        enhancer.setSuperclass(Man.class);
        //设置代理的回调函数
        enhancer.setCallback(new ManInterceptor());
        //创建出Man类的代理子类
        Man man = (Man) enhancer.create();
        man.run();
    }
}
