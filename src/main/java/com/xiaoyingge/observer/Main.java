package com.xiaoyingge.observer;

/**
 * 观察者测试
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/24 16:23
 */
public class Main {

    public static void main (String[] args) {

        IronMan ironMan = new IronMan();
        Jarvis jarvisObserver = new Jarvis();
        //注册观察者Jarvis
        ironMan.addWakeupListener(jarvisObserver);
        ironMan.addPhoneCallListener(jarvisObserver);
        //生产事件
        ironMan.wakeupJarvis();
        ironMan.makePhoneCall("pepper");
    }
}
