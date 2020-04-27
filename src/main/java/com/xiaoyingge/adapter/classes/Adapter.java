package com.xiaoyingge.adapter.classes;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/4/27 0:56
 */
public class Adapter extends AImpl implements InterfaceB {

    @Override
    public Long printLong (Long number) {
        //适配过程
        return number + Long.parseLong(saySomething("555"));
    }
}
