package com.study.test;

import com.study.entity.Person;

public class TestDL {
    public static void main(String[] args) {
        Person person=Person.getInstance("小黄",28,1);
        System.out.println(person.getName());
        System.out.println(person.getSex());
        System.out.println(person.getAge());
    }
}
