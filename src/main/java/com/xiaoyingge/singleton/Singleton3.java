package com.xiaoyingge.singleton;

/**
 * 按需加载对象，但是引入了线程不安全问题
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/18 18:21
 */
public class Singleton3 {

    /**
     * static final 会在类加载过程中实例化，因此只会执行一次Singleton1
     */
    private static Singleton3 INSTANCE;

    /**
     * 禁止使用new
     */
    private Singleton3 () {

    }

    public static Singleton3 getInstance () {

        if (INSTANCE == null) {
            //加 sleep 只是为了让问题容易暴露出来
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }

    public static void main (String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Singleton3.getInstance().hashCode())).start();
        }

    }
}
