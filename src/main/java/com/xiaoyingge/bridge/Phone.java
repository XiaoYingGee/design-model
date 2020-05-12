package com.xiaoyingge.bridge;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/5/6 23:47
 */
public abstract class Phone {

    private List<Game> games = new ArrayList<>();

    protected abstract String getName ();

    public void installGame (Game game) {
        System.out.println("正在安装" + game.getName());
        games.add(game);
    }
}
