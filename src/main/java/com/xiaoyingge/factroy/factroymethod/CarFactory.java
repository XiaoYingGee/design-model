package com.xiaoyingge.factroy.factroymethod;

import com.xiaoyingge.factroy.Car;
import com.xiaoyingge.factroy.Moving;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/20 23:48
 */
public class CarFactory {

    public static Moving createProduct () {
        return new Car();
    }
}
