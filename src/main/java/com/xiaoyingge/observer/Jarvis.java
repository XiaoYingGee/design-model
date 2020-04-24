package com.xiaoyingge.observer;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/24 16:15
 */
public class Jarvis implements WakeupEventListener, PhoneCallEventListener {

    @Override
    public void makePhoneCall (AbstractEvent e) {
        System.out.println("Jarvis -- Yes Sir! calling Miss pepper");
    }

    @Override
    public void answerTonyStark (AbstractEvent e) {
        System.out.println("Jarvis -- ready for you ,Sir");
    }
}
