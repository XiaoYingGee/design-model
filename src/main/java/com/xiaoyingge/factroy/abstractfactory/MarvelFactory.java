package com.xiaoyingge.factroy.abstractfactory;

/**
 * 具体的工厂实现，确定当前组合内有哪些内容
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/21 0:20
 */
public class MarvelFactory extends AbstractFactory {

    @Override
    Hero getHero () {
        return new IronMan();
    }

    @Override
    SuperPower getSuperPower () {
        return new IronManSuperPower();
    }
}
