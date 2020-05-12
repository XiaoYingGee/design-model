package com.xiaoyingge.templatemethod;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/5/6 22:01
 */
public abstract class AbstractTemplateMethod {

    protected abstract void getUp ();

    protected abstract void putOnClothes ();

    protected abstract void brushTeeth ();

    protected abstract void lockDoor ();

    public void getOut () {
        this.getUp();
        this.putOnClothes();
        this.brushTeeth();
        this.lockDoor();
    }
}
