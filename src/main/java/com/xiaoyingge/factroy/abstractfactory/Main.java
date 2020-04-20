package com.xiaoyingge.factroy.abstractfactory;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/20 23:57
 */
public class Main {

    public static void main (String[] args) {
        AbstractFactory f = new MarvelFactory();
        f.getHero().say();
        f.getSuperPower().show();
    }
}
