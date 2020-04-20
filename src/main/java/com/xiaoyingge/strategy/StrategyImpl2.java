package com.xiaoyingge.strategy;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/20 21:43
 */
public class StrategyImpl2 implements IStrategy {

    @Override
    public int calcThisNumber (int number) {
        return -number;
    }
}
