package com.xiaoyingge.proxy.statics;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/25 15:28
 */
public class Main {

    public static void main (String[] args) {
        Human man = new Man();
        HumanProxy proxy = new HumanProxy(man);
        proxy.run();
    }
}
