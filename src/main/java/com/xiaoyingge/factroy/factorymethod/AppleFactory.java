package com.xiaoyingge.factroy.factorymethod;

import com.xiaoyingge.factroy.AppleCompute;
import com.xiaoyingge.factroy.BaseCompute;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/20 23:48
 */
public class AppleFactory extends BaseComputeFactory {

    @Override
    public BaseCompute createCompute () {
        return new AppleCompute();
    }
}
