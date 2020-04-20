package com.xiaoyingge.strategy;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/20 21:42
 */
public class StrategyImpl1 implements IStrategy {

    @Override
    public int calcThisNumber (int number) {
        return number + 3;
    }
}
