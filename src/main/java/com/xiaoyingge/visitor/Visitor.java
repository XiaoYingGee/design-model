package com.xiaoyingge.visitor;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/26 10:32
 */
public interface Visitor {

    void visit (Compute compute);

    void visitCpu (CPU cpu);

    void visitMemory (Memory memory);

    void visitKeyBroad (KeyBroad keyBroad);

}
