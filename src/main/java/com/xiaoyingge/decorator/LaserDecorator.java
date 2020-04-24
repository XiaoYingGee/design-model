package com.xiaoyingge.decorator;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/24 13:51
 */
public class LaserDecorator extends BaseIronManSuit {

    private BaseIronManSuit suit;

    public LaserDecorator (BaseIronManSuit suit) {
        this.suit = suit;
    }

    @Override
    protected void showFunction () {
        suit.showFunction();
        System.out.println("add new function! now you can shots lasers");

    }
}
