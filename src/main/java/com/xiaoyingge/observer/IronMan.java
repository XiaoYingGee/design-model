package com.xiaoyingge.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/24 16:14
 */
public class IronMan {

    private List<WakeupEventListener> wakeupEventListeners = new ArrayList<>();

    private List<PhoneCallEventListener> phoneCallEventListeners = new ArrayList<>();

    public void addWakeupListener (WakeupEventListener listener) {
        wakeupEventListeners.add(listener);
    }

    public void addPhoneCallListener (PhoneCallEventListener listener) {
        phoneCallEventListeners.add(listener);
    }

    public void makePhoneCall (String name) {
        System.out.println("Iron Man -- call " + name);
        PhoneCallEvent phoneCallEvent = new PhoneCallEvent();
        for (PhoneCallEventListener phoneCallEventListener : phoneCallEventListeners) {
            phoneCallEventListener.makePhoneCall(phoneCallEvent);
        }
    }

    public void wakeupJarvis () {
        System.out.println("Iron Man -- jarvis,are you online?");
        WakeupEvent wakeupEvent = new WakeupEvent();
        for (WakeupEventListener wakeupEventListener : wakeupEventListeners) {
            wakeupEventListener.answerTonyStark(wakeupEvent);
        }
    }
}
