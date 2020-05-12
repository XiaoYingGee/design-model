package com.xiaoyingge.prototype;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/5/6 21:06
 */
public class Prototype1 implements Cloneable {

    private int x = 8;

    public int getX () {
        return x;
    }

    public void setX (int x) {
        this.x = x;
    }

    @Override
    public Object clone () throws CloneNotSupportedException {
        return super.clone();
    }
}
