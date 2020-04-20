package com.xiaoyingge.factroy.factroymethod;

import com.xiaoyingge.factroy.Moving;

/**
 * 工厂方法，可以自由扩展产品的生产
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/20 23:49
 */
public class Main {

    public static void main (String[] args) {
        Moving moving = CarFactory.createProduct();
        moving.go();
        moving = TrainFactory.createProduct();
        moving.go();
    }
}
