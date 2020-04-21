package com.xiaoyingge.factroy.factorymethod;

import com.xiaoyingge.factroy.BaseCompute;

/**
 * 抽象的电脑工厂，定义子类工厂的具体行为
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/21 14:27
 */
public abstract class BaseComputeFactory {

    public abstract BaseCompute createCompute ();

}
