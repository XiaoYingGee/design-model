package com.xiaoyingge.prototype;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/5/6 21:07
 */
public class Main {

    public static void main (String[] args) {
        //基础数据类型测试
        Prototype1 prototype1 = new Prototype1();

        try {
            Prototype1 prototype11 = (Prototype1) prototype1.clone();
            prototype11.setX(10);
            //基础数据互不干扰
            System.out.println(prototype1.getX());
            System.out.println(prototype11.getX());

        } catch (Exception e) {
            e.printStackTrace();
        }
        //String测试
        Prototype2 prototype2 = new Prototype2();
        try {
            Prototype2 prototype22 = (Prototype2) prototype2.clone();
            prototype22.setX("hello");
            //看起来也互不干扰 ，实际是因为JAVA常量池导致的
            System.out.println(prototype2.getX());
            System.out.println(prototype22.getX());

        } catch (Exception e) {
            e.printStackTrace();
        }

        Prototype3 prototype3 = new Prototype3();
        try {
            Prototype3 prototype33 = (Prototype3) prototype3.clone();
            prototype33.setY(100);
            //基础数据互不干扰，但是引用类型指向同一个地址
            System.out.println(prototype3.getY());
            System.out.println(prototype3.getObject());
            System.out.println(prototype33.getY());
            System.out.println(prototype33.getObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
