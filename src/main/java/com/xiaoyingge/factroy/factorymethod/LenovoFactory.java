package com.xiaoyingge.factroy.factorymethod;

import com.xiaoyingge.factroy.BaseCompute;
import com.xiaoyingge.factroy.LenovoCompute;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/20 23:49
 */
public class LenovoFactory extends BaseComputeFactory {

    @Override
    public BaseCompute createCompute () {
        return new LenovoCompute();
    }
}
