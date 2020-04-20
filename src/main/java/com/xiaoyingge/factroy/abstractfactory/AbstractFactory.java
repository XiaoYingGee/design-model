package com.xiaoyingge.factroy.abstractfactory;

/**
 * 抽象工厂定义，确定了产品组合
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/21 0:19
 */
public abstract class AbstractFactory {

    abstract Hero getHero ();

    abstract SuperPower getSuperPower ();

}
