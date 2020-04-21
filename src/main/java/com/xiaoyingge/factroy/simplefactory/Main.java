package com.xiaoyingge.factroy.simplefactory;

import com.xiaoyingge.factroy.BaseCompute;

/**
 * 简单工厂，实现简单，扩展性差
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/20 23:43
 */
public class Main {

    public static void main (String[] args) {
        BaseCompute apple = new ComputeFactory().buyAppleCompute();
        BaseCompute lenovoCompute = new ComputeFactory().buyLenovoCompute();
    }
}
