package com.xiaoyingge.factroy.abstractfactory;

/**
 * 抽象工厂定义，确定了产品组合,生产主角，并生产相应的超能力
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/21 0:19
 */
public abstract class BaseMovieFactory {

    abstract Hero getHero ();

    abstract SuperPower getSuperPower ();

}
