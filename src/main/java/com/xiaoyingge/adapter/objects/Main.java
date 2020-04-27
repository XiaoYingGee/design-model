package com.xiaoyingge.adapter.objects;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/4/27 1:04
 */
public class Main {

    public static void main (String[] args) {
        AImpl a = new AImpl(new Person());
        a.saySomething("ss");
    }
}
