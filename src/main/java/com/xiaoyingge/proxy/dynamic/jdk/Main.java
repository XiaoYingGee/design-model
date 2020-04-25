package com.xiaoyingge.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/25 15:39
 */
public class Main {

    public static void main (String[] args) {
        Man man = new Man();
        Human proxyInstance = (Human) Proxy.newProxyInstance(Human.class.getClassLoader(), new Class[]{Human.class}, new HumanInvocationHandler(man));
        proxyInstance.run();
    }
}
