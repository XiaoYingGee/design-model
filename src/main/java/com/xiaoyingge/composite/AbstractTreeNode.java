package com.xiaoyingge.composite;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/25 11:54
 */
public abstract class AbstractTreeNode {

    protected String name;

    public AbstractTreeNode (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void print () {
        System.out.println(this.name);
    }
}
