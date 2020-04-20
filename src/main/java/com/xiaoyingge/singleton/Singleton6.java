package com.xiaoyingge.singleton;

/**
 * 双重检查,能保证线程安全，很多源码可以看到运用
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/18 18:21
 */
public class Singleton6 {

    /**
     * static final 会在类加载过程中实例化，因此只会执行一次Singleton1
     */
    private static volatile Singleton6 INSTANCE;

    /**
     * 禁止使用new
     */
    private Singleton6 () {

    }

    public static Singleton6 getInstance () {

        if (INSTANCE == null) {
            //加 sleep 只是为了让问题容易暴露出来
            synchronized (Singleton6.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Singleton6();
                }
            }
        }
        return INSTANCE;
    }
}
