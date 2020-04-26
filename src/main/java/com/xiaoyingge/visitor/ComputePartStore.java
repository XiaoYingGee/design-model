package com.xiaoyingge.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/26 10:42
 */
public class ComputePartStore {

    private List<ComputePart> goods = new ArrayList<>();

    public ComputePartStore () {
        goods.add(new CPU(100));
        goods.add(new CPU(400));
        goods.add(new Memory(200));
        goods.add(new Memory(500));
        goods.add(new KeyBroad(300));
        goods.add(new KeyBroad(600));
    }

    public void sell (Visitor visitor) {
        for (ComputePart good : goods) {
            good.accept(visitor);
        }
    }
}

