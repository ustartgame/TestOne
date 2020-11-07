package com.study;

import com.study.service.impl.PersonServiceImpl;

public class TestIdeaKey {
    public static void main(String[] args) {
        PersonServiceImpl impl = new PersonServiceImpl();
        impl.saveMoney(200);
        impl.saveMoney(100);
        impl.outMoney(500);
        System.out.println(impl.money);
    }
}
