package com.xiaoyingge.factroy.abstractfactory;

/**
 * 由DC电影工厂生产的银幕英雄
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/21 0:25
 */
public class SuperMan extends Hero {

    @Override
    void say () {
        System.out.println("I'm super man");
    }
}
