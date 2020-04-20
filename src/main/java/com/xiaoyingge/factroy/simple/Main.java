package com.xiaoyingge.factroy.simple;

import com.xiaoyingge.factroy.Moving;
import com.xiaoyingge.factroy.factroymethod.CarFactory;
import com.xiaoyingge.factroy.factroymethod.TrainFactory;

/**
 * 简单工厂，扩展性差
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/20 23:43
 */
public class Main {

    public static void main (String[] args) {
        Moving moving = CarFactory.createProduct();
        moving.go();
        moving = TrainFactory.createProduct();
        moving.go();
    }
}
