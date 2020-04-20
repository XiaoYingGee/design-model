package com.xiaoyingge.singleton;

/**
 * 按需加载对象，引入synchronized，完成懒汉模式
 * 问题：性能下降
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/18 18:21
 */
public class Singleton4 {

    /**
     * static final 会在类加载过程中实例化，因此只会执行一次Singleton1
     */
    private static Singleton4 INSTANCE;

    /**
     * 禁止使用new
     */
    private Singleton4 () {

    }

    public static synchronized Singleton4 getInstance () {

        if (INSTANCE == null) {
            //加 sleep 只是为了让问题容易暴露出来
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton4();
        }
        return INSTANCE;
    }

    public static void main (String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Singleton4.getInstance().hashCode())).start();
        }

    }
}
