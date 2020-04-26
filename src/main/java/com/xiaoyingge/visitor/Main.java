package com.xiaoyingge.visitor;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/26 10:40
 */
public class Main {

    public static void main (String[] args) {
        ComputeStore store = new ComputeStore();
        store.sell(new Consumer());
    }
}
