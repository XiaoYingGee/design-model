package com.xiaoyingge.builder;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/26 9:57
 */
public class Compute {

    private String cpu;

    private String memory;

    private String display;

    private String keyBroad;

    public static class Builder {

        private Compute compute;

        public Builder () {
            compute = new Compute();
        }

        public Builder cpu (String cpu) {
            compute.cpu = cpu;
            return this;
        }

        public Builder memory (String memory) {
            compute.memory = memory;
            return this;
        }

        public Builder display (String display) {
            compute.display = display;
            return this;
        }

        public Builder keyBroad (String keyBroad) {
            compute.keyBroad = keyBroad;
            return this;
        }

        public Compute build () {
            return compute;
        }
    }
}
