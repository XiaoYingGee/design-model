package com.xiaoyingge.proxy.statics;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/25 15:24
 */
public class Man implements Human {

    @Override
    public void run () {
        System.out.println("开始跑步~~~~~~~~~~");
        System.out.println("结束跑步~~~~~~~~~~");
    }
}
