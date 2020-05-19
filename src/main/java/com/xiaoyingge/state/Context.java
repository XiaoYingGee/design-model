package com.xiaoyingge.state;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/5/15 20:20
 */
public class Context {

    private Audit audit;

    public Context () {

    }

    public void setState (Audit audit) {
        this.audit = audit;
    }

    public Audit getState () {
        return this.audit;
    }

    public void doSomeThing () {
        System.out.println("执行状态方法前有自己的逻辑");
        audit.doAudit();
        System.out.println("根据返回又可能有自己的处理");
    }
}
