package com.xiaoyingge.factroy.factroymethod;

import com.xiaoyingge.factroy.Moving;
import com.xiaoyingge.factroy.Train;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/20 23:49
 */
public class TrainFactory {

    public static Moving createProduct () {
        return new Train();
    }
}
