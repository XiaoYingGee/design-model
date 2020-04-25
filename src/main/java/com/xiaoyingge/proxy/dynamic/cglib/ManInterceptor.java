package com.xiaoyingge.proxy.dynamic.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/25 15:52
 */
public class ManInterceptor implements MethodInterceptor {

    @Override
    public Object intercept (Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始热身吧");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("开始拉伸吧");
        return invoke;
    }
}
