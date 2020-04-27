package com.xiaoyingge.adapter.objects;

/**
 * @author Xiaoyingge
 * @description
 * @date 2020/4/27 1:02
 */
public class AImpl implements InterfaceA {

    private Person person;

    public AImpl (Person person) {
        this.person = person;
    }

    @Override
    public String saySomething (String xxx) {
        return this.person.print();
    }
}
