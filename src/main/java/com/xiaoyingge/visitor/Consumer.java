package com.xiaoyingge.visitor;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/26 10:39
 */
public class Consumer implements Visitor {

    @Override
    public void visit (Compute compute) {
        //整体最终再打上九折
        System.out.println("now you price is " + compute.getPrice() * 0.9);
    }

    @Override
    public void visitCpu (CPU cpu) {
        System.out.println(cpu.getPrice() * 0.95);
    }

    @Override
    public void visitMemory (Memory memory) {
        System.out.println(memory.getPrice() * 0.95);
    }

    @Override
    public void visitKeyBroad (KeyBroad keyBroad) {
        System.out.println(keyBroad.getPrice() * 0.95);
    }
}
