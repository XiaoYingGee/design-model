package com.xiaoyingge.singleton;

/**
 * 按需加载对象，引入synchronized代码块
 * 问题：还是会引起错误，实例化多个对象
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/18 18:21
 */
public class Singleton5 {

    /**
     * static final 会在类加载过程中实例化，因此只会执行一次Singleton1
     */
    private static Singleton5 INSTANCE;

    /**
     * 禁止使用new
     */
    private Singleton5 () {

    }

    public static Singleton5 getInstance () {

        if (INSTANCE == null) {
            //加 sleep 只是为了让问题容易暴露出来
            synchronized (Singleton5.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Singleton5();
            }
        }
        return INSTANCE;
    }

    public static void main (String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Singleton5.getInstance().hashCode())).start();
        }

    }
}
