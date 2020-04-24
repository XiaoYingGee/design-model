package com.xiaoyingge.observer;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/24 16:12
 */
public abstract class AbstractEvent {

    /**
     * 通常事件定义中都存在调用对象的引用，防止出现特殊情况在处理事件时要对调用者进行处理
     */
    private IronMan source;

    public IronMan getSource () {
        return source;
    }

    public void setSource (IronMan source) {
        this.source = source;
    }
}
