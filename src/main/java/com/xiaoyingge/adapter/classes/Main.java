package com.xiaoyingge.adapter.classes;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/4/27 0:59
 */
public class Main {

    public static void main (String[] args) {
        Adapter adapter = new Adapter();
        Long aLong = adapter.printLong(1L);
        System.out.println(aLong);
    }
}
