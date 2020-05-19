package com.xiaoyingge.memento;

import java.io.Serializable;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/5/18 23:55
 */
public class Person implements Serializable {

    private static final long serialVersionUID = -1921922134355937096L;

    private String name;

    private int age;

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }
}
