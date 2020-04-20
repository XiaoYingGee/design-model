package com.xiaoyingge.factroy.simple;

import com.xiaoyingge.factroy.Car;
import com.xiaoyingge.factroy.Moving;
import com.xiaoyingge.factroy.Train;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/20 23:43
 */
public class SimpleFactory {

    public static Moving createCar () {
        return new Car();
    }

    public static Moving createTrain () {
        return new Train();
    }
}
