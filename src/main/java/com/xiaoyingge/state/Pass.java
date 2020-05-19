package com.xiaoyingge.state;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/5/15 20:23
 */
public class Pass implements Audit {

    @Override
    public void doAudit () {
        System.out.println("审核通过");
    }
}
