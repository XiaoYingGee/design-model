package com.xiaoyingge.iterator;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/4/26 21:43
 */
public interface BaseList<E> {

    //添加元素
    void add (E e);

    //获取元素
    E get (int index);

    //获取迭代器
    MyIterator<E> iterator ();
}
