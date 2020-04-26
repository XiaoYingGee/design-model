package com.xiaoyingge.builder;

import com.xiaoyingge.builder.Compute.Builder;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/26 10:03
 */
public class Main {

    public static void main (String[] args) {
        new Builder().cpu("i10").memory("32G").display("34#").keyBroad("cheery").build();
    }
}
