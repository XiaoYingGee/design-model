package com.xiaoyingge.singleton;

/**
 * 枚举本质上是个final类,定义的枚举值实际上就是一个枚举类的不可变对象
 * 在Enum类加载的时候，就已经实例化了这个对象,且枚举对象不可以new
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/18 18:21
 */
public enum Singleton8 {
    INSTANCE;

    public static Singleton8 getInstance () {
        return INSTANCE;
    }

    public String doMyWork () {
        return "this is my job";
    }

    public static void main (String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Singleton8.INSTANCE.doMyWork())).start();
        }

    }
}
