package com.xiaoyingge.state;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/5/15 20:23
 */
public class Main {

    public static void main (String[] args) {
        Context context = new Context();
        context.setState(new Pass());
        context.doSomeThing();
    }
}
