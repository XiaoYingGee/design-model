package com.xiaoyingge.visitor;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/26 10:32
 */
public class Memory extends ComputePart {

    public Memory (int price) {
        super(price);
    }

    @Override
    public void accept (Visitor visitor) {
        visitor.visitMemory(this);
    }
}
