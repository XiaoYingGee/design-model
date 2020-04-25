package com.xiaoyingge.proxy.statics;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/25 15:26
 */
public class HumanProxy implements Human {

    private Human human;

    public HumanProxy (Human human) {
        this.human = human;
    }

    @Override
    public void run () {
        System.out.println("开始热身...");
        human.run();
        System.out.println("开始拉伸...");
    }
}
