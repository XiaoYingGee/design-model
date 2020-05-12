package com.xiaoyingge.bridge;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/5/6 23:52
 */
public class Main {

    public static void main (String[] args) {
        Phone myPhone = new Huawei();
        myPhone.installGame(new WangZheRongYao());
        myPhone.installGame(new YinYangShi());
    }

}
