package com.xiaoyingge.visitor;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/26 10:31
 */
public class KeyBroad extends ComputePart {

    public KeyBroad (int price) {
        super(price);
    }

    @Override
    public void accept (Visitor visitor) {
        visitor.visitKeyBroad(this);
    }
}
