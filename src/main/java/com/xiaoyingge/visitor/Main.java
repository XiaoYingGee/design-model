package com.xiaoyingge.visitor;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/26 10:40
 */
public class Main {

    public static void main (String[] args) {
        ComputePartStore store = new ComputePartStore();
        store.sell(new Consumer());
    }
}
