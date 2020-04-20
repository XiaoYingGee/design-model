package com.xiaoyingge.factroy.abstractfactory;

/**
 * 由漫威电影工厂生产的银幕英雄
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/21 0:21
 */
public class IronMan extends Hero {

    @Override
    void say () {
        System.out.println("I'm iron man");
    }
}
