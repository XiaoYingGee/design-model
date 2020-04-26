package com.xiaoyingge.visitor;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/4/26 22:18
 */
public class Compute extends ComputePart {

    private CPU cpu;

    private Memory memory;

    private KeyBroad keyBroad;

    public Compute (CPU cpu, Memory memory, KeyBroad keyBroad) {
        super(cpu.getPrice() + memory.getPrice() + keyBroad.getPrice());
        this.cpu = cpu;
        this.memory = memory;
        this.keyBroad = keyBroad;
    }

    @Override
    public void accept (Visitor visitor) {
        visitor.visit(this);
    }
}
