package com.xiaoyingge.visitor;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/26 10:31
 */
public class CPU extends ComputePart {

    public CPU (int price) {
        super(price);
    }

    @Override
    public void accept (Visitor visitor) {
        visitor.visitCpu(this);
    }
}
