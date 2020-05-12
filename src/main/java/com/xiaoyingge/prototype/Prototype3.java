package com.xiaoyingge.prototype;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/5/6 21:12
 */
public class Prototype3 implements Cloneable {

    private int y = 10;

    public int getY () {
        return y;
    }

    public void setY (int y) {
        this.y = y;
    }

    private CloneableObject object = new CloneableObject();

    public CloneableObject getObject () {
        return object;
    }

    public void setObject (CloneableObject object) {
        this.object = object;
    }

    @Override
    protected Object clone () throws CloneNotSupportedException {
        return super.clone();
    }

    public static class CloneableObject implements Cloneable {

        private int x = 8;

        @Override
        protected Object clone () throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString () {
            return super.toString();
        }
    }

}
