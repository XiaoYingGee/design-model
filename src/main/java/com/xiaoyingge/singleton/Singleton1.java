package com.xiaoyingge.singleton;

/**
 * 饿汉式
 * 不管三七二十一，加载一个再说
 * 问题：有可能这个类无需使用，浪费内存空间
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/18 18:21
 */
public class Singleton1 {

    /**
     * static final 会在类加载过程中实例化，因此只会执行一次Singleton1
     */
    private static final Singleton1 INSTANCE = new Singleton1();

    /**
     * 禁止使用new
     */
    private Singleton1 () {

    }

    public static Singleton1 getInstance () {
        return INSTANCE;
    }

    public static void main (String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
