package com.xiaoyingge.command;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/5/12 18:33
 */
public class TonyStark {

    public static void main (String[] args) {
        //创建命令的执行者
        Jarvis jarvis = new Jarvis();
        //创建一个唤醒命令，这个命令交给jarvis执行
        Command command = new WakeUpCommand(jarvis);
        //调用麦克风，把命令输入到麦克风里
        Mic invoker = new Mic(command);
        //麦克风唤醒远端的jarvis服务
        invoker.invoke();
    }
}
