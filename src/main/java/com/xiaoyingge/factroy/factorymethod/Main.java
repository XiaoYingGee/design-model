package com.xiaoyingge.factroy.factorymethod;

/**
 * 工厂方法，可以自由扩展产品的生产
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/20 23:49
 */
public class Main {

    public static void main (String[] args) {
        BaseComputeFactory factory = new AppleFactory();
        factory.createCompute().print();
    }
}
