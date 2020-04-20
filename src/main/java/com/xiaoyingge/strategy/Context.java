package com.xiaoyingge.strategy;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/20 21:42
 */
public class Context {

    public static void main (String[] args) {
        int init = 100;
        //使用策略一进行计算
        System.out.println(new StrategyImpl1().calcThisNumber(init));
        //使用策略二进行计算
        System.out.println(new StrategyImpl2().calcThisNumber(init));
    }

}
