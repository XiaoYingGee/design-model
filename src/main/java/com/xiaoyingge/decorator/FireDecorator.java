package com.xiaoyingge.decorator;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/24 13:48
 */
public class FireDecorator extends BaseIronManSuit {

    private BaseIronManSuit suit;

    public FireDecorator (BaseIronManSuit suit) {
        this.suit = suit;
    }

    @Override
    protected void showFunction () {
        suit.showFunction();
        System.out.println("add new function,now you can shoot enemies!");
    }
}
