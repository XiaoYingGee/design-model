package com.xiaoyingge.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的逻辑增强实现
 *
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
        //调用了被代理对象的真实业务方法，在方法前面都可以进行增强处理
        Object invoke = method.invoke(human, args);
        System.out.println("开始拉伸");
        return invoke;
    }
}
