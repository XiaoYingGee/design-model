package com.xiaoyingge.iterator;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/26 10:17
 */
public class Main {

    public static void main (String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("1");
        String s = myList.get(0);
        System.out.println(s);

    }

}
