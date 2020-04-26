package com.xiaoyingge.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/26 10:42
 */
class ComputeStore {

    private List<Compute> computes = new ArrayList<>();

    public ComputeStore () {
        computes.add(new Compute(new CPU(100), new Memory(100), new KeyBroad(100)));
        computes.add(new Compute(new CPU(200), new Memory(200), new KeyBroad(200)));
        computes.add(new Compute(new CPU(300), new Memory(300), new KeyBroad(300)));
    }

    public void sell (Visitor visitor) {
        for (Compute compute : computes) {
            compute.accept(visitor);
        }
    }
}

