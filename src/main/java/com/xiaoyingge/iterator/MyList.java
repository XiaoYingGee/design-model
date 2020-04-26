package com.xiaoyingge.iterator;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/26 10:10
 */
public class MyList<E> {

    private int index = 0;

    private Object[] objects = new Object[10];

    public void add (E e) {
        objects[index++] = e;
    }

    public E get (int i) {
        return (E) objects[Math.max(i, index)];
    }

}
