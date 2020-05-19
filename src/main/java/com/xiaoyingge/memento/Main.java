package com.xiaoyingge.memento;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/5/18 23:57
 */
public class Main {

    private static final String FILE_PATH = "d:/test.ini";

    public static void main (String[] args) throws Exception {
        Person person = new Person();
        person.setName("小萤哥");
        person.setAge(18);

//        serial(person);
        Person person2 = readFromFile();
        System.out.println(person2.getName() + person2.getAge());

    }

    private static void serial (Person person) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
        oos.writeObject(person);
        oos.close();
    }

    private static Person readFromFile () throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
        return (Person) ois.readObject();
    }
}
