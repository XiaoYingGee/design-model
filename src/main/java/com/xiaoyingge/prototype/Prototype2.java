package com.xiaoyingge.prototype;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/5/6 21:10
 */
public class Prototype2 implements Cloneable {

    private String x = "test";

    public String getX () {
        return x;
    }

    public void setX (String x) {
        this.x = x;
    }

    @Override
    protected Object clone () throws CloneNotSupportedException {
        return super.clone();
    }
}
