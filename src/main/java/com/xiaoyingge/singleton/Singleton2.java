package com.xiaoyingge.singleton;

/**
 * 也属于饿汉式，和第一个没区别
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/18 18:21
 */
public class Singleton2 {

    private static final Singleton2 INSTANCE;

    static {
        INSTANCE = new Singleton2();
    }

    /**
     * 禁止使用new
     */
    private Singleton2 () {

    }

    public static Singleton2 getInstance () {
        return INSTANCE;
    }

    public static void main (String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
