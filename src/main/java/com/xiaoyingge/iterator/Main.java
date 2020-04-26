package com.xiaoyingge.iterator;

/**
 * @author xiaoyingge
 * @description
 * @date 2020/4/26 10:17
 */
public class Main {

    public static void main (String[] args) {
        BaseList<String> myList = new MyList<>();
        for (int i = 0; i < 10; i++) {
            myList.add("name" + i);
        }

        MyIterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
