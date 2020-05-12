package com.xiaoyingge.command;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/5/12 18:33
 */
public class Mic {

    private Command command;

    public Mic (Command command) {
        this.command = command;
    }

    public void invoke () {
        System.out.println("麦克风向远程服务器传输命令");
        command.execute();
    }
}
