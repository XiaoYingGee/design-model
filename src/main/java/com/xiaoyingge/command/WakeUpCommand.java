package com.xiaoyingge.command;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/5/12 18:34
 */
public class WakeUpCommand implements Command {

    private Jarvis jarvis;

    public WakeUpCommand (Jarvis jarvis) {
        this.jarvis = jarvis;
    }

    @Override
    public void execute () {
        System.out.println("命令已确认，将由jarvis执行");
        jarvis.action();
    }
}
