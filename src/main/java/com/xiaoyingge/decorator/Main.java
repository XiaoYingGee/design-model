package com.xiaoyingge.decorator;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/24 13:53
 */
public class Main {

    public static void main (String[] args) {
        //在不改动mark1战甲的基础上给他加上开枪与发射激光的能力
        BaseIronManSuit newSuit = new LaserDecorator(new FireDecorator(new Mark1()));
        newSuit.showFunction();
    }
}
