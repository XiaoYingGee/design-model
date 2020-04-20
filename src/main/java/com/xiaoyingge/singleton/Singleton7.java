package com.xiaoyingge.singleton;

/**
 * 静态内部类
 * JVM加载时不会加载内部类，因此可以实现懒汉式
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/18 18:21
 */
public class Singleton7 {

    /**
     * 禁止使用new
     */
    private Singleton7 () {

    }

    public static Singleton7 getInstance () {

        return Singleton7Holder.INSTANCE;
    }

    private static class Singleton7Holder {

        private static final Singleton7 INSTANCE = new Singleton7();
    }

}
