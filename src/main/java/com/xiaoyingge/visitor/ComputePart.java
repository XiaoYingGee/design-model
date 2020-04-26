package com.xiaoyingge.visitor;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/26 10:29
 */
public abstract class ComputePart {

    private int price;

    public ComputePart (int price) {
        this.price = price;
    }

    public int getPrice () {
        return price;
    }

    public void setPrice (int price) {
        this.price = price;
    }

    public abstract void accept (Visitor visitor);
}
