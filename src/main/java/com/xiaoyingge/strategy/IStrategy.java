package com.xiaoyingge.strategy;

/**
 * 策略模式接口
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/20 21:41
 */
public interface IStrategy {

    /**
     * 对数字进行计算
     *
     * @param number
     */
    int calcThisNumber (int number);
}
