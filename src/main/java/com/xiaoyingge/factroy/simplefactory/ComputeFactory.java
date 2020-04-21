package com.xiaoyingge.factroy.simplefactory;

import com.xiaoyingge.factroy.BaseCompute;

/**
 * 电脑生产的简单工厂
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/20 23:43
 */
public class ComputeFactory {

    public BaseCompute buyAppleCompute () {
        return new AppleCompute();
    }

    public BaseCompute buyLenovoCompute () {
        return new LenovoCompute();
    }
}
