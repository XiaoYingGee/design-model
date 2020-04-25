package com.xiaoyingge.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/25 15:37
 */
public class HumanInvocationHandler implements InvocationHandler {

    private Human human;

    public HumanInvocationHandler (Human human) {
        this.human = human;
    }

    @Override
    public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始热身");
        Object invoke = method.invoke(human, args);
        System.out.println("开始拉伸");
        return invoke;
    }
}
