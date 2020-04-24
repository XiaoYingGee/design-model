package com.xiaoyingge.observer;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/24 16:23
 */
public class Main {

    public static void main (String[] args) {

        IronMan ironMan = new IronMan();
        Jarvis jarvisObserver = new Jarvis();
        ironMan.addWakeupListener(jarvisObserver);
        ironMan.addPhoneCallListener(jarvisObserver);
        ironMan.wakeupJarvis();
        ironMan.makePhoneCall("pepper");
    }
}
