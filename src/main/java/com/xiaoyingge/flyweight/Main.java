package com.xiaoyingge.flyweight;

/**
 * java字符串常量池的判断
 *
 * @author xiaoyingge
 * @description
 * @date 2020/4/25 12:29
 */
public class Main {

    public static void main (String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        String s5 = new String("ab");
        String s6 = new String("c");

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1 == s3.intern());
        System.out.println(s3.intern() == s4.intern());
        System.out.println(s1 == (s5 + s6));
        System.out.println(s1 == new String(s5 + s6).intern());

    }

}
