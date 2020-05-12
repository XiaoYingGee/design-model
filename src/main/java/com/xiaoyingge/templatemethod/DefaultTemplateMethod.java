package com.xiaoyingge.templatemethod;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/5/6 22:04
 */
public class DefaultTemplateMethod extends AbstractTemplateMethod {

    @Override
    protected void getUp () {
        System.out.println("getUp");
    }

    @Override
    protected void putOnClothes () {
        System.out.println("putOnClothes");
    }

    @Override
    protected void brushTeeth () {
        System.out.println("brushTeeth");
    }

    @Override
    protected void lockDoor () {
        System.out.println("lockDoor");
    }
}
